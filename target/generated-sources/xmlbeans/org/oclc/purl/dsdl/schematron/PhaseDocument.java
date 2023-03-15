/*
 * An XML document type.
 * Localname: phase
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.PhaseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron;


/**
 * A document containing one phase(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public interface PhaseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PhaseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("phase2483doctype");
    
    /**
     * Gets the "phase" element
     */
    org.oclc.purl.dsdl.schematron.PhaseDocument.Phase getPhase();
    
    /**
     * Sets the "phase" element
     */
    void setPhase(org.oclc.purl.dsdl.schematron.PhaseDocument.Phase phase);
    
    /**
     * Appends and returns a new empty "phase" element
     */
    org.oclc.purl.dsdl.schematron.PhaseDocument.Phase addNewPhase();
    
    /**
     * An XML phase(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public interface Phase extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Phase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("phaseaffcelemtype");
        
        /**
         * Gets array of all "include" elements
         */
        org.oclc.purl.dsdl.schematron.IncludeDocument.Include[] getIncludeArray();
        
        /**
         * Gets ith "include" element
         */
        org.oclc.purl.dsdl.schematron.IncludeDocument.Include getIncludeArray(int i);
        
        /**
         * Returns number of "include" element
         */
        int sizeOfIncludeArray();
        
        /**
         * Sets array of all "include" element
         */
        void setIncludeArray(org.oclc.purl.dsdl.schematron.IncludeDocument.Include[] includeArray);
        
        /**
         * Sets ith "include" element
         */
        void setIncludeArray(int i, org.oclc.purl.dsdl.schematron.IncludeDocument.Include include);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "include" element
         */
        org.oclc.purl.dsdl.schematron.IncludeDocument.Include insertNewInclude(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "include" element
         */
        org.oclc.purl.dsdl.schematron.IncludeDocument.Include addNewInclude();
        
        /**
         * Removes the ith "include" element
         */
        void removeInclude(int i);
        
        /**
         * Gets array of all "p" elements
         */
        org.oclc.purl.dsdl.schematron.PDocument.P[] getPArray();
        
        /**
         * Gets ith "p" element
         */
        org.oclc.purl.dsdl.schematron.PDocument.P getPArray(int i);
        
        /**
         * Returns number of "p" element
         */
        int sizeOfPArray();
        
        /**
         * Sets array of all "p" element
         */
        void setPArray(org.oclc.purl.dsdl.schematron.PDocument.P[] pArray);
        
        /**
         * Sets ith "p" element
         */
        void setPArray(int i, org.oclc.purl.dsdl.schematron.PDocument.P p);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "p" element
         */
        org.oclc.purl.dsdl.schematron.PDocument.P insertNewP(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "p" element
         */
        org.oclc.purl.dsdl.schematron.PDocument.P addNewP();
        
        /**
         * Removes the ith "p" element
         */
        void removeP(int i);
        
        /**
         * Gets array of all "let" elements
         */
        org.oclc.purl.dsdl.schematron.LetDocument.Let[] getLetArray();
        
        /**
         * Gets ith "let" element
         */
        org.oclc.purl.dsdl.schematron.LetDocument.Let getLetArray(int i);
        
        /**
         * Returns number of "let" element
         */
        int sizeOfLetArray();
        
        /**
         * Sets array of all "let" element
         */
        void setLetArray(org.oclc.purl.dsdl.schematron.LetDocument.Let[] letArray);
        
        /**
         * Sets ith "let" element
         */
        void setLetArray(int i, org.oclc.purl.dsdl.schematron.LetDocument.Let let);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "let" element
         */
        org.oclc.purl.dsdl.schematron.LetDocument.Let insertNewLet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "let" element
         */
        org.oclc.purl.dsdl.schematron.LetDocument.Let addNewLet();
        
        /**
         * Removes the ith "let" element
         */
        void removeLet(int i);
        
        /**
         * Gets array of all "active" elements
         */
        org.oclc.purl.dsdl.schematron.ActiveDocument.Active[] getActiveArray();
        
        /**
         * Gets ith "active" element
         */
        org.oclc.purl.dsdl.schematron.ActiveDocument.Active getActiveArray(int i);
        
        /**
         * Returns number of "active" element
         */
        int sizeOfActiveArray();
        
        /**
         * Sets array of all "active" element
         */
        void setActiveArray(org.oclc.purl.dsdl.schematron.ActiveDocument.Active[] activeArray);
        
        /**
         * Sets ith "active" element
         */
        void setActiveArray(int i, org.oclc.purl.dsdl.schematron.ActiveDocument.Active active);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "active" element
         */
        org.oclc.purl.dsdl.schematron.ActiveDocument.Active insertNewActive(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "active" element
         */
        org.oclc.purl.dsdl.schematron.ActiveDocument.Active addNewActive();
        
        /**
         * Removes the ith "active" element
         */
        void removeActive(int i);
        
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
            public static org.oclc.purl.dsdl.schematron.PhaseDocument.Phase newInstance() {
              return (org.oclc.purl.dsdl.schematron.PhaseDocument.Phase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oclc.purl.dsdl.schematron.PhaseDocument.Phase newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oclc.purl.dsdl.schematron.PhaseDocument.Phase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oclc.purl.dsdl.schematron.PhaseDocument newInstance() {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PhaseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.PhaseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.PhaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
