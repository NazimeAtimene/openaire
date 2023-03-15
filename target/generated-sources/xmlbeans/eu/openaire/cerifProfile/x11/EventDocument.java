/*
 * An XML document type.
 * Localname: Event
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.EventDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11;


/**
 * A document containing one Event(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public interface EventDocument extends eu.openaire.cerifProfile.x11.IndividualSubstitutionGroupHeadDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("eventa87cdoctype");
    
    /**
     * Gets the "Event" element
     */
    eu.openaire.cerifProfile.x11.EventDocument.Event getEvent();
    
    /**
     * Sets the "Event" element
     */
    void setEvent(eu.openaire.cerifProfile.x11.EventDocument.Event event);
    
    /**
     * Appends and returns a new empty "Event" element
     */
    eu.openaire.cerifProfile.x11.EventDocument.Event addNewEvent();
    
    /**
     * An XML Event(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public interface Event extends eu.openaire.cerifProfile.x11.CfIdAttrBaseType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Event.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("event41d6elemtype");
        
        /**
         * Gets array of all "Type" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getTypeArray();
        
        /**
         * Gets ith "Type" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getTypeArray(int i);
        
        /**
         * Returns number of "Type" element
         */
        int sizeOfTypeArray();
        
        /**
         * Sets array of all "Type" element
         */
        void setTypeArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] typeArray);
        
        /**
         * Sets ith "Type" element
         */
        void setTypeArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType type);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Type" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Type" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewType();
        
        /**
         * Removes the ith "Type" element
         */
        void removeType(int i);
        
        /**
         * Gets the "Acronym" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getAcronym();
        
        /**
         * True if has "Acronym" element
         */
        boolean isSetAcronym();
        
        /**
         * Sets the "Acronym" element
         */
        void setAcronym(eu.openaire.cerifProfile.x11.CfStringType acronym);
        
        /**
         * Appends and returns a new empty "Acronym" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewAcronym();
        
        /**
         * Unsets the "Acronym" element
         */
        void unsetAcronym();
        
        /**
         * Gets array of all "Name" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getNameArray();
        
        /**
         * Gets ith "Name" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getNameArray(int i);
        
        /**
         * Returns number of "Name" element
         */
        int sizeOfNameArray();
        
        /**
         * Sets array of all "Name" element
         */
        void setNameArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] nameArray);
        
        /**
         * Sets ith "Name" element
         */
        void setNameArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType name);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Name" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Name" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewName();
        
        /**
         * Removes the ith "Name" element
         */
        void removeName(int i);
        
        /**
         * Gets the "Place" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getPlace();
        
        /**
         * True if has "Place" element
         */
        boolean isSetPlace();
        
        /**
         * Sets the "Place" element
         */
        void setPlace(eu.openaire.cerifProfile.x11.CfStringType place);
        
        /**
         * Appends and returns a new empty "Place" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewPlace();
        
        /**
         * Unsets the "Place" element
         */
        void unsetPlace();
        
        /**
         * Gets the "Country" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getCountry();
        
        /**
         * True if has "Country" element
         */
        boolean isSetCountry();
        
        /**
         * Sets the "Country" element
         */
        void setCountry(eu.openaire.cerifProfile.x11.CfStringType country);
        
        /**
         * Appends and returns a new empty "Country" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewCountry();
        
        /**
         * Unsets the "Country" element
         */
        void unsetCountry();
        
        /**
         * Gets the "StartDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType getStartDate();
        
        /**
         * True if has "StartDate" element
         */
        boolean isSetStartDate();
        
        /**
         * Sets the "StartDate" element
         */
        void setStartDate(eu.openaire.cerifProfile.x11.CfDateType startDate);
        
        /**
         * Appends and returns a new empty "StartDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType addNewStartDate();
        
        /**
         * Unsets the "StartDate" element
         */
        void unsetStartDate();
        
        /**
         * Gets the "EndDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType getEndDate();
        
        /**
         * True if has "EndDate" element
         */
        boolean isSetEndDate();
        
        /**
         * Sets the "EndDate" element
         */
        void setEndDate(eu.openaire.cerifProfile.x11.CfDateType endDate);
        
        /**
         * Appends and returns a new empty "EndDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType addNewEndDate();
        
        /**
         * Unsets the "EndDate" element
         */
        void unsetEndDate();
        
        /**
         * Gets array of all "Description" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getDescriptionArray();
        
        /**
         * Gets ith "Description" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getDescriptionArray(int i);
        
        /**
         * Returns number of "Description" element
         */
        int sizeOfDescriptionArray();
        
        /**
         * Sets array of all "Description" element
         */
        void setDescriptionArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] descriptionArray);
        
        /**
         * Sets ith "Description" element
         */
        void setDescriptionArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType description);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Description" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewDescription(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Description" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewDescription();
        
        /**
         * Removes the ith "Description" element
         */
        void removeDescription(int i);
        
        /**
         * Gets array of all "Subject" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getSubjectArray();
        
        /**
         * Gets ith "Subject" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getSubjectArray(int i);
        
        /**
         * Returns number of "Subject" element
         */
        int sizeOfSubjectArray();
        
        /**
         * Sets array of all "Subject" element
         */
        void setSubjectArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] subjectArray);
        
        /**
         * Sets ith "Subject" element
         */
        void setSubjectArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType subject);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Subject" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewSubject(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Subject" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewSubject();
        
        /**
         * Removes the ith "Subject" element
         */
        void removeSubject(int i);
        
        /**
         * Gets array of all "Keyword" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getKeywordArray();
        
        /**
         * Gets ith "Keyword" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getKeywordArray(int i);
        
        /**
         * Returns number of "Keyword" element
         */
        int sizeOfKeywordArray();
        
        /**
         * Sets array of all "Keyword" element
         */
        void setKeywordArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] keywordArray);
        
        /**
         * Sets ith "Keyword" element
         */
        void setKeywordArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType keyword);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Keyword" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewKeyword(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Keyword" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewKeyword();
        
        /**
         * Removes the ith "Keyword" element
         */
        void removeKeyword(int i);
        
        /**
         * Gets array of all "Organizer" elements
         */
        eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer[] getOrganizerArray();
        
        /**
         * Gets ith "Organizer" element
         */
        eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer getOrganizerArray(int i);
        
        /**
         * Returns number of "Organizer" element
         */
        int sizeOfOrganizerArray();
        
        /**
         * Sets array of all "Organizer" element
         */
        void setOrganizerArray(eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer[] organizerArray);
        
        /**
         * Sets ith "Organizer" element
         */
        void setOrganizerArray(int i, eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer organizer);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Organizer" element
         */
        eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer insertNewOrganizer(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Organizer" element
         */
        eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer addNewOrganizer();
        
        /**
         * Removes the ith "Organizer" element
         */
        void removeOrganizer(int i);
        
        /**
         * Gets array of all "Sponsor" elements
         */
        eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor[] getSponsorArray();
        
        /**
         * Gets ith "Sponsor" element
         */
        eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor getSponsorArray(int i);
        
        /**
         * Returns number of "Sponsor" element
         */
        int sizeOfSponsorArray();
        
        /**
         * Sets array of all "Sponsor" element
         */
        void setSponsorArray(eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor[] sponsorArray);
        
        /**
         * Sets ith "Sponsor" element
         */
        void setSponsorArray(int i, eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor sponsor);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Sponsor" element
         */
        eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor insertNewSponsor(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Sponsor" element
         */
        eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor addNewSponsor();
        
        /**
         * Removes the ith "Sponsor" element
         */
        void removeSponsor(int i);
        
        /**
         * Gets array of all "Partner" elements
         */
        eu.openaire.cerifProfile.x11.EventDocument.Event.Partner[] getPartnerArray();
        
        /**
         * Gets ith "Partner" element
         */
        eu.openaire.cerifProfile.x11.EventDocument.Event.Partner getPartnerArray(int i);
        
        /**
         * Returns number of "Partner" element
         */
        int sizeOfPartnerArray();
        
        /**
         * Sets array of all "Partner" element
         */
        void setPartnerArray(eu.openaire.cerifProfile.x11.EventDocument.Event.Partner[] partnerArray);
        
        /**
         * Sets ith "Partner" element
         */
        void setPartnerArray(int i, eu.openaire.cerifProfile.x11.EventDocument.Event.Partner partner);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Partner" element
         */
        eu.openaire.cerifProfile.x11.EventDocument.Event.Partner insertNewPartner(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Partner" element
         */
        eu.openaire.cerifProfile.x11.EventDocument.Event.Partner addNewPartner();
        
        /**
         * Removes the ith "Partner" element
         */
        void removePartner(int i);
        
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
         * An XML Organizer(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Organizer extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Organizer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("organizere37belemtype");
            
            /**
             * Gets the "OrgUnit" element
             */
            eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit getOrgUnit();
            
            /**
             * True if has "OrgUnit" element
             */
            boolean isSetOrgUnit();
            
            /**
             * Sets the "OrgUnit" element
             */
            void setOrgUnit(eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit orgUnit);
            
            /**
             * Appends and returns a new empty "OrgUnit" element
             */
            eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit addNewOrgUnit();
            
            /**
             * Unsets the "OrgUnit" element
             */
            void unsetOrgUnit();
            
            /**
             * Gets the "Project" element
             */
            eu.openaire.cerifProfile.x11.ProjectDocument.Project getProject();
            
            /**
             * True if has "Project" element
             */
            boolean isSetProject();
            
            /**
             * Sets the "Project" element
             */
            void setProject(eu.openaire.cerifProfile.x11.ProjectDocument.Project project);
            
            /**
             * Appends and returns a new empty "Project" element
             */
            eu.openaire.cerifProfile.x11.ProjectDocument.Project addNewProject();
            
            /**
             * Unsets the "Project" element
             */
            void unsetProject();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer newInstance() {
                  return (eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.EventDocument.Event.Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Sponsor(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Sponsor extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sponsor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("sponsor62b0elemtype");
            
            /**
             * Gets the "OrgUnit" element
             */
            eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit getOrgUnit();
            
            /**
             * True if has "OrgUnit" element
             */
            boolean isSetOrgUnit();
            
            /**
             * Sets the "OrgUnit" element
             */
            void setOrgUnit(eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit orgUnit);
            
            /**
             * Appends and returns a new empty "OrgUnit" element
             */
            eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit addNewOrgUnit();
            
            /**
             * Unsets the "OrgUnit" element
             */
            void unsetOrgUnit();
            
            /**
             * Gets the "Project" element
             */
            eu.openaire.cerifProfile.x11.ProjectDocument.Project getProject();
            
            /**
             * True if has "Project" element
             */
            boolean isSetProject();
            
            /**
             * Sets the "Project" element
             */
            void setProject(eu.openaire.cerifProfile.x11.ProjectDocument.Project project);
            
            /**
             * Appends and returns a new empty "Project" element
             */
            eu.openaire.cerifProfile.x11.ProjectDocument.Project addNewProject();
            
            /**
             * Unsets the "Project" element
             */
            void unsetProject();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor newInstance() {
                  return (eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.EventDocument.Event.Sponsor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Partner(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Partner extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Partner.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("partner7442elemtype");
            
            /**
             * Gets the "OrgUnit" element
             */
            eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit getOrgUnit();
            
            /**
             * True if has "OrgUnit" element
             */
            boolean isSetOrgUnit();
            
            /**
             * Sets the "OrgUnit" element
             */
            void setOrgUnit(eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit orgUnit);
            
            /**
             * Appends and returns a new empty "OrgUnit" element
             */
            eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit addNewOrgUnit();
            
            /**
             * Unsets the "OrgUnit" element
             */
            void unsetOrgUnit();
            
            /**
             * Gets the "Project" element
             */
            eu.openaire.cerifProfile.x11.ProjectDocument.Project getProject();
            
            /**
             * True if has "Project" element
             */
            boolean isSetProject();
            
            /**
             * Sets the "Project" element
             */
            void setProject(eu.openaire.cerifProfile.x11.ProjectDocument.Project project);
            
            /**
             * Appends and returns a new empty "Project" element
             */
            eu.openaire.cerifProfile.x11.ProjectDocument.Project addNewProject();
            
            /**
             * Unsets the "Project" element
             */
            void unsetProject();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.EventDocument.Event.Partner newInstance() {
                  return (eu.openaire.cerifProfile.x11.EventDocument.Event.Partner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.EventDocument.Event.Partner newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.EventDocument.Event.Partner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.x11.EventDocument.Event newInstance() {
              return (eu.openaire.cerifProfile.x11.EventDocument.Event) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.x11.EventDocument.Event newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.x11.EventDocument.Event) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.x11.EventDocument newInstance() {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EventDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.x11.EventDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EventDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.x11.EventDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EventDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.EventDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EventDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.EventDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EventDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.EventDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EventDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.EventDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EventDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.EventDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EventDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.EventDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.EventDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.EventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
