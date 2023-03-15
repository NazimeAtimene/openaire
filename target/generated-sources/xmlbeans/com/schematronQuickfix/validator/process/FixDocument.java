/*
 * An XML document type.
 * Localname: fix
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.FixDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process;


/**
 * A document containing one fix(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public interface FixDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FixDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("fix8b48doctype");
    
    /**
     * Gets the "fix" element
     */
    com.schematronQuickfix.validator.process.FixDocument.Fix getFix();
    
    /**
     * Sets the "fix" element
     */
    void setFix(com.schematronQuickfix.validator.process.FixDocument.Fix fix);
    
    /**
     * Appends and returns a new empty "fix" element
     */
    com.schematronQuickfix.validator.process.FixDocument.Fix addNewFix();
    
    /**
     * An XML fix(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public interface Fix extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Fix.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("fixea27elemtype");
        
        /**
         * Gets array of all "param" elements
         */
        com.schematronQuickfix.validator.process.ParamDocument.Param[] getParamArray();
        
        /**
         * Gets ith "param" element
         */
        com.schematronQuickfix.validator.process.ParamDocument.Param getParamArray(int i);
        
        /**
         * Returns number of "param" element
         */
        int sizeOfParamArray();
        
        /**
         * Sets array of all "param" element
         */
        void setParamArray(com.schematronQuickfix.validator.process.ParamDocument.Param[] paramArray);
        
        /**
         * Sets ith "param" element
         */
        void setParamArray(int i, com.schematronQuickfix.validator.process.ParamDocument.Param param);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "param" element
         */
        com.schematronQuickfix.validator.process.ParamDocument.Param insertNewParam(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "param" element
         */
        com.schematronQuickfix.validator.process.ParamDocument.Param addNewParam();
        
        /**
         * Removes the ith "param" element
         */
        void removeParam(int i);
        
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
         * Gets array of all "description" elements
         */
        com.schematronQuickfix.validator.process.DescriptionDocument.Description[] getDescriptionArray();
        
        /**
         * Gets ith "description" element
         */
        com.schematronQuickfix.validator.process.DescriptionDocument.Description getDescriptionArray(int i);
        
        /**
         * Returns number of "description" element
         */
        int sizeOfDescriptionArray();
        
        /**
         * Sets array of all "description" element
         */
        void setDescriptionArray(com.schematronQuickfix.validator.process.DescriptionDocument.Description[] descriptionArray);
        
        /**
         * Sets ith "description" element
         */
        void setDescriptionArray(int i, com.schematronQuickfix.validator.process.DescriptionDocument.Description description);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "description" element
         */
        com.schematronQuickfix.validator.process.DescriptionDocument.Description insertNewDescription(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "description" element
         */
        com.schematronQuickfix.validator.process.DescriptionDocument.Description addNewDescription();
        
        /**
         * Removes the ith "description" element
         */
        void removeDescription(int i);
        
        /**
         * Gets the "call-fix" element
         */
        com.schematronQuickfix.validator.process.CallFixDocument.CallFix getCallFix();
        
        /**
         * True if has "call-fix" element
         */
        boolean isSetCallFix();
        
        /**
         * Sets the "call-fix" element
         */
        void setCallFix(com.schematronQuickfix.validator.process.CallFixDocument.CallFix callFix);
        
        /**
         * Appends and returns a new empty "call-fix" element
         */
        com.schematronQuickfix.validator.process.CallFixDocument.CallFix addNewCallFix();
        
        /**
         * Unsets the "call-fix" element
         */
        void unsetCallFix();
        
        /**
         * Gets array of all "user-entry" elements
         */
        com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry[] getUserEntryArray();
        
        /**
         * Gets ith "user-entry" element
         */
        com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry getUserEntryArray(int i);
        
        /**
         * Returns number of "user-entry" element
         */
        int sizeOfUserEntryArray();
        
        /**
         * Sets array of all "user-entry" element
         */
        void setUserEntryArray(com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry[] userEntryArray);
        
        /**
         * Sets ith "user-entry" element
         */
        void setUserEntryArray(int i, com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry userEntry);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "user-entry" element
         */
        com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry insertNewUserEntry(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "user-entry" element
         */
        com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry addNewUserEntry();
        
        /**
         * Removes the ith "user-entry" element
         */
        void removeUserEntry(int i);
        
        /**
         * Gets array of all "add" elements
         */
        com.schematronQuickfix.validator.process.AddDocument.Add[] getAddArray();
        
        /**
         * Gets ith "add" element
         */
        com.schematronQuickfix.validator.process.AddDocument.Add getAddArray(int i);
        
        /**
         * Returns number of "add" element
         */
        int sizeOfAddArray();
        
        /**
         * Sets array of all "add" element
         */
        void setAddArray(com.schematronQuickfix.validator.process.AddDocument.Add[] addArray);
        
        /**
         * Sets ith "add" element
         */
        void setAddArray(int i, com.schematronQuickfix.validator.process.AddDocument.Add add);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "add" element
         */
        com.schematronQuickfix.validator.process.AddDocument.Add insertNewAdd(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "add" element
         */
        com.schematronQuickfix.validator.process.AddDocument.Add addNewAdd();
        
        /**
         * Removes the ith "add" element
         */
        void removeAdd(int i);
        
        /**
         * Gets array of all "delete" elements
         */
        com.schematronQuickfix.validator.process.DeleteDocument.Delete[] getDeleteArray();
        
        /**
         * Gets ith "delete" element
         */
        com.schematronQuickfix.validator.process.DeleteDocument.Delete getDeleteArray(int i);
        
        /**
         * Returns number of "delete" element
         */
        int sizeOfDeleteArray();
        
        /**
         * Sets array of all "delete" element
         */
        void setDeleteArray(com.schematronQuickfix.validator.process.DeleteDocument.Delete[] deleteArray);
        
        /**
         * Sets ith "delete" element
         */
        void setDeleteArray(int i, com.schematronQuickfix.validator.process.DeleteDocument.Delete delete);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "delete" element
         */
        com.schematronQuickfix.validator.process.DeleteDocument.Delete insertNewDelete(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "delete" element
         */
        com.schematronQuickfix.validator.process.DeleteDocument.Delete addNewDelete();
        
        /**
         * Removes the ith "delete" element
         */
        void removeDelete(int i);
        
        /**
         * Gets array of all "replace" elements
         */
        com.schematronQuickfix.validator.process.ReplaceDocument.Replace[] getReplaceArray();
        
        /**
         * Gets ith "replace" element
         */
        com.schematronQuickfix.validator.process.ReplaceDocument.Replace getReplaceArray(int i);
        
        /**
         * Returns number of "replace" element
         */
        int sizeOfReplaceArray();
        
        /**
         * Sets array of all "replace" element
         */
        void setReplaceArray(com.schematronQuickfix.validator.process.ReplaceDocument.Replace[] replaceArray);
        
        /**
         * Sets ith "replace" element
         */
        void setReplaceArray(int i, com.schematronQuickfix.validator.process.ReplaceDocument.Replace replace);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "replace" element
         */
        com.schematronQuickfix.validator.process.ReplaceDocument.Replace insertNewReplace(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "replace" element
         */
        com.schematronQuickfix.validator.process.ReplaceDocument.Replace addNewReplace();
        
        /**
         * Removes the ith "replace" element
         */
        void removeReplace(int i);
        
        /**
         * Gets array of all "stringReplace" elements
         */
        com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace[] getStringReplaceArray();
        
        /**
         * Gets ith "stringReplace" element
         */
        com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace getStringReplaceArray(int i);
        
        /**
         * Returns number of "stringReplace" element
         */
        int sizeOfStringReplaceArray();
        
        /**
         * Sets array of all "stringReplace" element
         */
        void setStringReplaceArray(com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace[] stringReplaceArray);
        
        /**
         * Sets ith "stringReplace" element
         */
        void setStringReplaceArray(int i, com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace stringReplace);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "stringReplace" element
         */
        com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace insertNewStringReplace(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "stringReplace" element
         */
        com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace addNewStringReplace();
        
        /**
         * Removes the ith "stringReplace" element
         */
        void removeStringReplace(int i);
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlNCName xgetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlNCName id);
        
        /**
         * Gets the "use-when" attribute
         */
        java.lang.String getUseWhen();
        
        /**
         * Gets (as xml) the "use-when" attribute
         */
        org.apache.xmlbeans.XmlString xgetUseWhen();
        
        /**
         * True if has "use-when" attribute
         */
        boolean isSetUseWhen();
        
        /**
         * Sets the "use-when" attribute
         */
        void setUseWhen(java.lang.String useWhen);
        
        /**
         * Sets (as xml) the "use-when" attribute
         */
        void xsetUseWhen(org.apache.xmlbeans.XmlString useWhen);
        
        /**
         * Unsets the "use-when" attribute
         */
        void unsetUseWhen();
        
        /**
         * Gets the "role" attribute
         */
        com.schematronQuickfix.validator.process.FixDocument.Fix.Role.Enum getRole();
        
        /**
         * Gets (as xml) the "role" attribute
         */
        com.schematronQuickfix.validator.process.FixDocument.Fix.Role xgetRole();
        
        /**
         * True if has "role" attribute
         */
        boolean isSetRole();
        
        /**
         * Sets the "role" attribute
         */
        void setRole(com.schematronQuickfix.validator.process.FixDocument.Fix.Role.Enum role);
        
        /**
         * Sets (as xml) the "role" attribute
         */
        void xsetRole(com.schematronQuickfix.validator.process.FixDocument.Fix.Role role);
        
        /**
         * Unsets the "role" attribute
         */
        void unsetRole();
        
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
         * An XML role(@).
         *
         * This is an atomic type that is a restriction of com.schematronQuickfix.validator.process.FixDocument$Fix$Role.
         */
        public interface Role extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Role.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("roled251attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum REPLACE = Enum.forString("replace");
            static final Enum ADD = Enum.forString("add");
            static final Enum STRING_REPLACE = Enum.forString("stringReplace");
            static final Enum DELETE = Enum.forString("delete");
            static final Enum MIX = Enum.forString("mix");
            
            static final int INT_REPLACE = Enum.INT_REPLACE;
            static final int INT_ADD = Enum.INT_ADD;
            static final int INT_STRING_REPLACE = Enum.INT_STRING_REPLACE;
            static final int INT_DELETE = Enum.INT_DELETE;
            static final int INT_MIX = Enum.INT_MIX;
            
            /**
             * Enumeration value class for com.schematronQuickfix.validator.process.FixDocument$Fix$Role.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_REPLACE
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
                
                static final int INT_REPLACE = 1;
                static final int INT_ADD = 2;
                static final int INT_STRING_REPLACE = 3;
                static final int INT_DELETE = 4;
                static final int INT_MIX = 5;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("replace", INT_REPLACE),
                      new Enum("add", INT_ADD),
                      new Enum("stringReplace", INT_STRING_REPLACE),
                      new Enum("delete", INT_DELETE),
                      new Enum("mix", INT_MIX),
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
                public static com.schematronQuickfix.validator.process.FixDocument.Fix.Role newValue(java.lang.Object obj) {
                  return (com.schematronQuickfix.validator.process.FixDocument.Fix.Role) type.newValue( obj ); }
                
                public static com.schematronQuickfix.validator.process.FixDocument.Fix.Role newInstance() {
                  return (com.schematronQuickfix.validator.process.FixDocument.Fix.Role) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.schematronQuickfix.validator.process.FixDocument.Fix.Role newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.schematronQuickfix.validator.process.FixDocument.Fix.Role) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.schematronQuickfix.validator.process.FixDocument.Fix newInstance() {
              return (com.schematronQuickfix.validator.process.FixDocument.Fix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.schematronQuickfix.validator.process.FixDocument.Fix newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.schematronQuickfix.validator.process.FixDocument.Fix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.schematronQuickfix.validator.process.FixDocument newInstance() {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.schematronQuickfix.validator.process.FixDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.schematronQuickfix.validator.process.FixDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.schematronQuickfix.validator.process.FixDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.schematronQuickfix.validator.process.FixDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.schematronQuickfix.validator.process.FixDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.schematronQuickfix.validator.process.FixDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.schematronQuickfix.validator.process.FixDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.schematronQuickfix.validator.process.FixDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.schematronQuickfix.validator.process.FixDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.schematronQuickfix.validator.process.FixDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.schematronQuickfix.validator.process.FixDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.schematronQuickfix.validator.process.FixDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.schematronQuickfix.validator.process.FixDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.schematronQuickfix.validator.process.FixDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.schematronQuickfix.validator.process.FixDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.FixDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.FixDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.FixDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
