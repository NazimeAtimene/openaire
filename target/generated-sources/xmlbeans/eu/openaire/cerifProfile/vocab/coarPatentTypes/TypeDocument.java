/*
 * An XML document type.
 * Localname: Type
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types
 * Java type: eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.coarPatentTypes;


/**
 * A document containing one Type(@https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types) element.
 *
 * This is a complex type.
 */
public interface TypeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("type0cb1doctype");
    
    /**
     * Gets the "Type" element
     */
    eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type getType();
    
    /**
     * Sets the "Type" element
     */
    void setType(eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type type);
    
    /**
     * Appends and returns a new empty "Type" element
     */
    eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type addNewType();
    
    /**
     * An XML Type(@https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types).
     *
     * This is an atomic type that is a restriction of eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument$Type.
     */
    public interface Type extends eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("type467belemtype");
        
        static final eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_SB_3_Y_W_4_EH = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.HTTP_PURL_ORG_COAR_RESOURCE_TYPE_SB_3_Y_W_4_EH;
        static final eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_53_B_JCY_5 = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_53_B_JCY_5;
        static final eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_15_CD = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_15_CD;
        static final eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_Z_907_YMBB = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.HTTP_PURL_ORG_COAR_RESOURCE_TYPE_Z_907_YMBB;
        static final eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_GPQ_7_G_5_VE = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.HTTP_PURL_ORG_COAR_RESOURCE_TYPE_GPQ_7_G_5_VE;
        static final eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_MW_8_G_3_CR_8 = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.HTTP_PURL_ORG_COAR_RESOURCE_TYPE_MW_8_G_3_CR_8;
        static final eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.Enum HTTP_PURL_ORG_COAR_RESOURCE_TYPE_9_DKX_KSAF = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.HTTP_PURL_ORG_COAR_RESOURCE_TYPE_9_DKX_KSAF;
        
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_SB_3_Y_W_4_EH = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_SB_3_Y_W_4_EH;
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_53_B_JCY_5 = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_53_B_JCY_5;
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_15_CD = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_C_15_CD;
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_Z_907_YMBB = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_Z_907_YMBB;
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_GPQ_7_G_5_VE = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_GPQ_7_G_5_VE;
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_MW_8_G_3_CR_8 = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_MW_8_G_3_CR_8;
        static final int INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_9_DKX_KSAF = eu.openaire.cerifProfile.vocab.coarPatentTypes.EnumType.INT_HTTP_PURL_ORG_COAR_RESOURCE_TYPE_9_DKX_KSAF;
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type newInstance() {
              return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument newInstance() {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
