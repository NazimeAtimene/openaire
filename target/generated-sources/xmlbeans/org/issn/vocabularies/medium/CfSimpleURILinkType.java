/*
 * XML Type:  cfSimpleURILink__Type
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.CfSimpleURILinkType
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium;


/**
 * An XML cfSimpleURILink__Type(@http://issn.org/vocabularies/Medium).
 *
 * This is an atomic type that is a restriction of org.issn.vocabularies.medium.CfSimpleURILinkType.
 */
public interface CfSimpleURILinkType extends org.issn.vocabularies.medium.CfURIType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CfSimpleURILinkType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("cfsimpleurilinktype85c0type");
    
    /**
     * Gets the "startDate" attribute
     */
    java.util.Calendar getStartDate();
    
    /**
     * Gets (as xml) the "startDate" attribute
     */
    org.issn.vocabularies.medium.CfGenericDateTimeSimpleType xgetStartDate();
    
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
    void xsetStartDate(org.issn.vocabularies.medium.CfGenericDateTimeSimpleType startDate);
    
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
    org.issn.vocabularies.medium.CfGenericDateTimeSimpleType xgetEndDate();
    
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
    void xsetEndDate(org.issn.vocabularies.medium.CfGenericDateTimeSimpleType endDate);
    
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
        public static org.issn.vocabularies.medium.CfSimpleURILinkType newInstance() {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.issn.vocabularies.medium.CfSimpleURILinkType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.issn.vocabularies.medium.CfSimpleURILinkType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.issn.vocabularies.medium.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}