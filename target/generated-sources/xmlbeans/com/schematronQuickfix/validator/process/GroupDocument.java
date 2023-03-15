/*
 * An XML document type.
 * Localname: group
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process;


/**
 * A document containing one group(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public interface GroupDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GroupDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("group54dedoctype");
    
    /**
     * Gets the "group" element
     */
    com.schematronQuickfix.validator.process.GroupDocument.Group getGroup();
    
    /**
     * Sets the "group" element
     */
    void setGroup(com.schematronQuickfix.validator.process.GroupDocument.Group group);
    
    /**
     * Appends and returns a new empty "group" element
     */
    com.schematronQuickfix.validator.process.GroupDocument.Group addNewGroup();
    
    /**
     * An XML group(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public interface Group extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Group.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("groupbfd3elemtype");
        
        /**
         * Gets array of all "fix" elements
         */
        com.schematronQuickfix.validator.process.FixDocument.Fix[] getFixArray();
        
        /**
         * Gets ith "fix" element
         */
        com.schematronQuickfix.validator.process.FixDocument.Fix getFixArray(int i);
        
        /**
         * Returns number of "fix" element
         */
        int sizeOfFixArray();
        
        /**
         * Sets array of all "fix" element
         */
        void setFixArray(com.schematronQuickfix.validator.process.FixDocument.Fix[] fixArray);
        
        /**
         * Sets ith "fix" element
         */
        void setFixArray(int i, com.schematronQuickfix.validator.process.FixDocument.Fix fix);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fix" element
         */
        com.schematronQuickfix.validator.process.FixDocument.Fix insertNewFix(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fix" element
         */
        com.schematronQuickfix.validator.process.FixDocument.Fix addNewFix();
        
        /**
         * Removes the ith "fix" element
         */
        void removeFix(int i);
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlString xgetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlString id);
        
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
         * Gets the "lang" attribute
         */
        java.lang.String getLang();
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        org.w3.xml.x1998.namespace.LangAttribute.Lang xgetLang();
        
        /**
         * True if has "lang" attribute
         */
        boolean isSetLang();
        
        /**
         * Sets the "lang" attribute
         */
        void setLang(java.lang.String lang);
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        void xsetLang(org.w3.xml.x1998.namespace.LangAttribute.Lang lang);
        
        /**
         * Unsets the "lang" attribute
         */
        void unsetLang();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.schematronQuickfix.validator.process.GroupDocument.Group newInstance() {
              return (com.schematronQuickfix.validator.process.GroupDocument.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.schematronQuickfix.validator.process.GroupDocument.Group newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.schematronQuickfix.validator.process.GroupDocument.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.schematronQuickfix.validator.process.GroupDocument newInstance() {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.schematronQuickfix.validator.process.GroupDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.schematronQuickfix.validator.process.GroupDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.schematronQuickfix.validator.process.GroupDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.schematronQuickfix.validator.process.GroupDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.schematronQuickfix.validator.process.GroupDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.schematronQuickfix.validator.process.GroupDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.schematronQuickfix.validator.process.GroupDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.schematronQuickfix.validator.process.GroupDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.schematronQuickfix.validator.process.GroupDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.schematronQuickfix.validator.process.GroupDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.schematronQuickfix.validator.process.GroupDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.schematronQuickfix.validator.process.GroupDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.schematronQuickfix.validator.process.GroupDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.schematronQuickfix.validator.process.GroupDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.schematronQuickfix.validator.process.GroupDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.GroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.GroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
