/*
 * An XML document type.
 * Localname: description
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.DescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process;


/**
 * A document containing one description(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public interface DescriptionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("descriptionacc1doctype");
    
    /**
     * Gets the "description" element
     */
    com.schematronQuickfix.validator.process.DescriptionDocument.Description getDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(com.schematronQuickfix.validator.process.DescriptionDocument.Description description);
    
    /**
     * Appends and returns a new empty "description" element
     */
    com.schematronQuickfix.validator.process.DescriptionDocument.Description addNewDescription();
    
    /**
     * An XML description(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public interface Description extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Description.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("description0759elemtype");
        
        /**
         * Gets the "title" element
         */
        com.schematronQuickfix.validator.process.TitleDocument.Title getTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(com.schematronQuickfix.validator.process.TitleDocument.Title title);
        
        /**
         * Appends and returns a new empty "title" element
         */
        com.schematronQuickfix.validator.process.TitleDocument.Title addNewTitle();
        
        /**
         * Gets array of all "p" elements
         */
        com.schematronQuickfix.validator.process.PDocument.P[] getPArray();
        
        /**
         * Gets ith "p" element
         */
        com.schematronQuickfix.validator.process.PDocument.P getPArray(int i);
        
        /**
         * Returns number of "p" element
         */
        int sizeOfPArray();
        
        /**
         * Sets array of all "p" element
         */
        void setPArray(com.schematronQuickfix.validator.process.PDocument.P[] pArray);
        
        /**
         * Sets ith "p" element
         */
        void setPArray(int i, com.schematronQuickfix.validator.process.PDocument.P p);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "p" element
         */
        com.schematronQuickfix.validator.process.PDocument.P insertNewP(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "p" element
         */
        com.schematronQuickfix.validator.process.PDocument.P addNewP();
        
        /**
         * Removes the ith "p" element
         */
        void removeP(int i);
        
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
            public static com.schematronQuickfix.validator.process.DescriptionDocument.Description newInstance() {
              return (com.schematronQuickfix.validator.process.DescriptionDocument.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.schematronQuickfix.validator.process.DescriptionDocument.Description newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.schematronQuickfix.validator.process.DescriptionDocument.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.schematronQuickfix.validator.process.DescriptionDocument newInstance() {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.schematronQuickfix.validator.process.DescriptionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.DescriptionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
