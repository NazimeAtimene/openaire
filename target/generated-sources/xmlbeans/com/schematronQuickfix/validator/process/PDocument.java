/*
 * An XML document type.
 * Localname: p
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.PDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process;


/**
 * A document containing one p(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public interface PDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("pa40ddoctype");
    
    /**
     * Gets the "p" element
     */
    com.schematronQuickfix.validator.process.PDocument.P getP();
    
    /**
     * Sets the "p" element
     */
    void setP(com.schematronQuickfix.validator.process.PDocument.P p);
    
    /**
     * Appends and returns a new empty "p" element
     */
    com.schematronQuickfix.validator.process.PDocument.P addNewP();
    
    /**
     * An XML p(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public interface P extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(P.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("pb8b1elemtype");
        
        /**
         * Gets array of all "name" elements
         */
        org.oclc.purl.dsdl.schematron.NameDocument.Name[] getNameArray();
        
        /**
         * Gets ith "name" element
         */
        org.oclc.purl.dsdl.schematron.NameDocument.Name getNameArray(int i);
        
        /**
         * Returns number of "name" element
         */
        int sizeOfNameArray();
        
        /**
         * Sets array of all "name" element
         */
        void setNameArray(org.oclc.purl.dsdl.schematron.NameDocument.Name[] nameArray);
        
        /**
         * Sets ith "name" element
         */
        void setNameArray(int i, org.oclc.purl.dsdl.schematron.NameDocument.Name name);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        org.oclc.purl.dsdl.schematron.NameDocument.Name insertNewName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        org.oclc.purl.dsdl.schematron.NameDocument.Name addNewName();
        
        /**
         * Removes the ith "name" element
         */
        void removeName(int i);
        
        /**
         * Gets array of all "value-of" elements
         */
        org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf[] getValueOfArray();
        
        /**
         * Gets ith "value-of" element
         */
        org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf getValueOfArray(int i);
        
        /**
         * Returns number of "value-of" element
         */
        int sizeOfValueOfArray();
        
        /**
         * Sets array of all "value-of" element
         */
        void setValueOfArray(org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf[] valueOfArray);
        
        /**
         * Sets ith "value-of" element
         */
        void setValueOfArray(int i, org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf valueOf);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "value-of" element
         */
        org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf insertNewValueOf(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "value-of" element
         */
        org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf addNewValueOf();
        
        /**
         * Removes the ith "value-of" element
         */
        void removeValueOf(int i);
        
        /**
         * Gets array of all "emph" elements
         */
        org.oclc.purl.dsdl.schematron.EmphDocument.Emph[] getEmphArray();
        
        /**
         * Gets ith "emph" element
         */
        org.oclc.purl.dsdl.schematron.EmphDocument.Emph getEmphArray(int i);
        
        /**
         * Returns number of "emph" element
         */
        int sizeOfEmphArray();
        
        /**
         * Sets array of all "emph" element
         */
        void setEmphArray(org.oclc.purl.dsdl.schematron.EmphDocument.Emph[] emphArray);
        
        /**
         * Sets ith "emph" element
         */
        void setEmphArray(int i, org.oclc.purl.dsdl.schematron.EmphDocument.Emph emph);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "emph" element
         */
        org.oclc.purl.dsdl.schematron.EmphDocument.Emph insertNewEmph(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "emph" element
         */
        org.oclc.purl.dsdl.schematron.EmphDocument.Emph addNewEmph();
        
        /**
         * Removes the ith "emph" element
         */
        void removeEmph(int i);
        
        /**
         * Gets array of all "dir" elements
         */
        org.oclc.purl.dsdl.schematron.DirDocument.Dir[] getDirArray();
        
        /**
         * Gets ith "dir" element
         */
        org.oclc.purl.dsdl.schematron.DirDocument.Dir getDirArray(int i);
        
        /**
         * Returns number of "dir" element
         */
        int sizeOfDirArray();
        
        /**
         * Sets array of all "dir" element
         */
        void setDirArray(org.oclc.purl.dsdl.schematron.DirDocument.Dir[] dirArray);
        
        /**
         * Sets ith "dir" element
         */
        void setDirArray(int i, org.oclc.purl.dsdl.schematron.DirDocument.Dir dir);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dir" element
         */
        org.oclc.purl.dsdl.schematron.DirDocument.Dir insertNewDir(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dir" element
         */
        org.oclc.purl.dsdl.schematron.DirDocument.Dir addNewDir();
        
        /**
         * Removes the ith "dir" element
         */
        void removeDir(int i);
        
        /**
         * Gets array of all "span" elements
         */
        org.oclc.purl.dsdl.schematron.SpanDocument.Span[] getSpanArray();
        
        /**
         * Gets ith "span" element
         */
        org.oclc.purl.dsdl.schematron.SpanDocument.Span getSpanArray(int i);
        
        /**
         * Returns number of "span" element
         */
        int sizeOfSpanArray();
        
        /**
         * Sets array of all "span" element
         */
        void setSpanArray(org.oclc.purl.dsdl.schematron.SpanDocument.Span[] spanArray);
        
        /**
         * Sets ith "span" element
         */
        void setSpanArray(int i, org.oclc.purl.dsdl.schematron.SpanDocument.Span span);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "span" element
         */
        org.oclc.purl.dsdl.schematron.SpanDocument.Span insertNewSpan(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "span" element
         */
        org.oclc.purl.dsdl.schematron.SpanDocument.Span addNewSpan();
        
        /**
         * Removes the ith "span" element
         */
        void removeSpan(int i);
        
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
            public static com.schematronQuickfix.validator.process.PDocument.P newInstance() {
              return (com.schematronQuickfix.validator.process.PDocument.P) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.schematronQuickfix.validator.process.PDocument.P newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.schematronQuickfix.validator.process.PDocument.P) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.schematronQuickfix.validator.process.PDocument newInstance() {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.schematronQuickfix.validator.process.PDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.schematronQuickfix.validator.process.PDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.schematronQuickfix.validator.process.PDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.schematronQuickfix.validator.process.PDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.schematronQuickfix.validator.process.PDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.schematronQuickfix.validator.process.PDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.schematronQuickfix.validator.process.PDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.schematronQuickfix.validator.process.PDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.schematronQuickfix.validator.process.PDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.schematronQuickfix.validator.process.PDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.schematronQuickfix.validator.process.PDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.schematronQuickfix.validator.process.PDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.schematronQuickfix.validator.process.PDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.schematronQuickfix.validator.process.PDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.schematronQuickfix.validator.process.PDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.PDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.PDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
