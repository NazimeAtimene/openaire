/*
 * An XML document type.
 * Localname: OrgUnit
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.OrgUnitDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one OrgUnit(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class OrgUnitDocumentImpl extends eu.openaire.cerifProfile.x11.impl.OrgUnitSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.OrgUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrgUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGUNIT$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit");
    
    
    /**
     * Gets the "OrgUnit" element
     */
    public eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit getOrgUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit target = null;
            target = (eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit)get_store().find_element_user(ORGUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrgUnit" element
     */
    public void setOrgUnit(eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit orgUnit)
    {
        generatedSetterHelperImpl(orgUnit, ORGUNIT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrgUnit" element
     */
    public eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit addNewOrgUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit target = null;
            target = (eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit)get_store().add_element_user(ORGUNIT$0);
            return target;
        }
    }
    /**
     * An XML OrgUnit(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class OrgUnitImpl extends eu.openaire.cerifProfile.x11.impl.OrgUnitBaseTypeImpl implements eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit
    {
        private static final long serialVersionUID = 1L;
        
        public OrgUnitImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Type");
        private static final javax.xml.namespace.QName ACRONYM$2 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Acronym");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Name");
        private static final javax.xml.namespace.QName RORID$6 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "RORID");
        private static final javax.xml.namespace.QName ALTERNATIVERORID$8 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "AlternativeRORID");
        private static final javax.xml.namespace.QName GRID$10 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "GRID");
        private static final javax.xml.namespace.QName ALTERNATIVEGRID$12 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "AlternativeGRID");
        private static final javax.xml.namespace.QName ISNI$14 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ISNI");
        private static final javax.xml.namespace.QName ALTERNATIVEISNI$16 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "AlternativeISNI");
        private static final javax.xml.namespace.QName FUNDREFID$18 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "FundRefID");
        private static final javax.xml.namespace.QName ALTERNATIVEFUNDREFID$20 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "AlternativeFundRefID");
        private static final javax.xml.namespace.QName IDENTIFIER$22 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Identifier");
        private static final javax.xml.namespace.QName ELECTRONICADDRESS$24 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ElectronicAddress");
        private static final javax.xml.namespace.QName PARTOF$26 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PartOf");
        private static final javax.xml.namespace.QName CLASSIFICATION$28 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Classification");
        private static final javax.xml.namespace.QName LINK$30 = 
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
         * Gets the "RORID" element
         */
        public eu.openaire.cerifProfile.x11.RORIDType getRORID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.RORIDType target = null;
                target = (eu.openaire.cerifProfile.x11.RORIDType)get_store().find_element_user(RORID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "RORID" element
         */
        public boolean isSetRORID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RORID$6) != 0;
            }
        }
        
        /**
         * Sets the "RORID" element
         */
        public void setRORID(eu.openaire.cerifProfile.x11.RORIDType rorid)
        {
            generatedSetterHelperImpl(rorid, RORID$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "RORID" element
         */
        public eu.openaire.cerifProfile.x11.RORIDType addNewRORID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.RORIDType target = null;
                target = (eu.openaire.cerifProfile.x11.RORIDType)get_store().add_element_user(RORID$6);
                return target;
            }
        }
        
        /**
         * Unsets the "RORID" element
         */
        public void unsetRORID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RORID$6, 0);
            }
        }
        
        /**
         * Gets array of all "AlternativeRORID" elements
         */
        public eu.openaire.cerifProfile.x11.RORIDType[] getAlternativeRORIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALTERNATIVERORID$8, targetList);
                eu.openaire.cerifProfile.x11.RORIDType[] result = new eu.openaire.cerifProfile.x11.RORIDType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AlternativeRORID" element
         */
        public eu.openaire.cerifProfile.x11.RORIDType getAlternativeRORIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.RORIDType target = null;
                target = (eu.openaire.cerifProfile.x11.RORIDType)get_store().find_element_user(ALTERNATIVERORID$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AlternativeRORID" element
         */
        public int sizeOfAlternativeRORIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTERNATIVERORID$8);
            }
        }
        
        /**
         * Sets array of all "AlternativeRORID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAlternativeRORIDArray(eu.openaire.cerifProfile.x11.RORIDType[] alternativeRORIDArray)
        {
            check_orphaned();
            arraySetterHelper(alternativeRORIDArray, ALTERNATIVERORID$8);
        }
        
        /**
         * Sets ith "AlternativeRORID" element
         */
        public void setAlternativeRORIDArray(int i, eu.openaire.cerifProfile.x11.RORIDType alternativeRORID)
        {
            generatedSetterHelperImpl(alternativeRORID, ALTERNATIVERORID$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeRORID" element
         */
        public eu.openaire.cerifProfile.x11.RORIDType insertNewAlternativeRORID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.RORIDType target = null;
                target = (eu.openaire.cerifProfile.x11.RORIDType)get_store().insert_element_user(ALTERNATIVERORID$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeRORID" element
         */
        public eu.openaire.cerifProfile.x11.RORIDType addNewAlternativeRORID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.RORIDType target = null;
                target = (eu.openaire.cerifProfile.x11.RORIDType)get_store().add_element_user(ALTERNATIVERORID$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "AlternativeRORID" element
         */
        public void removeAlternativeRORID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTERNATIVERORID$8, i);
            }
        }
        
        /**
         * Gets the "GRID" element
         */
        public eu.openaire.cerifProfile.x11.GRIDType getGRID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.GRIDType target = null;
                target = (eu.openaire.cerifProfile.x11.GRIDType)get_store().find_element_user(GRID$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GRID" element
         */
        public boolean isSetGRID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GRID$10) != 0;
            }
        }
        
        /**
         * Sets the "GRID" element
         */
        public void setGRID(eu.openaire.cerifProfile.x11.GRIDType grid)
        {
            generatedSetterHelperImpl(grid, GRID$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GRID" element
         */
        public eu.openaire.cerifProfile.x11.GRIDType addNewGRID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.GRIDType target = null;
                target = (eu.openaire.cerifProfile.x11.GRIDType)get_store().add_element_user(GRID$10);
                return target;
            }
        }
        
        /**
         * Unsets the "GRID" element
         */
        public void unsetGRID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GRID$10, 0);
            }
        }
        
        /**
         * Gets array of all "AlternativeGRID" elements
         */
        public eu.openaire.cerifProfile.x11.GRIDType[] getAlternativeGRIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALTERNATIVEGRID$12, targetList);
                eu.openaire.cerifProfile.x11.GRIDType[] result = new eu.openaire.cerifProfile.x11.GRIDType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AlternativeGRID" element
         */
        public eu.openaire.cerifProfile.x11.GRIDType getAlternativeGRIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.GRIDType target = null;
                target = (eu.openaire.cerifProfile.x11.GRIDType)get_store().find_element_user(ALTERNATIVEGRID$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AlternativeGRID" element
         */
        public int sizeOfAlternativeGRIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTERNATIVEGRID$12);
            }
        }
        
        /**
         * Sets array of all "AlternativeGRID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAlternativeGRIDArray(eu.openaire.cerifProfile.x11.GRIDType[] alternativeGRIDArray)
        {
            check_orphaned();
            arraySetterHelper(alternativeGRIDArray, ALTERNATIVEGRID$12);
        }
        
        /**
         * Sets ith "AlternativeGRID" element
         */
        public void setAlternativeGRIDArray(int i, eu.openaire.cerifProfile.x11.GRIDType alternativeGRID)
        {
            generatedSetterHelperImpl(alternativeGRID, ALTERNATIVEGRID$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeGRID" element
         */
        public eu.openaire.cerifProfile.x11.GRIDType insertNewAlternativeGRID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.GRIDType target = null;
                target = (eu.openaire.cerifProfile.x11.GRIDType)get_store().insert_element_user(ALTERNATIVEGRID$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeGRID" element
         */
        public eu.openaire.cerifProfile.x11.GRIDType addNewAlternativeGRID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.GRIDType target = null;
                target = (eu.openaire.cerifProfile.x11.GRIDType)get_store().add_element_user(ALTERNATIVEGRID$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "AlternativeGRID" element
         */
        public void removeAlternativeGRID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTERNATIVEGRID$12, i);
            }
        }
        
        /**
         * Gets the "ISNI" element
         */
        public eu.openaire.cerifProfile.x11.ISNIType getISNI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ISNIType target = null;
                target = (eu.openaire.cerifProfile.x11.ISNIType)get_store().find_element_user(ISNI$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ISNI" element
         */
        public boolean isSetISNI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISNI$14) != 0;
            }
        }
        
        /**
         * Sets the "ISNI" element
         */
        public void setISNI(eu.openaire.cerifProfile.x11.ISNIType isni)
        {
            generatedSetterHelperImpl(isni, ISNI$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ISNI" element
         */
        public eu.openaire.cerifProfile.x11.ISNIType addNewISNI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ISNIType target = null;
                target = (eu.openaire.cerifProfile.x11.ISNIType)get_store().add_element_user(ISNI$14);
                return target;
            }
        }
        
        /**
         * Unsets the "ISNI" element
         */
        public void unsetISNI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISNI$14, 0);
            }
        }
        
        /**
         * Gets array of all "AlternativeISNI" elements
         */
        public eu.openaire.cerifProfile.x11.ISNIType[] getAlternativeISNIArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALTERNATIVEISNI$16, targetList);
                eu.openaire.cerifProfile.x11.ISNIType[] result = new eu.openaire.cerifProfile.x11.ISNIType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AlternativeISNI" element
         */
        public eu.openaire.cerifProfile.x11.ISNIType getAlternativeISNIArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ISNIType target = null;
                target = (eu.openaire.cerifProfile.x11.ISNIType)get_store().find_element_user(ALTERNATIVEISNI$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AlternativeISNI" element
         */
        public int sizeOfAlternativeISNIArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTERNATIVEISNI$16);
            }
        }
        
        /**
         * Sets array of all "AlternativeISNI" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAlternativeISNIArray(eu.openaire.cerifProfile.x11.ISNIType[] alternativeISNIArray)
        {
            check_orphaned();
            arraySetterHelper(alternativeISNIArray, ALTERNATIVEISNI$16);
        }
        
        /**
         * Sets ith "AlternativeISNI" element
         */
        public void setAlternativeISNIArray(int i, eu.openaire.cerifProfile.x11.ISNIType alternativeISNI)
        {
            generatedSetterHelperImpl(alternativeISNI, ALTERNATIVEISNI$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeISNI" element
         */
        public eu.openaire.cerifProfile.x11.ISNIType insertNewAlternativeISNI(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ISNIType target = null;
                target = (eu.openaire.cerifProfile.x11.ISNIType)get_store().insert_element_user(ALTERNATIVEISNI$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeISNI" element
         */
        public eu.openaire.cerifProfile.x11.ISNIType addNewAlternativeISNI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ISNIType target = null;
                target = (eu.openaire.cerifProfile.x11.ISNIType)get_store().add_element_user(ALTERNATIVEISNI$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "AlternativeISNI" element
         */
        public void removeAlternativeISNI(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTERNATIVEISNI$16, i);
            }
        }
        
        /**
         * Gets the "FundRefID" element
         */
        public eu.openaire.cerifProfile.x11.FundRefIDType getFundRefID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.FundRefIDType target = null;
                target = (eu.openaire.cerifProfile.x11.FundRefIDType)get_store().find_element_user(FUNDREFID$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "FundRefID" element
         */
        public boolean isSetFundRefID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FUNDREFID$18) != 0;
            }
        }
        
        /**
         * Sets the "FundRefID" element
         */
        public void setFundRefID(eu.openaire.cerifProfile.x11.FundRefIDType fundRefID)
        {
            generatedSetterHelperImpl(fundRefID, FUNDREFID$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "FundRefID" element
         */
        public eu.openaire.cerifProfile.x11.FundRefIDType addNewFundRefID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.FundRefIDType target = null;
                target = (eu.openaire.cerifProfile.x11.FundRefIDType)get_store().add_element_user(FUNDREFID$18);
                return target;
            }
        }
        
        /**
         * Unsets the "FundRefID" element
         */
        public void unsetFundRefID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FUNDREFID$18, 0);
            }
        }
        
        /**
         * Gets array of all "AlternativeFundRefID" elements
         */
        public eu.openaire.cerifProfile.x11.FundRefIDType[] getAlternativeFundRefIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALTERNATIVEFUNDREFID$20, targetList);
                eu.openaire.cerifProfile.x11.FundRefIDType[] result = new eu.openaire.cerifProfile.x11.FundRefIDType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AlternativeFundRefID" element
         */
        public eu.openaire.cerifProfile.x11.FundRefIDType getAlternativeFundRefIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.FundRefIDType target = null;
                target = (eu.openaire.cerifProfile.x11.FundRefIDType)get_store().find_element_user(ALTERNATIVEFUNDREFID$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AlternativeFundRefID" element
         */
        public int sizeOfAlternativeFundRefIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTERNATIVEFUNDREFID$20);
            }
        }
        
        /**
         * Sets array of all "AlternativeFundRefID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAlternativeFundRefIDArray(eu.openaire.cerifProfile.x11.FundRefIDType[] alternativeFundRefIDArray)
        {
            check_orphaned();
            arraySetterHelper(alternativeFundRefIDArray, ALTERNATIVEFUNDREFID$20);
        }
        
        /**
         * Sets ith "AlternativeFundRefID" element
         */
        public void setAlternativeFundRefIDArray(int i, eu.openaire.cerifProfile.x11.FundRefIDType alternativeFundRefID)
        {
            generatedSetterHelperImpl(alternativeFundRefID, ALTERNATIVEFUNDREFID$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeFundRefID" element
         */
        public eu.openaire.cerifProfile.x11.FundRefIDType insertNewAlternativeFundRefID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.FundRefIDType target = null;
                target = (eu.openaire.cerifProfile.x11.FundRefIDType)get_store().insert_element_user(ALTERNATIVEFUNDREFID$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeFundRefID" element
         */
        public eu.openaire.cerifProfile.x11.FundRefIDType addNewAlternativeFundRefID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.FundRefIDType target = null;
                target = (eu.openaire.cerifProfile.x11.FundRefIDType)get_store().add_element_user(ALTERNATIVEFUNDREFID$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "AlternativeFundRefID" element
         */
        public void removeAlternativeFundRefID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTERNATIVEFUNDREFID$20, i);
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
                get_store().find_all_element_users(IDENTIFIER$22, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().find_element_user(IDENTIFIER$22, i);
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
                return get_store().count_elements(IDENTIFIER$22);
            }
        }
        
        /**
         * Sets array of all "Identifier" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIdentifierArray(eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] identifierArray)
        {
            check_orphaned();
            arraySetterHelper(identifierArray, IDENTIFIER$22);
        }
        
        /**
         * Sets ith "Identifier" element
         */
        public void setIdentifierArray(int i, eu.openaire.cerifProfile.x11.CfGenericIdentifierType identifier)
        {
            generatedSetterHelperImpl(identifier, IDENTIFIER$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().insert_element_user(IDENTIFIER$22, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().add_element_user(IDENTIFIER$22);
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
                get_store().remove_element(IDENTIFIER$22, i);
            }
        }
        
        /**
         * Gets array of all "ElectronicAddress" elements
         */
        public java.lang.String[] getElectronicAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ELECTRONICADDRESS$24, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "ElectronicAddress" element
         */
        public java.lang.String getElectronicAddressArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTRONICADDRESS$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "ElectronicAddress" elements
         */
        public org.apache.xmlbeans.XmlAnyURI[] xgetElectronicAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ELECTRONICADDRESS$24, targetList);
                org.apache.xmlbeans.XmlAnyURI[] result = new org.apache.xmlbeans.XmlAnyURI[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "ElectronicAddress" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetElectronicAddressArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ELECTRONICADDRESS$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ElectronicAddress" element
         */
        public int sizeOfElectronicAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ELECTRONICADDRESS$24);
            }
        }
        
        /**
         * Sets array of all "ElectronicAddress" element
         */
        public void setElectronicAddressArray(java.lang.String[] electronicAddressArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(electronicAddressArray, ELECTRONICADDRESS$24);
            }
        }
        
        /**
         * Sets ith "ElectronicAddress" element
         */
        public void setElectronicAddressArray(int i, java.lang.String electronicAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTRONICADDRESS$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(electronicAddress);
            }
        }
        
        /**
         * Sets (as xml) array of all "ElectronicAddress" element
         */
        public void xsetElectronicAddressArray(org.apache.xmlbeans.XmlAnyURI[]electronicAddressArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(electronicAddressArray, ELECTRONICADDRESS$24);
            }
        }
        
        /**
         * Sets (as xml) ith "ElectronicAddress" element
         */
        public void xsetElectronicAddressArray(int i, org.apache.xmlbeans.XmlAnyURI electronicAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ELECTRONICADDRESS$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(electronicAddress);
            }
        }
        
        /**
         * Inserts the value as the ith "ElectronicAddress" element
         */
        public void insertElectronicAddress(int i, java.lang.String electronicAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ELECTRONICADDRESS$24, i);
                target.setStringValue(electronicAddress);
            }
        }
        
        /**
         * Appends the value as the last "ElectronicAddress" element
         */
        public void addElectronicAddress(java.lang.String electronicAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELECTRONICADDRESS$24);
                target.setStringValue(electronicAddress);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ElectronicAddress" element
         */
        public org.apache.xmlbeans.XmlAnyURI insertNewElectronicAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(ELECTRONICADDRESS$24, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ElectronicAddress" element
         */
        public org.apache.xmlbeans.XmlAnyURI addNewElectronicAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ELECTRONICADDRESS$24);
                return target;
            }
        }
        
        /**
         * Removes the ith "ElectronicAddress" element
         */
        public void removeElectronicAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ELECTRONICADDRESS$24, i);
            }
        }
        
        /**
         * Gets array of all "PartOf" elements
         */
        public eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf[] getPartOfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARTOF$26, targetList);
                eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf[] result = new eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PartOf" element
         */
        public eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf getPartOfArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf target = null;
                target = (eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf)get_store().find_element_user(PARTOF$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PartOf" element
         */
        public int sizeOfPartOfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARTOF$26);
            }
        }
        
        /**
         * Sets array of all "PartOf" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPartOfArray(eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf[] partOfArray)
        {
            check_orphaned();
            arraySetterHelper(partOfArray, PARTOF$26);
        }
        
        /**
         * Sets ith "PartOf" element
         */
        public void setPartOfArray(int i, eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf partOf)
        {
            generatedSetterHelperImpl(partOf, PARTOF$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PartOf" element
         */
        public eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf insertNewPartOf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf target = null;
                target = (eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf)get_store().insert_element_user(PARTOF$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PartOf" element
         */
        public eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf addNewPartOf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf target = null;
                target = (eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf)get_store().add_element_user(PARTOF$26);
                return target;
            }
        }
        
        /**
         * Removes the ith "PartOf" element
         */
        public void removePartOf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARTOF$26, i);
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
                get_store().find_all_element_users(CLASSIFICATION$28, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(CLASSIFICATION$28, i);
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
                return get_store().count_elements(CLASSIFICATION$28);
            }
        }
        
        /**
         * Sets array of all "Classification" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setClassificationArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] classificationArray)
        {
            check_orphaned();
            arraySetterHelper(classificationArray, CLASSIFICATION$28);
        }
        
        /**
         * Sets ith "Classification" element
         */
        public void setClassificationArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType classification)
        {
            generatedSetterHelperImpl(classification, CLASSIFICATION$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(CLASSIFICATION$28, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(CLASSIFICATION$28);
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
                get_store().remove_element(CLASSIFICATION$28, i);
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
                get_store().find_all_element_users(LINK$30, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().find_element_user(LINK$30, i);
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
                return get_store().count_elements(LINK$30);
            }
        }
        
        /**
         * Sets array of all "Link" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLinkArray(eu.openaire.cerifProfile.x11.CfGenericLinkType[] linkArray)
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$30);
        }
        
        /**
         * Sets ith "Link" element
         */
        public void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfGenericLinkType link)
        {
            generatedSetterHelperImpl(link, LINK$30, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().insert_element_user(LINK$30, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().add_element_user(LINK$30);
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
                get_store().remove_element(LINK$30, i);
            }
        }
        /**
         * An XML PartOf(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class PartOfImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkWithDisplayNameBaseTypeImpl implements eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf
        {
            private static final long serialVersionUID = 1L;
            
            public PartOfImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ORGUNIT$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit");
            
            
            /**
             * Gets the "OrgUnit" element
             */
            public eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit getOrgUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit target = null;
                    target = (eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit)get_store().find_element_user(ORGUNIT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "OrgUnit" element
             */
            public void setOrgUnit(eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit orgUnit)
            {
                generatedSetterHelperImpl(orgUnit, ORGUNIT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "OrgUnit" element
             */
            public eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit addNewOrgUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit target = null;
                    target = (eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit)get_store().add_element_user(ORGUNIT$0);
                    return target;
                }
            }
        }
    }
}
