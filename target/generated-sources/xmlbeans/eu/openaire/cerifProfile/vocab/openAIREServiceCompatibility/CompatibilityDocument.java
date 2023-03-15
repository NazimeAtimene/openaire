/*
 * An XML document type.
 * Localname: Compatibility
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility
 * Java type: eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility;


/**
 * A document containing one Compatibility(@https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility) element.
 *
 * This is a complex type.
 */
public interface CompatibilityDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompatibilityDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("compatibility743bdoctype");
    
    /**
     * Gets the "Compatibility" element
     */
    eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility getCompatibility();
    
    /**
     * Sets the "Compatibility" element
     */
    void setCompatibility(eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility compatibility);
    
    /**
     * Appends and returns a new empty "Compatibility" element
     */
    eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility addNewCompatibility();
    
    /**
     * An XML Compatibility(@https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility).
     *
     * This is an atomic type that is a restriction of eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument$Compatibility.
     */
    public interface Compatibility extends eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.EnumType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Compatibility.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("compatibility3affelemtype");
        
        static final eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.EnumType.Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_SERVICE_COMPATIBILITY_1_1_1 = eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.EnumType.HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_SERVICE_COMPATIBILITY_1_1_1;
        static final eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.EnumType.Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_SERVICE_COMPATIBILITY_1_1 = eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.EnumType.HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_SERVICE_COMPATIBILITY_1_1;
        static final eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.EnumType.Enum HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_SERVICE_COMPATIBILITY_1_0 = eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.EnumType.HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_SERVICE_COMPATIBILITY_1_0;
        
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_SERVICE_COMPATIBILITY_1_1_1 = eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.EnumType.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_SERVICE_COMPATIBILITY_1_1_1;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_SERVICE_COMPATIBILITY_1_1 = eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.EnumType.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_SERVICE_COMPATIBILITY_1_1;
        static final int INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_SERVICE_COMPATIBILITY_1_0 = eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.EnumType.INT_HTTPS_WWW_OPENAIRE_EU_CERIF_PROFILE_VOCAB_OPEN_AIRE_SERVICE_COMPATIBILITY_1_0;
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility newInstance() {
              return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument newInstance() {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
