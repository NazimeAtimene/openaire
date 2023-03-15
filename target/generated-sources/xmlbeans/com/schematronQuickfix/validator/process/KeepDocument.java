/*
 * An XML document type.
 * Localname: keep
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.KeepDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process;


/**
 * A document containing one keep(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public interface KeepDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeepDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("keep4e06doctype");
    
    /**
     * Gets the "keep" element
     */
    com.schematronQuickfix.validator.process.KeepDocument.Keep getKeep();
    
    /**
     * Sets the "keep" element
     */
    void setKeep(com.schematronQuickfix.validator.process.KeepDocument.Keep keep);
    
    /**
     * Appends and returns a new empty "keep" element
     */
    com.schematronQuickfix.validator.process.KeepDocument.Keep addNewKeep();
    
    /**
     * An XML keep(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public interface Keep extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Keep.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("keep26a7elemtype");
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.schematronQuickfix.validator.process.KeepDocument.Keep newInstance() {
              return (com.schematronQuickfix.validator.process.KeepDocument.Keep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.schematronQuickfix.validator.process.KeepDocument.Keep newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.schematronQuickfix.validator.process.KeepDocument.Keep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.schematronQuickfix.validator.process.KeepDocument newInstance() {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.schematronQuickfix.validator.process.KeepDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.schematronQuickfix.validator.process.KeepDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.schematronQuickfix.validator.process.KeepDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.schematronQuickfix.validator.process.KeepDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.schematronQuickfix.validator.process.KeepDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.schematronQuickfix.validator.process.KeepDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.schematronQuickfix.validator.process.KeepDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.schematronQuickfix.validator.process.KeepDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.schematronQuickfix.validator.process.KeepDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.schematronQuickfix.validator.process.KeepDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.schematronQuickfix.validator.process.KeepDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.schematronQuickfix.validator.process.KeepDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.schematronQuickfix.validator.process.KeepDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.schematronQuickfix.validator.process.KeepDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.schematronQuickfix.validator.process.KeepDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.KeepDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.KeepDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.KeepDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
