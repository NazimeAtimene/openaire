/*
 * XML Type:  cfMLangAnyMixed__Type
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.CfMLangAnyMixedType
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium;


/**
 * An XML cfMLangAnyMixed__Type(@http://issn.org/vocabularies/Medium).
 *
 * This is a complex type.
 */
public interface CfMLangAnyMixedType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CfMLangAnyMixedType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("cfmlanganymixedtypeb756type");
    
    /**
     * Gets the "lang" attribute
     */
    java.lang.String getLang();
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    org.w3.xml.x1998.namespace.LangAttribute.Lang xgetLang();
    
    /**
     * Sets the "lang" attribute
     */
    void setLang(java.lang.String lang);
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    void xsetLang(org.w3.xml.x1998.namespace.LangAttribute.Lang lang);
    
    /**
     * Gets the "trans" attribute
     */
    org.issn.vocabularies.medium.CfTransType.Enum getTrans();
    
    /**
     * Gets (as xml) the "trans" attribute
     */
    org.issn.vocabularies.medium.CfTransType xgetTrans();
    
    /**
     * True if has "trans" attribute
     */
    boolean isSetTrans();
    
    /**
     * Sets the "trans" attribute
     */
    void setTrans(org.issn.vocabularies.medium.CfTransType.Enum trans);
    
    /**
     * Sets (as xml) the "trans" attribute
     */
    void xsetTrans(org.issn.vocabularies.medium.CfTransType trans);
    
    /**
     * Unsets the "trans" attribute
     */
    void unsetTrans();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType newInstance() {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.issn.vocabularies.medium.CfMLangAnyMixedType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.issn.vocabularies.medium.CfMLangAnyMixedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
