/*
 * An XML document type.
 * Localname: title
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.TitleDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron;


/**
 * A document containing one title(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public interface TitleDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TitleDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("title41c6doctype");
    
    /**
     * Gets the "title" element
     */
    org.oclc.purl.dsdl.schematron.TitleDocument.Title getTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(org.oclc.purl.dsdl.schematron.TitleDocument.Title title);
    
    /**
     * Appends and returns a new empty "title" element
     */
    org.oclc.purl.dsdl.schematron.TitleDocument.Title addNewTitle();
    
    /**
     * An XML title(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public interface Title extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Title.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("titlef782elemtype");
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oclc.purl.dsdl.schematron.TitleDocument.Title newInstance() {
              return (org.oclc.purl.dsdl.schematron.TitleDocument.Title) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oclc.purl.dsdl.schematron.TitleDocument.Title newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oclc.purl.dsdl.schematron.TitleDocument.Title) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oclc.purl.dsdl.schematron.TitleDocument newInstance() {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.TitleDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.TitleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}