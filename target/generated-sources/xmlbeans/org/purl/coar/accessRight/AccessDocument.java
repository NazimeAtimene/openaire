/*
 * An XML document type.
 * Localname: Access
 * Namespace: http://purl.org/coar/access_right
 * Java type: org.purl.coar.accessRight.AccessDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.accessRight;


/**
 * A document containing one Access(@http://purl.org/coar/access_right) element.
 *
 * This is a complex type.
 */
public interface AccessDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccessDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("accessa5e8doctype");
    
    /**
     * Gets the "Access" element
     */
    org.purl.coar.accessRight.AccessDocument.Access getAccess();
    
    /**
     * Sets the "Access" element
     */
    void setAccess(org.purl.coar.accessRight.AccessDocument.Access access);
    
    /**
     * Appends and returns a new empty "Access" element
     */
    org.purl.coar.accessRight.AccessDocument.Access addNewAccess();
    
    /**
     * An XML Access(@http://purl.org/coar/access_right).
     *
     * This is an atomic type that is a restriction of org.purl.coar.accessRight.AccessDocument$Access.
     */
    public interface Access extends org.purl.coar.accessRight.EnumType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Access.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("accessf9c8elemtype");
        
        static final org.purl.coar.accessRight.EnumType.Enum HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_ABF_2 = org.purl.coar.accessRight.EnumType.HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_ABF_2;
        static final org.purl.coar.accessRight.EnumType.Enum HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_F_1_CF = org.purl.coar.accessRight.EnumType.HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_F_1_CF;
        static final org.purl.coar.accessRight.EnumType.Enum HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_16_EC = org.purl.coar.accessRight.EnumType.HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_16_EC;
        static final org.purl.coar.accessRight.EnumType.Enum HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_14_CB = org.purl.coar.accessRight.EnumType.HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_14_CB;
        
        static final int INT_HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_ABF_2 = org.purl.coar.accessRight.EnumType.INT_HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_ABF_2;
        static final int INT_HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_F_1_CF = org.purl.coar.accessRight.EnumType.INT_HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_F_1_CF;
        static final int INT_HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_16_EC = org.purl.coar.accessRight.EnumType.INT_HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_16_EC;
        static final int INT_HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_14_CB = org.purl.coar.accessRight.EnumType.INT_HTTP_PURL_ORG_COAR_ACCESS_RIGHT_C_14_CB;
        
        /**
         * Gets the "startDate" attribute
         */
        java.util.Calendar getStartDate();
        
        /**
         * Gets (as xml) the "startDate" attribute
         */
        org.purl.coar.accessRight.CfGenericDateTimeSimpleType xgetStartDate();
        
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
        void xsetStartDate(org.purl.coar.accessRight.CfGenericDateTimeSimpleType startDate);
        
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
        org.purl.coar.accessRight.CfGenericDateTimeSimpleType xgetEndDate();
        
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
        void xsetEndDate(org.purl.coar.accessRight.CfGenericDateTimeSimpleType endDate);
        
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
            public static org.purl.coar.accessRight.AccessDocument.Access newInstance() {
              return (org.purl.coar.accessRight.AccessDocument.Access) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.purl.coar.accessRight.AccessDocument.Access newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.purl.coar.accessRight.AccessDocument.Access) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.purl.coar.accessRight.AccessDocument newInstance() {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.purl.coar.accessRight.AccessDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.purl.coar.accessRight.AccessDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.purl.coar.accessRight.AccessDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.purl.coar.accessRight.AccessDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.purl.coar.accessRight.AccessDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.purl.coar.accessRight.AccessDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.purl.coar.accessRight.AccessDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.purl.coar.accessRight.AccessDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.purl.coar.accessRight.AccessDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.purl.coar.accessRight.AccessDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.purl.coar.accessRight.AccessDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.purl.coar.accessRight.AccessDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.purl.coar.accessRight.AccessDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.purl.coar.accessRight.AccessDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.purl.coar.accessRight.AccessDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.purl.coar.accessRight.AccessDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.purl.coar.accessRight.AccessDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.purl.coar.accessRight.AccessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
