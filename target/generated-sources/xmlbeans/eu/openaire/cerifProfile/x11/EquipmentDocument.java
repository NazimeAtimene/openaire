/*
 * An XML document type.
 * Localname: Equipment
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.EquipmentDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11;


/**
 * A document containing one Equipment(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public interface EquipmentDocument extends eu.openaire.cerifProfile.x11.InfrastructureSubstitutionGroupHeadDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EquipmentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("equipment7088doctype");
    
    /**
     * Gets the "Equipment" element
     */
    eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment getEquipment();
    
    /**
     * Sets the "Equipment" element
     */
    void setEquipment(eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment equipment);
    
    /**
     * Appends and returns a new empty "Equipment" element
     */
    eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment addNewEquipment();
    
    /**
     * An XML Equipment(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public interface Equipment extends eu.openaire.cerifProfile.x11.InfrastructureBaseType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Equipment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("equipmentfb6eelemtype");
        
        /**
         * Gets array of all "Type" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getTypeArray();
        
        /**
         * Gets ith "Type" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getTypeArray(int i);
        
        /**
         * Returns number of "Type" element
         */
        int sizeOfTypeArray();
        
        /**
         * Sets array of all "Type" element
         */
        void setTypeArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] typeArray);
        
        /**
         * Sets ith "Type" element
         */
        void setTypeArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType type);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Type" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Type" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewType();
        
        /**
         * Removes the ith "Type" element
         */
        void removeType(int i);
        
        /**
         * Gets the "Acronym" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getAcronym();
        
        /**
         * True if has "Acronym" element
         */
        boolean isSetAcronym();
        
        /**
         * Sets the "Acronym" element
         */
        void setAcronym(eu.openaire.cerifProfile.x11.CfStringType acronym);
        
        /**
         * Appends and returns a new empty "Acronym" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewAcronym();
        
        /**
         * Unsets the "Acronym" element
         */
        void unsetAcronym();
        
        /**
         * Gets array of all "Name" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getNameArray();
        
        /**
         * Gets ith "Name" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getNameArray(int i);
        
        /**
         * Returns number of "Name" element
         */
        int sizeOfNameArray();
        
        /**
         * Sets array of all "Name" element
         */
        void setNameArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] nameArray);
        
        /**
         * Sets ith "Name" element
         */
        void setNameArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType name);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Name" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Name" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewName();
        
        /**
         * Removes the ith "Name" element
         */
        void removeName(int i);
        
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
         * Gets array of all "Description" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getDescriptionArray();
        
        /**
         * Gets ith "Description" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getDescriptionArray(int i);
        
        /**
         * Returns number of "Description" element
         */
        int sizeOfDescriptionArray();
        
        /**
         * Sets array of all "Description" element
         */
        void setDescriptionArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] descriptionArray);
        
        /**
         * Sets ith "Description" element
         */
        void setDescriptionArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType description);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Description" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewDescription(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Description" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewDescription();
        
        /**
         * Removes the ith "Description" element
         */
        void removeDescription(int i);
        
        /**
         * Gets array of all "Owner" elements
         */
        eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getOwnerArray();
        
        /**
         * Gets ith "Owner" element
         */
        eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getOwnerArray(int i);
        
        /**
         * Returns number of "Owner" element
         */
        int sizeOfOwnerArray();
        
        /**
         * Sets array of all "Owner" element
         */
        void setOwnerArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] ownerArray);
        
        /**
         * Sets ith "Owner" element
         */
        void setOwnerArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType owner);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Owner" element
         */
        eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewOwner(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Owner" element
         */
        eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewOwner();
        
        /**
         * Removes the ith "Owner" element
         */
        void removeOwner(int i);
        
        /**
         * Gets array of all "Classification" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getClassificationArray();
        
        /**
         * Gets ith "Classification" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getClassificationArray(int i);
        
        /**
         * Returns number of "Classification" element
         */
        int sizeOfClassificationArray();
        
        /**
         * Sets array of all "Classification" element
         */
        void setClassificationArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] classificationArray);
        
        /**
         * Sets ith "Classification" element
         */
        void setClassificationArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType classification);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Classification" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewClassification(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Classification" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewClassification();
        
        /**
         * Removes the ith "Classification" element
         */
        void removeClassification(int i);
        
        /**
         * Gets array of all "Link" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericLinkType[] getLinkArray();
        
        /**
         * Gets ith "Link" element
         */
        eu.openaire.cerifProfile.x11.CfGenericLinkType getLinkArray(int i);
        
        /**
         * Returns number of "Link" element
         */
        int sizeOfLinkArray();
        
        /**
         * Sets array of all "Link" element
         */
        void setLinkArray(eu.openaire.cerifProfile.x11.CfGenericLinkType[] linkArray);
        
        /**
         * Sets ith "Link" element
         */
        void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfGenericLinkType link);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Link" element
         */
        eu.openaire.cerifProfile.x11.CfGenericLinkType insertNewLink(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Link" element
         */
        eu.openaire.cerifProfile.x11.CfGenericLinkType addNewLink();
        
        /**
         * Removes the ith "Link" element
         */
        void removeLink(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment newInstance() {
              return (eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.x11.EquipmentDocument newInstance() {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EquipmentDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.EquipmentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.EquipmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
