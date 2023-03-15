/*
 * XML Type:  cfLinkWithDisplayNameToPersonWithAffiliations__Type
 * Namespace: http://purl.org/coar/access_right
 * Java type: org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.accessRight;


/**
 * An XML cfLinkWithDisplayNameToPersonWithAffiliations__Type(@http://purl.org/coar/access_right).
 *
 * This is a complex type.
 */
public interface CfLinkWithDisplayNameToPersonWithAffiliationsType extends org.purl.coar.accessRight.CfLinkWithDisplayNameBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CfLinkWithDisplayNameToPersonWithAffiliationsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("cflinkwithdisplaynametopersonwithaffiliationstype313ftype");
    
    /**
     * Gets the "Person__SubstitutionGroupHead" element
     */
    org.purl.coar.accessRight.PersonBaseType getPersonSubstitutionGroupHead();
    
    /**
     * Sets the "Person__SubstitutionGroupHead" element
     */
    void setPersonSubstitutionGroupHead(org.purl.coar.accessRight.PersonBaseType personSubstitutionGroupHead);
    
    /**
     * Appends and returns a new empty "Person__SubstitutionGroupHead" element
     */
    org.purl.coar.accessRight.PersonBaseType addNewPersonSubstitutionGroupHead();
    
    /**
     * Gets array of all "Affiliation" elements
     */
    org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation[] getAffiliationArray();
    
    /**
     * Gets ith "Affiliation" element
     */
    org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation getAffiliationArray(int i);
    
    /**
     * Returns number of "Affiliation" element
     */
    int sizeOfAffiliationArray();
    
    /**
     * Sets array of all "Affiliation" element
     */
    void setAffiliationArray(org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation[] affiliationArray);
    
    /**
     * Sets ith "Affiliation" element
     */
    void setAffiliationArray(int i, org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation affiliation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Affiliation" element
     */
    org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation insertNewAffiliation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Affiliation" element
     */
    org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation addNewAffiliation();
    
    /**
     * Removes the ith "Affiliation" element
     */
    void removeAffiliation(int i);
    
    /**
     * An XML Affiliation(@http://purl.org/coar/access_right).
     *
     * This is a complex type.
     */
    public interface Affiliation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Affiliation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("affiliationb07belemtype");
        
        /**
         * Gets the "DisplayName" element
         */
        java.lang.String getDisplayName();
        
        /**
         * Gets (as xml) the "DisplayName" element
         */
        org.apache.xmlbeans.XmlString xgetDisplayName();
        
        /**
         * True if has "DisplayName" element
         */
        boolean isSetDisplayName();
        
        /**
         * Sets the "DisplayName" element
         */
        void setDisplayName(java.lang.String displayName);
        
        /**
         * Sets (as xml) the "DisplayName" element
         */
        void xsetDisplayName(org.apache.xmlbeans.XmlString displayName);
        
        /**
         * Unsets the "DisplayName" element
         */
        void unsetDisplayName();
        
        /**
         * Gets the "OrgUnit__SubstitutionGroupHead" element
         */
        org.purl.coar.accessRight.OrgUnitBaseType getOrgUnitSubstitutionGroupHead();
        
        /**
         * Sets the "OrgUnit__SubstitutionGroupHead" element
         */
        void setOrgUnitSubstitutionGroupHead(org.purl.coar.accessRight.OrgUnitBaseType orgUnitSubstitutionGroupHead);
        
        /**
         * Appends and returns a new empty "OrgUnit__SubstitutionGroupHead" element
         */
        org.purl.coar.accessRight.OrgUnitBaseType addNewOrgUnitSubstitutionGroupHead();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation newInstance() {
              return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType newInstance() {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
