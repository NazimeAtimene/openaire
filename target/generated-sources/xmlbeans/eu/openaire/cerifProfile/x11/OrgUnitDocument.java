/*
 * An XML document type.
 * Localname: OrgUnit
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.OrgUnitDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11;


/**
 * A document containing one OrgUnit(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public interface OrgUnitDocument extends eu.openaire.cerifProfile.x11.OrgUnitSubstitutionGroupHeadDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrgUnitDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("orgunit858edoctype");
    
    /**
     * Gets the "OrgUnit" element
     */
    eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit getOrgUnit();
    
    /**
     * Sets the "OrgUnit" element
     */
    void setOrgUnit(eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit orgUnit);
    
    /**
     * Appends and returns a new empty "OrgUnit" element
     */
    eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit addNewOrgUnit();
    
    /**
     * An XML OrgUnit(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public interface OrgUnit extends eu.openaire.cerifProfile.x11.OrgUnitBaseType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrgUnit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("orgunit033aelemtype");
        
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
         * Gets the "RORID" element
         */
        eu.openaire.cerifProfile.x11.RORIDType getRORID();
        
        /**
         * True if has "RORID" element
         */
        boolean isSetRORID();
        
        /**
         * Sets the "RORID" element
         */
        void setRORID(eu.openaire.cerifProfile.x11.RORIDType rorid);
        
        /**
         * Appends and returns a new empty "RORID" element
         */
        eu.openaire.cerifProfile.x11.RORIDType addNewRORID();
        
        /**
         * Unsets the "RORID" element
         */
        void unsetRORID();
        
        /**
         * Gets array of all "AlternativeRORID" elements
         */
        eu.openaire.cerifProfile.x11.RORIDType[] getAlternativeRORIDArray();
        
        /**
         * Gets ith "AlternativeRORID" element
         */
        eu.openaire.cerifProfile.x11.RORIDType getAlternativeRORIDArray(int i);
        
        /**
         * Returns number of "AlternativeRORID" element
         */
        int sizeOfAlternativeRORIDArray();
        
        /**
         * Sets array of all "AlternativeRORID" element
         */
        void setAlternativeRORIDArray(eu.openaire.cerifProfile.x11.RORIDType[] alternativeRORIDArray);
        
        /**
         * Sets ith "AlternativeRORID" element
         */
        void setAlternativeRORIDArray(int i, eu.openaire.cerifProfile.x11.RORIDType alternativeRORID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeRORID" element
         */
        eu.openaire.cerifProfile.x11.RORIDType insertNewAlternativeRORID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeRORID" element
         */
        eu.openaire.cerifProfile.x11.RORIDType addNewAlternativeRORID();
        
        /**
         * Removes the ith "AlternativeRORID" element
         */
        void removeAlternativeRORID(int i);
        
        /**
         * Gets the "GRID" element
         */
        eu.openaire.cerifProfile.x11.GRIDType getGRID();
        
        /**
         * True if has "GRID" element
         */
        boolean isSetGRID();
        
        /**
         * Sets the "GRID" element
         */
        void setGRID(eu.openaire.cerifProfile.x11.GRIDType grid);
        
        /**
         * Appends and returns a new empty "GRID" element
         */
        eu.openaire.cerifProfile.x11.GRIDType addNewGRID();
        
        /**
         * Unsets the "GRID" element
         */
        void unsetGRID();
        
        /**
         * Gets array of all "AlternativeGRID" elements
         */
        eu.openaire.cerifProfile.x11.GRIDType[] getAlternativeGRIDArray();
        
        /**
         * Gets ith "AlternativeGRID" element
         */
        eu.openaire.cerifProfile.x11.GRIDType getAlternativeGRIDArray(int i);
        
        /**
         * Returns number of "AlternativeGRID" element
         */
        int sizeOfAlternativeGRIDArray();
        
        /**
         * Sets array of all "AlternativeGRID" element
         */
        void setAlternativeGRIDArray(eu.openaire.cerifProfile.x11.GRIDType[] alternativeGRIDArray);
        
        /**
         * Sets ith "AlternativeGRID" element
         */
        void setAlternativeGRIDArray(int i, eu.openaire.cerifProfile.x11.GRIDType alternativeGRID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeGRID" element
         */
        eu.openaire.cerifProfile.x11.GRIDType insertNewAlternativeGRID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeGRID" element
         */
        eu.openaire.cerifProfile.x11.GRIDType addNewAlternativeGRID();
        
        /**
         * Removes the ith "AlternativeGRID" element
         */
        void removeAlternativeGRID(int i);
        
        /**
         * Gets the "ISNI" element
         */
        eu.openaire.cerifProfile.x11.ISNIType getISNI();
        
        /**
         * True if has "ISNI" element
         */
        boolean isSetISNI();
        
        /**
         * Sets the "ISNI" element
         */
        void setISNI(eu.openaire.cerifProfile.x11.ISNIType isni);
        
        /**
         * Appends and returns a new empty "ISNI" element
         */
        eu.openaire.cerifProfile.x11.ISNIType addNewISNI();
        
        /**
         * Unsets the "ISNI" element
         */
        void unsetISNI();
        
        /**
         * Gets array of all "AlternativeISNI" elements
         */
        eu.openaire.cerifProfile.x11.ISNIType[] getAlternativeISNIArray();
        
        /**
         * Gets ith "AlternativeISNI" element
         */
        eu.openaire.cerifProfile.x11.ISNIType getAlternativeISNIArray(int i);
        
        /**
         * Returns number of "AlternativeISNI" element
         */
        int sizeOfAlternativeISNIArray();
        
        /**
         * Sets array of all "AlternativeISNI" element
         */
        void setAlternativeISNIArray(eu.openaire.cerifProfile.x11.ISNIType[] alternativeISNIArray);
        
        /**
         * Sets ith "AlternativeISNI" element
         */
        void setAlternativeISNIArray(int i, eu.openaire.cerifProfile.x11.ISNIType alternativeISNI);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeISNI" element
         */
        eu.openaire.cerifProfile.x11.ISNIType insertNewAlternativeISNI(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeISNI" element
         */
        eu.openaire.cerifProfile.x11.ISNIType addNewAlternativeISNI();
        
        /**
         * Removes the ith "AlternativeISNI" element
         */
        void removeAlternativeISNI(int i);
        
        /**
         * Gets the "FundRefID" element
         */
        eu.openaire.cerifProfile.x11.FundRefIDType getFundRefID();
        
        /**
         * True if has "FundRefID" element
         */
        boolean isSetFundRefID();
        
        /**
         * Sets the "FundRefID" element
         */
        void setFundRefID(eu.openaire.cerifProfile.x11.FundRefIDType fundRefID);
        
        /**
         * Appends and returns a new empty "FundRefID" element
         */
        eu.openaire.cerifProfile.x11.FundRefIDType addNewFundRefID();
        
        /**
         * Unsets the "FundRefID" element
         */
        void unsetFundRefID();
        
        /**
         * Gets array of all "AlternativeFundRefID" elements
         */
        eu.openaire.cerifProfile.x11.FundRefIDType[] getAlternativeFundRefIDArray();
        
        /**
         * Gets ith "AlternativeFundRefID" element
         */
        eu.openaire.cerifProfile.x11.FundRefIDType getAlternativeFundRefIDArray(int i);
        
        /**
         * Returns number of "AlternativeFundRefID" element
         */
        int sizeOfAlternativeFundRefIDArray();
        
        /**
         * Sets array of all "AlternativeFundRefID" element
         */
        void setAlternativeFundRefIDArray(eu.openaire.cerifProfile.x11.FundRefIDType[] alternativeFundRefIDArray);
        
        /**
         * Sets ith "AlternativeFundRefID" element
         */
        void setAlternativeFundRefIDArray(int i, eu.openaire.cerifProfile.x11.FundRefIDType alternativeFundRefID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AlternativeFundRefID" element
         */
        eu.openaire.cerifProfile.x11.FundRefIDType insertNewAlternativeFundRefID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AlternativeFundRefID" element
         */
        eu.openaire.cerifProfile.x11.FundRefIDType addNewAlternativeFundRefID();
        
        /**
         * Removes the ith "AlternativeFundRefID" element
         */
        void removeAlternativeFundRefID(int i);
        
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
         * Gets array of all "ElectronicAddress" elements
         */
        java.lang.String[] getElectronicAddressArray();
        
        /**
         * Gets ith "ElectronicAddress" element
         */
        java.lang.String getElectronicAddressArray(int i);
        
        /**
         * Gets (as xml) array of all "ElectronicAddress" elements
         */
        org.apache.xmlbeans.XmlAnyURI[] xgetElectronicAddressArray();
        
        /**
         * Gets (as xml) ith "ElectronicAddress" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetElectronicAddressArray(int i);
        
        /**
         * Returns number of "ElectronicAddress" element
         */
        int sizeOfElectronicAddressArray();
        
        /**
         * Sets array of all "ElectronicAddress" element
         */
        void setElectronicAddressArray(java.lang.String[] electronicAddressArray);
        
        /**
         * Sets ith "ElectronicAddress" element
         */
        void setElectronicAddressArray(int i, java.lang.String electronicAddress);
        
        /**
         * Sets (as xml) array of all "ElectronicAddress" element
         */
        void xsetElectronicAddressArray(org.apache.xmlbeans.XmlAnyURI[] electronicAddressArray);
        
        /**
         * Sets (as xml) ith "ElectronicAddress" element
         */
        void xsetElectronicAddressArray(int i, org.apache.xmlbeans.XmlAnyURI electronicAddress);
        
        /**
         * Inserts the value as the ith "ElectronicAddress" element
         */
        void insertElectronicAddress(int i, java.lang.String electronicAddress);
        
        /**
         * Appends the value as the last "ElectronicAddress" element
         */
        void addElectronicAddress(java.lang.String electronicAddress);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ElectronicAddress" element
         */
        org.apache.xmlbeans.XmlAnyURI insertNewElectronicAddress(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ElectronicAddress" element
         */
        org.apache.xmlbeans.XmlAnyURI addNewElectronicAddress();
        
        /**
         * Removes the ith "ElectronicAddress" element
         */
        void removeElectronicAddress(int i);
        
        /**
         * Gets array of all "PartOf" elements
         */
        eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf[] getPartOfArray();
        
        /**
         * Gets ith "PartOf" element
         */
        eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf getPartOfArray(int i);
        
        /**
         * Returns number of "PartOf" element
         */
        int sizeOfPartOfArray();
        
        /**
         * Sets array of all "PartOf" element
         */
        void setPartOfArray(eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf[] partOfArray);
        
        /**
         * Sets ith "PartOf" element
         */
        void setPartOfArray(int i, eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf partOf);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PartOf" element
         */
        eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf insertNewPartOf(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PartOf" element
         */
        eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf addNewPartOf();
        
        /**
         * Removes the ith "PartOf" element
         */
        void removePartOf(int i);
        
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
         * An XML PartOf(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface PartOf extends eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PartOf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("partof3e94elemtype");
            
            /**
             * Gets the "OrgUnit" element
             */
            eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit getOrgUnit();
            
            /**
             * Sets the "OrgUnit" element
             */
            void setOrgUnit(eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit orgUnit);
            
            /**
             * Appends and returns a new empty "OrgUnit" element
             */
            eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit addNewOrgUnit();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf newInstance() {
                  return (eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit.PartOf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit newInstance() {
              return (eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.x11.OrgUnitDocument.OrgUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument newInstance() {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.OrgUnitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.OrgUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
