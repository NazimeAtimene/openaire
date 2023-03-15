/*
 * XML Type:  EnumType
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types
 * Java type: eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.openAIREFundingTypes;


/**
 * An XML EnumType(@https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types).
 *
 * This is an atomic type that is a restriction of eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.
 */
public interface EnumType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnumType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("enumtype817ftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_FUNDING_PROGRAMME = Enum.forString("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#FundingProgramme");
    static final Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CALL = Enum.forString("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#Call");
    static final Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_TENDER = Enum.forString("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#Tender");
    static final Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GIFT = Enum.forString("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#Gift");
    static final Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_INTERNAL_FUNDING = Enum.forString("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#InternalFunding");
    static final Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CONTRACT = Enum.forString("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#Contract");
    static final Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_AWARD = Enum.forString("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#Award");
    static final Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GRANT = Enum.forString("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#Grant");
    
    static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_FUNDING_PROGRAMME = Enum.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_FUNDING_PROGRAMME;
    static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CALL = Enum.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CALL;
    static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_TENDER = Enum.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_TENDER;
    static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GIFT = Enum.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GIFT;
    static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_INTERNAL_FUNDING = Enum.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_INTERNAL_FUNDING;
    static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CONTRACT = Enum.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CONTRACT;
    static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_AWARD = Enum.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_AWARD;
    static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GRANT = Enum.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GRANT;
    
    /**
     * Enumeration value class for eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_FUNDING_PROGRAMME
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
        
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_FUNDING_PROGRAMME = 1;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CALL = 2;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_TENDER = 3;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GIFT = 4;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_INTERNAL_FUNDING = 5;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CONTRACT = 6;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_AWARD = 7;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GRANT = 8;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#FundingProgramme", INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_FUNDING_PROGRAMME),
                new Enum("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#Call", INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CALL),
                new Enum("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#Tender", INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_TENDER),
                new Enum("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#Gift", INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GIFT),
                new Enum("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#InternalFunding", INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_INTERNAL_FUNDING),
                new Enum("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#Contract", INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CONTRACT),
                new Enum("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#Award", INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_AWARD),
                new Enum("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types#Grant", INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GRANT),
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
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType newValue(java.lang.Object obj) {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) type.newValue( obj ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType newInstance() {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
