/*
 * An XML document type.
 * Localname: Type
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types
 * Java type: eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.openAIREFundingTypes;


/**
 * A document containing one Type(@https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types) element.
 *
 * This is a complex type.
 */
public interface TypeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("type7d30doctype");
    
    /**
     * Gets the "Type" element
     */
    eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type getType();
    
    /**
     * Sets the "Type" element
     */
    void setType(eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type type);
    
    /**
     * Appends and returns a new empty "Type" element
     */
    eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type addNewType();
    
    /**
     * An XML Type(@https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types).
     *
     * This is an atomic type that is a restriction of eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument$Type.
     */
    public interface Type extends eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("typed1a6elemtype");
        
        static final eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_FUNDING_PROGRAMME = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_FUNDING_PROGRAMME;
        static final eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CALL = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CALL;
        static final eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_TENDER = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_TENDER;
        static final eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GIFT = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GIFT;
        static final eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_INTERNAL_FUNDING = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_INTERNAL_FUNDING;
        static final eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CONTRACT = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CONTRACT;
        static final eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_AWARD = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_AWARD;
        static final eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GRANT = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GRANT;
        
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_FUNDING_PROGRAMME = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_FUNDING_PROGRAMME;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CALL = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CALL;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_TENDER = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_TENDER;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GIFT = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GIFT;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_INTERNAL_FUNDING = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_INTERNAL_FUNDING;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CONTRACT = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_CONTRACT;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_AWARD = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_AWARD;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GRANT = eu.openaire.cerifProfile.vocab.openAIREFundingTypes.EnumType.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_FUNDING_TYPES_GRANT;
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type newInstance() {
              return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument newInstance() {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
