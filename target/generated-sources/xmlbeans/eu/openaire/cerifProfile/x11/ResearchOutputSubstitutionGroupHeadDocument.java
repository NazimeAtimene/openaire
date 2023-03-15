/*
 * An XML document type.
 * Localname: ResearchOutput__SubstitutionGroupHead
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11;


/**
 * A document containing one ResearchOutput__SubstitutionGroupHead(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public interface ResearchOutputSubstitutionGroupHeadDocument extends eu.openaire.cerifProfile.x11.IndividualSubstitutionGroupHeadDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResearchOutputSubstitutionGroupHeadDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("researchoutputsubstitutiongrouphead7310doctype");
    
    /**
     * Gets the "ResearchOutput__SubstitutionGroupHead" element
     */
    eu.openaire.cerifProfile.x11.ResearchOutputBaseType getResearchOutputSubstitutionGroupHead();
    
    /**
     * Sets the "ResearchOutput__SubstitutionGroupHead" element
     */
    void setResearchOutputSubstitutionGroupHead(eu.openaire.cerifProfile.x11.ResearchOutputBaseType researchOutputSubstitutionGroupHead);
    
    /**
     * Appends and returns a new empty "ResearchOutput__SubstitutionGroupHead" element
     */
    eu.openaire.cerifProfile.x11.ResearchOutputBaseType addNewResearchOutputSubstitutionGroupHead();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument newInstance() {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
