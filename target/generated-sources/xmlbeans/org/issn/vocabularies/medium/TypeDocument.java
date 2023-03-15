/*
 * An XML document type.
 * Localname: Type
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.TypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium;


/**
 * A document containing one Type(@http://issn.org/vocabularies/Medium) element.
 *
 * This is a complex type.
 */
public interface TypeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("typef311doctype");
    
    /**
     * Gets the "Type" element
     */
    org.issn.vocabularies.medium.TypeDocument.Type getType();
    
    /**
     * Sets the "Type" element
     */
    void setType(org.issn.vocabularies.medium.TypeDocument.Type type);
    
    /**
     * Appends and returns a new empty "Type" element
     */
    org.issn.vocabularies.medium.TypeDocument.Type addNewType();
    
    /**
     * An XML Type(@http://issn.org/vocabularies/Medium).
     *
     * This is an atomic type that is a restriction of org.issn.vocabularies.medium.TypeDocument$Type.
     */
    public interface Type extends org.issn.vocabularies.medium.EnumType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("typed55belemtype");
        
        static final org.issn.vocabularies.medium.EnumType.Enum HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_PRINT = org.issn.vocabularies.medium.EnumType.HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_PRINT;
        static final org.issn.vocabularies.medium.EnumType.Enum HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_ONLINE = org.issn.vocabularies.medium.EnumType.HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_ONLINE;
        static final org.issn.vocabularies.medium.EnumType.Enum HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_DIGITAL_CARRIER = org.issn.vocabularies.medium.EnumType.HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_DIGITAL_CARRIER;
        static final org.issn.vocabularies.medium.EnumType.Enum HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_OTHER = org.issn.vocabularies.medium.EnumType.HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_OTHER;
        
        static final int INT_HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_PRINT = org.issn.vocabularies.medium.EnumType.INT_HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_PRINT;
        static final int INT_HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_ONLINE = org.issn.vocabularies.medium.EnumType.INT_HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_ONLINE;
        static final int INT_HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_DIGITAL_CARRIER = org.issn.vocabularies.medium.EnumType.INT_HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_DIGITAL_CARRIER;
        static final int INT_HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_OTHER = org.issn.vocabularies.medium.EnumType.INT_HTTP_ISSN_ORG_VOCABULARIES_MEDIUM_OTHER;
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.issn.vocabularies.medium.TypeDocument.Type newInstance() {
              return (org.issn.vocabularies.medium.TypeDocument.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.issn.vocabularies.medium.TypeDocument.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.issn.vocabularies.medium.TypeDocument.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.issn.vocabularies.medium.TypeDocument newInstance() {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.issn.vocabularies.medium.TypeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.issn.vocabularies.medium.TypeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.issn.vocabularies.medium.TypeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.issn.vocabularies.medium.TypeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.issn.vocabularies.medium.TypeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.issn.vocabularies.medium.TypeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.issn.vocabularies.medium.TypeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.issn.vocabularies.medium.TypeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.issn.vocabularies.medium.TypeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.issn.vocabularies.medium.TypeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.issn.vocabularies.medium.TypeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.issn.vocabularies.medium.TypeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.issn.vocabularies.medium.TypeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.issn.vocabularies.medium.TypeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.issn.vocabularies.medium.TypeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.issn.vocabularies.medium.TypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.issn.vocabularies.medium.TypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.issn.vocabularies.medium.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
