/*
 * XML Type:  cfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnit__Type
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11;


/**
 * An XML cfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnit__Type(@https://www.openaire.eu/cerif-profile/1.1/).
 *
 * This is a complex type.
 */
public interface CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType extends eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("cflinkwithdisplaynametopersonwithaffiliationsororgunittypec4f8type");
    
    /**
     * Gets the "Person__SubstitutionGroupHead" element
     */
    eu.openaire.cerifProfile.x11.PersonBaseType getPersonSubstitutionGroupHead();
    
    /**
     * True if has "Person__SubstitutionGroupHead" element
     */
    boolean isSetPersonSubstitutionGroupHead();
    
    /**
     * Sets the "Person__SubstitutionGroupHead" element
     */
    void setPersonSubstitutionGroupHead(eu.openaire.cerifProfile.x11.PersonBaseType personSubstitutionGroupHead);
    
    /**
     * Appends and returns a new empty "Person__SubstitutionGroupHead" element
     */
    eu.openaire.cerifProfile.x11.PersonBaseType addNewPersonSubstitutionGroupHead();
    
    /**
     * Unsets the "Person__SubstitutionGroupHead" element
     */
    void unsetPersonSubstitutionGroupHead();
    
    /**
     * Gets array of all "Affiliation" elements
     */
    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation[] getAffiliationArray();
    
    /**
     * Gets ith "Affiliation" element
     */
    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation getAffiliationArray(int i);
    
    /**
     * Returns number of "Affiliation" element
     */
    int sizeOfAffiliationArray();
    
    /**
     * Sets array of all "Affiliation" element
     */
    void setAffiliationArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation[] affiliationArray);
    
    /**
     * Sets ith "Affiliation" element
     */
    void setAffiliationArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation affiliation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Affiliation" element
     */
    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation insertNewAffiliation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Affiliation" element
     */
    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation addNewAffiliation();
    
    /**
     * Removes the ith "Affiliation" element
     */
    void removeAffiliation(int i);
    
    /**
     * Gets the "OrgUnit__SubstitutionGroupHead" element
     */
    eu.openaire.cerifProfile.x11.OrgUnitBaseType getOrgUnitSubstitutionGroupHead();
    
    /**
     * True if has "OrgUnit__SubstitutionGroupHead" element
     */
    boolean isSetOrgUnitSubstitutionGroupHead();
    
    /**
     * Sets the "OrgUnit__SubstitutionGroupHead" element
     */
    void setOrgUnitSubstitutionGroupHead(eu.openaire.cerifProfile.x11.OrgUnitBaseType orgUnitSubstitutionGroupHead);
    
    /**
     * Appends and returns a new empty "OrgUnit__SubstitutionGroupHead" element
     */
    eu.openaire.cerifProfile.x11.OrgUnitBaseType addNewOrgUnitSubstitutionGroupHead();
    
    /**
     * Unsets the "OrgUnit__SubstitutionGroupHead" element
     */
    void unsetOrgUnitSubstitutionGroupHead();
    
    /**
     * An XML Affiliation(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public interface Affiliation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Affiliation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("affiliation6d34elemtype");
        
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
        eu.openaire.cerifProfile.x11.OrgUnitBaseType getOrgUnitSubstitutionGroupHead();
        
        /**
         * Sets the "OrgUnit__SubstitutionGroupHead" element
         */
        void setOrgUnitSubstitutionGroupHead(eu.openaire.cerifProfile.x11.OrgUnitBaseType orgUnitSubstitutionGroupHead);
        
        /**
         * Appends and returns a new empty "OrgUnit__SubstitutionGroupHead" element
         */
        eu.openaire.cerifProfile.x11.OrgUnitBaseType addNewOrgUnitSubstitutionGroupHead();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation newInstance() {
              return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType newInstance() {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
