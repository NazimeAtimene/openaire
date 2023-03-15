/*
 * An XML document type.
 * Localname: Publication
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.PublicationDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11;


/**
 * A document containing one Publication(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public interface PublicationDocument extends eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PublicationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("publication1aeadoctype");
    
    /**
     * Gets the "Publication" element
     */
    eu.openaire.cerifProfile.x11.PublicationDocument.Publication getPublication();
    
    /**
     * Sets the "Publication" element
     */
    void setPublication(eu.openaire.cerifProfile.x11.PublicationDocument.Publication publication);
    
    /**
     * Appends and returns a new empty "Publication" element
     */
    eu.openaire.cerifProfile.x11.PublicationDocument.Publication addNewPublication();
    
    /**
     * An XML Publication(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public interface Publication extends eu.openaire.cerifProfile.x11.ResearchOutputBaseType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Publication.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("publicationbf72elemtype");
        
        /**
         * Gets the "Type" element
         */
        eu.openaire.cerifProfile.vocab.coarPublicationTypes.TypeDocument.Type getType();
        
        /**
         * True if has "Type" element
         */
        boolean isSetType();
        
        /**
         * Sets the "Type" element
         */
        void setType(eu.openaire.cerifProfile.vocab.coarPublicationTypes.TypeDocument.Type type);
        
        /**
         * Appends and returns a new empty "Type" element
         */
        eu.openaire.cerifProfile.vocab.coarPublicationTypes.TypeDocument.Type addNewType();
        
        /**
         * Unsets the "Type" element
         */
        void unsetType();
        
        /**
         * Gets the "Language" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getLanguage();
        
        /**
         * True if has "Language" element
         */
        boolean isSetLanguage();
        
        /**
         * Sets the "Language" element
         */
        void setLanguage(eu.openaire.cerifProfile.x11.CfStringType language);
        
        /**
         * Appends and returns a new empty "Language" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewLanguage();
        
        /**
         * Unsets the "Language" element
         */
        void unsetLanguage();
        
        /**
         * Gets array of all "Title" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getTitleArray();
        
        /**
         * Gets ith "Title" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getTitleArray(int i);
        
        /**
         * Returns number of "Title" element
         */
        int sizeOfTitleArray();
        
        /**
         * Sets array of all "Title" element
         */
        void setTitleArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] titleArray);
        
        /**
         * Sets ith "Title" element
         */
        void setTitleArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType title);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Title" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewTitle(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Title" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewTitle();
        
        /**
         * Removes the ith "Title" element
         */
        void removeTitle(int i);
        
        /**
         * Gets array of all "Subtitle" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getSubtitleArray();
        
        /**
         * Gets ith "Subtitle" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getSubtitleArray(int i);
        
        /**
         * Returns number of "Subtitle" element
         */
        int sizeOfSubtitleArray();
        
        /**
         * Sets array of all "Subtitle" element
         */
        void setSubtitleArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] subtitleArray);
        
        /**
         * Sets ith "Subtitle" element
         */
        void setSubtitleArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType subtitle);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Subtitle" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewSubtitle(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Subtitle" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewSubtitle();
        
        /**
         * Removes the ith "Subtitle" element
         */
        void removeSubtitle(int i);
        
        /**
         * Gets array of all "NameAbbreviation" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getNameAbbreviationArray();
        
        /**
         * Gets ith "NameAbbreviation" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getNameAbbreviationArray(int i);
        
        /**
         * Returns number of "NameAbbreviation" element
         */
        int sizeOfNameAbbreviationArray();
        
        /**
         * Sets array of all "NameAbbreviation" element
         */
        void setNameAbbreviationArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] nameAbbreviationArray);
        
        /**
         * Sets ith "NameAbbreviation" element
         */
        void setNameAbbreviationArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType nameAbbreviation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "NameAbbreviation" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewNameAbbreviation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "NameAbbreviation" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewNameAbbreviation();
        
        /**
         * Removes the ith "NameAbbreviation" element
         */
        void removeNameAbbreviation(int i);
        
        /**
         * Gets the "PublishedIn" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn getPublishedIn();
        
        /**
         * True if has "PublishedIn" element
         */
        boolean isSetPublishedIn();
        
        /**
         * Sets the "PublishedIn" element
         */
        void setPublishedIn(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn publishedIn);
        
        /**
         * Appends and returns a new empty "PublishedIn" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn addNewPublishedIn();
        
        /**
         * Unsets the "PublishedIn" element
         */
        void unsetPublishedIn();
        
        /**
         * Gets the "PartOf" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf getPartOf();
        
        /**
         * True if has "PartOf" element
         */
        boolean isSetPartOf();
        
        /**
         * Sets the "PartOf" element
         */
        void setPartOf(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf partOf);
        
        /**
         * Appends and returns a new empty "PartOf" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf addNewPartOf();
        
        /**
         * Unsets the "PartOf" element
         */
        void unsetPartOf();
        
        /**
         * Gets the "PublicationDate" element
         */
        eu.openaire.cerifProfile.x11.CfGenericDateTimeType getPublicationDate();
        
        /**
         * True if has "PublicationDate" element
         */
        boolean isSetPublicationDate();
        
        /**
         * Sets the "PublicationDate" element
         */
        void setPublicationDate(eu.openaire.cerifProfile.x11.CfGenericDateTimeType publicationDate);
        
        /**
         * Appends and returns a new empty "PublicationDate" element
         */
        eu.openaire.cerifProfile.x11.CfGenericDateTimeType addNewPublicationDate();
        
        /**
         * Unsets the "PublicationDate" element
         */
        void unsetPublicationDate();
        
        /**
         * Gets the "Number" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getNumber();
        
        /**
         * True if has "Number" element
         */
        boolean isSetNumber();
        
        /**
         * Sets the "Number" element
         */
        void setNumber(eu.openaire.cerifProfile.x11.CfStringType number);
        
        /**
         * Appends and returns a new empty "Number" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewNumber();
        
        /**
         * Unsets the "Number" element
         */
        void unsetNumber();
        
        /**
         * Gets the "Volume" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getVolume();
        
        /**
         * True if has "Volume" element
         */
        boolean isSetVolume();
        
        /**
         * Sets the "Volume" element
         */
        void setVolume(eu.openaire.cerifProfile.x11.CfStringType volume);
        
        /**
         * Appends and returns a new empty "Volume" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewVolume();
        
        /**
         * Unsets the "Volume" element
         */
        void unsetVolume();
        
        /**
         * Gets the "Issue" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getIssue();
        
        /**
         * True if has "Issue" element
         */
        boolean isSetIssue();
        
        /**
         * Sets the "Issue" element
         */
        void setIssue(eu.openaire.cerifProfile.x11.CfStringType issue);
        
        /**
         * Appends and returns a new empty "Issue" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewIssue();
        
        /**
         * Unsets the "Issue" element
         */
        void unsetIssue();
        
        /**
         * Gets the "Edition" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getEdition();
        
        /**
         * True if has "Edition" element
         */
        boolean isSetEdition();
        
        /**
         * Sets the "Edition" element
         */
        void setEdition(eu.openaire.cerifProfile.x11.CfStringType edition);
        
        /**
         * Appends and returns a new empty "Edition" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewEdition();
        
        /**
         * Unsets the "Edition" element
         */
        void unsetEdition();
        
        /**
         * Gets the "StartPage" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getStartPage();
        
        /**
         * True if has "StartPage" element
         */
        boolean isSetStartPage();
        
        /**
         * Sets the "StartPage" element
         */
        void setStartPage(eu.openaire.cerifProfile.x11.CfStringType startPage);
        
        /**
         * Appends and returns a new empty "StartPage" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewStartPage();
        
        /**
         * Unsets the "StartPage" element
         */
        void unsetStartPage();
        
        /**
         * Gets the "EndPage" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getEndPage();
        
        /**
         * True if has "EndPage" element
         */
        boolean isSetEndPage();
        
        /**
         * Sets the "EndPage" element
         */
        void setEndPage(eu.openaire.cerifProfile.x11.CfStringType endPage);
        
        /**
         * Appends and returns a new empty "EndPage" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewEndPage();
        
        /**
         * Unsets the "EndPage" element
         */
        void unsetEndPage();
        
        /**
         * Gets the "DOI" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI getDOI();
        
        /**
         * True if has "DOI" element
         */
        boolean isSetDOI();
        
        /**
         * Sets the "DOI" element
         */
        void setDOI(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI doi);
        
        /**
         * Appends and returns a new empty "DOI" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI addNewDOI();
        
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
         * Gets the "PMCID" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getPMCID();
        
        /**
         * True if has "PMCID" element
         */
        boolean isSetPMCID();
        
        /**
         * Sets the "PMCID" element
         */
        void setPMCID(eu.openaire.cerifProfile.x11.CfStringType pmcid);
        
        /**
         * Appends and returns a new empty "PMCID" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewPMCID();
        
        /**
         * Unsets the "PMCID" element
         */
        void unsetPMCID();
        
        /**
         * Gets the "ISI-Number" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getISINumber();
        
        /**
         * True if has "ISI-Number" element
         */
        boolean isSetISINumber();
        
        /**
         * Sets the "ISI-Number" element
         */
        void setISINumber(eu.openaire.cerifProfile.x11.CfStringType isiNumber);
        
        /**
         * Appends and returns a new empty "ISI-Number" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewISINumber();
        
        /**
         * Unsets the "ISI-Number" element
         */
        void unsetISINumber();
        
        /**
         * Gets the "SCP-Number" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getSCPNumber();
        
        /**
         * True if has "SCP-Number" element
         */
        boolean isSetSCPNumber();
        
        /**
         * Sets the "SCP-Number" element
         */
        void setSCPNumber(eu.openaire.cerifProfile.x11.CfStringType scpNumber);
        
        /**
         * Appends and returns a new empty "SCP-Number" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewSCPNumber();
        
        /**
         * Unsets the "SCP-Number" element
         */
        void unsetSCPNumber();
        
        /**
         * Gets array of all "ISSN" elements
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN[] getISSNArray();
        
        /**
         * Gets ith "ISSN" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN getISSNArray(int i);
        
        /**
         * Returns number of "ISSN" element
         */
        int sizeOfISSNArray();
        
        /**
         * Sets array of all "ISSN" element
         */
        void setISSNArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN[] issnArray);
        
        /**
         * Sets ith "ISSN" element
         */
        void setISSNArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN issn);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ISSN" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN insertNewISSN(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ISSN" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN addNewISSN();
        
        /**
         * Removes the ith "ISSN" element
         */
        void removeISSN(int i);
        
        /**
         * Gets array of all "ISBN" elements
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN[] getISBNArray();
        
        /**
         * Gets ith "ISBN" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN getISBNArray(int i);
        
        /**
         * Returns number of "ISBN" element
         */
        int sizeOfISBNArray();
        
        /**
         * Sets array of all "ISBN" element
         */
        void setISBNArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN[] isbnArray);
        
        /**
         * Sets ith "ISBN" element
         */
        void setISBNArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN isbn);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ISBN" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN insertNewISBN(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ISBN" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN addNewISBN();
        
        /**
         * Removes the ith "ISBN" element
         */
        void removeISBN(int i);
        
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
         * Gets the "ZDB-ID" element
         */
        eu.openaire.cerifProfile.x11.ZDBIDType getZDBID();
        
        /**
         * True if has "ZDB-ID" element
         */
        boolean isSetZDBID();
        
        /**
         * Sets the "ZDB-ID" element
         */
        void setZDBID(eu.openaire.cerifProfile.x11.ZDBIDType zdbid);
        
        /**
         * Appends and returns a new empty "ZDB-ID" element
         */
        eu.openaire.cerifProfile.x11.ZDBIDType addNewZDBID();
        
        /**
         * Unsets the "ZDB-ID" element
         */
        void unsetZDBID();
        
        /**
         * Gets the "Authors" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors getAuthors();
        
        /**
         * True if has "Authors" element
         */
        boolean isSetAuthors();
        
        /**
         * Sets the "Authors" element
         */
        void setAuthors(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors authors);
        
        /**
         * Appends and returns a new empty "Authors" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors addNewAuthors();
        
        /**
         * Unsets the "Authors" element
         */
        void unsetAuthors();
        
        /**
         * Gets the "Editors" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors getEditors();
        
        /**
         * True if has "Editors" element
         */
        boolean isSetEditors();
        
        /**
         * Sets the "Editors" element
         */
        void setEditors(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors editors);
        
        /**
         * Appends and returns a new empty "Editors" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors addNewEditors();
        
        /**
         * Unsets the "Editors" element
         */
        void unsetEditors();
        
        /**
         * Gets the "Publishers" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers getPublishers();
        
        /**
         * True if has "Publishers" element
         */
        boolean isSetPublishers();
        
        /**
         * Sets the "Publishers" element
         */
        void setPublishers(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers publishers);
        
        /**
         * Appends and returns a new empty "Publishers" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers addNewPublishers();
        
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
         * Gets array of all "Abstract" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getAbstractArray();
        
        /**
         * Gets ith "Abstract" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getAbstractArray(int i);
        
        /**
         * Returns number of "Abstract" element
         */
        int sizeOfAbstractArray();
        
        /**
         * Sets array of all "Abstract" element
         */
        void setAbstractArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] xabstractArray);
        
        /**
         * Sets ith "Abstract" element
         */
        void setAbstractArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType xabstract);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Abstract" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewAbstract(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Abstract" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewAbstract();
        
        /**
         * Removes the ith "Abstract" element
         */
        void removeAbstract(int i);
        
        /**
         * Gets array of all "Status" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getStatusArray();
        
        /**
         * Gets ith "Status" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getStatusArray(int i);
        
        /**
         * Returns number of "Status" element
         */
        int sizeOfStatusArray();
        
        /**
         * Sets array of all "Status" element
         */
        void setStatusArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] statusArray);
        
        /**
         * Sets ith "Status" element
         */
        void setStatusArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType status);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Status" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewStatus(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Status" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewStatus();
        
        /**
         * Removes the ith "Status" element
         */
        void removeStatus(int i);
        
        /**
         * Gets array of all "OriginatesFrom" elements
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom[] getOriginatesFromArray();
        
        /**
         * Gets ith "OriginatesFrom" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom getOriginatesFromArray(int i);
        
        /**
         * Returns number of "OriginatesFrom" element
         */
        int sizeOfOriginatesFromArray();
        
        /**
         * Sets array of all "OriginatesFrom" element
         */
        void setOriginatesFromArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom[] originatesFromArray);
        
        /**
         * Sets ith "OriginatesFrom" element
         */
        void setOriginatesFromArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom originatesFrom);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OriginatesFrom" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom insertNewOriginatesFrom(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OriginatesFrom" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom addNewOriginatesFrom();
        
        /**
         * Removes the ith "OriginatesFrom" element
         */
        void removeOriginatesFrom(int i);
        
        /**
         * Gets array of all "PresentedAt" elements
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt[] getPresentedAtArray();
        
        /**
         * Gets ith "PresentedAt" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt getPresentedAtArray(int i);
        
        /**
         * Returns number of "PresentedAt" element
         */
        int sizeOfPresentedAtArray();
        
        /**
         * Sets array of all "PresentedAt" element
         */
        void setPresentedAtArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt[] presentedAtArray);
        
        /**
         * Sets ith "PresentedAt" element
         */
        void setPresentedAtArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt presentedAt);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PresentedAt" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt insertNewPresentedAt(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PresentedAt" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt addNewPresentedAt();
        
        /**
         * Removes the ith "PresentedAt" element
         */
        void removePresentedAt(int i);
        
        /**
         * Gets array of all "OutputFrom" elements
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom[] getOutputFromArray();
        
        /**
         * Gets ith "OutputFrom" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom getOutputFromArray(int i);
        
        /**
         * Returns number of "OutputFrom" element
         */
        int sizeOfOutputFromArray();
        
        /**
         * Sets array of all "OutputFrom" element
         */
        void setOutputFromArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom[] outputFromArray);
        
        /**
         * Sets ith "OutputFrom" element
         */
        void setOutputFromArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom outputFrom);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OutputFrom" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom insertNewOutputFrom(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OutputFrom" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom addNewOutputFrom();
        
        /**
         * Removes the ith "OutputFrom" element
         */
        void removeOutputFrom(int i);
        
        /**
         * Gets array of all "Coverage" elements
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage[] getCoverageArray();
        
        /**
         * Gets ith "Coverage" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage getCoverageArray(int i);
        
        /**
         * Returns number of "Coverage" element
         */
        int sizeOfCoverageArray();
        
        /**
         * Sets array of all "Coverage" element
         */
        void setCoverageArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage[] coverageArray);
        
        /**
         * Sets ith "Coverage" element
         */
        void setCoverageArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage coverage);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Coverage" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage insertNewCoverage(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Coverage" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage addNewCoverage();
        
        /**
         * Removes the ith "Coverage" element
         */
        void removeCoverage(int i);
        
        /**
         * Gets array of all "References" elements
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References[] getReferencesArray();
        
        /**
         * Gets ith "References" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References getReferencesArray(int i);
        
        /**
         * Returns number of "References" element
         */
        int sizeOfReferencesArray();
        
        /**
         * Sets array of all "References" element
         */
        void setReferencesArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References[] referencesArray);
        
        /**
         * Sets ith "References" element
         */
        void setReferencesArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References references);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "References" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References insertNewReferences(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "References" element
         */
        eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References addNewReferences();
        
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
         * An XML PublishedIn(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface PublishedIn extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PublishedIn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("publishedin5293elemtype");
            
            /**
             * Gets the "Publication" element
             */
            eu.openaire.cerifProfile.x11.PublicationDocument.Publication getPublication();
            
            /**
             * Sets the "Publication" element
             */
            void setPublication(eu.openaire.cerifProfile.x11.PublicationDocument.Publication publication);
            
            /**
             * Appends and returns a new empty "Publication" element
             */
            eu.openaire.cerifProfile.x11.PublicationDocument.Publication addNewPublication();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn newInstance() {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PartOf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("partof00ccelemtype");
            
            /**
             * Gets the "Publication" element
             */
            eu.openaire.cerifProfile.x11.PublicationDocument.Publication getPublication();
            
            /**
             * Sets the "Publication" element
             */
            void setPublication(eu.openaire.cerifProfile.x11.PublicationDocument.Publication publication);
            
            /**
             * Appends and returns a new empty "Publication" element
             */
            eu.openaire.cerifProfile.x11.PublicationDocument.Publication addNewPublication();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf newInstance() {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML DOI(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is an atomic type that is a restriction of eu.openaire.cerifProfile.x11.PublicationDocument$Publication$DOI.
         */
        public interface DOI extends eu.openaire.cerifProfile.x11.DOISimpleType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DOI.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("doi06a8elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI newInstance() {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ISSN(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is an atomic type that is a restriction of eu.openaire.cerifProfile.x11.PublicationDocument$Publication$ISSN.
         */
        public interface ISSN extends eu.openaire.cerifProfile.x11.ISSNSimpleType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ISSN.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("issn72b1elemtype");
            
            /**
             * Gets the "medium" attribute
             */
            org.issn.vocabularies.medium.EnumType.Enum getMedium();
            
            /**
             * Gets (as xml) the "medium" attribute
             */
            org.issn.vocabularies.medium.EnumType xgetMedium();
            
            /**
             * True if has "medium" attribute
             */
            boolean isSetMedium();
            
            /**
             * Sets the "medium" attribute
             */
            void setMedium(org.issn.vocabularies.medium.EnumType.Enum medium);
            
            /**
             * Sets (as xml) the "medium" attribute
             */
            void xsetMedium(org.issn.vocabularies.medium.EnumType medium);
            
            /**
             * Unsets the "medium" attribute
             */
            void unsetMedium();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN newInstance() {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ISBN(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a union type. Instances are of one of the following types:
         *     eu.openaire.cerifProfile.x11.ISBN13SimpleType$Member
         *     eu.openaire.cerifProfile.x11.ISBN13SimpleType$Member2
         *     eu.openaire.cerifProfile.x11.ISBN10SimpleType$Member
         *     eu.openaire.cerifProfile.x11.ISBN10SimpleType$Member2
         */
        public interface ISBN extends eu.openaire.cerifProfile.x11.ISBNSimpleType
        {
            java.lang.Object getObjectValue();
            void setObjectValue(java.lang.Object val);
            /** @deprecated */
            java.lang.Object objectValue();
            /** @deprecated */
            void objectSet(java.lang.Object val);
            org.apache.xmlbeans.SchemaType instanceType();
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ISBN.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("isbn1ba0elemtype");
            
            /**
             * Gets the "medium" attribute
             */
            org.issn.vocabularies.medium.EnumType.Enum getMedium();
            
            /**
             * Gets (as xml) the "medium" attribute
             */
            org.issn.vocabularies.medium.EnumType xgetMedium();
            
            /**
             * True if has "medium" attribute
             */
            boolean isSetMedium();
            
            /**
             * Sets the "medium" attribute
             */
            void setMedium(org.issn.vocabularies.medium.EnumType.Enum medium);
            
            /**
             * Sets (as xml) the "medium" attribute
             */
            void xsetMedium(org.issn.vocabularies.medium.EnumType medium);
            
            /**
             * Unsets the "medium" attribute
             */
            void unsetMedium();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN newInstance() {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Authors(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Authors extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Authors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("authors8c5eelemtype");
            
            /**
             * Gets array of all "Author" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] getAuthorArray();
            
            /**
             * Gets ith "Author" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType getAuthorArray(int i);
            
            /**
             * Returns number of "Author" element
             */
            int sizeOfAuthorArray();
            
            /**
             * Sets array of all "Author" element
             */
            void setAuthorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] authorArray);
            
            /**
             * Sets ith "Author" element
             */
            void setAuthorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType author);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Author" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType insertNewAuthor(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Author" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType addNewAuthor();
            
            /**
             * Removes the ith "Author" element
             */
            void removeAuthor(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors newInstance() {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Editors(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Editors extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Editors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("editors7a40elemtype");
            
            /**
             * Gets array of all "Editor" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] getEditorArray();
            
            /**
             * Gets ith "Editor" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType getEditorArray(int i);
            
            /**
             * Returns number of "Editor" element
             */
            int sizeOfEditorArray();
            
            /**
             * Sets array of all "Editor" element
             */
            void setEditorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] editorArray);
            
            /**
             * Sets ith "Editor" element
             */
            void setEditorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType editor);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Editor" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType insertNewEditor(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Editor" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType addNewEditor();
            
            /**
             * Removes the ith "Editor" element
             */
            void removeEditor(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors newInstance() {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Publishers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("publishers135felemtype");
            
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
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers newInstance() {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OriginatesFrom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("originatesfromc785elemtype");
            
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
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom newInstance() {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PresentedAt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("presentedat1899elemtype");
            
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
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt newInstance() {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML OutputFrom(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface OutputFrom extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OutputFrom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("outputfrom0e8belemtype");
            
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
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom newInstance() {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Coverage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("coverage944eelemtype");
            
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
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage newInstance() {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(References.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("referencesf9aeelemtype");
            
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
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References newInstance() {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication newInstance() {
              return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.x11.PublicationDocument.Publication newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.x11.PublicationDocument.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.x11.PublicationDocument newInstance() {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PublicationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.PublicationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.PublicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
