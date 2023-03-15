/*
 * An XML document type.
 * Localname: Patent
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.PatentDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11;


/**
 * A document containing one Patent(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public interface PatentDocument extends eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("patentdadcdoctype");
    
    /**
     * Gets the "Patent" element
     */
    eu.openaire.cerifProfile.x11.PatentDocument.Patent getPatent();
    
    /**
     * Sets the "Patent" element
     */
    void setPatent(eu.openaire.cerifProfile.x11.PatentDocument.Patent patent);
    
    /**
     * Appends and returns a new empty "Patent" element
     */
    eu.openaire.cerifProfile.x11.PatentDocument.Patent addNewPatent();
    
    /**
     * An XML Patent(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public interface Patent extends eu.openaire.cerifProfile.x11.ResearchOutputBaseType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Patent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("patente500elemtype");
        
        /**
         * Gets the "Type" element
         */
        eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type getType();
        
        /**
         * True if has "Type" element
         */
        boolean isSetType();
        
        /**
         * Sets the "Type" element
         */
        void setType(eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type type);
        
        /**
         * Appends and returns a new empty "Type" element
         */
        eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type addNewType();
        
        /**
         * Unsets the "Type" element
         */
        void unsetType();
        
        /**
         * Gets array of all "Title" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getTitleArray();
        
        /**
         * Gets ith "Title" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getTitleArray(int i);
        
        /**
         * Returns number of "Title" element
         */
        int sizeOfTitleArray();
        
        /**
         * Sets array of all "Title" element
         */
        void setTitleArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] titleArray);
        
        /**
         * Sets ith "Title" element
         */
        void setTitleArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType title);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Title" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewTitle(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Title" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewTitle();
        
        /**
         * Removes the ith "Title" element
         */
        void removeTitle(int i);
        
        /**
         * Gets array of all "VersionInfo" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getVersionInfoArray();
        
        /**
         * Gets ith "VersionInfo" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getVersionInfoArray(int i);
        
        /**
         * Returns number of "VersionInfo" element
         */
        int sizeOfVersionInfoArray();
        
        /**
         * Sets array of all "VersionInfo" element
         */
        void setVersionInfoArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] versionInfoArray);
        
        /**
         * Sets ith "VersionInfo" element
         */
        void setVersionInfoArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType versionInfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "VersionInfo" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewVersionInfo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "VersionInfo" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewVersionInfo();
        
        /**
         * Removes the ith "VersionInfo" element
         */
        void removeVersionInfo(int i);
        
        /**
         * Gets the "RegistrationDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType getRegistrationDate();
        
        /**
         * True if has "RegistrationDate" element
         */
        boolean isSetRegistrationDate();
        
        /**
         * Sets the "RegistrationDate" element
         */
        void setRegistrationDate(eu.openaire.cerifProfile.x11.CfDateType registrationDate);
        
        /**
         * Appends and returns a new empty "RegistrationDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType addNewRegistrationDate();
        
        /**
         * Unsets the "RegistrationDate" element
         */
        void unsetRegistrationDate();
        
        /**
         * Gets the "ApprovalDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType getApprovalDate();
        
        /**
         * True if has "ApprovalDate" element
         */
        boolean isSetApprovalDate();
        
        /**
         * Sets the "ApprovalDate" element
         */
        void setApprovalDate(eu.openaire.cerifProfile.x11.CfDateType approvalDate);
        
        /**
         * Appends and returns a new empty "ApprovalDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType addNewApprovalDate();
        
        /**
         * Unsets the "ApprovalDate" element
         */
        void unsetApprovalDate();
        
        /**
         * Gets the "PublicationDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType getPublicationDate();
        
        /**
         * True if has "PublicationDate" element
         */
        boolean isSetPublicationDate();
        
        /**
         * Sets the "PublicationDate" element
         */
        void setPublicationDate(eu.openaire.cerifProfile.x11.CfDateType publicationDate);
        
        /**
         * Appends and returns a new empty "PublicationDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType addNewPublicationDate();
        
        /**
         * Unsets the "PublicationDate" element
         */
        void unsetPublicationDate();
        
        /**
         * Gets the "CountryCode" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getCountryCode();
        
        /**
         * True if has "CountryCode" element
         */
        boolean isSetCountryCode();
        
        /**
         * Sets the "CountryCode" element
         */
        void setCountryCode(eu.openaire.cerifProfile.x11.CfStringType countryCode);
        
        /**
         * Appends and returns a new empty "CountryCode" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewCountryCode();
        
        /**
         * Unsets the "CountryCode" element
         */
        void unsetCountryCode();
        
        /**
         * Gets array of all "Issuer" elements
         */
        eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType[] getIssuerArray();
        
        /**
         * Gets ith "Issuer" element
         */
        eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType getIssuerArray(int i);
        
        /**
         * Returns number of "Issuer" element
         */
        int sizeOfIssuerArray();
        
        /**
         * Sets array of all "Issuer" element
         */
        void setIssuerArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType[] issuerArray);
        
        /**
         * Sets ith "Issuer" element
         */
        void setIssuerArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType issuer);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Issuer" element
         */
        eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType insertNewIssuer(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Issuer" element
         */
        eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType addNewIssuer();
        
        /**
         * Removes the ith "Issuer" element
         */
        void removeIssuer(int i);
        
        /**
         * Gets the "PatentNumber" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getPatentNumber();
        
        /**
         * True if has "PatentNumber" element
         */
        boolean isSetPatentNumber();
        
        /**
         * Sets the "PatentNumber" element
         */
        void setPatentNumber(eu.openaire.cerifProfile.x11.CfStringType patentNumber);
        
        /**
         * Appends and returns a new empty "PatentNumber" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewPatentNumber();
        
        /**
         * Unsets the "PatentNumber" element
         */
        void unsetPatentNumber();
        
        /**
         * Gets the "URL" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getURL();
        
        /**
         * True if has "URL" element
         */
        boolean isSetURL();
        
        /**
         * Sets the "URL" element
         */
        void setURL(eu.openaire.cerifProfile.x11.CfStringType url);
        
        /**
         * Appends and returns a new empty "URL" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewURL();
        
        /**
         * Unsets the "URL" element
         */
        void unsetURL();
        
        /**
         * Gets the "Inventors" element
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors getInventors();
        
        /**
         * True if has "Inventors" element
         */
        boolean isSetInventors();
        
        /**
         * Sets the "Inventors" element
         */
        void setInventors(eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors inventors);
        
        /**
         * Appends and returns a new empty "Inventors" element
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors addNewInventors();
        
        /**
         * Unsets the "Inventors" element
         */
        void unsetInventors();
        
        /**
         * Gets the "Holders" element
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders getHolders();
        
        /**
         * True if has "Holders" element
         */
        boolean isSetHolders();
        
        /**
         * Sets the "Holders" element
         */
        void setHolders(eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders holders);
        
        /**
         * Appends and returns a new empty "Holders" element
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders addNewHolders();
        
        /**
         * Unsets the "Holders" element
         */
        void unsetHolders();
        
        /**
         * Gets array of all "Abstract" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getAbstractArray();
        
        /**
         * Gets ith "Abstract" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getAbstractArray(int i);
        
        /**
         * Returns number of "Abstract" element
         */
        int sizeOfAbstractArray();
        
        /**
         * Sets array of all "Abstract" element
         */
        void setAbstractArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] xabstractArray);
        
        /**
         * Sets ith "Abstract" element
         */
        void setAbstractArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType xabstract);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Abstract" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewAbstract(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Abstract" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewAbstract();
        
        /**
         * Removes the ith "Abstract" element
         */
        void removeAbstract(int i);
        
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
         * Gets array of all "OriginatesFrom" elements
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom[] getOriginatesFromArray();
        
        /**
         * Gets ith "OriginatesFrom" element
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom getOriginatesFromArray(int i);
        
        /**
         * Returns number of "OriginatesFrom" element
         */
        int sizeOfOriginatesFromArray();
        
        /**
         * Sets array of all "OriginatesFrom" element
         */
        void setOriginatesFromArray(eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom[] originatesFromArray);
        
        /**
         * Sets ith "OriginatesFrom" element
         */
        void setOriginatesFromArray(int i, eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom originatesFrom);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OriginatesFrom" element
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom insertNewOriginatesFrom(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OriginatesFrom" element
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom addNewOriginatesFrom();
        
        /**
         * Removes the ith "OriginatesFrom" element
         */
        void removeOriginatesFrom(int i);
        
        /**
         * Gets array of all "Predecessor" elements
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor[] getPredecessorArray();
        
        /**
         * Gets ith "Predecessor" element
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor getPredecessorArray(int i);
        
        /**
         * Returns number of "Predecessor" element
         */
        int sizeOfPredecessorArray();
        
        /**
         * Sets array of all "Predecessor" element
         */
        void setPredecessorArray(eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor[] predecessorArray);
        
        /**
         * Sets ith "Predecessor" element
         */
        void setPredecessorArray(int i, eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor predecessor);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Predecessor" element
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor insertNewPredecessor(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Predecessor" element
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor addNewPredecessor();
        
        /**
         * Removes the ith "Predecessor" element
         */
        void removePredecessor(int i);
        
        /**
         * Gets array of all "References" elements
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.References[] getReferencesArray();
        
        /**
         * Gets ith "References" element
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.References getReferencesArray(int i);
        
        /**
         * Returns number of "References" element
         */
        int sizeOfReferencesArray();
        
        /**
         * Sets array of all "References" element
         */
        void setReferencesArray(eu.openaire.cerifProfile.x11.PatentDocument.Patent.References[] referencesArray);
        
        /**
         * Sets ith "References" element
         */
        void setReferencesArray(int i, eu.openaire.cerifProfile.x11.PatentDocument.Patent.References references);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "References" element
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.References insertNewReferences(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "References" element
         */
        eu.openaire.cerifProfile.x11.PatentDocument.Patent.References addNewReferences();
        
        /**
         * Removes the ith "References" element
         */
        void removeReferences(int i);
        
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
         * An XML Inventors(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Inventors extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Inventors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("inventors0c9eelemtype");
            
            /**
             * Gets array of all "Inventor" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] getInventorArray();
            
            /**
             * Gets ith "Inventor" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType getInventorArray(int i);
            
            /**
             * Returns number of "Inventor" element
             */
            int sizeOfInventorArray();
            
            /**
             * Sets array of all "Inventor" element
             */
            void setInventorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] inventorArray);
            
            /**
             * Sets ith "Inventor" element
             */
            void setInventorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType inventor);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Inventor" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType insertNewInventor(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Inventor" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType addNewInventor();
            
            /**
             * Removes the ith "Inventor" element
             */
            void removeInventor(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors newInstance() {
                  return (eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Holders(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Holders extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Holders.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("holders614delemtype");
            
            /**
             * Gets array of all "Holder" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getHolderArray();
            
            /**
             * Gets ith "Holder" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getHolderArray(int i);
            
            /**
             * Returns number of "Holder" element
             */
            int sizeOfHolderArray();
            
            /**
             * Sets array of all "Holder" element
             */
            void setHolderArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] holderArray);
            
            /**
             * Sets ith "Holder" element
             */
            void setHolderArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType holder);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Holder" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewHolder(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Holder" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewHolder();
            
            /**
             * Removes the ith "Holder" element
             */
            void removeHolder(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders newInstance() {
                  return (eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML OriginatesFrom(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface OriginatesFrom extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OriginatesFrom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("originatesfrom58d3elemtype");
            
            /**
             * Gets the "ProjectFunding__SubstitutionGroupHead" element
             */
            eu.openaire.cerifProfile.x11.ProjectFundingBaseType getProjectFundingSubstitutionGroupHead();
            
            /**
             * Sets the "ProjectFunding__SubstitutionGroupHead" element
             */
            void setProjectFundingSubstitutionGroupHead(eu.openaire.cerifProfile.x11.ProjectFundingBaseType projectFundingSubstitutionGroupHead);
            
            /**
             * Appends and returns a new empty "ProjectFunding__SubstitutionGroupHead" element
             */
            eu.openaire.cerifProfile.x11.ProjectFundingBaseType addNewProjectFundingSubstitutionGroupHead();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom newInstance() {
                  return (eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Predecessor(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Predecessor extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Predecessor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("predecessor2dcbelemtype");
            
            /**
             * Gets the "Patent" element
             */
            eu.openaire.cerifProfile.x11.PatentDocument.Patent getPatent();
            
            /**
             * Sets the "Patent" element
             */
            void setPatent(eu.openaire.cerifProfile.x11.PatentDocument.Patent patent);
            
            /**
             * Appends and returns a new empty "Patent" element
             */
            eu.openaire.cerifProfile.x11.PatentDocument.Patent addNewPatent();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor newInstance() {
                  return (eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML References(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface References extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(References.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("references7a3celemtype");
            
            /**
             * Gets the "ResearchOutput__SubstitutionGroupHead" element
             */
            eu.openaire.cerifProfile.x11.ResearchOutputBaseType getResearchOutputSubstitutionGroupHead();
            
            /**
             * Sets the "ResearchOutput__SubstitutionGroupHead" element
             */
            void setResearchOutputSubstitutionGroupHead(eu.openaire.cerifProfile.x11.ResearchOutputBaseType researchOutputSubstitutionGroupHead);
            
            /**
             * Appends and returns a new empty "ResearchOutput__SubstitutionGroupHead" element
             */
            eu.openaire.cerifProfile.x11.ResearchOutputBaseType addNewResearchOutputSubstitutionGroupHead();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PatentDocument.Patent.References newInstance() {
                  return (eu.openaire.cerifProfile.x11.PatentDocument.Patent.References) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PatentDocument.Patent.References newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PatentDocument.Patent.References) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.x11.PatentDocument.Patent newInstance() {
              return (eu.openaire.cerifProfile.x11.PatentDocument.Patent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.x11.PatentDocument.Patent newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.x11.PatentDocument.Patent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.x11.PatentDocument newInstance() {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PatentDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.PatentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.PatentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
