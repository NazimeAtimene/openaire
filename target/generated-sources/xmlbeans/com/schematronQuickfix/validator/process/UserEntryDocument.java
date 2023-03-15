/*
 * An XML document type.
 * Localname: user-entry
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.UserEntryDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process;


/**
 * A document containing one user-entry(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public interface UserEntryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserEntryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("userentry893bdoctype");
    
    /**
     * Gets the "user-entry" element
     */
    com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry getUserEntry();
    
    /**
     * Sets the "user-entry" element
     */
    void setUserEntry(com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry userEntry);
    
    /**
     * Appends and returns a new empty "user-entry" element
     */
    com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry addNewUserEntry();
    
    /**
     * An XML user-entry(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public interface UserEntry extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserEntry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("userentrya4c7elemtype");
        
        /**
         * Gets array of all "description" elements
         */
        com.schematronQuickfix.validator.process.DescriptionDocument.Description[] getDescriptionArray();
        
        /**
         * Gets ith "description" element
         */
        com.schematronQuickfix.validator.process.DescriptionDocument.Description getDescriptionArray(int i);
        
        /**
         * Returns number of "description" element
         */
        int sizeOfDescriptionArray();
        
        /**
         * Sets array of all "description" element
         */
        void setDescriptionArray(com.schematronQuickfix.validator.process.DescriptionDocument.Description[] descriptionArray);
        
        /**
         * Sets ith "description" element
         */
        void setDescriptionArray(int i, com.schematronQuickfix.validator.process.DescriptionDocument.Description description);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "description" element
         */
        com.schematronQuickfix.validator.process.DescriptionDocument.Description insertNewDescription(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "description" element
         */
        com.schematronQuickfix.validator.process.DescriptionDocument.Description addNewDescription();
        
        /**
         * Removes the ith "description" element
         */
        void removeDescription(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "default" attribute
         */
        java.lang.String getDefault();
        
        /**
         * Gets (as xml) the "default" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefault();
        
        /**
         * True if has "default" attribute
         */
        boolean isSetDefault();
        
        /**
         * Sets the "default" attribute
         */
        void setDefault(java.lang.String xdefault);
        
        /**
         * Sets (as xml) the "default" attribute
         */
        void xsetDefault(org.apache.xmlbeans.XmlString xdefault);
        
        /**
         * Unsets the "default" attribute
         */
        void unsetDefault();
        
        /**
         * Gets the "type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
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
            public static com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry newInstance() {
              return (com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.schematronQuickfix.validator.process.UserEntryDocument newInstance() {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.schematronQuickfix.validator.process.UserEntryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.UserEntryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.UserEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
