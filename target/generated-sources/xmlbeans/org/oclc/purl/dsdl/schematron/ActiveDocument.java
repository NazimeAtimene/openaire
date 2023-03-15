/*
 * An XML document type.
 * Localname: active
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.ActiveDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron;


/**
 * A document containing one active(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public interface ActiveDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActiveDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("active3e86doctype");
    
    /**
     * Gets the "active" element
     */
    org.oclc.purl.dsdl.schematron.ActiveDocument.Active getActive();
    
    /**
     * Sets the "active" element
     */
    void setActive(org.oclc.purl.dsdl.schematron.ActiveDocument.Active active);
    
    /**
     * Appends and returns a new empty "active" element
     */
    org.oclc.purl.dsdl.schematron.ActiveDocument.Active addNewActive();
    
    /**
     * An XML active(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public interface Active extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Active.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("active68a8elemtype");
        
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
         * Gets the "pattern" attribute
         */
        java.lang.String getPattern();
        
        /**
         * Gets (as xml) the "pattern" attribute
         */
        org.apache.xmlbeans.XmlIDREF xgetPattern();
        
        /**
         * Sets the "pattern" attribute
         */
        void setPattern(java.lang.String pattern);
        
        /**
         * Sets (as xml) the "pattern" attribute
         */
        void xsetPattern(org.apache.xmlbeans.XmlIDREF pattern);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oclc.purl.dsdl.schematron.ActiveDocument.Active newInstance() {
              return (org.oclc.purl.dsdl.schematron.ActiveDocument.Active) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oclc.purl.dsdl.schematron.ActiveDocument.Active newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oclc.purl.dsdl.schematron.ActiveDocument.Active) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oclc.purl.dsdl.schematron.ActiveDocument newInstance() {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.ActiveDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.ActiveDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.ActiveDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
