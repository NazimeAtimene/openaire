/*
 * XML Type:  cfSimpleURILink__Type
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility
 * Java type: eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility;


/**
 * An XML cfSimpleURILink__Type(@https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility).
 *
 * This is an atomic type that is a restriction of eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType.
 */
public interface CfSimpleURILinkType extends eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfURIType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CfSimpleURILinkType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("cfsimpleurilinktype3b50type");
    
    /**
     * Gets the "startDate" attribute
     */
    java.util.Calendar getStartDate();
    
    /**
     * Gets (as xml) the "startDate" attribute
     */
    eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfGenericDateTimeSimpleType xgetStartDate();
    
    /**
     * True if has "startDate" attribute
     */
    boolean isSetStartDate();
    
    /**
     * Sets the "startDate" attribute
     */
    void setStartDate(java.util.Calendar startDate);
    
    /**
     * Sets (as xml) the "startDate" attribute
     */
    void xsetStartDate(eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfGenericDateTimeSimpleType startDate);
    
    /**
     * Unsets the "startDate" attribute
     */
    void unsetStartDate();
    
    /**
     * Gets the "endDate" attribute
     */
    java.util.Calendar getEndDate();
    
    /**
     * Gets (as xml) the "endDate" attribute
     */
    eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfGenericDateTimeSimpleType xgetEndDate();
    
    /**
     * True if has "endDate" attribute
     */
    boolean isSetEndDate();
    
    /**
     * Sets the "endDate" attribute
     */
    void setEndDate(java.util.Calendar endDate);
    
    /**
     * Sets (as xml) the "endDate" attribute
     */
    void xsetEndDate(eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfGenericDateTimeSimpleType endDate);
    
    /**
     * Unsets the "endDate" attribute
     */
    void unsetEndDate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType newInstance() {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CfSimpleURILinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
