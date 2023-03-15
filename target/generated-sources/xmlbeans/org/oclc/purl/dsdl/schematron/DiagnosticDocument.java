/*
 * An XML document type.
 * Localname: diagnostic
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.DiagnosticDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron;


/**
 * A document containing one diagnostic(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public interface DiagnosticDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiagnosticDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("diagnostic9705doctype");
    
    /**
     * Gets the "diagnostic" element
     */
    org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic getDiagnostic();
    
    /**
     * Sets the "diagnostic" element
     */
    void setDiagnostic(org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic diagnostic);
    
    /**
     * Appends and returns a new empty "diagnostic" element
     */
    org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic addNewDiagnostic();
    
    /**
     * An XML diagnostic(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public interface Diagnostic extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Diagnostic.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("diagnostice688elemtype");
        
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
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlID xgetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlID id);
        
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
         * Gets the "see" attribute
         */
        java.lang.String getSee();
        
        /**
         * Gets (as xml) the "see" attribute
         */
        org.oclc.purl.dsdl.schematron.UriValue xgetSee();
        
        /**
         * True if has "see" attribute
         */
        boolean isSetSee();
        
        /**
         * Sets the "see" attribute
         */
        void setSee(java.lang.String see);
        
        /**
         * Sets (as xml) the "see" attribute
         */
        void xsetSee(org.oclc.purl.dsdl.schematron.UriValue see);
        
        /**
         * Unsets the "see" attribute
         */
        void unsetSee();
        
        /**
         * Gets the "fpi" attribute
         */
        java.lang.String getFpi();
        
        /**
         * Gets (as xml) the "fpi" attribute
         */
        org.oclc.purl.dsdl.schematron.FpiValue xgetFpi();
        
        /**
         * True if has "fpi" attribute
         */
        boolean isSetFpi();
        
        /**
         * Sets the "fpi" attribute
         */
        void setFpi(java.lang.String fpi);
        
        /**
         * Sets (as xml) the "fpi" attribute
         */
        void xsetFpi(org.oclc.purl.dsdl.schematron.FpiValue fpi);
        
        /**
         * Unsets the "fpi" attribute
         */
        void unsetFpi();
        
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
         * Gets the "space" attribute
         */
        org.w3.xml.x1998.namespace.SpaceAttribute.Space.Enum getSpace();
        
        /**
         * Gets (as xml) the "space" attribute
         */
        org.w3.xml.x1998.namespace.SpaceAttribute.Space xgetSpace();
        
        /**
         * True if has "space" attribute
         */
        boolean isSetSpace();
        
        /**
         * Sets the "space" attribute
         */
        void setSpace(org.w3.xml.x1998.namespace.SpaceAttribute.Space.Enum space);
        
        /**
         * Sets (as xml) the "space" attribute
         */
        void xsetSpace(org.w3.xml.x1998.namespace.SpaceAttribute.Space space);
        
        /**
         * Unsets the "space" attribute
         */
        void unsetSpace();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic newInstance() {
              return (org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument newInstance() {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.DiagnosticDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.DiagnosticDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
