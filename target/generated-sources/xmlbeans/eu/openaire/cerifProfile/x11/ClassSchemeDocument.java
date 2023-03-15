/*
 * An XML document type.
 * Localname: ClassScheme
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.ClassSchemeDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11;


/**
 * A document containing one ClassScheme(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public interface ClassSchemeDocument extends eu.openaire.cerifProfile.x11.SemanticLayerSubstitutionGroupHeadDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClassSchemeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("classscheme8b39doctype");
    
    /**
     * Gets the "ClassScheme" element
     */
    eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme getClassScheme();
    
    /**
     * Sets the "ClassScheme" element
     */
    void setClassScheme(eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme classScheme);
    
    /**
     * Appends and returns a new empty "ClassScheme" element
     */
    eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme addNewClassScheme();
    
    /**
     * An XML ClassScheme(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public interface ClassScheme extends eu.openaire.cerifProfile.x11.SemanticLayerBaseType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClassScheme.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("classscheme69d0elemtype");
        
        /**
         * Gets array of all "Name" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] getNameArray();
        
        /**
         * Gets ith "Name" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType getNameArray(int i);
        
        /**
         * Returns number of "Name" element
         */
        int sizeOfNameArray();
        
        /**
         * Sets array of all "Name" element
         */
        void setNameArray(eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] nameArray);
        
        /**
         * Sets ith "Name" element
         */
        void setNameArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType name);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Name" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType insertNewName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Name" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType addNewName();
        
        /**
         * Removes the ith "Name" element
         */
        void removeName(int i);
        
        /**
         * Gets array of all "Description" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] getDescriptionArray();
        
        /**
         * Gets ith "Description" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType getDescriptionArray(int i);
        
        /**
         * Returns number of "Description" element
         */
        int sizeOfDescriptionArray();
        
        /**
         * Sets array of all "Description" element
         */
        void setDescriptionArray(eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] descriptionArray);
        
        /**
         * Sets ith "Description" element
         */
        void setDescriptionArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType description);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Description" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType insertNewDescription(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Description" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType addNewDescription();
        
        /**
         * Removes the ith "Description" element
         */
        void removeDescription(int i);
        
        /**
         * Gets array of all "Identifier" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] getIdentifierArray();
        
        /**
         * Gets ith "Identifier" element
         */
        eu.openaire.cerifProfile.x11.CfGenericIdentifierType getIdentifierArray(int i);
        
        /**
         * Returns number of "Identifier" element
         */
        int sizeOfIdentifierArray();
        
        /**
         * Sets array of all "Identifier" element
         */
        void setIdentifierArray(eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] identifierArray);
        
        /**
         * Sets ith "Identifier" element
         */
        void setIdentifierArray(int i, eu.openaire.cerifProfile.x11.CfGenericIdentifierType identifier);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        eu.openaire.cerifProfile.x11.CfGenericIdentifierType insertNewIdentifier(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        eu.openaire.cerifProfile.x11.CfGenericIdentifierType addNewIdentifier();
        
        /**
         * Removes the ith "Identifier" element
         */
        void removeIdentifier(int i);
        
        /**
         * Gets array of all "Class" elements
         */
        eu.openaire.cerifProfile.x11.CfClassBaseType[] getClass1Array();
        
        /**
         * Gets ith "Class" element
         */
        eu.openaire.cerifProfile.x11.CfClassBaseType getClass1Array(int i);
        
        /**
         * Returns number of "Class" element
         */
        int sizeOfClass1Array();
        
        /**
         * Sets array of all "Class" element
         */
        void setClass1Array(eu.openaire.cerifProfile.x11.CfClassBaseType[] class1Array);
        
        /**
         * Sets ith "Class" element
         */
        void setClass1Array(int i, eu.openaire.cerifProfile.x11.CfClassBaseType class1);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Class" element
         */
        eu.openaire.cerifProfile.x11.CfClassBaseType insertNewClass1(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Class" element
         */
        eu.openaire.cerifProfile.x11.CfClassBaseType addNewClass1();
        
        /**
         * Removes the ith "Class" element
         */
        void removeClass1(int i);
        
        /**
         * Gets array of all "Link" elements
         */
        eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link[] getLinkArray();
        
        /**
         * Gets ith "Link" element
         */
        eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link getLinkArray(int i);
        
        /**
         * Returns number of "Link" element
         */
        int sizeOfLinkArray();
        
        /**
         * Sets array of all "Link" element
         */
        void setLinkArray(eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link[] linkArray);
        
        /**
         * Sets ith "Link" element
         */
        void setLinkArray(int i, eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link link);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Link" element
         */
        eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link insertNewLink(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Link" element
         */
        eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link addNewLink();
        
        /**
         * Removes the ith "Link" element
         */
        void removeLink(int i);
        
        /**
         * An XML Link(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Link extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Link.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("linke05aelemtype");
            
            /**
             * Gets the "SemanticLayer__SubstitutionGroupHead" element
             */
            eu.openaire.cerifProfile.x11.SemanticLayerBaseType getSemanticLayerSubstitutionGroupHead();
            
            /**
             * Sets the "SemanticLayer__SubstitutionGroupHead" element
             */
            void setSemanticLayerSubstitutionGroupHead(eu.openaire.cerifProfile.x11.SemanticLayerBaseType semanticLayerSubstitutionGroupHead);
            
            /**
             * Appends and returns a new empty "SemanticLayer__SubstitutionGroupHead" element
             */
            eu.openaire.cerifProfile.x11.SemanticLayerBaseType addNewSemanticLayerSubstitutionGroupHead();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link newInstance() {
                  return (eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme newInstance() {
              return (eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument newInstance() {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.ClassSchemeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.ClassSchemeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
