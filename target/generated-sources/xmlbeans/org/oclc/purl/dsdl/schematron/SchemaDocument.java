/*
 * An XML document type.
 * Localname: schema
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.SchemaDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron;


/**
 * A document containing one schema(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public interface SchemaDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SchemaDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("schema1ccbdoctype");
    
    /**
     * Gets the "schema" element
     */
    org.oclc.purl.dsdl.schematron.SchemaDocument.Schema getSchema();
    
    /**
     * Sets the "schema" element
     */
    void setSchema(org.oclc.purl.dsdl.schematron.SchemaDocument.Schema schema);
    
    /**
     * Appends and returns a new empty "schema" element
     */
    org.oclc.purl.dsdl.schematron.SchemaDocument.Schema addNewSchema();
    
    /**
     * An XML schema(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public interface Schema extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Schema.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("schemaa648elemtype");
        
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
         * Gets array of all "extends" elements
         */
        org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends[] getExtendsArray();
        
        /**
         * Gets ith "extends" element
         */
        org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends getExtendsArray(int i);
        
        /**
         * Returns number of "extends" element
         */
        int sizeOfExtendsArray();
        
        /**
         * Sets array of all "extends" element
         */
        void setExtendsArray(org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends[] xextendsArray);
        
        /**
         * Sets ith "extends" element
         */
        void setExtendsArray(int i, org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends xextends);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extends" element
         */
        org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends insertNewExtends(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extends" element
         */
        org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends addNewExtends();
        
        /**
         * Removes the ith "extends" element
         */
        void removeExtends(int i);
        
        /**
         * Gets array of all "title" elements
         */
        org.oclc.purl.dsdl.schematron.TitleDocument.Title[] getTitleArray();
        
        /**
         * Gets ith "title" element
         */
        org.oclc.purl.dsdl.schematron.TitleDocument.Title getTitleArray(int i);
        
        /**
         * Returns number of "title" element
         */
        int sizeOfTitleArray();
        
        /**
         * Sets array of all "title" element
         */
        void setTitleArray(org.oclc.purl.dsdl.schematron.TitleDocument.Title[] titleArray);
        
        /**
         * Sets ith "title" element
         */
        void setTitleArray(int i, org.oclc.purl.dsdl.schematron.TitleDocument.Title title);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "title" element
         */
        org.oclc.purl.dsdl.schematron.TitleDocument.Title insertNewTitle(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "title" element
         */
        org.oclc.purl.dsdl.schematron.TitleDocument.Title addNewTitle();
        
        /**
         * Removes the ith "title" element
         */
        void removeTitle(int i);
        
        /**
         * Gets array of all "ns" elements
         */
        org.oclc.purl.dsdl.schematron.NsDocument.Ns[] getNsArray();
        
        /**
         * Gets ith "ns" element
         */
        org.oclc.purl.dsdl.schematron.NsDocument.Ns getNsArray(int i);
        
        /**
         * Returns number of "ns" element
         */
        int sizeOfNsArray();
        
        /**
         * Sets array of all "ns" element
         */
        void setNsArray(org.oclc.purl.dsdl.schematron.NsDocument.Ns[] nsArray);
        
        /**
         * Sets ith "ns" element
         */
        void setNsArray(int i, org.oclc.purl.dsdl.schematron.NsDocument.Ns ns);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ns" element
         */
        org.oclc.purl.dsdl.schematron.NsDocument.Ns insertNewNs(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ns" element
         */
        org.oclc.purl.dsdl.schematron.NsDocument.Ns addNewNs();
        
        /**
         * Removes the ith "ns" element
         */
        void removeNs(int i);
        
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
         * Gets array of all "phase" elements
         */
        org.oclc.purl.dsdl.schematron.PhaseDocument.Phase[] getPhaseArray();
        
        /**
         * Gets ith "phase" element
         */
        org.oclc.purl.dsdl.schematron.PhaseDocument.Phase getPhaseArray(int i);
        
        /**
         * Returns number of "phase" element
         */
        int sizeOfPhaseArray();
        
        /**
         * Sets array of all "phase" element
         */
        void setPhaseArray(org.oclc.purl.dsdl.schematron.PhaseDocument.Phase[] phaseArray);
        
        /**
         * Sets ith "phase" element
         */
        void setPhaseArray(int i, org.oclc.purl.dsdl.schematron.PhaseDocument.Phase phase);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "phase" element
         */
        org.oclc.purl.dsdl.schematron.PhaseDocument.Phase insertNewPhase(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "phase" element
         */
        org.oclc.purl.dsdl.schematron.PhaseDocument.Phase addNewPhase();
        
        /**
         * Removes the ith "phase" element
         */
        void removePhase(int i);
        
        /**
         * Gets array of all "pattern" elements
         */
        org.oclc.purl.dsdl.schematron.PatternDocument.Pattern[] getPatternArray();
        
        /**
         * Gets ith "pattern" element
         */
        org.oclc.purl.dsdl.schematron.PatternDocument.Pattern getPatternArray(int i);
        
        /**
         * Returns number of "pattern" element
         */
        int sizeOfPatternArray();
        
        /**
         * Sets array of all "pattern" element
         */
        void setPatternArray(org.oclc.purl.dsdl.schematron.PatternDocument.Pattern[] patternArray);
        
        /**
         * Sets ith "pattern" element
         */
        void setPatternArray(int i, org.oclc.purl.dsdl.schematron.PatternDocument.Pattern pattern);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pattern" element
         */
        org.oclc.purl.dsdl.schematron.PatternDocument.Pattern insertNewPattern(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pattern" element
         */
        org.oclc.purl.dsdl.schematron.PatternDocument.Pattern addNewPattern();
        
        /**
         * Removes the ith "pattern" element
         */
        void removePattern(int i);
        
        /**
         * Gets array of all "diagnostics" elements
         */
        org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics[] getDiagnosticsArray();
        
        /**
         * Gets ith "diagnostics" element
         */
        org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics getDiagnosticsArray(int i);
        
        /**
         * Returns number of "diagnostics" element
         */
        int sizeOfDiagnosticsArray();
        
        /**
         * Sets array of all "diagnostics" element
         */
        void setDiagnosticsArray(org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics[] diagnosticsArray);
        
        /**
         * Sets ith "diagnostics" element
         */
        void setDiagnosticsArray(int i, org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics diagnostics);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "diagnostics" element
         */
        org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics insertNewDiagnostics(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "diagnostics" element
         */
        org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics addNewDiagnostics();
        
        /**
         * Removes the ith "diagnostics" element
         */
        void removeDiagnostics(int i);
        
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
         * Gets the "schemaVersion" attribute
         */
        java.lang.String getSchemaVersion();
        
        /**
         * Gets (as xml) the "schemaVersion" attribute
         */
        org.oclc.purl.dsdl.schematron.NonEmptyString xgetSchemaVersion();
        
        /**
         * True if has "schemaVersion" attribute
         */
        boolean isSetSchemaVersion();
        
        /**
         * Sets the "schemaVersion" attribute
         */
        void setSchemaVersion(java.lang.String schemaVersion);
        
        /**
         * Sets (as xml) the "schemaVersion" attribute
         */
        void xsetSchemaVersion(org.oclc.purl.dsdl.schematron.NonEmptyString schemaVersion);
        
        /**
         * Unsets the "schemaVersion" attribute
         */
        void unsetSchemaVersion();
        
        /**
         * Gets the "defaultPhase" attribute
         */
        java.lang.String getDefaultPhase();
        
        /**
         * Gets (as xml) the "defaultPhase" attribute
         */
        org.apache.xmlbeans.XmlIDREF xgetDefaultPhase();
        
        /**
         * True if has "defaultPhase" attribute
         */
        boolean isSetDefaultPhase();
        
        /**
         * Sets the "defaultPhase" attribute
         */
        void setDefaultPhase(java.lang.String defaultPhase);
        
        /**
         * Sets (as xml) the "defaultPhase" attribute
         */
        void xsetDefaultPhase(org.apache.xmlbeans.XmlIDREF defaultPhase);
        
        /**
         * Unsets the "defaultPhase" attribute
         */
        void unsetDefaultPhase();
        
        /**
         * Gets the "queryBinding" attribute
         */
        java.lang.String getQueryBinding();
        
        /**
         * Gets (as xml) the "queryBinding" attribute
         */
        org.oclc.purl.dsdl.schematron.NonEmptyString xgetQueryBinding();
        
        /**
         * True if has "queryBinding" attribute
         */
        boolean isSetQueryBinding();
        
        /**
         * Sets the "queryBinding" attribute
         */
        void setQueryBinding(java.lang.String queryBinding);
        
        /**
         * Sets (as xml) the "queryBinding" attribute
         */
        void xsetQueryBinding(org.oclc.purl.dsdl.schematron.NonEmptyString queryBinding);
        
        /**
         * Unsets the "queryBinding" attribute
         */
        void unsetQueryBinding();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oclc.purl.dsdl.schematron.SchemaDocument.Schema newInstance() {
              return (org.oclc.purl.dsdl.schematron.SchemaDocument.Schema) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oclc.purl.dsdl.schematron.SchemaDocument.Schema newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oclc.purl.dsdl.schematron.SchemaDocument.Schema) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oclc.purl.dsdl.schematron.SchemaDocument newInstance() {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.SchemaDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.SchemaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
