/*
 * An XML document type.
 * Localname: Funding
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.FundingDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11;


/**
 * A document containing one Funding(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public interface FundingDocument extends eu.openaire.cerifProfile.x11.ProjectFundingSubstitutionGroupHeadDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FundingDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("fundingd5f9doctype");
    
    /**
     * Gets the "Funding" element
     */
    eu.openaire.cerifProfile.x11.FundingDocument.Funding getFunding();
    
    /**
     * Sets the "Funding" element
     */
    void setFunding(eu.openaire.cerifProfile.x11.FundingDocument.Funding funding);
    
    /**
     * Appends and returns a new empty "Funding" element
     */
    eu.openaire.cerifProfile.x11.FundingDocument.Funding addNewFunding();
    
    /**
     * An XML Funding(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public interface Funding extends eu.openaire.cerifProfile.x11.ProjectFundingBaseType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Funding.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("funding5a50elemtype");
        
        /**
         * Gets the "Type" element
         */
        eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type getType();
        
        /**
         * True if has "Type" element
         */
        boolean isSetType();
        
        /**
         * Sets the "Type" element
         */
        void setType(eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type type);
        
        /**
         * Appends and returns a new empty "Type" element
         */
        eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type addNewType();
        
        /**
         * Unsets the "Type" element
         */
        void unsetType();
        
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
         * Gets the "Amount" element
         */
        eu.openaire.cerifProfile.x11.CfAmountType getAmount();
        
        /**
         * True if has "Amount" element
         */
        boolean isSetAmount();
        
        /**
         * Sets the "Amount" element
         */
        void setAmount(eu.openaire.cerifProfile.x11.CfAmountType amount);
        
        /**
         * Appends and returns a new empty "Amount" element
         */
        eu.openaire.cerifProfile.x11.CfAmountType addNewAmount();
        
        /**
         * Unsets the "Amount" element
         */
        void unsetAmount();
        
        /**
         * Gets array of all "Identifier" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] getIdentifierArray();
        
        /**
         * Gets ith "Identifier" element
         */
        eu.openaire.cerifProfile.x11.CfGenericIdentifierType getIdentifierArray(int i);
        
        /**
         * Returns number of "Identifier" element
         */
        int sizeOfIdentifierArray();
        
        /**
         * Sets array of all "Identifier" element
         */
        void setIdentifierArray(eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] identifierArray);
        
        /**
         * Sets ith "Identifier" element
         */
        void setIdentifierArray(int i, eu.openaire.cerifProfile.x11.CfGenericIdentifierType identifier);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        eu.openaire.cerifProfile.x11.CfGenericIdentifierType insertNewIdentifier(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        eu.openaire.cerifProfile.x11.CfGenericIdentifierType addNewIdentifier();
        
        /**
         * Removes the ith "Identifier" element
         */
        void removeIdentifier(int i);
        
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
         * Gets array of all "Funder" elements
         */
        eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getFunderArray();
        
        /**
         * Gets ith "Funder" element
         */
        eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getFunderArray(int i);
        
        /**
         * Returns number of "Funder" element
         */
        int sizeOfFunderArray();
        
        /**
         * Sets array of all "Funder" element
         */
        void setFunderArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] funderArray);
        
        /**
         * Sets ith "Funder" element
         */
        void setFunderArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType funder);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Funder" element
         */
        eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewFunder(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Funder" element
         */
        eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewFunder();
        
        /**
         * Removes the ith "Funder" element
         */
        void removeFunder(int i);
        
        /**
         * Gets the "PartOf" element
         */
        eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf getPartOf();
        
        /**
         * True if has "PartOf" element
         */
        boolean isSetPartOf();
        
        /**
         * Sets the "PartOf" element
         */
        void setPartOf(eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf partOf);
        
        /**
         * Appends and returns a new empty "PartOf" element
         */
        eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf addNewPartOf();
        
        /**
         * Unsets the "PartOf" element
         */
        void unsetPartOf();
        
        /**
         * Gets the "Duration" element
         */
        eu.openaire.cerifProfile.x11.CfLinkBaseType getDuration();
        
        /**
         * True if has "Duration" element
         */
        boolean isSetDuration();
        
        /**
         * Sets the "Duration" element
         */
        void setDuration(eu.openaire.cerifProfile.x11.CfLinkBaseType duration);
        
        /**
         * Appends and returns a new empty "Duration" element
         */
        eu.openaire.cerifProfile.x11.CfLinkBaseType addNewDuration();
        
        /**
         * Unsets the "Duration" element
         */
        void unsetDuration();
        
        /**
         * Gets array of all "OAMandate" elements
         */
        eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate[] getOAMandateArray();
        
        /**
         * Gets ith "OAMandate" element
         */
        eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate getOAMandateArray(int i);
        
        /**
         * Returns number of "OAMandate" element
         */
        int sizeOfOAMandateArray();
        
        /**
         * Sets array of all "OAMandate" element
         */
        void setOAMandateArray(eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate[] oaMandateArray);
        
        /**
         * Sets ith "OAMandate" element
         */
        void setOAMandateArray(int i, eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate oaMandate);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OAMandate" element
         */
        eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate insertNewOAMandate(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OAMandate" element
         */
        eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate addNewOAMandate();
        
        /**
         * Removes the ith "OAMandate" element
         */
        void removeOAMandate(int i);
        
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
         * An XML PartOf(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface PartOf extends eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PartOf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("partof95aaelemtype");
            
            /**
             * Gets the "Funding" element
             */
            eu.openaire.cerifProfile.x11.FundingDocument.Funding getFunding();
            
            /**
             * Sets the "Funding" element
             */
            void setFunding(eu.openaire.cerifProfile.x11.FundingDocument.Funding funding);
            
            /**
             * Appends and returns a new empty "Funding" element
             */
            eu.openaire.cerifProfile.x11.FundingDocument.Funding addNewFunding();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf newInstance() {
                  return (eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML OAMandate(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface OAMandate extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OAMandate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("oamandatea1ceelemtype");
            
            /**
             * Gets the "mandated" attribute
             */
            boolean getMandated();
            
            /**
             * Gets (as xml) the "mandated" attribute
             */
            org.apache.xmlbeans.XmlBoolean xgetMandated();
            
            /**
             * Sets the "mandated" attribute
             */
            void setMandated(boolean mandated);
            
            /**
             * Sets (as xml) the "mandated" attribute
             */
            void xsetMandated(org.apache.xmlbeans.XmlBoolean mandated);
            
            /**
             * Gets the "uri" attribute
             */
            java.lang.String getUri();
            
            /**
             * Gets (as xml) the "uri" attribute
             */
            org.apache.xmlbeans.XmlAnyURI xgetUri();
            
            /**
             * True if has "uri" attribute
             */
            boolean isSetUri();
            
            /**
             * Sets the "uri" attribute
             */
            void setUri(java.lang.String uri);
            
            /**
             * Sets (as xml) the "uri" attribute
             */
            void xsetUri(org.apache.xmlbeans.XmlAnyURI uri);
            
            /**
             * Unsets the "uri" attribute
             */
            void unsetUri();
            
            /**
             * Gets the "startDate" attribute
             */
            java.util.Calendar getStartDate();
            
            /**
             * Gets (as xml) the "startDate" attribute
             */
            eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType xgetStartDate();
            
            /**
             * True if has "startDate" attribute
             */
            boolean isSetStartDate();
            
            /**
             * Sets the "startDate" attribute
             */
            void setStartDate(java.util.Calendar startDate);
            
            /**
             * Sets (as xml) the "startDate" attribute
             */
            void xsetStartDate(eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType startDate);
            
            /**
             * Unsets the "startDate" attribute
             */
            void unsetStartDate();
            
            /**
             * Gets the "endDate" attribute
             */
            java.util.Calendar getEndDate();
            
            /**
             * Gets (as xml) the "endDate" attribute
             */
            eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType xgetEndDate();
            
            /**
             * True if has "endDate" attribute
             */
            boolean isSetEndDate();
            
            /**
             * Sets the "endDate" attribute
             */
            void setEndDate(java.util.Calendar endDate);
            
            /**
             * Sets (as xml) the "endDate" attribute
             */
            void xsetEndDate(eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType endDate);
            
            /**
             * Unsets the "endDate" attribute
             */
            void unsetEndDate();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate newInstance() {
                  return (eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.x11.FundingDocument.Funding newInstance() {
              return (eu.openaire.cerifProfile.x11.FundingDocument.Funding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.x11.FundingDocument.Funding newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.x11.FundingDocument.Funding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.x11.FundingDocument newInstance() {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.x11.FundingDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.FundingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.FundingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
