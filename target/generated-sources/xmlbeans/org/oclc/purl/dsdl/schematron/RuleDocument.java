/*
 * An XML document type.
 * Localname: rule
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.RuleDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron;


/**
 * A document containing one rule(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public interface RuleDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RuleDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("rule5610doctype");
    
    /**
     * Gets the "rule" element
     */
    org.oclc.purl.dsdl.schematron.RuleDocument.Rule getRule();
    
    /**
     * Sets the "rule" element
     */
    void setRule(org.oclc.purl.dsdl.schematron.RuleDocument.Rule rule);
    
    /**
     * Appends and returns a new empty "rule" element
     */
    org.oclc.purl.dsdl.schematron.RuleDocument.Rule addNewRule();
    
    /**
     * An XML rule(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public interface Rule extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Rule.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("rulee5a8elemtype");
        
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
         * Gets array of all "assert" elements
         */
        org.oclc.purl.dsdl.schematron.AssertReportType[] getAssertArray();
        
        /**
         * Gets ith "assert" element
         */
        org.oclc.purl.dsdl.schematron.AssertReportType getAssertArray(int i);
        
        /**
         * Returns number of "assert" element
         */
        int sizeOfAssertArray();
        
        /**
         * Sets array of all "assert" element
         */
        void setAssertArray(org.oclc.purl.dsdl.schematron.AssertReportType[] xassertArray);
        
        /**
         * Sets ith "assert" element
         */
        void setAssertArray(int i, org.oclc.purl.dsdl.schematron.AssertReportType xassert);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "assert" element
         */
        org.oclc.purl.dsdl.schematron.AssertReportType insertNewAssert(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "assert" element
         */
        org.oclc.purl.dsdl.schematron.AssertReportType addNewAssert();
        
        /**
         * Removes the ith "assert" element
         */
        void removeAssert(int i);
        
        /**
         * Gets array of all "report" elements
         */
        org.oclc.purl.dsdl.schematron.AssertReportType[] getReportArray();
        
        /**
         * Gets ith "report" element
         */
        org.oclc.purl.dsdl.schematron.AssertReportType getReportArray(int i);
        
        /**
         * Returns number of "report" element
         */
        int sizeOfReportArray();
        
        /**
         * Sets array of all "report" element
         */
        void setReportArray(org.oclc.purl.dsdl.schematron.AssertReportType[] reportArray);
        
        /**
         * Sets ith "report" element
         */
        void setReportArray(int i, org.oclc.purl.dsdl.schematron.AssertReportType report);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "report" element
         */
        org.oclc.purl.dsdl.schematron.AssertReportType insertNewReport(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "report" element
         */
        org.oclc.purl.dsdl.schematron.AssertReportType addNewReport();
        
        /**
         * Removes the ith "report" element
         */
        void removeReport(int i);
        
        /**
         * Gets array of all "extends" elements
         */
        org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends[] getExtendsArray();
        
        /**
         * Gets ith "extends" element
         */
        org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends getExtendsArray(int i);
        
        /**
         * Returns number of "extends" element
         */
        int sizeOfExtendsArray();
        
        /**
         * Sets array of all "extends" element
         */
        void setExtendsArray(org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends[] xextendsArray);
        
        /**
         * Sets ith "extends" element
         */
        void setExtendsArray(int i, org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends xextends);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extends" element
         */
        org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends insertNewExtends(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extends" element
         */
        org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends addNewExtends();
        
        /**
         * Removes the ith "extends" element
         */
        void removeExtends(int i);
        
        /**
         * Gets the "flag" attribute
         */
        java.lang.String getFlag();
        
        /**
         * Gets (as xml) the "flag" attribute
         */
        org.oclc.purl.dsdl.schematron.FlagValue xgetFlag();
        
        /**
         * True if has "flag" attribute
         */
        boolean isSetFlag();
        
        /**
         * Sets the "flag" attribute
         */
        void setFlag(java.lang.String flag);
        
        /**
         * Sets (as xml) the "flag" attribute
         */
        void xsetFlag(org.oclc.purl.dsdl.schematron.FlagValue flag);
        
        /**
         * Unsets the "flag" attribute
         */
        void unsetFlag();
        
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
         * Gets the "role" attribute
         */
        java.lang.String getRole();
        
        /**
         * Gets (as xml) the "role" attribute
         */
        org.oclc.purl.dsdl.schematron.RoleValue xgetRole();
        
        /**
         * True if has "role" attribute
         */
        boolean isSetRole();
        
        /**
         * Sets the "role" attribute
         */
        void setRole(java.lang.String role);
        
        /**
         * Sets (as xml) the "role" attribute
         */
        void xsetRole(org.oclc.purl.dsdl.schematron.RoleValue role);
        
        /**
         * Unsets the "role" attribute
         */
        void unsetRole();
        
        /**
         * Gets the "subject" attribute
         */
        java.lang.String getSubject();
        
        /**
         * Gets (as xml) the "subject" attribute
         */
        org.oclc.purl.dsdl.schematron.PathValue xgetSubject();
        
        /**
         * True if has "subject" attribute
         */
        boolean isSetSubject();
        
        /**
         * Sets the "subject" attribute
         */
        void setSubject(java.lang.String subject);
        
        /**
         * Sets (as xml) the "subject" attribute
         */
        void xsetSubject(org.oclc.purl.dsdl.schematron.PathValue subject);
        
        /**
         * Unsets the "subject" attribute
         */
        void unsetSubject();
        
        /**
         * Gets the "abstract" attribute
         */
        org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract.Enum getAbstract();
        
        /**
         * Gets (as xml) the "abstract" attribute
         */
        org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract xgetAbstract();
        
        /**
         * True if has "abstract" attribute
         */
        boolean isSetAbstract();
        
        /**
         * Sets the "abstract" attribute
         */
        void setAbstract(org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract.Enum xabstract);
        
        /**
         * Sets (as xml) the "abstract" attribute
         */
        void xsetAbstract(org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract xabstract);
        
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
         * Gets the "context" attribute
         */
        java.lang.String getContext();
        
        /**
         * Gets (as xml) the "context" attribute
         */
        org.oclc.purl.dsdl.schematron.PathValue xgetContext();
        
        /**
         * True if has "context" attribute
         */
        boolean isSetContext();
        
        /**
         * Sets the "context" attribute
         */
        void setContext(java.lang.String context);
        
        /**
         * Sets (as xml) the "context" attribute
         */
        void xsetContext(org.oclc.purl.dsdl.schematron.PathValue context);
        
        /**
         * Unsets the "context" attribute
         */
        void unsetContext();
        
        /**
         * An XML extends(@http://purl.oclc.org/dsdl/schematron).
         *
         * This is a complex type.
         */
        public interface Extends extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Extends.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("extends8883elemtype");
            
            /**
             * Gets the "rule" attribute
             */
            java.lang.String getRule();
            
            /**
             * Gets (as xml) the "rule" attribute
             */
            org.apache.xmlbeans.XmlIDREF xgetRule();
            
            /**
             * Sets the "rule" attribute
             */
            void setRule(java.lang.String rule);
            
            /**
             * Sets (as xml) the "rule" attribute
             */
            void xsetRule(org.apache.xmlbeans.XmlIDREF rule);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends newInstance() {
                  return (org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML abstract(@).
         *
         * This is an atomic type that is a restriction of org.oclc.purl.dsdl.schematron.RuleDocument$Rule$Abstract.
         */
        public interface Abstract extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Abstract.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("abstract1626attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for org.oclc.purl.dsdl.schematron.RuleDocument$Rule$Abstract.
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
                public static org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract newValue(java.lang.Object obj) {
                  return (org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract) type.newValue( obj ); }
                
                public static org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract newInstance() {
                  return (org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oclc.purl.dsdl.schematron.RuleDocument.Rule newInstance() {
              return (org.oclc.purl.dsdl.schematron.RuleDocument.Rule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oclc.purl.dsdl.schematron.RuleDocument.Rule newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oclc.purl.dsdl.schematron.RuleDocument.Rule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oclc.purl.dsdl.schematron.RuleDocument newInstance() {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.RuleDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oclc.purl.dsdl.schematron.RuleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oclc.purl.dsdl.schematron.RuleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
