/*
 * An XML document type.
 * Localname: Person
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.PersonDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11;


/**
 * A document containing one Person(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public interface PersonDocument extends eu.openaire.cerifProfile.x11.PersonSubstitutionGroupHeadDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("person1ecfdoctype");
    
    /**
     * Gets the "Person" element
     */
    eu.openaire.cerifProfile.x11.PersonDocument.Person getPerson();
    
    /**
     * Sets the "Person" element
     */
    void setPerson(eu.openaire.cerifProfile.x11.PersonDocument.Person person);
    
    /**
     * Appends and returns a new empty "Person" element
     */
    eu.openaire.cerifProfile.x11.PersonDocument.Person addNewPerson();
    
    /**
     * An XML Person(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public interface Person extends eu.openaire.cerifProfile.x11.PersonBaseType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Person.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("persona660elemtype");
        
        /**
         * Gets the "PersonName" element
         */
        eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName getPersonName();
        
        /**
         * True if has "PersonName" element
         */
        boolean isSetPersonName();
        
        /**
         * Sets the "PersonName" element
         */
        void setPersonName(eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName personName);
        
        /**
         * Appends and returns a new empty "PersonName" element
         */
        eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName addNewPersonName();
        
        /**
         * Unsets the "PersonName" element
         */
        void unsetPersonName();
        
        /**
         * Gets the "Gender" element
         */
        eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender.Enum getGender();
        
        /**
         * Gets (as xml) the "Gender" element
         */
        eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender xgetGender();
        
        /**
         * True if has "Gender" element
         */
        boolean isSetGender();
        
        /**
         * Sets the "Gender" element
         */
        void setGender(eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender.Enum gender);
        
        /**
         * Sets (as xml) the "Gender" element
         */
        void xsetGender(eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender gender);
        
        /**
         * Unsets the "Gender" element
         */
        void unsetGender();
        
        /**
         * Gets the "ORCID" element
         */
        eu.openaire.cerifProfile.x11.ORCIDType getORCID();
        
        /**
         * True if has "ORCID" element
         */
        boolean isSetORCID();
        
        /**
         * Sets the "ORCID" element
         */
        void setORCID(eu.openaire.cerifProfile.x11.ORCIDType orcid);
        
        /**
         * Appends and returns a new empty "ORCID" element
         */
        eu.openaire.cerifProfile.x11.ORCIDType addNewORCID();
        
        /**
         * Unsets the "ORCID" element
         */
        void unsetORCID();
        
        /**
         * Gets array of all "AlternativeORCID" elements
         */
        eu.openaire.cerifProfile.x11.ORCIDType[] getAlternativeORCIDArray();
        
        /**
         * Gets ith "AlternativeORCID" element
         */
        eu.openaire.cerifProfile.x11.ORCIDType getAlternativeORCIDArray(int i);
        
        /**
         * Returns number of "AlternativeORCID" element
         */
        int sizeOfAlternativeORCIDArray();
        
        /**
         * Sets array of all "AlternativeORCID" element
         */
        void setAlternativeORCIDArray(eu.openaire.cerifProfile.x11.ORCIDType[] alternativeORCIDArray);
        
        /**
         * Sets ith "AlternativeORCID" element
         */
        void setAlternativeORCIDArray(int i, eu.openaire.cerifProfile.x11.ORCIDType alternativeORCID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeORCID" element
         */
        eu.openaire.cerifProfile.x11.ORCIDType insertNewAlternativeORCID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeORCID" element
         */
        eu.openaire.cerifProfile.x11.ORCIDType addNewAlternativeORCID();
        
        /**
         * Removes the ith "AlternativeORCID" element
         */
        void removeAlternativeORCID(int i);
        
        /**
         * Gets the "ResearcherID" element
         */
        eu.openaire.cerifProfile.x11.ResearcherIDType getResearcherID();
        
        /**
         * True if has "ResearcherID" element
         */
        boolean isSetResearcherID();
        
        /**
         * Sets the "ResearcherID" element
         */
        void setResearcherID(eu.openaire.cerifProfile.x11.ResearcherIDType researcherID);
        
        /**
         * Appends and returns a new empty "ResearcherID" element
         */
        eu.openaire.cerifProfile.x11.ResearcherIDType addNewResearcherID();
        
        /**
         * Unsets the "ResearcherID" element
         */
        void unsetResearcherID();
        
        /**
         * Gets array of all "AlternativeResearcherID" elements
         */
        eu.openaire.cerifProfile.x11.ResearcherIDType[] getAlternativeResearcherIDArray();
        
        /**
         * Gets ith "AlternativeResearcherID" element
         */
        eu.openaire.cerifProfile.x11.ResearcherIDType getAlternativeResearcherIDArray(int i);
        
        /**
         * Returns number of "AlternativeResearcherID" element
         */
        int sizeOfAlternativeResearcherIDArray();
        
        /**
         * Sets array of all "AlternativeResearcherID" element
         */
        void setAlternativeResearcherIDArray(eu.openaire.cerifProfile.x11.ResearcherIDType[] alternativeResearcherIDArray);
        
        /**
         * Sets ith "AlternativeResearcherID" element
         */
        void setAlternativeResearcherIDArray(int i, eu.openaire.cerifProfile.x11.ResearcherIDType alternativeResearcherID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeResearcherID" element
         */
        eu.openaire.cerifProfile.x11.ResearcherIDType insertNewAlternativeResearcherID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeResearcherID" element
         */
        eu.openaire.cerifProfile.x11.ResearcherIDType addNewAlternativeResearcherID();
        
        /**
         * Removes the ith "AlternativeResearcherID" element
         */
        void removeAlternativeResearcherID(int i);
        
        /**
         * Gets the "ScopusAuthorID" element
         */
        eu.openaire.cerifProfile.x11.ScopusAuthorIDType getScopusAuthorID();
        
        /**
         * True if has "ScopusAuthorID" element
         */
        boolean isSetScopusAuthorID();
        
        /**
         * Sets the "ScopusAuthorID" element
         */
        void setScopusAuthorID(eu.openaire.cerifProfile.x11.ScopusAuthorIDType scopusAuthorID);
        
        /**
         * Appends and returns a new empty "ScopusAuthorID" element
         */
        eu.openaire.cerifProfile.x11.ScopusAuthorIDType addNewScopusAuthorID();
        
        /**
         * Unsets the "ScopusAuthorID" element
         */
        void unsetScopusAuthorID();
        
        /**
         * Gets array of all "AlternativeScopusAuthorID" elements
         */
        eu.openaire.cerifProfile.x11.ScopusAuthorIDType[] getAlternativeScopusAuthorIDArray();
        
        /**
         * Gets ith "AlternativeScopusAuthorID" element
         */
        eu.openaire.cerifProfile.x11.ScopusAuthorIDType getAlternativeScopusAuthorIDArray(int i);
        
        /**
         * Returns number of "AlternativeScopusAuthorID" element
         */
        int sizeOfAlternativeScopusAuthorIDArray();
        
        /**
         * Sets array of all "AlternativeScopusAuthorID" element
         */
        void setAlternativeScopusAuthorIDArray(eu.openaire.cerifProfile.x11.ScopusAuthorIDType[] alternativeScopusAuthorIDArray);
        
        /**
         * Sets ith "AlternativeScopusAuthorID" element
         */
        void setAlternativeScopusAuthorIDArray(int i, eu.openaire.cerifProfile.x11.ScopusAuthorIDType alternativeScopusAuthorID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeScopusAuthorID" element
         */
        eu.openaire.cerifProfile.x11.ScopusAuthorIDType insertNewAlternativeScopusAuthorID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeScopusAuthorID" element
         */
        eu.openaire.cerifProfile.x11.ScopusAuthorIDType addNewAlternativeScopusAuthorID();
        
        /**
         * Removes the ith "AlternativeScopusAuthorID" element
         */
        void removeAlternativeScopusAuthorID(int i);
        
        /**
         * Gets the "ISNI" element
         */
        eu.openaire.cerifProfile.x11.ISNIType getISNI();
        
        /**
         * True if has "ISNI" element
         */
        boolean isSetISNI();
        
        /**
         * Sets the "ISNI" element
         */
        void setISNI(eu.openaire.cerifProfile.x11.ISNIType isni);
        
        /**
         * Appends and returns a new empty "ISNI" element
         */
        eu.openaire.cerifProfile.x11.ISNIType addNewISNI();
        
        /**
         * Unsets the "ISNI" element
         */
        void unsetISNI();
        
        /**
         * Gets array of all "AlternativeISNI" elements
         */
        eu.openaire.cerifProfile.x11.ISNIType[] getAlternativeISNIArray();
        
        /**
         * Gets ith "AlternativeISNI" element
         */
        eu.openaire.cerifProfile.x11.ISNIType getAlternativeISNIArray(int i);
        
        /**
         * Returns number of "AlternativeISNI" element
         */
        int sizeOfAlternativeISNIArray();
        
        /**
         * Sets array of all "AlternativeISNI" element
         */
        void setAlternativeISNIArray(eu.openaire.cerifProfile.x11.ISNIType[] alternativeISNIArray);
        
        /**
         * Sets ith "AlternativeISNI" element
         */
        void setAlternativeISNIArray(int i, eu.openaire.cerifProfile.x11.ISNIType alternativeISNI);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeISNI" element
         */
        eu.openaire.cerifProfile.x11.ISNIType insertNewAlternativeISNI(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeISNI" element
         */
        eu.openaire.cerifProfile.x11.ISNIType addNewAlternativeISNI();
        
        /**
         * Removes the ith "AlternativeISNI" element
         */
        void removeAlternativeISNI(int i);
        
        /**
         * Gets the "DAI" element
         */
        eu.openaire.cerifProfile.x11.DAIType getDAI();
        
        /**
         * True if has "DAI" element
         */
        boolean isSetDAI();
        
        /**
         * Sets the "DAI" element
         */
        void setDAI(eu.openaire.cerifProfile.x11.DAIType dai);
        
        /**
         * Appends and returns a new empty "DAI" element
         */
        eu.openaire.cerifProfile.x11.DAIType addNewDAI();
        
        /**
         * Unsets the "DAI" element
         */
        void unsetDAI();
        
        /**
         * Gets array of all "AlternativeDAI" elements
         */
        eu.openaire.cerifProfile.x11.DAIType[] getAlternativeDAIArray();
        
        /**
         * Gets ith "AlternativeDAI" element
         */
        eu.openaire.cerifProfile.x11.DAIType getAlternativeDAIArray(int i);
        
        /**
         * Returns number of "AlternativeDAI" element
         */
        int sizeOfAlternativeDAIArray();
        
        /**
         * Sets array of all "AlternativeDAI" element
         */
        void setAlternativeDAIArray(eu.openaire.cerifProfile.x11.DAIType[] alternativeDAIArray);
        
        /**
         * Sets ith "AlternativeDAI" element
         */
        void setAlternativeDAIArray(int i, eu.openaire.cerifProfile.x11.DAIType alternativeDAI);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeDAI" element
         */
        eu.openaire.cerifProfile.x11.DAIType insertNewAlternativeDAI(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeDAI" element
         */
        eu.openaire.cerifProfile.x11.DAIType addNewAlternativeDAI();
        
        /**
         * Removes the ith "AlternativeDAI" element
         */
        void removeAlternativeDAI(int i);
        
        /**
         * Gets array of all "ElectronicAddress" elements
         */
        java.lang.String[] getElectronicAddressArray();
        
        /**
         * Gets ith "ElectronicAddress" element
         */
        java.lang.String getElectronicAddressArray(int i);
        
        /**
         * Gets (as xml) array of all "ElectronicAddress" elements
         */
        org.apache.xmlbeans.XmlAnyURI[] xgetElectronicAddressArray();
        
        /**
         * Gets (as xml) ith "ElectronicAddress" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetElectronicAddressArray(int i);
        
        /**
         * Returns number of "ElectronicAddress" element
         */
        int sizeOfElectronicAddressArray();
        
        /**
         * Sets array of all "ElectronicAddress" element
         */
        void setElectronicAddressArray(java.lang.String[] electronicAddressArray);
        
        /**
         * Sets ith "ElectronicAddress" element
         */
        void setElectronicAddressArray(int i, java.lang.String electronicAddress);
        
        /**
         * Sets (as xml) array of all "ElectronicAddress" element
         */
        void xsetElectronicAddressArray(org.apache.xmlbeans.XmlAnyURI[] electronicAddressArray);
        
        /**
         * Sets (as xml) ith "ElectronicAddress" element
         */
        void xsetElectronicAddressArray(int i, org.apache.xmlbeans.XmlAnyURI electronicAddress);
        
        /**
         * Inserts the value as the ith "ElectronicAddress" element
         */
        void insertElectronicAddress(int i, java.lang.String electronicAddress);
        
        /**
         * Appends the value as the last "ElectronicAddress" element
         */
        void addElectronicAddress(java.lang.String electronicAddress);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ElectronicAddress" element
         */
        org.apache.xmlbeans.XmlAnyURI insertNewElectronicAddress(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ElectronicAddress" element
         */
        org.apache.xmlbeans.XmlAnyURI addNewElectronicAddress();
        
        /**
         * Removes the ith "ElectronicAddress" element
         */
        void removeElectronicAddress(int i);
        
        /**
         * Gets array of all "Affiliation" elements
         */
        eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation[] getAffiliationArray();
        
        /**
         * Gets ith "Affiliation" element
         */
        eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation getAffiliationArray(int i);
        
        /**
         * Returns number of "Affiliation" element
         */
        int sizeOfAffiliationArray();
        
        /**
         * Sets array of all "Affiliation" element
         */
        void setAffiliationArray(eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation[] affiliationArray);
        
        /**
         * Sets ith "Affiliation" element
         */
        void setAffiliationArray(int i, eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation affiliation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Affiliation" element
         */
        eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation insertNewAffiliation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Affiliation" element
         */
        eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation addNewAffiliation();
        
        /**
         * Removes the ith "Affiliation" element
         */
        void removeAffiliation(int i);
        
        /**
         * Gets array of all "Classification" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getClassificationArray();
        
        /**
         * Gets ith "Classification" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getClassificationArray(int i);
        
        /**
         * Returns number of "Classification" element
         */
        int sizeOfClassificationArray();
        
        /**
         * Sets array of all "Classification" element
         */
        void setClassificationArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] classificationArray);
        
        /**
         * Sets ith "Classification" element
         */
        void setClassificationArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType classification);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Classification" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewClassification(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Classification" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewClassification();
        
        /**
         * Removes the ith "Classification" element
         */
        void removeClassification(int i);
        
        /**
         * Gets array of all "Link" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericLinkType[] getLinkArray();
        
        /**
         * Gets ith "Link" element
         */
        eu.openaire.cerifProfile.x11.CfGenericLinkType getLinkArray(int i);
        
        /**
         * Returns number of "Link" element
         */
        int sizeOfLinkArray();
        
        /**
         * Sets array of all "Link" element
         */
        void setLinkArray(eu.openaire.cerifProfile.x11.CfGenericLinkType[] linkArray);
        
        /**
         * Sets ith "Link" element
         */
        void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfGenericLinkType link);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Link" element
         */
        eu.openaire.cerifProfile.x11.CfGenericLinkType insertNewLink(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Link" element
         */
        eu.openaire.cerifProfile.x11.CfGenericLinkType addNewLink();
        
        /**
         * Removes the ith "Link" element
         */
        void removeLink(int i);
        
        /**
         * An XML PersonName(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface PersonName extends eu.openaire.cerifProfile.x11.CfIdAttrBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("personnameb1a4elemtype");
            
            /**
             * Gets the "FamilyNames" element
             */
            eu.openaire.cerifProfile.x11.CfStringType getFamilyNames();
            
            /**
             * True if has "FamilyNames" element
             */
            boolean isSetFamilyNames();
            
            /**
             * Sets the "FamilyNames" element
             */
            void setFamilyNames(eu.openaire.cerifProfile.x11.CfStringType familyNames);
            
            /**
             * Appends and returns a new empty "FamilyNames" element
             */
            eu.openaire.cerifProfile.x11.CfStringType addNewFamilyNames();
            
            /**
             * Unsets the "FamilyNames" element
             */
            void unsetFamilyNames();
            
            /**
             * Gets the "FirstNames" element
             */
            eu.openaire.cerifProfile.x11.CfStringType getFirstNames();
            
            /**
             * True if has "FirstNames" element
             */
            boolean isSetFirstNames();
            
            /**
             * Sets the "FirstNames" element
             */
            void setFirstNames(eu.openaire.cerifProfile.x11.CfStringType firstNames);
            
            /**
             * Appends and returns a new empty "FirstNames" element
             */
            eu.openaire.cerifProfile.x11.CfStringType addNewFirstNames();
            
            /**
             * Unsets the "FirstNames" element
             */
            void unsetFirstNames();
            
            /**
             * Gets the "OtherNames" element
             */
            eu.openaire.cerifProfile.x11.CfStringType getOtherNames();
            
            /**
             * True if has "OtherNames" element
             */
            boolean isSetOtherNames();
            
            /**
             * Sets the "OtherNames" element
             */
            void setOtherNames(eu.openaire.cerifProfile.x11.CfStringType otherNames);
            
            /**
             * Appends and returns a new empty "OtherNames" element
             */
            eu.openaire.cerifProfile.x11.CfStringType addNewOtherNames();
            
            /**
             * Unsets the "OtherNames" element
             */
            void unsetOtherNames();
            
            /**
             * Gets array of all "Classification" elements
             */
            eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getClassificationArray();
            
            /**
             * Gets ith "Classification" element
             */
            eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getClassificationArray(int i);
            
            /**
             * Returns number of "Classification" element
             */
            int sizeOfClassificationArray();
            
            /**
             * Sets array of all "Classification" element
             */
            void setClassificationArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] classificationArray);
            
            /**
             * Sets ith "Classification" element
             */
            void setClassificationArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType classification);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Classification" element
             */
            eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewClassification(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Classification" element
             */
            eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewClassification();
            
            /**
             * Removes the ith "Classification" element
             */
            void removeClassification(int i);
            
            /**
             * Gets array of all "Link" elements
             */
            eu.openaire.cerifProfile.x11.CfGenericLinkType[] getLinkArray();
            
            /**
             * Gets ith "Link" element
             */
            eu.openaire.cerifProfile.x11.CfGenericLinkType getLinkArray(int i);
            
            /**
             * Returns number of "Link" element
             */
            int sizeOfLinkArray();
            
            /**
             * Sets array of all "Link" element
             */
            void setLinkArray(eu.openaire.cerifProfile.x11.CfGenericLinkType[] linkArray);
            
            /**
             * Sets ith "Link" element
             */
            void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfGenericLinkType link);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Link" element
             */
            eu.openaire.cerifProfile.x11.CfGenericLinkType insertNewLink(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Link" element
             */
            eu.openaire.cerifProfile.x11.CfGenericLinkType addNewLink();
            
            /**
             * Removes the ith "Link" element
             */
            void removeLink(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName newInstance() {
                  return (eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PersonDocument.Person.PersonName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Gender(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is an atomic type that is a restriction of eu.openaire.cerifProfile.x11.PersonDocument$Person$Gender.
         */
        public interface Gender extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Gender.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("gender3203elemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum M = Enum.forString("m");
            static final Enum F = Enum.forString("f");
            
            static final int INT_M = Enum.INT_M;
            static final int INT_F = Enum.INT_F;
            
            /**
             * Enumeration value class for eu.openaire.cerifProfile.x11.PersonDocument$Person$Gender.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_M
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_M = 1;
                static final int INT_F = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("m", INT_M),
                      new Enum("f", INT_F),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender newValue(java.lang.Object obj) {
                  return (eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender) type.newValue( obj ); }
                
                public static eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender newInstance() {
                  return (eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PersonDocument.Person.Gender) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Affiliation(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Affiliation extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Affiliation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("affiliation5ca4elemtype");
            
            /**
             * Gets the "OrgUnit" element
             */
            eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit getOrgUnit();
            
            /**
             * Sets the "OrgUnit" element
             */
            void setOrgUnit(eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit orgUnit);
            
            /**
             * Appends and returns a new empty "OrgUnit" element
             */
            eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit addNewOrgUnit();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation newInstance() {
                  return (eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PersonDocument.Person.Affiliation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.x11.PersonDocument.Person newInstance() {
              return (eu.openaire.cerifProfile.x11.PersonDocument.Person) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.x11.PersonDocument.Person newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.x11.PersonDocument.Person) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.x11.PersonDocument newInstance() {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PersonDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.PersonDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.PersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
