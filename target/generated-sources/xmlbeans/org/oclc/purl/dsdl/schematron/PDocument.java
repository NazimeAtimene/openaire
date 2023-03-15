/*
 * An XML document type.
 * Localname: p
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.PDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron;


/**
 * A document containing one p(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public interface PDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("p572edoctype");
    
    /**
     * Gets the "p" element
     */
    org.oclc.purl.dsdl.schematron.PDocument.P getP();
    
    /**
     * Sets the "p" element
     */
    void setP(org.oclc.purl.dsdl.schematron.PDocument.P p);
    
    /**
     * Appends and returns a new empty "p" element
     */
    org.oclc.purl.dsdl.schematron.PDocument.P addNewP();
    
    /**
     * An XML p(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public interface P extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(P.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("p33d2elemtype");
        
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
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlID xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlID id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
        /**
         * Gets the "class" attribute
         */
        java.lang.String getClass1();
        
        /**
         * Gets (as xml) the "class" attribute
         */
        org.oclc.purl.dsdl.schematron.ClassValue xgetClass1();
        
        /**
         * True if has "class" attribute
         */
        boolean isSetClass1();
        
        /**
         * Sets the "class" attribute
         */
        void setClass1(java.lang.String class1);
        
        /**
         * Sets (as xml) the "class" attribute
         */
        void xsetClass1(org.oclc.purl.dsdl.schematron.ClassValue class1);
        
        /**
         * Unsets the "class" attribute
         */
        void unsetClass1();
        
        /**
         * Gets the "icon" attribute
         */
        java.lang.String getIcon();
        
        /**
         * Gets (as xml) the "icon" attribute
         */
        org.oclc.purl.dsdl.schematron.UriValue xgetIcon();
        
        /**
         * True if has "icon" attribute
         */
        boolean isSetIcon();
        
        /**
         * Sets the "icon" attribute
         */
        void setIcon(java.lang.String icon);
        
        /**
         * Sets (as xml) the "icon" attribute
         */
        void xsetIcon(org.oclc.purl.dsdl.schematron.UriValue icon);
        
        /**
         * Unsets the "icon" attribute
         */
        void unsetIcon();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oclc.purl.dsdl.schematron.PDocument.P newInstance() {
              return (org.oclc.purl.dsdl.schematron.PDocument.P) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oclc.purl.dsdl.schematron.PDocument.P newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oclc.purl.dsdl.schematron.PDocument.P) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oclc.purl.dsdl.schematron.PDocument newInstance() {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oclc.purl.dsdl.schematron.PDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oclc.purl.dsdl.schematron.PDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.PDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.PDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.PDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
