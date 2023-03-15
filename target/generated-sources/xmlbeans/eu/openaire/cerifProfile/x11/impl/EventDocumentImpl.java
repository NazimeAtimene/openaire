/*
 * An XML document type.
 * Localname: Event
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.EventDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one Event(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class EventDocumentImpl extends eu.openaire.cerifProfile.x11.impl.IndividualSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.EventDocument
{
    private static final long serialVersionUID = 1L;
    
    public EventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Event");
    
    
    /**
     * Gets the "Event" element
     */
    public eu.openaire.cerifProfile.x11.EventDocument.Event getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.EventDocument.Event target = null;
            target = (eu.openaire.cerifProfile.x11.EventDocument.Event)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Event" element
     */
    public void setEvent(eu.openaire.cerifProfile.x11.EventDocument.Event event)
    {
        generatedSetterHelperImpl(event, EVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Event" element
     */
    public eu.openaire.cerifProfile.x11.EventDocument.Event addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.EventDocument.Event target = null;
            target = (eu.openaire.cerifProfile.x11.EventDocument.Event)get_store().add_element_user(EVENT$0);
            return target;
        }
    }
    /**
     * An XML Event(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class EventImpl extends eu.openaire.cerifProfile.x11.impl.CfIdAttrBaseTypeImpl implements eu.openaire.cerifProfile.x11.EventDocument.Event
    {
        private static final long serialVersionUID = 1L;
        
        public EventImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Type");
        private static final javax.xml.namespace.QName ACRONYM$2 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Acronym");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Name");
        private static final javax.xml.namespace.QName PLACE$6 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Place");
        private static final javax.xml.namespace.QName COUNTRY$8 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Country");
        private static final javax.xml.namespace.QName STARTDATE$10 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "StartDate");
        private static final javax.xml.namespace.QName ENDDATE$12 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "EndDate");
        private static final javax.xml.namespace.QName DESCRIPTION$14 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Description");
        private static final javax.xml.namespace.QName SUBJECT$16 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Subject");
        private static final javax.xml.namespace.QName KEYWORD$18 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Keyword");
        private static final javax.xml.namespace.QName ORGANIZER$20 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Organizer");
        private static final javax.xml.namespace.QName SPONSOR$22 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Sponsor");
        private static final javax.xml.namespace.QName PARTNER$24 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Partner");
        private static final javax.xml.namespace.QName CLASSIFICATION$26 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Classification");
        private static final javax.xml.namespace.QName LINK$28 = 
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
         * Gets the "Place" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getPlace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(PLACE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Place" element
         */
        public boolean isSetPlace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLACE$6) != 0;
            }
        }
        
        /**
         * Sets the "Place" element
         */
        public void setPlace(eu.openaire.cerifProfile.x11.CfStringType place)
        {
            generatedSetterHelperImpl(place, PLACE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Place" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewPlace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(PLACE$6);
                return target;
            }
        }
        
        /**
         * Unsets the "Place" element
         */
        public void unsetPlace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLACE$6, 0);
            }
        }
        
        /**
         * Gets the "Country" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(COUNTRY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Country" element
         */
        public boolean isSetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COUNTRY$8) != 0;
            }
        }
        
        /**
         * Sets the "Country" element
         */
        public void setCountry(eu.openaire.cerifProfile.x11.CfStringType country)
        {
            generatedSetterHelperImpl(country, COUNTRY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Country" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(COUNTRY$8);
                return target;
            }
        }
        
        /**
         * Unsets the "Country" element
         */
        public void unsetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COUNTRY$8, 0);
            }
        }
        
        /**
         * Gets the "StartDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().find_element_user(STARTDATE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "StartDate" element
         */
        public boolean isSetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTDATE$10) != 0;
            }
        }
        
        /**
         * Sets the "StartDate" element
         */
        public void setStartDate(eu.openaire.cerifProfile.x11.CfDateType startDate)
        {
            generatedSetterHelperImpl(startDate, STARTDATE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "StartDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType addNewStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().add_element_user(STARTDATE$10);
                return target;
            }
        }
        
        /**
         * Unsets the "StartDate" element
         */
        public void unsetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTDATE$10, 0);
            }
        }
        
        /**
         * Gets the "EndDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().find_element_user(ENDDATE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "EndDate" element
         */
        public boolean isSetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDDATE$12) != 0;
            }
        }
        
        /**
         * Sets the "EndDate" element
         */
        public void setEndDate(eu.openaire.cerifProfile.x11.CfDateType endDate)
        {
            generatedSetterHelperImpl(endDate, ENDDATE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "EndDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType addNewEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().add_element_user(ENDDATE$12);
                return target;
            }
        }
        
        /**
         * Unsets the "EndDate" element
         */
        public void unsetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDDATE$12, 0);
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
                get_store().find_all_element_users(DESCRIPTION$14, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(DESCRIPTION$14, i);
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
                return get_store().count_elements(DESCRIPTION$14);
            }
        }
        
        /**
         * Sets array of all "Description" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDescriptionArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] descriptionArray)
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$14);
        }
        
        /**
         * Sets ith "Description" element
         */
        public void setDescriptionArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType description)
        {
            generatedSetterHelperImpl(description, DESCRIPTION$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(DESCRIPTION$14, i);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(DESCRIPTION$14);
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
                get_store().remove_element(DESCRIPTION$14, i);
            }
        }
        
        /**
         * Gets array of all "Subject" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getSubjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBJECT$16, targetList);
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] result = new eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Subject" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getSubjectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(SUBJECT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Subject" element
         */
        public int sizeOfSubjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBJECT$16);
            }
        }
        
        /**
         * Sets array of all "Subject" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSubjectArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] subjectArray)
        {
            check_orphaned();
            arraySetterHelper(subjectArray, SUBJECT$16);
        }
        
        /**
         * Sets ith "Subject" element
         */
        public void setSubjectArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType subject)
        {
            generatedSetterHelperImpl(subject, SUBJECT$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Subject" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewSubject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(SUBJECT$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Subject" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(SUBJECT$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "Subject" element
         */
        public void removeSubject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBJECT$16, i);
            }
        }
        
        /**
         * Gets array of all "Keyword" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getKeywordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYWORD$18, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Keyword" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType getKeywordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(KEYWORD$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Keyword" element
         */
        public int sizeOfKeywordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYWORD$18);
            }
        }
        
        /**
         * Sets array of all "Keyword" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setKeywordArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] keywordArray)
        {
            check_orphaned();
            arraySetterHelper(keywordArray, KEYWORD$18);
        }
        
        /**
         * Sets ith "Keyword" element
         */
        public void setKeywordArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType keyword)
        {
            generatedSetterHelperImpl(keyword, KEYWORD$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Keyword" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewKeyword(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(KEYWORD$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Keyword" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType addNewKeyword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(KEYWORD$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "Keyword" element
         */
        public void removeKeyword(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYWORD$18, i);
            }
        }
        
        /**
         * Gets array of all "Organizer" elements
         */
        public eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer[] getOrganizerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORGANIZER$20, targetList);
                eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer[] result = new eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Organizer" element
         */
        public eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer getOrganizerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer target = null;
                target = (eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer)get_store().find_element_user(ORGANIZER$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Organizer" element
         */
        public int sizeOfOrganizerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANIZER$20);
            }
        }
        
        /**
         * Sets array of all "Organizer" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOrganizerArray(eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer[] organizerArray)
        {
            check_orphaned();
            arraySetterHelper(organizerArray, ORGANIZER$20);
        }
        
        /**
         * Sets ith "Organizer" element
         */
        public void setOrganizerArray(int i, eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer organizer)
        {
            generatedSetterHelperImpl(organizer, ORGANIZER$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Organizer" element
         */
        public eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer insertNewOrganizer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer target = null;
                target = (eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer)get_store().insert_element_user(ORGANIZER$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Organizer" element
         */
        public eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer addNewOrganizer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer target = null;
                target = (eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer)get_store().add_element_user(ORGANIZER$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "Organizer" element
         */
        public void removeOrganizer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANIZER$20, i);
            }
        }
        
        /**
         * Gets array of all "Sponsor" elements
         */
        public eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor[] getSponsorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SPONSOR$22, targetList);
                eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor[] result = new eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Sponsor" element
         */
        public eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor getSponsorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor target = null;
                target = (eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor)get_store().find_element_user(SPONSOR$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Sponsor" element
         */
        public int sizeOfSponsorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SPONSOR$22);
            }
        }
        
        /**
         * Sets array of all "Sponsor" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSponsorArray(eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor[] sponsorArray)
        {
            check_orphaned();
            arraySetterHelper(sponsorArray, SPONSOR$22);
        }
        
        /**
         * Sets ith "Sponsor" element
         */
        public void setSponsorArray(int i, eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor sponsor)
        {
            generatedSetterHelperImpl(sponsor, SPONSOR$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Sponsor" element
         */
        public eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor insertNewSponsor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor target = null;
                target = (eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor)get_store().insert_element_user(SPONSOR$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Sponsor" element
         */
        public eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor addNewSponsor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor target = null;
                target = (eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor)get_store().add_element_user(SPONSOR$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "Sponsor" element
         */
        public void removeSponsor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SPONSOR$22, i);
            }
        }
        
        /**
         * Gets array of all "Partner" elements
         */
        public eu.openaire.cerifProfile.x11.EventDocument.Event.Partner[] getPartnerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARTNER$24, targetList);
                eu.openaire.cerifProfile.x11.EventDocument.Event.Partner[] result = new eu.openaire.cerifProfile.x11.EventDocument.Event.Partner[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Partner" element
         */
        public eu.openaire.cerifProfile.x11.EventDocument.Event.Partner getPartnerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.EventDocument.Event.Partner target = null;
                target = (eu.openaire.cerifProfile.x11.EventDocument.Event.Partner)get_store().find_element_user(PARTNER$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Partner" element
         */
        public int sizeOfPartnerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARTNER$24);
            }
        }
        
        /**
         * Sets array of all "Partner" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPartnerArray(eu.openaire.cerifProfile.x11.EventDocument.Event.Partner[] partnerArray)
        {
            check_orphaned();
            arraySetterHelper(partnerArray, PARTNER$24);
        }
        
        /**
         * Sets ith "Partner" element
         */
        public void setPartnerArray(int i, eu.openaire.cerifProfile.x11.EventDocument.Event.Partner partner)
        {
            generatedSetterHelperImpl(partner, PARTNER$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Partner" element
         */
        public eu.openaire.cerifProfile.x11.EventDocument.Event.Partner insertNewPartner(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.EventDocument.Event.Partner target = null;
                target = (eu.openaire.cerifProfile.x11.EventDocument.Event.Partner)get_store().insert_element_user(PARTNER$24, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Partner" element
         */
        public eu.openaire.cerifProfile.x11.EventDocument.Event.Partner addNewPartner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.EventDocument.Event.Partner target = null;
                target = (eu.openaire.cerifProfile.x11.EventDocument.Event.Partner)get_store().add_element_user(PARTNER$24);
                return target;
            }
        }
        
        /**
         * Removes the ith "Partner" element
         */
        public void removePartner(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARTNER$24, i);
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
                get_store().find_all_element_users(CLASSIFICATION$26, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(CLASSIFICATION$26, i);
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
                return get_store().count_elements(CLASSIFICATION$26);
            }
        }
        
        /**
         * Sets array of all "Classification" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setClassificationArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] classificationArray)
        {
            check_orphaned();
            arraySetterHelper(classificationArray, CLASSIFICATION$26);
        }
        
        /**
         * Sets ith "Classification" element
         */
        public void setClassificationArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType classification)
        {
            generatedSetterHelperImpl(classification, CLASSIFICATION$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(CLASSIFICATION$26, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(CLASSIFICATION$26);
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
                get_store().remove_element(CLASSIFICATION$26, i);
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
                get_store().find_all_element_users(LINK$28, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().find_element_user(LINK$28, i);
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
                return get_store().count_elements(LINK$28);
            }
        }
        
        /**
         * Sets array of all "Link" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLinkArray(eu.openaire.cerifProfile.x11.CfGenericLinkType[] linkArray)
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$28);
        }
        
        /**
         * Sets ith "Link" element
         */
        public void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfGenericLinkType link)
        {
            generatedSetterHelperImpl(link, LINK$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().insert_element_user(LINK$28, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().add_element_user(LINK$28);
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
                get_store().remove_element(LINK$28, i);
            }
        }
        /**
         * An XML Organizer(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class OrganizerImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer
        {
            private static final long serialVersionUID = 1L;
            
            public OrganizerImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ORGUNIT$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit");
            private static final javax.xml.namespace.QName PROJECT$2 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Project");
            
            
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
             * True if has "OrgUnit" element
             */
            public boolean isSetOrgUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORGUNIT$0) != 0;
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
             * Unsets the "OrgUnit" element
             */
            public void unsetOrgUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORGUNIT$0, 0);
                }
            }
            
            /**
             * Gets the "Project" element
             */
            public eu.openaire.cerifProfile.x11.ProjectDocument.Project getProject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ProjectDocument.Project target = null;
                    target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project)get_store().find_element_user(PROJECT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Project" element
             */
            public boolean isSetProject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PROJECT$2) != 0;
                }
            }
            
            /**
             * Sets the "Project" element
             */
            public void setProject(eu.openaire.cerifProfile.x11.ProjectDocument.Project project)
            {
                generatedSetterHelperImpl(project, PROJECT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Project" element
             */
            public eu.openaire.cerifProfile.x11.ProjectDocument.Project addNewProject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ProjectDocument.Project target = null;
                    target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project)get_store().add_element_user(PROJECT$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "Project" element
             */
            public void unsetProject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PROJECT$2, 0);
                }
            }
        }
        /**
         * An XML Sponsor(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class SponsorImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor
        {
            private static final long serialVersionUID = 1L;
            
            public SponsorImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ORGUNIT$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit");
            private static final javax.xml.namespace.QName PROJECT$2 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Project");
            
            
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
             * True if has "OrgUnit" element
             */
            public boolean isSetOrgUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORGUNIT$0) != 0;
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
             * Unsets the "OrgUnit" element
             */
            public void unsetOrgUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORGUNIT$0, 0);
                }
            }
            
            /**
             * Gets the "Project" element
             */
            public eu.openaire.cerifProfile.x11.ProjectDocument.Project getProject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ProjectDocument.Project target = null;
                    target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project)get_store().find_element_user(PROJECT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Project" element
             */
            public boolean isSetProject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PROJECT$2) != 0;
                }
            }
            
            /**
             * Sets the "Project" element
             */
            public void setProject(eu.openaire.cerifProfile.x11.ProjectDocument.Project project)
            {
                generatedSetterHelperImpl(project, PROJECT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Project" element
             */
            public eu.openaire.cerifProfile.x11.ProjectDocument.Project addNewProject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ProjectDocument.Project target = null;
                    target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project)get_store().add_element_user(PROJECT$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "Project" element
             */
            public void unsetProject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PROJECT$2, 0);
                }
            }
        }
        /**
         * An XML Partner(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class PartnerImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.EventDocument.Event.Partner
        {
            private static final long serialVersionUID = 1L;
            
            public PartnerImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ORGUNIT$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit");
            private static final javax.xml.namespace.QName PROJECT$2 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Project");
            
            
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
             * True if has "OrgUnit" element
             */
            public boolean isSetOrgUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORGUNIT$0) != 0;
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
             * Unsets the "OrgUnit" element
             */
            public void unsetOrgUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORGUNIT$0, 0);
                }
            }
            
            /**
             * Gets the "Project" element
             */
            public eu.openaire.cerifProfile.x11.ProjectDocument.Project getProject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ProjectDocument.Project target = null;
                    target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project)get_store().find_element_user(PROJECT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Project" element
             */
            public boolean isSetProject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PROJECT$2) != 0;
                }
            }
            
            /**
             * Sets the "Project" element
             */
            public void setProject(eu.openaire.cerifProfile.x11.ProjectDocument.Project project)
            {
                generatedSetterHelperImpl(project, PROJECT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Project" element
             */
            public eu.openaire.cerifProfile.x11.ProjectDocument.Project addNewProject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ProjectDocument.Project target = null;
                    target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project)get_store().add_element_user(PROJECT$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "Project" element
             */
            public void unsetProject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PROJECT$2, 0);
                }
            }
        }
    }
}
