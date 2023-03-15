/*
 * An XML document type.
 * Localname: Product
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.ProductDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11;


/**
 * A document containing one Product(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public interface ProductDocument extends eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("productc8c7doctype");
    
    /**
     * Gets the "Product" element
     */
    eu.openaire.cerifProfile.x11.ProductDocument.Product getProduct();
    
    /**
     * Sets the "Product" element
     */
    void setProduct(eu.openaire.cerifProfile.x11.ProductDocument.Product product);
    
    /**
     * Appends and returns a new empty "Product" element
     */
    eu.openaire.cerifProfile.x11.ProductDocument.Product addNewProduct();
    
    /**
     * An XML Product(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public interface Product extends eu.openaire.cerifProfile.x11.ResearchOutputBaseType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Product.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("product966celemtype");
        
        /**
         * Gets the "Type" element
         */
        eu.openaire.cerifProfile.vocab.coarProductTypes.TypeDocument.Type getType();
        
        /**
         * True if has "Type" element
         */
        boolean isSetType();
        
        /**
         * Sets the "Type" element
         */
        void setType(eu.openaire.cerifProfile.vocab.coarProductTypes.TypeDocument.Type type);
        
        /**
         * Appends and returns a new empty "Type" element
         */
        eu.openaire.cerifProfile.vocab.coarProductTypes.TypeDocument.Type addNewType();
        
        /**
         * Unsets the "Type" element
         */
        void unsetType();
        
        /**
         * Gets array of all "Language" elements
         */
        eu.openaire.cerifProfile.x11.CfStringType[] getLanguageArray();
        
        /**
         * Gets ith "Language" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getLanguageArray(int i);
        
        /**
         * Returns number of "Language" element
         */
        int sizeOfLanguageArray();
        
        /**
         * Sets array of all "Language" element
         */
        void setLanguageArray(eu.openaire.cerifProfile.x11.CfStringType[] languageArray);
        
        /**
         * Sets ith "Language" element
         */
        void setLanguageArray(int i, eu.openaire.cerifProfile.x11.CfStringType language);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Language" element
         */
        eu.openaire.cerifProfile.x11.CfStringType insertNewLanguage(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Language" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewLanguage();
        
        /**
         * Removes the ith "Language" element
         */
        void removeLanguage(int i);
        
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
         * Gets array of all "VersionInfo" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getVersionInfoArray();
        
        /**
         * Gets ith "VersionInfo" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getVersionInfoArray(int i);
        
        /**
         * Returns number of "VersionInfo" element
         */
        int sizeOfVersionInfoArray();
        
        /**
         * Sets array of all "VersionInfo" element
         */
        void setVersionInfoArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] versionInfoArray);
        
        /**
         * Sets ith "VersionInfo" element
         */
        void setVersionInfoArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType versionInfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "VersionInfo" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewVersionInfo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "VersionInfo" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewVersionInfo();
        
        /**
         * Removes the ith "VersionInfo" element
         */
        void removeVersionInfo(int i);
        
        /**
         * Gets the "ARK" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getARK();
        
        /**
         * True if has "ARK" element
         */
        boolean isSetARK();
        
        /**
         * Sets the "ARK" element
         */
        void setARK(eu.openaire.cerifProfile.x11.CfStringType ark);
        
        /**
         * Appends and returns a new empty "ARK" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewARK();
        
        /**
         * Unsets the "ARK" element
         */
        void unsetARK();
        
        /**
         * Gets the "DOI" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI getDOI();
        
        /**
         * True if has "DOI" element
         */
        boolean isSetDOI();
        
        /**
         * Sets the "DOI" element
         */
        void setDOI(eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI doi);
        
        /**
         * Appends and returns a new empty "DOI" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI addNewDOI();
        
        /**
         * Unsets the "DOI" element
         */
        void unsetDOI();
        
        /**
         * Gets the "Handle" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getHandle();
        
        /**
         * True if has "Handle" element
         */
        boolean isSetHandle();
        
        /**
         * Sets the "Handle" element
         */
        void setHandle(eu.openaire.cerifProfile.x11.CfStringType handle);
        
        /**
         * Appends and returns a new empty "Handle" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewHandle();
        
        /**
         * Unsets the "Handle" element
         */
        void unsetHandle();
        
        /**
         * Gets the "URL" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getURL();
        
        /**
         * True if has "URL" element
         */
        boolean isSetURL();
        
        /**
         * Sets the "URL" element
         */
        void setURL(eu.openaire.cerifProfile.x11.CfStringType url);
        
        /**
         * Appends and returns a new empty "URL" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewURL();
        
        /**
         * Unsets the "URL" element
         */
        void unsetURL();
        
        /**
         * Gets the "URN" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getURN();
        
        /**
         * True if has "URN" element
         */
        boolean isSetURN();
        
        /**
         * Sets the "URN" element
         */
        void setURN(eu.openaire.cerifProfile.x11.CfStringType urn);
        
        /**
         * Appends and returns a new empty "URN" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewURN();
        
        /**
         * Unsets the "URN" element
         */
        void unsetURN();
        
        /**
         * Gets the "Creators" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators getCreators();
        
        /**
         * True if has "Creators" element
         */
        boolean isSetCreators();
        
        /**
         * Sets the "Creators" element
         */
        void setCreators(eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators creators);
        
        /**
         * Appends and returns a new empty "Creators" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators addNewCreators();
        
        /**
         * Unsets the "Creators" element
         */
        void unsetCreators();
        
        /**
         * Gets the "Publishers" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers getPublishers();
        
        /**
         * True if has "Publishers" element
         */
        boolean isSetPublishers();
        
        /**
         * Sets the "Publishers" element
         */
        void setPublishers(eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers publishers);
        
        /**
         * Appends and returns a new empty "Publishers" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers addNewPublishers();
        
        /**
         * Unsets the "Publishers" element
         */
        void unsetPublishers();
        
        /**
         * Gets array of all "License" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getLicenseArray();
        
        /**
         * Gets ith "License" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getLicenseArray(int i);
        
        /**
         * Returns number of "License" element
         */
        int sizeOfLicenseArray();
        
        /**
         * Sets array of all "License" element
         */
        void setLicenseArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] licenseArray);
        
        /**
         * Sets ith "License" element
         */
        void setLicenseArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType license);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "License" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewLicense(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "License" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewLicense();
        
        /**
         * Removes the ith "License" element
         */
        void removeLicense(int i);
        
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
         * Gets array of all "Subject" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getSubjectArray();
        
        /**
         * Gets ith "Subject" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getSubjectArray(int i);
        
        /**
         * Returns number of "Subject" element
         */
        int sizeOfSubjectArray();
        
        /**
         * Sets array of all "Subject" element
         */
        void setSubjectArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] subjectArray);
        
        /**
         * Sets ith "Subject" element
         */
        void setSubjectArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType subject);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Subject" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewSubject(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Subject" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewSubject();
        
        /**
         * Removes the ith "Subject" element
         */
        void removeSubject(int i);
        
        /**
         * Gets array of all "Keyword" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getKeywordArray();
        
        /**
         * Gets ith "Keyword" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getKeywordArray(int i);
        
        /**
         * Returns number of "Keyword" element
         */
        int sizeOfKeywordArray();
        
        /**
         * Sets array of all "Keyword" element
         */
        void setKeywordArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] keywordArray);
        
        /**
         * Sets ith "Keyword" element
         */
        void setKeywordArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType keyword);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Keyword" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewKeyword(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Keyword" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewKeyword();
        
        /**
         * Removes the ith "Keyword" element
         */
        void removeKeyword(int i);
        
        /**
         * Gets the "PartOf" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf getPartOf();
        
        /**
         * True if has "PartOf" element
         */
        boolean isSetPartOf();
        
        /**
         * Sets the "PartOf" element
         */
        void setPartOf(eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf partOf);
        
        /**
         * Appends and returns a new empty "PartOf" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf addNewPartOf();
        
        /**
         * Unsets the "PartOf" element
         */
        void unsetPartOf();
        
        /**
         * Gets array of all "OriginatesFrom" elements
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom[] getOriginatesFromArray();
        
        /**
         * Gets ith "OriginatesFrom" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom getOriginatesFromArray(int i);
        
        /**
         * Returns number of "OriginatesFrom" element
         */
        int sizeOfOriginatesFromArray();
        
        /**
         * Sets array of all "OriginatesFrom" element
         */
        void setOriginatesFromArray(eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom[] originatesFromArray);
        
        /**
         * Sets ith "OriginatesFrom" element
         */
        void setOriginatesFromArray(int i, eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom originatesFrom);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OriginatesFrom" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom insertNewOriginatesFrom(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OriginatesFrom" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom addNewOriginatesFrom();
        
        /**
         * Removes the ith "OriginatesFrom" element
         */
        void removeOriginatesFrom(int i);
        
        /**
         * Gets array of all "GeneratedBy" elements
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy[] getGeneratedByArray();
        
        /**
         * Gets ith "GeneratedBy" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy getGeneratedByArray(int i);
        
        /**
         * Returns number of "GeneratedBy" element
         */
        int sizeOfGeneratedByArray();
        
        /**
         * Sets array of all "GeneratedBy" element
         */
        void setGeneratedByArray(eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy[] generatedByArray);
        
        /**
         * Sets ith "GeneratedBy" element
         */
        void setGeneratedByArray(int i, eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy generatedBy);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GeneratedBy" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy insertNewGeneratedBy(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GeneratedBy" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy addNewGeneratedBy();
        
        /**
         * Removes the ith "GeneratedBy" element
         */
        void removeGeneratedBy(int i);
        
        /**
         * Gets array of all "PresentedAt" elements
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt[] getPresentedAtArray();
        
        /**
         * Gets ith "PresentedAt" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt getPresentedAtArray(int i);
        
        /**
         * Returns number of "PresentedAt" element
         */
        int sizeOfPresentedAtArray();
        
        /**
         * Sets array of all "PresentedAt" element
         */
        void setPresentedAtArray(eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt[] presentedAtArray);
        
        /**
         * Sets ith "PresentedAt" element
         */
        void setPresentedAtArray(int i, eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt presentedAt);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PresentedAt" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt insertNewPresentedAt(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PresentedAt" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt addNewPresentedAt();
        
        /**
         * Removes the ith "PresentedAt" element
         */
        void removePresentedAt(int i);
        
        /**
         * Gets array of all "Coverage" elements
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage[] getCoverageArray();
        
        /**
         * Gets ith "Coverage" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage getCoverageArray(int i);
        
        /**
         * Returns number of "Coverage" element
         */
        int sizeOfCoverageArray();
        
        /**
         * Sets array of all "Coverage" element
         */
        void setCoverageArray(eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage[] coverageArray);
        
        /**
         * Sets ith "Coverage" element
         */
        void setCoverageArray(int i, eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage coverage);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Coverage" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage insertNewCoverage(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Coverage" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage addNewCoverage();
        
        /**
         * Removes the ith "Coverage" element
         */
        void removeCoverage(int i);
        
        /**
         * Gets array of all "References" elements
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.References[] getReferencesArray();
        
        /**
         * Gets ith "References" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.References getReferencesArray(int i);
        
        /**
         * Returns number of "References" element
         */
        int sizeOfReferencesArray();
        
        /**
         * Sets array of all "References" element
         */
        void setReferencesArray(eu.openaire.cerifProfile.x11.ProductDocument.Product.References[] referencesArray);
        
        /**
         * Sets ith "References" element
         */
        void setReferencesArray(int i, eu.openaire.cerifProfile.x11.ProductDocument.Product.References references);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "References" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.References insertNewReferences(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "References" element
         */
        eu.openaire.cerifProfile.x11.ProductDocument.Product.References addNewReferences();
        
        /**
         * Removes the ith "References" element
         */
        void removeReferences(int i);
        
        /**
         * Gets the "Access" element
         */
        org.purl.coar.accessRight.AccessDocument.Access getAccess();
        
        /**
         * True if has "Access" element
         */
        boolean isSetAccess();
        
        /**
         * Sets the "Access" element
         */
        void setAccess(org.purl.coar.accessRight.AccessDocument.Access access);
        
        /**
         * Appends and returns a new empty "Access" element
         */
        org.purl.coar.accessRight.AccessDocument.Access addNewAccess();
        
        /**
         * Unsets the "Access" element
         */
        void unsetAccess();
        
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
         * An XML DOI(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is an atomic type that is a restriction of eu.openaire.cerifProfile.x11.ProductDocument$Product$DOI.
         */
        public interface DOI extends eu.openaire.cerifProfile.x11.DOISimpleType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DOI.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("doi73a2elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Creators(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Creators extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Creators.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("creators7789elemtype");
            
            /**
             * Gets array of all "Creator" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] getCreatorArray();
            
            /**
             * Gets ith "Creator" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType getCreatorArray(int i);
            
            /**
             * Returns number of "Creator" element
             */
            int sizeOfCreatorArray();
            
            /**
             * Sets array of all "Creator" element
             */
            void setCreatorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] creatorArray);
            
            /**
             * Sets ith "Creator" element
             */
            void setCreatorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType creator);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Creator" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType insertNewCreator(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Creator" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType addNewCreator();
            
            /**
             * Removes the ith "Creator" element
             */
            void removeCreator(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Publishers(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Publishers extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Publishers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("publishers2759elemtype");
            
            /**
             * Gets array of all "Publisher" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getPublisherArray();
            
            /**
             * Gets ith "Publisher" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getPublisherArray(int i);
            
            /**
             * Returns number of "Publisher" element
             */
            int sizeOfPublisherArray();
            
            /**
             * Sets array of all "Publisher" element
             */
            void setPublisherArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] publisherArray);
            
            /**
             * Sets ith "Publisher" element
             */
            void setPublisherArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType publisher);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Publisher" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewPublisher(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Publisher" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewPublisher();
            
            /**
             * Removes the ith "Publisher" element
             */
            void removePublisher(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML PartOf(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface PartOf extends eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PartOf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("partofd1c6elemtype");
            
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
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML OriginatesFrom(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface OriginatesFrom extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OriginatesFrom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("originatesfrom617felemtype");
            
            /**
             * Gets the "ProjectFunding__SubstitutionGroupHead" element
             */
            eu.openaire.cerifProfile.x11.ProjectFundingBaseType getProjectFundingSubstitutionGroupHead();
            
            /**
             * Sets the "ProjectFunding__SubstitutionGroupHead" element
             */
            void setProjectFundingSubstitutionGroupHead(eu.openaire.cerifProfile.x11.ProjectFundingBaseType projectFundingSubstitutionGroupHead);
            
            /**
             * Appends and returns a new empty "ProjectFunding__SubstitutionGroupHead" element
             */
            eu.openaire.cerifProfile.x11.ProjectFundingBaseType addNewProjectFundingSubstitutionGroupHead();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML GeneratedBy(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface GeneratedBy extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneratedBy.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("generatedby419aelemtype");
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML PresentedAt(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface PresentedAt extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PresentedAt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("presentedat0693elemtype");
            
            /**
             * Gets the "Event" element
             */
            eu.openaire.cerifProfile.x11.EventDocument.Event getEvent();
            
            /**
             * Sets the "Event" element
             */
            void setEvent(eu.openaire.cerifProfile.x11.EventDocument.Event event);
            
            /**
             * Appends and returns a new empty "Event" element
             */
            eu.openaire.cerifProfile.x11.EventDocument.Event addNewEvent();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Coverage(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Coverage extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Coverage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("coverage0748elemtype");
            
            /**
             * Gets the "Event" element
             */
            eu.openaire.cerifProfile.x11.EventDocument.Event getEvent();
            
            /**
             * Sets the "Event" element
             */
            void setEvent(eu.openaire.cerifProfile.x11.EventDocument.Event event);
            
            /**
             * Appends and returns a new empty "Event" element
             */
            eu.openaire.cerifProfile.x11.EventDocument.Event addNewEvent();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML References(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface References extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(References.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("referencescca8elemtype");
            
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
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.References newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.References) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProductDocument.Product.References newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProductDocument.Product.References) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.x11.ProductDocument.Product newInstance() {
              return (eu.openaire.cerifProfile.x11.ProductDocument.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.x11.ProductDocument.Product newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.x11.ProductDocument.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.x11.ProductDocument newInstance() {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProductDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.ProductDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.ProductDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
