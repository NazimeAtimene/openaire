/*
 * XML Type:  EnumType
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types
 * Java type: eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.coarPatentTypes;


/**
 * An XML EnumType(@https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types).
 *
 * This is an atomic type that is a restriction of eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.
 */
public interface EnumType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnumType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("enumtype5302type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_SB_3_Y_W_4_EH = Enum.forString("http://purl.org/coar/resource_type/SB3Y-W4EH");
    static final Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_53_B_JCY_5 = Enum.forString("http://purl.org/coar/resource_type/C53B-JCY5");
    static final Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_15_CD = Enum.forString("http://purl.org/coar/resource_type/c_15cd");
    static final Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_Z_907_YMBB = Enum.forString("http://purl.org/coar/resource_type/Z907-YMBB");
    static final Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_GPQ_7_G_5_VE = Enum.forString("http://purl.org/coar/resource_type/GPQ7-G5VE");
    static final Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_MW_8_G_3_CR_8 = Enum.forString("http://purl.org/coar/resource_type/MW8G-3CR8");
    static final Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_9_DKX_KSAF = Enum.forString("http://purl.org/coar/resource_type/9DKX-KSAF");
    
    static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_SB_3_Y_W_4_EH = Enum.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_SB_3_Y_W_4_EH;
    static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_53_B_JCY_5 = Enum.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_53_B_JCY_5;
    static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_15_CD = Enum.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_15_CD;
    static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_Z_907_YMBB = Enum.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_Z_907_YMBB;
    static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_GPQ_7_G_5_VE = Enum.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_GPQ_7_G_5_VE;
    static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_MW_8_G_3_CR_8 = Enum.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_MW_8_G_3_CR_8;
    static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_9_DKX_KSAF = Enum.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_9_DKX_KSAF;
    
    /**
     * Enumeration value class for eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_SB_3_Y_W_4_EH
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
        
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_SB_3_Y_W_4_EH = 1;
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_53_B_JCY_5 = 2;
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_15_CD = 3;
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_Z_907_YMBB = 4;
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_GPQ_7_G_5_VE = 5;
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_MW_8_G_3_CR_8 = 6;
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_9_DKX_KSAF = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("http://purl.org/coar/resource_type/SB3Y-W4EH", INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_SB_3_Y_W_4_EH),
                new Enum("http://purl.org/coar/resource_type/C53B-JCY5", INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_53_B_JCY_5),
                new Enum("http://purl.org/coar/resource_type/c_15cd", INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_15_CD),
                new Enum("http://purl.org/coar/resource_type/Z907-YMBB", INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_Z_907_YMBB),
                new Enum("http://purl.org/coar/resource_type/GPQ7-G5VE", INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_GPQ_7_G_5_VE),
                new Enum("http://purl.org/coar/resource_type/MW8G-3CR8", INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_MW_8_G_3_CR_8),
                new Enum("http://purl.org/coar/resource_type/9DKX-KSAF", INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_9_DKX_KSAF),
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
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType newValue(java.lang.Object obj) {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) type.newValue( obj ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType newInstance() {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
