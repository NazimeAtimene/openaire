/*
 * An XML document type.
 * Localname: pattern
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.PatternDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron;


/**
 * A document containing one pattern(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public interface PatternDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatternDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("patternf14edoctype");
    
    /**
     * Gets the "pattern" element
     */
    org.oclc.purl.dsdl.schematron.PatternDocument.Pattern getPattern();
    
    /**
     * Sets the "pattern" element
     */
    void setPattern(org.oclc.purl.dsdl.schematron.PatternDocument.Pattern pattern);
    
    /**
     * Appends and returns a new empty "pattern" element
     */
    org.oclc.purl.dsdl.schematron.PatternDocument.Pattern addNewPattern();
    
    /**
     * An XML pattern(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public interface Pattern extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pattern.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("patterne1d2elemtype");
        
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
         * Gets array of all "rule" elements
         */
        org.oclc.purl.dsdl.schematron.RuleDocument.Rule[] getRuleArray();
        
        /**
         * Gets ith "rule" element
         */
        org.oclc.purl.dsdl.schematron.RuleDocument.Rule getRuleArray(int i);
        
        /**
         * Returns number of "rule" element
         */
        int sizeOfRuleArray();
        
        /**
         * Sets array of all "rule" element
         */
        void setRuleArray(org.oclc.purl.dsdl.schematron.RuleDocument.Rule[] ruleArray);
        
        /**
         * Sets ith "rule" element
         */
        void setRuleArray(int i, org.oclc.purl.dsdl.schematron.RuleDocument.Rule rule);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "rule" element
         */
        org.oclc.purl.dsdl.schematron.RuleDocument.Rule insertNewRule(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "rule" element
         */
        org.oclc.purl.dsdl.schematron.RuleDocument.Rule addNewRule();
        
        /**
         * Removes the ith "rule" element
         */
        void removeRule(int i);
        
        /**
         * Gets array of all "param" elements
         */
        org.oclc.purl.dsdl.schematron.ParamDocument.Param[] getParamArray();
        
        /**
         * Gets ith "param" element
         */
        org.oclc.purl.dsdl.schematron.ParamDocument.Param getParamArray(int i);
        
        /**
         * Returns number of "param" element
         */
        int sizeOfParamArray();
        
        /**
         * Sets array of all "param" element
         */
        void setParamArray(org.oclc.purl.dsdl.schematron.ParamDocument.Param[] paramArray);
        
        /**
         * Sets ith "param" element
         */
        void setParamArray(int i, org.oclc.purl.dsdl.schematron.ParamDocument.Param param);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "param" element
         */
        org.oclc.purl.dsdl.schematron.ParamDocument.Param insertNewParam(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "param" element
         */
        org.oclc.purl.dsdl.schematron.ParamDocument.Param addNewParam();
        
        /**
         * Removes the ith "param" element
         */
        void removeParam(int i);
        
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
         * Gets the "abstract" attribute
         */
        org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract.Enum getAbstract();
        
        /**
         * Gets (as xml) the "abstract" attribute
         */
        org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract xgetAbstract();
        
        /**
         * True if has "abstract" attribute
         */
        boolean isSetAbstract();
        
        /**
         * Sets the "abstract" attribute
         */
        void setAbstract(org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract.Enum xabstract);
        
        /**
         * Sets (as xml) the "abstract" attribute
         */
        void xsetAbstract(org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract xabstract);
        
        /**
         * Unsets the "abstract" attribute
         */
        void unsetAbstract();
        
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
         * Gets the "is-a" attribute
         */
        java.lang.String getIsA();
        
        /**
         * Gets (as xml) the "is-a" attribute
         */
        org.apache.xmlbeans.XmlIDREF xgetIsA();
        
        /**
         * True if has "is-a" attribute
         */
        boolean isSetIsA();
        
        /**
         * Sets the "is-a" attribute
         */
        void setIsA(java.lang.String isA);
        
        /**
         * Sets (as xml) the "is-a" attribute
         */
        void xsetIsA(org.apache.xmlbeans.XmlIDREF isA);
        
        /**
         * Unsets the "is-a" attribute
         */
        void unsetIsA();
        
        /**
         * An XML abstract(@).
         *
         * This is an atomic type that is a restriction of org.oclc.purl.dsdl.schematron.PatternDocument$Pattern$Abstract.
         */
        public interface Abstract extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Abstract.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("abstract3bd0attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for org.oclc.purl.dsdl.schematron.PatternDocument$Pattern$Abstract.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TRUE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_TRUE = 1;
                static final int INT_FALSE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract newValue(java.lang.Object obj) {
                  return (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract) type.newValue( obj ); }
                
                public static org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract newInstance() {
                  return (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oclc.purl.dsdl.schematron.PatternDocument.Pattern newInstance() {
              return (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oclc.purl.dsdl.schematron.PatternDocument.Pattern newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oclc.purl.dsdl.schematron.PatternDocument newInstance() {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PatternDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.PatternDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.PatternDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
