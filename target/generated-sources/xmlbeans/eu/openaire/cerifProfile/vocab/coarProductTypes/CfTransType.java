/*
 * XML Type:  cfTrans__Type
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/COAR_Product_Types
 * Java type: eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.coarProductTypes;


/**
 * An XML cfTrans__Type(@https://www.openaire.eu/cerif-profile/vocab/COAR_Product_Types).
 *
 * This is an atomic type that is a restriction of eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType.
 */
public interface CfTransType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CfTransType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("cftranstype6437type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum O = Enum.forString("o");
    static final Enum H = Enum.forString("h");
    static final Enum M = Enum.forString("m");
    
    static final int INT_O = Enum.INT_O;
    static final int INT_H = Enum.INT_H;
    static final int INT_M = Enum.INT_M;
    
    /**
     * Enumeration value class for eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_O
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
        
        static final int INT_O = 1;
        static final int INT_H = 2;
        static final int INT_M = 3;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("o", INT_O),
                new Enum("h", INT_H),
                new Enum("m", INT_M),
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
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType newValue(java.lang.Object obj) {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) type.newValue( obj ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType newInstance() {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.coarProductTypes.CfTransType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
