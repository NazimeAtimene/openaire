/*
 * An XML document type.
 * Localname: replace
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.ReplaceDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process;


/**
 * A document containing one replace(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public interface ReplaceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReplaceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("replace6589doctype");
    
    /**
     * Gets the "replace" element
     */
    com.schematronQuickfix.validator.process.ReplaceDocument.Replace getReplace();
    
    /**
     * Sets the "replace" element
     */
    void setReplace(com.schematronQuickfix.validator.process.ReplaceDocument.Replace replace);
    
    /**
     * Appends and returns a new empty "replace" element
     */
    com.schematronQuickfix.validator.process.ReplaceDocument.Replace addNewReplace();
    
    /**
     * An XML replace(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public interface Replace extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Replace.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("replaceb269elemtype");
        
        /**
         * Gets the "match" attribute
         */
        java.lang.String getMatch();
        
        /**
         * Gets (as xml) the "match" attribute
         */
        org.apache.xmlbeans.XmlString xgetMatch();
        
        /**
         * True if has "match" attribute
         */
        boolean isSetMatch();
        
        /**
         * Sets the "match" attribute
         */
        void setMatch(java.lang.String match);
        
        /**
         * Sets (as xml) the "match" attribute
         */
        void xsetMatch(org.apache.xmlbeans.XmlString match);
        
        /**
         * Unsets the "match" attribute
         */
        void unsetMatch();
        
        /**
         * Gets the "use-when" attribute
         */
        java.lang.String getUseWhen();
        
        /**
         * Gets (as xml) the "use-when" attribute
         */
        org.apache.xmlbeans.XmlString xgetUseWhen();
        
        /**
         * True if has "use-when" attribute
         */
        boolean isSetUseWhen();
        
        /**
         * Sets the "use-when" attribute
         */
        void setUseWhen(java.lang.String useWhen);
        
        /**
         * Sets (as xml) the "use-when" attribute
         */
        void xsetUseWhen(org.apache.xmlbeans.XmlString useWhen);
        
        /**
         * Unsets the "use-when" attribute
         */
        void unsetUseWhen();
        
        /**
         * Gets the "node-type" attribute
         */
        com.schematronQuickfix.validator.process.NodeTypeType.Enum getNodeType();
        
        /**
         * Gets (as xml) the "node-type" attribute
         */
        com.schematronQuickfix.validator.process.NodeTypeType xgetNodeType();
        
        /**
         * True if has "node-type" attribute
         */
        boolean isSetNodeType();
        
        /**
         * Sets the "node-type" attribute
         */
        void setNodeType(com.schematronQuickfix.validator.process.NodeTypeType.Enum nodeType);
        
        /**
         * Sets (as xml) the "node-type" attribute
         */
        void xsetNodeType(com.schematronQuickfix.validator.process.NodeTypeType nodeType);
        
        /**
         * Unsets the "node-type" attribute
         */
        void unsetNodeType();
        
        /**
         * Gets the "select" attribute
         */
        java.lang.String getSelect();
        
        /**
         * Gets (as xml) the "select" attribute
         */
        org.apache.xmlbeans.XmlString xgetSelect();
        
        /**
         * True if has "select" attribute
         */
        boolean isSetSelect();
        
        /**
         * Sets the "select" attribute
         */
        void setSelect(java.lang.String select);
        
        /**
         * Sets (as xml) the "select" attribute
         */
        void xsetSelect(org.apache.xmlbeans.XmlString select);
        
        /**
         * Unsets the "select" attribute
         */
        void unsetSelect();
        
        /**
         * Gets the "target" attribute
         */
        java.lang.String getTarget();
        
        /**
         * Gets (as xml) the "target" attribute
         */
        org.apache.xmlbeans.XmlString xgetTarget();
        
        /**
         * True if has "target" attribute
         */
        boolean isSetTarget();
        
        /**
         * Sets the "target" attribute
         */
        void setTarget(java.lang.String target);
        
        /**
         * Sets (as xml) the "target" attribute
         */
        void xsetTarget(org.apache.xmlbeans.XmlString target);
        
        /**
         * Unsets the "target" attribute
         */
        void unsetTarget();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.schematronQuickfix.validator.process.ReplaceDocument.Replace newInstance() {
              return (com.schematronQuickfix.validator.process.ReplaceDocument.Replace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.schematronQuickfix.validator.process.ReplaceDocument.Replace newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.schematronQuickfix.validator.process.ReplaceDocument.Replace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.schematronQuickfix.validator.process.ReplaceDocument newInstance() {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.schematronQuickfix.validator.process.ReplaceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.ReplaceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.ReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
