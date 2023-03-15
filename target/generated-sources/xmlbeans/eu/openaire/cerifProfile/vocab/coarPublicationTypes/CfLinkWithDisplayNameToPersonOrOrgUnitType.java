/*
 * XML Type:  cfLinkWithDisplayNameToPersonOrOrgUnit__Type
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/COAR_Publication_Types
 * Java type: eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.coarPublicationTypes;


/**
 * An XML cfLinkWithDisplayNameToPersonOrOrgUnit__Type(@https://www.openaire.eu/cerif-profile/vocab/COAR_Publication_Types).
 *
 * This is a complex type.
 */
public interface CfLinkWithDisplayNameToPersonOrOrgUnitType extends eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CfLinkWithDisplayNameToPersonOrOrgUnitType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("cflinkwithdisplaynametopersonororgunittype221ctype");
    
    /**
     * Gets the "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    eu.openaire.cerifProfile.vocab.coarPublicationTypes.PersonOrOrgUnitBaseType getPersonOrOrgUnitSubstitutionGroupHead();
    
    /**
     * Sets the "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    void setPersonOrOrgUnitSubstitutionGroupHead(eu.openaire.cerifProfile.vocab.coarPublicationTypes.PersonOrOrgUnitBaseType personOrOrgUnitSubstitutionGroupHead);
    
    /**
     * Appends and returns a new empty "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    eu.openaire.cerifProfile.vocab.coarPublicationTypes.PersonOrOrgUnitBaseType addNewPersonOrOrgUnitSubstitutionGroupHead();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType newInstance() {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
