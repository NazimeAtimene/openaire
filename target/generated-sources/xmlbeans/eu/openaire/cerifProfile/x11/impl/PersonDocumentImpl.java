/*
 * An XML document type.
 * Localname: Person
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.PersonDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one Person(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class PersonDocumentImpl extends eu.openaire.cerifProfile.x11.impl.PersonSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.PersonDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSON$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Person");
    
    
    /**
     * Gets the "Person" element
     */
    public eu.openaire.cerifProfile.x11.PersonDocument.Person getPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.PersonDocument.Person target = null;
            target = (eu.openaire.cerifProfile.x11.PersonDocument.Person)get_store().find_element_user(PERSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Person" element
     */
    public void setPerson(eu.openaire.cerifProfile.x11.PersonDocument.Person person)
    {
        generatedSetterHelperImpl(person, PERSON$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Person" element
     */
    public eu.openaire.cerifProfile.x11.PersonDocument.Person addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.PersonDocument.Person target = null;
            target = (eu.openaire.cerifProfile.x11.PersonDocument.Person)get_store().add_element_user(PERSON$0);
            return target;
        }
    }
    /**
     * An XML Person(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class PersonImpl extends eu.openaire.cerifProfile.x11.impl.PersonBaseTypeImpl implements eu.openaire.cerifProfile.x11.PersonDocument.Person
    {
        private static final long serialVersionUID = 1L;
        
        public PersonImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PERSONNAME$0 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PersonName");
        private static final javax.xml.namespace.QName GENDER$2 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Gender");
        private static final javax.xml.namespace.QName ORCID$4 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ORCID");
        private static final javax.xml.namespace.QName ALTERNATIVEORCID$6 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "AlternativeORCID");
        private static final javax.xml.namespace.QName RESEARCHERID$8 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ResearcherID");
        private static final javax.xml.namespace.QName ALTERNATIVERESEARCHERID$10 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "AlternativeResearcherID");
        private static final javax.xml.namespace.QName SCOPUSAUTHORID$12 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ScopusAuthorID");
        private static final javax.xml.namespace.QName ALTERNATIVESCOPUSAUTHORID$14 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "AlternativeScopusAuthorID");
        private static final javax.xml.namespace.QName ISNI$16 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ISNI");
        private static final javax.xml.namespace.QName ALTERNATIVEISNI$18 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "AlternativeISNI");
        private static final javax.xml.namespace.QName DAI$20 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "DAI");
        private static final javax.xml.namespace.QName ALTERNATIVEDAI$22 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "AlternativeDAI");
        private static final javax.xml.namespace.QName ELECTRONICADDRESS$24 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ElectronicAddress");
        private static final javax.xml.namespace.QName AFFILIATION$26 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Affiliation");
        private static final javax.xml.namespace.QName CLASSIFICATION$28 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Classification");
        private static final javax.xml.namespace.QName LINK$30 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Link");
        
        
        /**
         * Gets the "PersonName" element
         */
        public eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName getPersonName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName target = null;
                target = (eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName)get_store().find_element_user(PERSONNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PersonName" element
         */
        public boolean isSetPersonName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERSONNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "PersonName" element
         */
        public void setPersonName(eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName personName)
        {
            generatedSetterHelperImpl(personName, PERSONNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "PersonName" element
         */
        public eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName addNewPersonName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName target = null;
                target = (eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName)get_store().add_element_user(PERSONNAME$0);
                return target;
            }
        }
        
        /**
         * Unsets the "PersonName" element
         */
        public void unsetPersonName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERSONNAME$0, 0);
            }
        }
        
        /**
         * Gets the "Gender" element
         */
        public eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender.Enum getGender()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Gender" element
         */
        public eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender xgetGender()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender target = null;
                target = (eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender)get_store().find_element_user(GENDER$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Gender" element
         */
        public boolean isSetGender()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENDER$2) != 0;
            }
        }
        
        /**
         * Sets the "Gender" element
         */
        public void setGender(eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender.Enum gender)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENDER$2);
                }
                target.setEnumValue(gender);
            }
        }
        
        /**
         * Sets (as xml) the "Gender" element
         */
        public void xsetGender(eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender gender)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender target = null;
                target = (eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender)get_store().find_element_user(GENDER$2, 0);
                if (target == null)
                {
                    target = (eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender)get_store().add_element_user(GENDER$2);
                }
                target.set(gender);
            }
        }
        
        /**
         * Unsets the "Gender" element
         */
        public void unsetGender()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENDER$2, 0);
            }
        }
        
        /**
         * Gets the "ORCID" element
         */
        public eu.openaire.cerifProfile.x11.ORCIDType getORCID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ORCIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ORCIDType)get_store().find_element_user(ORCID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ORCID" element
         */
        public boolean isSetORCID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORCID$4) != 0;
            }
        }
        
        /**
         * Sets the "ORCID" element
         */
        public void setORCID(eu.openaire.cerifProfile.x11.ORCIDType orcid)
        {
            generatedSetterHelperImpl(orcid, ORCID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ORCID" element
         */
        public eu.openaire.cerifProfile.x11.ORCIDType addNewORCID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ORCIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ORCIDType)get_store().add_element_user(ORCID$4);
                return target;
            }
        }
        
        /**
         * Unsets the "ORCID" element
         */
        public void unsetORCID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORCID$4, 0);
            }
        }
        
        /**
         * Gets array of all "AlternativeORCID" elements
         */
        public eu.openaire.cerifProfile.x11.ORCIDType[] getAlternativeORCIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALTERNATIVEORCID$6, targetList);
                eu.openaire.cerifProfile.x11.ORCIDType[] result = new eu.openaire.cerifProfile.x11.ORCIDType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AlternativeORCID" element
         */
        public eu.openaire.cerifProfile.x11.ORCIDType getAlternativeORCIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ORCIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ORCIDType)get_store().find_element_user(ALTERNATIVEORCID$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AlternativeORCID" element
         */
        public int sizeOfAlternativeORCIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTERNATIVEORCID$6);
            }
        }
        
        /**
         * Sets array of all "AlternativeORCID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAlternativeORCIDArray(eu.openaire.cerifProfile.x11.ORCIDType[] alternativeORCIDArray)
        {
            check_orphaned();
            arraySetterHelper(alternativeORCIDArray, ALTERNATIVEORCID$6);
        }
        
        /**
         * Sets ith "AlternativeORCID" element
         */
        public void setAlternativeORCIDArray(int i, eu.openaire.cerifProfile.x11.ORCIDType alternativeORCID)
        {
            generatedSetterHelperImpl(alternativeORCID, ALTERNATIVEORCID$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeORCID" element
         */
        public eu.openaire.cerifProfile.x11.ORCIDType insertNewAlternativeORCID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ORCIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ORCIDType)get_store().insert_element_user(ALTERNATIVEORCID$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeORCID" element
         */
        public eu.openaire.cerifProfile.x11.ORCIDType addNewAlternativeORCID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ORCIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ORCIDType)get_store().add_element_user(ALTERNATIVEORCID$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "AlternativeORCID" element
         */
        public void removeAlternativeORCID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTERNATIVEORCID$6, i);
            }
        }
        
        /**
         * Gets the "ResearcherID" element
         */
        public eu.openaire.cerifProfile.x11.ResearcherIDType getResearcherID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ResearcherIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ResearcherIDType)get_store().find_element_user(RESEARCHERID$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ResearcherID" element
         */
        public boolean isSetResearcherID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESEARCHERID$8) != 0;
            }
        }
        
        /**
         * Sets the "ResearcherID" element
         */
        public void setResearcherID(eu.openaire.cerifProfile.x11.ResearcherIDType researcherID)
        {
            generatedSetterHelperImpl(researcherID, RESEARCHERID$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ResearcherID" element
         */
        public eu.openaire.cerifProfile.x11.ResearcherIDType addNewResearcherID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ResearcherIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ResearcherIDType)get_store().add_element_user(RESEARCHERID$8);
                return target;
            }
        }
        
        /**
         * Unsets the "ResearcherID" element
         */
        public void unsetResearcherID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESEARCHERID$8, 0);
            }
        }
        
        /**
         * Gets array of all "AlternativeResearcherID" elements
         */
        public eu.openaire.cerifProfile.x11.ResearcherIDType[] getAlternativeResearcherIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALTERNATIVERESEARCHERID$10, targetList);
                eu.openaire.cerifProfile.x11.ResearcherIDType[] result = new eu.openaire.cerifProfile.x11.ResearcherIDType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AlternativeResearcherID" element
         */
        public eu.openaire.cerifProfile.x11.ResearcherIDType getAlternativeResearcherIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ResearcherIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ResearcherIDType)get_store().find_element_user(ALTERNATIVERESEARCHERID$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AlternativeResearcherID" element
         */
        public int sizeOfAlternativeResearcherIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTERNATIVERESEARCHERID$10);
            }
        }
        
        /**
         * Sets array of all "AlternativeResearcherID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAlternativeResearcherIDArray(eu.openaire.cerifProfile.x11.ResearcherIDType[] alternativeResearcherIDArray)
        {
            check_orphaned();
            arraySetterHelper(alternativeResearcherIDArray, ALTERNATIVERESEARCHERID$10);
        }
        
        /**
         * Sets ith "AlternativeResearcherID" element
         */
        public void setAlternativeResearcherIDArray(int i, eu.openaire.cerifProfile.x11.ResearcherIDType alternativeResearcherID)
        {
            generatedSetterHelperImpl(alternativeResearcherID, ALTERNATIVERESEARCHERID$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeResearcherID" element
         */
        public eu.openaire.cerifProfile.x11.ResearcherIDType insertNewAlternativeResearcherID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ResearcherIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ResearcherIDType)get_store().insert_element_user(ALTERNATIVERESEARCHERID$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeResearcherID" element
         */
        public eu.openaire.cerifProfile.x11.ResearcherIDType addNewAlternativeResearcherID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ResearcherIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ResearcherIDType)get_store().add_element_user(ALTERNATIVERESEARCHERID$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "AlternativeResearcherID" element
         */
        public void removeAlternativeResearcherID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTERNATIVERESEARCHERID$10, i);
            }
        }
        
        /**
         * Gets the "ScopusAuthorID" element
         */
        public eu.openaire.cerifProfile.x11.ScopusAuthorIDType getScopusAuthorID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ScopusAuthorIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ScopusAuthorIDType)get_store().find_element_user(SCOPUSAUTHORID$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ScopusAuthorID" element
         */
        public boolean isSetScopusAuthorID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCOPUSAUTHORID$12) != 0;
            }
        }
        
        /**
         * Sets the "ScopusAuthorID" element
         */
        public void setScopusAuthorID(eu.openaire.cerifProfile.x11.ScopusAuthorIDType scopusAuthorID)
        {
            generatedSetterHelperImpl(scopusAuthorID, SCOPUSAUTHORID$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ScopusAuthorID" element
         */
        public eu.openaire.cerifProfile.x11.ScopusAuthorIDType addNewScopusAuthorID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ScopusAuthorIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ScopusAuthorIDType)get_store().add_element_user(SCOPUSAUTHORID$12);
                return target;
            }
        }
        
        /**
         * Unsets the "ScopusAuthorID" element
         */
        public void unsetScopusAuthorID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCOPUSAUTHORID$12, 0);
            }
        }
        
        /**
         * Gets array of all "AlternativeScopusAuthorID" elements
         */
        public eu.openaire.cerifProfile.x11.ScopusAuthorIDType[] getAlternativeScopusAuthorIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALTERNATIVESCOPUSAUTHORID$14, targetList);
                eu.openaire.cerifProfile.x11.ScopusAuthorIDType[] result = new eu.openaire.cerifProfile.x11.ScopusAuthorIDType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AlternativeScopusAuthorID" element
         */
        public eu.openaire.cerifProfile.x11.ScopusAuthorIDType getAlternativeScopusAuthorIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ScopusAuthorIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ScopusAuthorIDType)get_store().find_element_user(ALTERNATIVESCOPUSAUTHORID$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AlternativeScopusAuthorID" element
         */
        public int sizeOfAlternativeScopusAuthorIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTERNATIVESCOPUSAUTHORID$14);
            }
        }
        
        /**
         * Sets array of all "AlternativeScopusAuthorID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAlternativeScopusAuthorIDArray(eu.openaire.cerifProfile.x11.ScopusAuthorIDType[] alternativeScopusAuthorIDArray)
        {
            check_orphaned();
            arraySetterHelper(alternativeScopusAuthorIDArray, ALTERNATIVESCOPUSAUTHORID$14);
        }
        
        /**
         * Sets ith "AlternativeScopusAuthorID" element
         */
        public void setAlternativeScopusAuthorIDArray(int i, eu.openaire.cerifProfile.x11.ScopusAuthorIDType alternativeScopusAuthorID)
        {
            generatedSetterHelperImpl(alternativeScopusAuthorID, ALTERNATIVESCOPUSAUTHORID$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeScopusAuthorID" element
         */
        public eu.openaire.cerifProfile.x11.ScopusAuthorIDType insertNewAlternativeScopusAuthorID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ScopusAuthorIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ScopusAuthorIDType)get_store().insert_element_user(ALTERNATIVESCOPUSAUTHORID$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeScopusAuthorID" element
         */
        public eu.openaire.cerifProfile.x11.ScopusAuthorIDType addNewAlternativeScopusAuthorID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ScopusAuthorIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ScopusAuthorIDType)get_store().add_element_user(ALTERNATIVESCOPUSAUTHORID$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "AlternativeScopusAuthorID" element
         */
        public void removeAlternativeScopusAuthorID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTERNATIVESCOPUSAUTHORID$14, i);
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
                target = (eu.openaire.cerifProfile.x11.ISNIType)get_store().find_element_user(ISNI$16, 0);
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
                return get_store().count_elements(ISNI$16) != 0;
            }
        }
        
        /**
         * Sets the "ISNI" element
         */
        public void setISNI(eu.openaire.cerifProfile.x11.ISNIType isni)
        {
            generatedSetterHelperImpl(isni, ISNI$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (eu.openaire.cerifProfile.x11.ISNIType)get_store().add_element_user(ISNI$16);
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
                get_store().remove_element(ISNI$16, 0);
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
                get_store().find_all_element_users(ALTERNATIVEISNI$18, targetList);
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
                target = (eu.openaire.cerifProfile.x11.ISNIType)get_store().find_element_user(ALTERNATIVEISNI$18, i);
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
                return get_store().count_elements(ALTERNATIVEISNI$18);
            }
        }
        
        /**
         * Sets array of all "AlternativeISNI" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAlternativeISNIArray(eu.openaire.cerifProfile.x11.ISNIType[] alternativeISNIArray)
        {
            check_orphaned();
            arraySetterHelper(alternativeISNIArray, ALTERNATIVEISNI$18);
        }
        
        /**
         * Sets ith "AlternativeISNI" element
         */
        public void setAlternativeISNIArray(int i, eu.openaire.cerifProfile.x11.ISNIType alternativeISNI)
        {
            generatedSetterHelperImpl(alternativeISNI, ALTERNATIVEISNI$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.ISNIType)get_store().insert_element_user(ALTERNATIVEISNI$18, i);
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
                target = (eu.openaire.cerifProfile.x11.ISNIType)get_store().add_element_user(ALTERNATIVEISNI$18);
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
                get_store().remove_element(ALTERNATIVEISNI$18, i);
            }
        }
        
        /**
         * Gets the "DAI" element
         */
        public eu.openaire.cerifProfile.x11.DAIType getDAI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.DAIType target = null;
                target = (eu.openaire.cerifProfile.x11.DAIType)get_store().find_element_user(DAI$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DAI" element
         */
        public boolean isSetDAI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DAI$20) != 0;
            }
        }
        
        /**
         * Sets the "DAI" element
         */
        public void setDAI(eu.openaire.cerifProfile.x11.DAIType dai)
        {
            generatedSetterHelperImpl(dai, DAI$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DAI" element
         */
        public eu.openaire.cerifProfile.x11.DAIType addNewDAI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.DAIType target = null;
                target = (eu.openaire.cerifProfile.x11.DAIType)get_store().add_element_user(DAI$20);
                return target;
            }
        }
        
        /**
         * Unsets the "DAI" element
         */
        public void unsetDAI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DAI$20, 0);
            }
        }
        
        /**
         * Gets array of all "AlternativeDAI" elements
         */
        public eu.openaire.cerifProfile.x11.DAIType[] getAlternativeDAIArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALTERNATIVEDAI$22, targetList);
                eu.openaire.cerifProfile.x11.DAIType[] result = new eu.openaire.cerifProfile.x11.DAIType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AlternativeDAI" element
         */
        public eu.openaire.cerifProfile.x11.DAIType getAlternativeDAIArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.DAIType target = null;
                target = (eu.openaire.cerifProfile.x11.DAIType)get_store().find_element_user(ALTERNATIVEDAI$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AlternativeDAI" element
         */
        public int sizeOfAlternativeDAIArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTERNATIVEDAI$22);
            }
        }
        
        /**
         * Sets array of all "AlternativeDAI" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAlternativeDAIArray(eu.openaire.cerifProfile.x11.DAIType[] alternativeDAIArray)
        {
            check_orphaned();
            arraySetterHelper(alternativeDAIArray, ALTERNATIVEDAI$22);
        }
        
        /**
         * Sets ith "AlternativeDAI" element
         */
        public void setAlternativeDAIArray(int i, eu.openaire.cerifProfile.x11.DAIType alternativeDAI)
        {
            generatedSetterHelperImpl(alternativeDAI, ALTERNATIVEDAI$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeDAI" element
         */
        public eu.openaire.cerifProfile.x11.DAIType insertNewAlternativeDAI(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.DAIType target = null;
                target = (eu.openaire.cerifProfile.x11.DAIType)get_store().insert_element_user(ALTERNATIVEDAI$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeDAI" element
         */
        public eu.openaire.cerifProfile.x11.DAIType addNewAlternativeDAI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.DAIType target = null;
                target = (eu.openaire.cerifProfile.x11.DAIType)get_store().add_element_user(ALTERNATIVEDAI$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "AlternativeDAI" element
         */
        public void removeAlternativeDAI(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTERNATIVEDAI$22, i);
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
         * Gets array of all "Affiliation" elements
         */
        public eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation[] getAffiliationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AFFILIATION$26, targetList);
                eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation[] result = new eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Affiliation" element
         */
        public eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation getAffiliationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation target = null;
                target = (eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation)get_store().find_element_user(AFFILIATION$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Affiliation" element
         */
        public int sizeOfAffiliationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AFFILIATION$26);
            }
        }
        
        /**
         * Sets array of all "Affiliation" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAffiliationArray(eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation[] affiliationArray)
        {
            check_orphaned();
            arraySetterHelper(affiliationArray, AFFILIATION$26);
        }
        
        /**
         * Sets ith "Affiliation" element
         */
        public void setAffiliationArray(int i, eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation affiliation)
        {
            generatedSetterHelperImpl(affiliation, AFFILIATION$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Affiliation" element
         */
        public eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation insertNewAffiliation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation target = null;
                target = (eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation)get_store().insert_element_user(AFFILIATION$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Affiliation" element
         */
        public eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation addNewAffiliation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation target = null;
                target = (eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation)get_store().add_element_user(AFFILIATION$26);
                return target;
            }
        }
        
        /**
         * Removes the ith "Affiliation" element
         */
        public void removeAffiliation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AFFILIATION$26, i);
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
         * An XML PersonName(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class PersonNameImpl extends eu.openaire.cerifProfile.x11.impl.CfIdAttrBaseTypeImpl implements eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName
        {
            private static final long serialVersionUID = 1L;
            
            public PersonNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FAMILYNAMES$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "FamilyNames");
            private static final javax.xml.namespace.QName FIRSTNAMES$2 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "FirstNames");
            private static final javax.xml.namespace.QName OTHERNAMES$4 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OtherNames");
            private static final javax.xml.namespace.QName CLASSIFICATION$6 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Classification");
            private static final javax.xml.namespace.QName LINK$8 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Link");
            
            
            /**
             * Gets the "FamilyNames" element
             */
            public eu.openaire.cerifProfile.x11.CfStringType getFamilyNames()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfStringType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(FAMILYNAMES$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "FamilyNames" element
             */
            public boolean isSetFamilyNames()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FAMILYNAMES$0) != 0;
                }
            }
            
            /**
             * Sets the "FamilyNames" element
             */
            public void setFamilyNames(eu.openaire.cerifProfile.x11.CfStringType familyNames)
            {
                generatedSetterHelperImpl(familyNames, FAMILYNAMES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "FamilyNames" element
             */
            public eu.openaire.cerifProfile.x11.CfStringType addNewFamilyNames()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfStringType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(FAMILYNAMES$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "FamilyNames" element
             */
            public void unsetFamilyNames()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FAMILYNAMES$0, 0);
                }
            }
            
            /**
             * Gets the "FirstNames" element
             */
            public eu.openaire.cerifProfile.x11.CfStringType getFirstNames()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfStringType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(FIRSTNAMES$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "FirstNames" element
             */
            public boolean isSetFirstNames()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FIRSTNAMES$2) != 0;
                }
            }
            
            /**
             * Sets the "FirstNames" element
             */
            public void setFirstNames(eu.openaire.cerifProfile.x11.CfStringType firstNames)
            {
                generatedSetterHelperImpl(firstNames, FIRSTNAMES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "FirstNames" element
             */
            public eu.openaire.cerifProfile.x11.CfStringType addNewFirstNames()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfStringType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(FIRSTNAMES$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "FirstNames" element
             */
            public void unsetFirstNames()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FIRSTNAMES$2, 0);
                }
            }
            
            /**
             * Gets the "OtherNames" element
             */
            public eu.openaire.cerifProfile.x11.CfStringType getOtherNames()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfStringType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(OTHERNAMES$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "OtherNames" element
             */
            public boolean isSetOtherNames()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OTHERNAMES$4) != 0;
                }
            }
            
            /**
             * Sets the "OtherNames" element
             */
            public void setOtherNames(eu.openaire.cerifProfile.x11.CfStringType otherNames)
            {
                generatedSetterHelperImpl(otherNames, OTHERNAMES$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "OtherNames" element
             */
            public eu.openaire.cerifProfile.x11.CfStringType addNewOtherNames()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfStringType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(OTHERNAMES$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "OtherNames" element
             */
            public void unsetOtherNames()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OTHERNAMES$4, 0);
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
                    get_store().find_all_element_users(CLASSIFICATION$6, targetList);
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
                    target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(CLASSIFICATION$6, i);
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
                    return get_store().count_elements(CLASSIFICATION$6);
                }
            }
            
            /**
             * Sets array of all "Classification" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setClassificationArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] classificationArray)
            {
                check_orphaned();
                arraySetterHelper(classificationArray, CLASSIFICATION$6);
            }
            
            /**
             * Sets ith "Classification" element
             */
            public void setClassificationArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType classification)
            {
                generatedSetterHelperImpl(classification, CLASSIFICATION$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                    target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(CLASSIFICATION$6, i);
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
                    target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(CLASSIFICATION$6);
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
                    get_store().remove_element(CLASSIFICATION$6, i);
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
                    get_store().find_all_element_users(LINK$8, targetList);
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
                    target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().find_element_user(LINK$8, i);
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
                    return get_store().count_elements(LINK$8);
                }
            }
            
            /**
             * Sets array of all "Link" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setLinkArray(eu.openaire.cerifProfile.x11.CfGenericLinkType[] linkArray)
            {
                check_orphaned();
                arraySetterHelper(linkArray, LINK$8);
            }
            
            /**
             * Sets ith "Link" element
             */
            public void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfGenericLinkType link)
            {
                generatedSetterHelperImpl(link, LINK$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                    target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().insert_element_user(LINK$8, i);
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
                    target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().add_element_user(LINK$8);
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
                    get_store().remove_element(LINK$8, i);
                }
            }
        }
        /**
         * An XML Gender(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is an atomic type that is a restriction of eu.openaire.cerifProfile.x11.PersonDocument$Person$Gender.
         */
        public static class GenderImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender
        {
            private static final long serialVersionUID = 1L;
            
            public GenderImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected GenderImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Affiliation(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class AffiliationImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation
        {
            private static final long serialVersionUID = 1L;
            
            public AffiliationImpl(org.apache.xmlbeans.SchemaType sType)
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
