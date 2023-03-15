/*
 * An XML document type.
 * Localname: Equipment
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.EquipmentDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one Equipment(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class EquipmentDocumentImpl extends eu.openaire.cerifProfile.x11.impl.InfrastructureSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.EquipmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public EquipmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EQUIPMENT$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Equipment");
    
    
    /**
     * Gets the "Equipment" element
     */
    public eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment getEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment target = null;
            target = (eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment)get_store().find_element_user(EQUIPMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Equipment" element
     */
    public void setEquipment(eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment equipment)
    {
        generatedSetterHelperImpl(equipment, EQUIPMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Equipment" element
     */
    public eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment addNewEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment target = null;
            target = (eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment)get_store().add_element_user(EQUIPMENT$0);
            return target;
        }
    }
    /**
     * An XML Equipment(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class EquipmentImpl extends eu.openaire.cerifProfile.x11.impl.InfrastructureBaseTypeImpl implements eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment
    {
        private static final long serialVersionUID = 1L;
        
        public EquipmentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Type");
        private static final javax.xml.namespace.QName ACRONYM$2 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Acronym");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Name");
        private static final javax.xml.namespace.QName IDENTIFIER$6 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Identifier");
        private static final javax.xml.namespace.QName DESCRIPTION$8 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Description");
        private static final javax.xml.namespace.QName OWNER$10 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Owner");
        private static final javax.xml.namespace.QName CLASSIFICATION$12 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Classification");
        private static final javax.xml.namespace.QName LINK$14 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Link");
        
        
        /**
         * Gets array of all "Type" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TYPE$0, targetList);
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] result = new eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Type" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(TYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Type" element
         */
        public int sizeOfTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPE$0);
            }
        }
        
        /**
         * Sets array of all "Type" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTypeArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] typeArray)
        {
            check_orphaned();
            arraySetterHelper(typeArray, TYPE$0);
        }
        
        /**
         * Sets ith "Type" element
         */
        public void setTypeArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType type)
        {
            generatedSetterHelperImpl(type, TYPE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Type" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(TYPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Type" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Type" element
         */
        public void removeType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPE$0, i);
            }
        }
        
        /**
         * Gets the "Acronym" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(ACRONYM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Acronym" element
         */
        public boolean isSetAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACRONYM$2) != 0;
            }
        }
        
        /**
         * Sets the "Acronym" element
         */
        public void setAcronym(eu.openaire.cerifProfile.x11.CfStringType acronym)
        {
            generatedSetterHelperImpl(acronym, ACRONYM$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Acronym" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(ACRONYM$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Acronym" element
         */
        public void unsetAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACRONYM$2, 0);
            }
        }
        
        /**
         * Gets array of all "Name" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$4, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Name" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType getNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(NAME$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Name" element
         */
        public int sizeOfNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$4);
            }
        }
        
        /**
         * Sets array of all "Name" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNameArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] nameArray)
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$4);
        }
        
        /**
         * Sets ith "Name" element
         */
        public void setNameArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType name)
        {
            generatedSetterHelperImpl(name, NAME$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Name" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(NAME$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Name" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(NAME$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Name" element
         */
        public void removeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$4, i);
            }
        }
        
        /**
         * Gets array of all "Identifier" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] getIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDENTIFIER$6, targetList);
                eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] result = new eu.openaire.cerifProfile.x11.CfGenericIdentifierType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Identifier" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericIdentifierType getIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericIdentifierType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().find_element_user(IDENTIFIER$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Identifier" element
         */
        public int sizeOfIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFIER$6);
            }
        }
        
        /**
         * Sets array of all "Identifier" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIdentifierArray(eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] identifierArray)
        {
            check_orphaned();
            arraySetterHelper(identifierArray, IDENTIFIER$6);
        }
        
        /**
         * Sets ith "Identifier" element
         */
        public void setIdentifierArray(int i, eu.openaire.cerifProfile.x11.CfGenericIdentifierType identifier)
        {
            generatedSetterHelperImpl(identifier, IDENTIFIER$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericIdentifierType insertNewIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericIdentifierType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().insert_element_user(IDENTIFIER$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericIdentifierType addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericIdentifierType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().add_element_user(IDENTIFIER$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "Identifier" element
         */
        public void removeIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFIER$6, i);
            }
        }
        
        /**
         * Gets array of all "Description" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DESCRIPTION$8, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Description" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType getDescriptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(DESCRIPTION$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Description" element
         */
        public int sizeOfDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$8);
            }
        }
        
        /**
         * Sets array of all "Description" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDescriptionArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] descriptionArray)
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$8);
        }
        
        /**
         * Sets ith "Description" element
         */
        public void setDescriptionArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType description)
        {
            generatedSetterHelperImpl(description, DESCRIPTION$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Description" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(DESCRIPTION$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Description" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType addNewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(DESCRIPTION$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "Description" element
         */
        public void removeDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$8, i);
            }
        }
        
        /**
         * Gets array of all "Owner" elements
         */
        public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getOwnerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OWNER$10, targetList);
                eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Owner" element
         */
        public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getOwnerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().find_element_user(OWNER$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Owner" element
         */
        public int sizeOfOwnerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OWNER$10);
            }
        }
        
        /**
         * Sets array of all "Owner" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOwnerArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] ownerArray)
        {
            check_orphaned();
            arraySetterHelper(ownerArray, OWNER$10);
        }
        
        /**
         * Sets ith "Owner" element
         */
        public void setOwnerArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType owner)
        {
            generatedSetterHelperImpl(owner, OWNER$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Owner" element
         */
        public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewOwner(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().insert_element_user(OWNER$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Owner" element
         */
        public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().add_element_user(OWNER$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "Owner" element
         */
        public void removeOwner(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OWNER$10, i);
            }
        }
        
        /**
         * Gets array of all "Classification" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CLASSIFICATION$12, targetList);
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] result = new eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Classification" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getClassificationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(CLASSIFICATION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Classification" element
         */
        public int sizeOfClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASSIFICATION$12);
            }
        }
        
        /**
         * Sets array of all "Classification" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setClassificationArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] classificationArray)
        {
            check_orphaned();
            arraySetterHelper(classificationArray, CLASSIFICATION$12);
        }
        
        /**
         * Sets ith "Classification" element
         */
        public void setClassificationArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType classification)
        {
            generatedSetterHelperImpl(classification, CLASSIFICATION$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Classification" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(CLASSIFICATION$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Classification" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(CLASSIFICATION$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "Classification" element
         */
        public void removeClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASSIFICATION$12, i);
            }
        }
        
        /**
         * Gets array of all "Link" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericLinkType[] getLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINK$14, targetList);
                eu.openaire.cerifProfile.x11.CfGenericLinkType[] result = new eu.openaire.cerifProfile.x11.CfGenericLinkType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Link" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericLinkType getLinkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericLinkType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().find_element_user(LINK$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Link" element
         */
        public int sizeOfLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINK$14);
            }
        }
        
        /**
         * Sets array of all "Link" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLinkArray(eu.openaire.cerifProfile.x11.CfGenericLinkType[] linkArray)
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$14);
        }
        
        /**
         * Sets ith "Link" element
         */
        public void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfGenericLinkType link)
        {
            generatedSetterHelperImpl(link, LINK$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Link" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericLinkType insertNewLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericLinkType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().insert_element_user(LINK$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Link" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericLinkType addNewLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericLinkType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().add_element_user(LINK$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "Link" element
         */
        public void removeLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINK$14, i);
            }
        }
    }
}
