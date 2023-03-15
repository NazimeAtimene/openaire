/*
 * XML Type:  oai-identifierType
 * Namespace: http://www.openarchives.org/OAI/2.0/oai-identifier
 * Java type: org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType
 *
 * Automatically generated - do not modify.
 */
package org.openarchives.oai.x20.oaiIdentifier;


/**
 * An XML oai-identifierType(@http://www.openarchives.org/OAI/2.0/oai-identifier).
 *
 * This is a complex type.
 */
public interface OaiIdentifierType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OaiIdentifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("oaiidentifiertype5bc5type");
    
    /**
     * Gets the "scheme" element
     */
    java.lang.String getScheme();
    
    /**
     * Gets (as xml) the "scheme" element
     */
    org.apache.xmlbeans.XmlString xgetScheme();
    
    /**
     * Sets the "scheme" element
     */
    void setScheme(java.lang.String scheme);
    
    /**
     * Sets (as xml) the "scheme" element
     */
    void xsetScheme(org.apache.xmlbeans.XmlString scheme);
    
    /**
     * Gets the "repositoryIdentifier" element
     */
    java.lang.String getRepositoryIdentifier();
    
    /**
     * Gets (as xml) the "repositoryIdentifier" element
     */
    org.openarchives.oai.x20.oaiIdentifier.RepositoryIdentifierType xgetRepositoryIdentifier();
    
    /**
     * Sets the "repositoryIdentifier" element
     */
    void setRepositoryIdentifier(java.lang.String repositoryIdentifier);
    
    /**
     * Sets (as xml) the "repositoryIdentifier" element
     */
    void xsetRepositoryIdentifier(org.openarchives.oai.x20.oaiIdentifier.RepositoryIdentifierType repositoryIdentifier);
    
    /**
     * Gets the "delimiter" element
     */
    java.lang.String getDelimiter();
    
    /**
     * Gets (as xml) the "delimiter" element
     */
    org.apache.xmlbeans.XmlString xgetDelimiter();
    
    /**
     * Sets the "delimiter" element
     */
    void setDelimiter(java.lang.String delimiter);
    
    /**
     * Sets (as xml) the "delimiter" element
     */
    void xsetDelimiter(org.apache.xmlbeans.XmlString delimiter);
    
    /**
     * Gets the "sampleIdentifier" element
     */
    java.lang.String getSampleIdentifier();
    
    /**
     * Gets (as xml) the "sampleIdentifier" element
     */
    org.openarchives.oai.x20.oaiIdentifier.SampleIdentifierType xgetSampleIdentifier();
    
    /**
     * Sets the "sampleIdentifier" element
     */
    void setSampleIdentifier(java.lang.String sampleIdentifier);
    
    /**
     * Sets (as xml) the "sampleIdentifier" element
     */
    void xsetSampleIdentifier(org.openarchives.oai.x20.oaiIdentifier.SampleIdentifierType sampleIdentifier);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType newInstance() {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}