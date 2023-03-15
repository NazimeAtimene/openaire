/*
 * XML Type:  nodeTypeType
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.NodeTypeType
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process;


/**
 * An XML nodeTypeType(@http://www.schematron-quickfix.com/validator/process).
 *
 * This is an atomic type that is a restriction of com.schematronQuickfix.validator.process.NodeTypeType.
 */
public interface NodeTypeType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NodeTypeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("nodetypetypec585type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum KEEP = Enum.forString("keep");
    static final Enum ELEMENT = Enum.forString("element");
    static final Enum ATTRIBUTE = Enum.forString("attribute");
    static final Enum PROCESSING_INSTRUCTION = Enum.forString("processing-instruction");
    static final Enum PI = Enum.forString("pi");
    static final Enum COMMENT = Enum.forString("comment");
    
    static final int INT_KEEP = Enum.INT_KEEP;
    static final int INT_ELEMENT = Enum.INT_ELEMENT;
    static final int INT_ATTRIBUTE = Enum.INT_ATTRIBUTE;
    static final int INT_PROCESSING_INSTRUCTION = Enum.INT_PROCESSING_INSTRUCTION;
    static final int INT_PI = Enum.INT_PI;
    static final int INT_COMMENT = Enum.INT_COMMENT;
    
    /**
     * Enumeration value class for com.schematronQuickfix.validator.process.NodeTypeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_KEEP
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
        
        static final int INT_KEEP = 1;
        static final int INT_ELEMENT = 2;
        static final int INT_ATTRIBUTE = 3;
        static final int INT_PROCESSING_INSTRUCTION = 4;
        static final int INT_PI = 5;
        static final int INT_COMMENT = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("keep", INT_KEEP),
                new Enum("element", INT_ELEMENT),
                new Enum("attribute", INT_ATTRIBUTE),
                new Enum("processing-instruction", INT_PROCESSING_INSTRUCTION),
                new Enum("pi", INT_PI),
                new Enum("comment", INT_COMMENT),
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
        public static com.schematronQuickfix.validator.process.NodeTypeType newValue(java.lang.Object obj) {
          return (com.schematronQuickfix.validator.process.NodeTypeType) type.newValue( obj ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType newInstance() {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.schematronQuickfix.validator.process.NodeTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.schematronQuickfix.validator.process.NodeTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}