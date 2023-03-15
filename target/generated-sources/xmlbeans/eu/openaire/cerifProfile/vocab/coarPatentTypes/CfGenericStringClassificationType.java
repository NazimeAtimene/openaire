/*
 * XML Type:  cfGenericStringClassification__Type
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types
 * Java type: eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.coarPatentTypes;


/**
 * An XML cfGenericStringClassification__Type(@https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types).
 *
 * This is an atomic type that is a restriction of eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType.
 */
public interface CfGenericStringClassificationType extends eu.openaire.cerifProfile.vocab.coarPatentTypes.CfSimpleStringLinkType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CfGenericStringClassificationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("cfgenericstringclassificationtype13fatype");
    
    /**
     * Gets the "scheme" attribute
     */
    java.lang.String getScheme();
    
    /**
     * Gets (as xml) the "scheme" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetScheme();
    
    /**
     * Sets the "scheme" attribute
     */
    void setScheme(java.lang.String scheme);
    
    /**
     * Sets (as xml) the "scheme" attribute
     */
    void xsetScheme(org.apache.xmlbeans.XmlAnyURI scheme);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType newInstance() {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericStringClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
