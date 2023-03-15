/*
 * XML Type:  cfGenericURIClassification__Type
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.CfGenericURIClassificationType
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium;


/**
 * An XML cfGenericURIClassification__Type(@http://issn.org/vocabularies/Medium).
 *
 * This is an atomic type that is a restriction of org.issn.vocabularies.medium.CfGenericURIClassificationType.
 */
public interface CfGenericURIClassificationType extends org.issn.vocabularies.medium.CfSimpleURILinkType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CfGenericURIClassificationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("cfgenericuriclassificationtypebebftype");
    
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
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType newInstance() {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.issn.vocabularies.medium.CfGenericURIClassificationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.issn.vocabularies.medium.CfGenericURIClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}