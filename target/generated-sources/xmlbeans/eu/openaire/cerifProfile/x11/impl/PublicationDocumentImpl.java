/*
 * An XML document type.
 * Localname: Publication
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.PublicationDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one Publication(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class PublicationDocumentImpl extends eu.openaire.cerifProfile.x11.impl.ResearchOutputSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.PublicationDocument
{
    private static final long serialVersionUID = 1L;
    
    public PublicationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLICATION$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Publication");
    
    
    /**
     * Gets the "Publication" element
     */
    public eu.openaire.cerifProfile.x11.PublicationDocument.Publication getPublication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.PublicationDocument.Publication target = null;
            target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication)get_store().find_element_user(PUBLICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Publication" element
     */
    public void setPublication(eu.openaire.cerifProfile.x11.PublicationDocument.Publication publication)
    {
        generatedSetterHelperImpl(publication, PUBLICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Publication" element
     */
    public eu.openaire.cerifProfile.x11.PublicationDocument.Publication addNewPublication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.PublicationDocument.Publication target = null;
            target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication)get_store().add_element_user(PUBLICATION$0);
            return target;
        }
    }
    /**
     * An XML Publication(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class PublicationImpl extends eu.openaire.cerifProfile.x11.impl.ResearchOutputBaseTypeImpl implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication
    {
        private static final long serialVersionUID = 1L;
        
        public PublicationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Publication_Types", "Type");
        private static final javax.xml.namespace.QName LANGUAGE$2 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Language");
        private static final javax.xml.namespace.QName TITLE$4 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Title");
        private static final javax.xml.namespace.QName SUBTITLE$6 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Subtitle");
        private static final javax.xml.namespace.QName NAMEABBREVIATION$8 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "NameAbbreviation");
        private static final javax.xml.namespace.QName PUBLISHEDIN$10 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PublishedIn");
        private static final javax.xml.namespace.QName PARTOF$12 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PartOf");
        private static final javax.xml.namespace.QName PUBLICATIONDATE$14 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PublicationDate");
        private static final javax.xml.namespace.QName NUMBER$16 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Number");
        private static final javax.xml.namespace.QName VOLUME$18 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Volume");
        private static final javax.xml.namespace.QName ISSUE$20 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Issue");
        private static final javax.xml.namespace.QName EDITION$22 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Edition");
        private static final javax.xml.namespace.QName STARTPAGE$24 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "StartPage");
        private static final javax.xml.namespace.QName ENDPAGE$26 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "EndPage");
        private static final javax.xml.namespace.QName DOI$28 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "DOI");
        private static final javax.xml.namespace.QName HANDLE$30 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Handle");
        private static final javax.xml.namespace.QName PMCID$32 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PMCID");
        private static final javax.xml.namespace.QName ISINUMBER$34 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ISI-Number");
        private static final javax.xml.namespace.QName SCPNUMBER$36 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "SCP-Number");
        private static final javax.xml.namespace.QName ISSN$38 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ISSN");
        private static final javax.xml.namespace.QName ISBN$40 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ISBN");
        private static final javax.xml.namespace.QName URL$42 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "URL");
        private static final javax.xml.namespace.QName URN$44 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "URN");
        private static final javax.xml.namespace.QName ZDBID$46 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ZDB-ID");
        private static final javax.xml.namespace.QName AUTHORS$48 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Authors");
        private static final javax.xml.namespace.QName EDITORS$50 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Editors");
        private static final javax.xml.namespace.QName PUBLISHERS$52 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Publishers");
        private static final javax.xml.namespace.QName LICENSE$54 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "License");
        private static final javax.xml.namespace.QName SUBJECT$56 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Subject");
        private static final javax.xml.namespace.QName KEYWORD$58 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Keyword");
        private static final javax.xml.namespace.QName ABSTRACT$60 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Abstract");
        private static final javax.xml.namespace.QName STATUS$62 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Status");
        private static final javax.xml.namespace.QName ORIGINATESFROM$64 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OriginatesFrom");
        private static final javax.xml.namespace.QName PRESENTEDAT$66 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PresentedAt");
        private static final javax.xml.namespace.QName OUTPUTFROM$68 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OutputFrom");
        private static final javax.xml.namespace.QName COVERAGE$70 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Coverage");
        private static final javax.xml.namespace.QName REFERENCES$72 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "References");
        private static final javax.xml.namespace.QName ACCESS$74 = 
            new javax.xml.namespace.QName("http://purl.org/coar/access_right", "Access");
        private static final javax.xml.namespace.QName CLASSIFICATION$76 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Classification");
        private static final javax.xml.namespace.QName LINK$78 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Link");
        
        
        /**
         * Gets the "Type" element
         */
        public eu.openaire.cerifProfile.vocab.coarPublicationTypes.TypeDocument.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.vocab.coarPublicationTypes.TypeDocument.Type target = null;
                target = (eu.openaire.cerifProfile.vocab.coarPublicationTypes.TypeDocument.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Type" element
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPE$0) != 0;
            }
        }
        
        /**
         * Sets the "Type" element
         */
        public void setType(eu.openaire.cerifProfile.vocab.coarPublicationTypes.TypeDocument.Type type)
        {
            generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Type" element
         */
        public eu.openaire.cerifProfile.vocab.coarPublicationTypes.TypeDocument.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.vocab.coarPublicationTypes.TypeDocument.Type target = null;
                target = (eu.openaire.cerifProfile.vocab.coarPublicationTypes.TypeDocument.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Type" element
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPE$0, 0);
            }
        }
        
        /**
         * Gets the "Language" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(LANGUAGE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Language" element
         */
        public boolean isSetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LANGUAGE$2) != 0;
            }
        }
        
        /**
         * Sets the "Language" element
         */
        public void setLanguage(eu.openaire.cerifProfile.x11.CfStringType language)
        {
            generatedSetterHelperImpl(language, LANGUAGE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Language" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(LANGUAGE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Language" element
         */
        public void unsetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LANGUAGE$2, 0);
            }
        }
        
        /**
         * Gets array of all "Title" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TITLE$4, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Title" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType getTitleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(TITLE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Title" element
         */
        public int sizeOfTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$4);
            }
        }
        
        /**
         * Sets array of all "Title" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTitleArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] titleArray)
        {
            check_orphaned();
            arraySetterHelper(titleArray, TITLE$4);
        }
        
        /**
         * Sets ith "Title" element
         */
        public void setTitleArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType title)
        {
            generatedSetterHelperImpl(title, TITLE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Title" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewTitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(TITLE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Title" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType addNewTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(TITLE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Title" element
         */
        public void removeTitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$4, i);
            }
        }
        
        /**
         * Gets array of all "Subtitle" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getSubtitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBTITLE$6, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Subtitle" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType getSubtitleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(SUBTITLE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Subtitle" element
         */
        public int sizeOfSubtitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBTITLE$6);
            }
        }
        
        /**
         * Sets array of all "Subtitle" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSubtitleArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] subtitleArray)
        {
            check_orphaned();
            arraySetterHelper(subtitleArray, SUBTITLE$6);
        }
        
        /**
         * Sets ith "Subtitle" element
         */
        public void setSubtitleArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType subtitle)
        {
            generatedSetterHelperImpl(subtitle, SUBTITLE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Subtitle" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewSubtitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(SUBTITLE$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Subtitle" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType addNewSubtitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(SUBTITLE$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "Subtitle" element
         */
        public void removeSubtitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBTITLE$6, i);
            }
        }
        
        /**
         * Gets array of all "NameAbbreviation" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getNameAbbreviationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAMEABBREVIATION$8, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "NameAbbreviation" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType getNameAbbreviationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(NAMEABBREVIATION$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "NameAbbreviation" element
         */
        public int sizeOfNameAbbreviationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAMEABBREVIATION$8);
            }
        }
        
        /**
         * Sets array of all "NameAbbreviation" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNameAbbreviationArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] nameAbbreviationArray)
        {
            check_orphaned();
            arraySetterHelper(nameAbbreviationArray, NAMEABBREVIATION$8);
        }
        
        /**
         * Sets ith "NameAbbreviation" element
         */
        public void setNameAbbreviationArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType nameAbbreviation)
        {
            generatedSetterHelperImpl(nameAbbreviation, NAMEABBREVIATION$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "NameAbbreviation" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewNameAbbreviation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(NAMEABBREVIATION$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "NameAbbreviation" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType addNewNameAbbreviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(NAMEABBREVIATION$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "NameAbbreviation" element
         */
        public void removeNameAbbreviation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAMEABBREVIATION$8, i);
            }
        }
        
        /**
         * Gets the "PublishedIn" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn getPublishedIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn)get_store().find_element_user(PUBLISHEDIN$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PublishedIn" element
         */
        public boolean isSetPublishedIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUBLISHEDIN$10) != 0;
            }
        }
        
        /**
         * Sets the "PublishedIn" element
         */
        public void setPublishedIn(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn publishedIn)
        {
            generatedSetterHelperImpl(publishedIn, PUBLISHEDIN$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "PublishedIn" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn addNewPublishedIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn)get_store().add_element_user(PUBLISHEDIN$10);
                return target;
            }
        }
        
        /**
         * Unsets the "PublishedIn" element
         */
        public void unsetPublishedIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUBLISHEDIN$10, 0);
            }
        }
        
        /**
         * Gets the "PartOf" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf getPartOf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf)get_store().find_element_user(PARTOF$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PartOf" element
         */
        public boolean isSetPartOf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARTOF$12) != 0;
            }
        }
        
        /**
         * Sets the "PartOf" element
         */
        public void setPartOf(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf partOf)
        {
            generatedSetterHelperImpl(partOf, PARTOF$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "PartOf" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf addNewPartOf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf)get_store().add_element_user(PARTOF$12);
                return target;
            }
        }
        
        /**
         * Unsets the "PartOf" element
         */
        public void unsetPartOf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARTOF$12, 0);
            }
        }
        
        /**
         * Gets the "PublicationDate" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericDateTimeType getPublicationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericDateTimeType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeType)get_store().find_element_user(PUBLICATIONDATE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PublicationDate" element
         */
        public boolean isSetPublicationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUBLICATIONDATE$14) != 0;
            }
        }
        
        /**
         * Sets the "PublicationDate" element
         */
        public void setPublicationDate(eu.openaire.cerifProfile.x11.CfGenericDateTimeType publicationDate)
        {
            generatedSetterHelperImpl(publicationDate, PUBLICATIONDATE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "PublicationDate" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericDateTimeType addNewPublicationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericDateTimeType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeType)get_store().add_element_user(PUBLICATIONDATE$14);
                return target;
            }
        }
        
        /**
         * Unsets the "PublicationDate" element
         */
        public void unsetPublicationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUBLICATIONDATE$14, 0);
            }
        }
        
        /**
         * Gets the "Number" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(NUMBER$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Number" element
         */
        public boolean isSetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMBER$16) != 0;
            }
        }
        
        /**
         * Sets the "Number" element
         */
        public void setNumber(eu.openaire.cerifProfile.x11.CfStringType number)
        {
            generatedSetterHelperImpl(number, NUMBER$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Number" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(NUMBER$16);
                return target;
            }
        }
        
        /**
         * Unsets the "Number" element
         */
        public void unsetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMBER$16, 0);
            }
        }
        
        /**
         * Gets the "Volume" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(VOLUME$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Volume" element
         */
        public boolean isSetVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VOLUME$18) != 0;
            }
        }
        
        /**
         * Sets the "Volume" element
         */
        public void setVolume(eu.openaire.cerifProfile.x11.CfStringType volume)
        {
            generatedSetterHelperImpl(volume, VOLUME$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Volume" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(VOLUME$18);
                return target;
            }
        }
        
        /**
         * Unsets the "Volume" element
         */
        public void unsetVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VOLUME$18, 0);
            }
        }
        
        /**
         * Gets the "Issue" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getIssue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(ISSUE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Issue" element
         */
        public boolean isSetIssue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISSUE$20) != 0;
            }
        }
        
        /**
         * Sets the "Issue" element
         */
        public void setIssue(eu.openaire.cerifProfile.x11.CfStringType issue)
        {
            generatedSetterHelperImpl(issue, ISSUE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Issue" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewIssue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(ISSUE$20);
                return target;
            }
        }
        
        /**
         * Unsets the "Issue" element
         */
        public void unsetIssue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISSUE$20, 0);
            }
        }
        
        /**
         * Gets the "Edition" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getEdition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(EDITION$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Edition" element
         */
        public boolean isSetEdition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EDITION$22) != 0;
            }
        }
        
        /**
         * Sets the "Edition" element
         */
        public void setEdition(eu.openaire.cerifProfile.x11.CfStringType edition)
        {
            generatedSetterHelperImpl(edition, EDITION$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Edition" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewEdition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(EDITION$22);
                return target;
            }
        }
        
        /**
         * Unsets the "Edition" element
         */
        public void unsetEdition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EDITION$22, 0);
            }
        }
        
        /**
         * Gets the "StartPage" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getStartPage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(STARTPAGE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "StartPage" element
         */
        public boolean isSetStartPage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTPAGE$24) != 0;
            }
        }
        
        /**
         * Sets the "StartPage" element
         */
        public void setStartPage(eu.openaire.cerifProfile.x11.CfStringType startPage)
        {
            generatedSetterHelperImpl(startPage, STARTPAGE$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "StartPage" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewStartPage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(STARTPAGE$24);
                return target;
            }
        }
        
        /**
         * Unsets the "StartPage" element
         */
        public void unsetStartPage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTPAGE$24, 0);
            }
        }
        
        /**
         * Gets the "EndPage" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getEndPage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(ENDPAGE$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "EndPage" element
         */
        public boolean isSetEndPage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDPAGE$26) != 0;
            }
        }
        
        /**
         * Sets the "EndPage" element
         */
        public void setEndPage(eu.openaire.cerifProfile.x11.CfStringType endPage)
        {
            generatedSetterHelperImpl(endPage, ENDPAGE$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "EndPage" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewEndPage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(ENDPAGE$26);
                return target;
            }
        }
        
        /**
         * Unsets the "EndPage" element
         */
        public void unsetEndPage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDPAGE$26, 0);
            }
        }
        
        /**
         * Gets the "DOI" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI getDOI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI)get_store().find_element_user(DOI$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DOI" element
         */
        public boolean isSetDOI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOI$28) != 0;
            }
        }
        
        /**
         * Sets the "DOI" element
         */
        public void setDOI(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI doi)
        {
            generatedSetterHelperImpl(doi, DOI$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DOI" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI addNewDOI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI)get_store().add_element_user(DOI$28);
                return target;
            }
        }
        
        /**
         * Unsets the "DOI" element
         */
        public void unsetDOI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOI$28, 0);
            }
        }
        
        /**
         * Gets the "Handle" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getHandle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(HANDLE$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Handle" element
         */
        public boolean isSetHandle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HANDLE$30) != 0;
            }
        }
        
        /**
         * Sets the "Handle" element
         */
        public void setHandle(eu.openaire.cerifProfile.x11.CfStringType handle)
        {
            generatedSetterHelperImpl(handle, HANDLE$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Handle" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewHandle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(HANDLE$30);
                return target;
            }
        }
        
        /**
         * Unsets the "Handle" element
         */
        public void unsetHandle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HANDLE$30, 0);
            }
        }
        
        /**
         * Gets the "PMCID" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getPMCID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(PMCID$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PMCID" element
         */
        public boolean isSetPMCID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PMCID$32) != 0;
            }
        }
        
        /**
         * Sets the "PMCID" element
         */
        public void setPMCID(eu.openaire.cerifProfile.x11.CfStringType pmcid)
        {
            generatedSetterHelperImpl(pmcid, PMCID$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "PMCID" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewPMCID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(PMCID$32);
                return target;
            }
        }
        
        /**
         * Unsets the "PMCID" element
         */
        public void unsetPMCID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PMCID$32, 0);
            }
        }
        
        /**
         * Gets the "ISI-Number" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getISINumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(ISINUMBER$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ISI-Number" element
         */
        public boolean isSetISINumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISINUMBER$34) != 0;
            }
        }
        
        /**
         * Sets the "ISI-Number" element
         */
        public void setISINumber(eu.openaire.cerifProfile.x11.CfStringType isiNumber)
        {
            generatedSetterHelperImpl(isiNumber, ISINUMBER$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ISI-Number" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewISINumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(ISINUMBER$34);
                return target;
            }
        }
        
        /**
         * Unsets the "ISI-Number" element
         */
        public void unsetISINumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISINUMBER$34, 0);
            }
        }
        
        /**
         * Gets the "SCP-Number" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getSCPNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(SCPNUMBER$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SCP-Number" element
         */
        public boolean isSetSCPNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCPNUMBER$36) != 0;
            }
        }
        
        /**
         * Sets the "SCP-Number" element
         */
        public void setSCPNumber(eu.openaire.cerifProfile.x11.CfStringType scpNumber)
        {
            generatedSetterHelperImpl(scpNumber, SCPNUMBER$36, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "SCP-Number" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewSCPNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(SCPNUMBER$36);
                return target;
            }
        }
        
        /**
         * Unsets the "SCP-Number" element
         */
        public void unsetSCPNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCPNUMBER$36, 0);
            }
        }
        
        /**
         * Gets array of all "ISSN" elements
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN[] getISSNArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ISSN$38, targetList);
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN[] result = new eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ISSN" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN getISSNArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN)get_store().find_element_user(ISSN$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ISSN" element
         */
        public int sizeOfISSNArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISSN$38);
            }
        }
        
        /**
         * Sets array of all "ISSN" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setISSNArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN[] issnArray)
        {
            check_orphaned();
            arraySetterHelper(issnArray, ISSN$38);
        }
        
        /**
         * Sets ith "ISSN" element
         */
        public void setISSNArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN issn)
        {
            generatedSetterHelperImpl(issn, ISSN$38, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ISSN" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN insertNewISSN(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN)get_store().insert_element_user(ISSN$38, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ISSN" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN addNewISSN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN)get_store().add_element_user(ISSN$38);
                return target;
            }
        }
        
        /**
         * Removes the ith "ISSN" element
         */
        public void removeISSN(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISSN$38, i);
            }
        }
        
        /**
         * Gets array of all "ISBN" elements
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN[] getISBNArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ISBN$40, targetList);
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN[] result = new eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ISBN" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN getISBNArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN)get_store().find_element_user(ISBN$40, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ISBN" element
         */
        public int sizeOfISBNArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISBN$40);
            }
        }
        
        /**
         * Sets array of all "ISBN" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setISBNArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN[] isbnArray)
        {
            check_orphaned();
            arraySetterHelper(isbnArray, ISBN$40);
        }
        
        /**
         * Sets ith "ISBN" element
         */
        public void setISBNArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN isbn)
        {
            generatedSetterHelperImpl(isbn, ISBN$40, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ISBN" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN insertNewISBN(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN)get_store().insert_element_user(ISBN$40, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ISBN" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN addNewISBN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN)get_store().add_element_user(ISBN$40);
                return target;
            }
        }
        
        /**
         * Removes the ith "ISBN" element
         */
        public void removeISBN(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISBN$40, i);
            }
        }
        
        /**
         * Gets the "URL" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(URL$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "URL" element
         */
        public boolean isSetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(URL$42) != 0;
            }
        }
        
        /**
         * Sets the "URL" element
         */
        public void setURL(eu.openaire.cerifProfile.x11.CfStringType url)
        {
            generatedSetterHelperImpl(url, URL$42, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "URL" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(URL$42);
                return target;
            }
        }
        
        /**
         * Unsets the "URL" element
         */
        public void unsetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(URL$42, 0);
            }
        }
        
        /**
         * Gets the "URN" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getURN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(URN$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "URN" element
         */
        public boolean isSetURN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(URN$44) != 0;
            }
        }
        
        /**
         * Sets the "URN" element
         */
        public void setURN(eu.openaire.cerifProfile.x11.CfStringType urn)
        {
            generatedSetterHelperImpl(urn, URN$44, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "URN" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewURN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(URN$44);
                return target;
            }
        }
        
        /**
         * Unsets the "URN" element
         */
        public void unsetURN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(URN$44, 0);
            }
        }
        
        /**
         * Gets the "ZDB-ID" element
         */
        public eu.openaire.cerifProfile.x11.ZDBIDType getZDBID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ZDBIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ZDBIDType)get_store().find_element_user(ZDBID$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ZDB-ID" element
         */
        public boolean isSetZDBID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZDBID$46) != 0;
            }
        }
        
        /**
         * Sets the "ZDB-ID" element
         */
        public void setZDBID(eu.openaire.cerifProfile.x11.ZDBIDType zdbid)
        {
            generatedSetterHelperImpl(zdbid, ZDBID$46, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ZDB-ID" element
         */
        public eu.openaire.cerifProfile.x11.ZDBIDType addNewZDBID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ZDBIDType target = null;
                target = (eu.openaire.cerifProfile.x11.ZDBIDType)get_store().add_element_user(ZDBID$46);
                return target;
            }
        }
        
        /**
         * Unsets the "ZDB-ID" element
         */
        public void unsetZDBID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZDBID$46, 0);
            }
        }
        
        /**
         * Gets the "Authors" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors getAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors)get_store().find_element_user(AUTHORS$48, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Authors" element
         */
        public boolean isSetAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AUTHORS$48) != 0;
            }
        }
        
        /**
         * Sets the "Authors" element
         */
        public void setAuthors(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors authors)
        {
            generatedSetterHelperImpl(authors, AUTHORS$48, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Authors" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors addNewAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors)get_store().add_element_user(AUTHORS$48);
                return target;
            }
        }
        
        /**
         * Unsets the "Authors" element
         */
        public void unsetAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AUTHORS$48, 0);
            }
        }
        
        /**
         * Gets the "Editors" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors getEditors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors)get_store().find_element_user(EDITORS$50, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Editors" element
         */
        public boolean isSetEditors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EDITORS$50) != 0;
            }
        }
        
        /**
         * Sets the "Editors" element
         */
        public void setEditors(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors editors)
        {
            generatedSetterHelperImpl(editors, EDITORS$50, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Editors" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors addNewEditors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors)get_store().add_element_user(EDITORS$50);
                return target;
            }
        }
        
        /**
         * Unsets the "Editors" element
         */
        public void unsetEditors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EDITORS$50, 0);
            }
        }
        
        /**
         * Gets the "Publishers" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers getPublishers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers)get_store().find_element_user(PUBLISHERS$52, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Publishers" element
         */
        public boolean isSetPublishers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUBLISHERS$52) != 0;
            }
        }
        
        /**
         * Sets the "Publishers" element
         */
        public void setPublishers(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers publishers)
        {
            generatedSetterHelperImpl(publishers, PUBLISHERS$52, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Publishers" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers addNewPublishers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers)get_store().add_element_user(PUBLISHERS$52);
                return target;
            }
        }
        
        /**
         * Unsets the "Publishers" element
         */
        public void unsetPublishers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUBLISHERS$52, 0);
            }
        }
        
        /**
         * Gets array of all "License" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getLicenseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LICENSE$54, targetList);
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] result = new eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "License" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getLicenseArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(LICENSE$54, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "License" element
         */
        public int sizeOfLicenseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LICENSE$54);
            }
        }
        
        /**
         * Sets array of all "License" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLicenseArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] licenseArray)
        {
            check_orphaned();
            arraySetterHelper(licenseArray, LICENSE$54);
        }
        
        /**
         * Sets ith "License" element
         */
        public void setLicenseArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType license)
        {
            generatedSetterHelperImpl(license, LICENSE$54, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "License" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewLicense(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(LICENSE$54, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "License" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewLicense()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(LICENSE$54);
                return target;
            }
        }
        
        /**
         * Removes the ith "License" element
         */
        public void removeLicense(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LICENSE$54, i);
            }
        }
        
        /**
         * Gets array of all "Subject" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getSubjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBJECT$56, targetList);
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] result = new eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Subject" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getSubjectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(SUBJECT$56, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Subject" element
         */
        public int sizeOfSubjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBJECT$56);
            }
        }
        
        /**
         * Sets array of all "Subject" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSubjectArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] subjectArray)
        {
            check_orphaned();
            arraySetterHelper(subjectArray, SUBJECT$56);
        }
        
        /**
         * Sets ith "Subject" element
         */
        public void setSubjectArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType subject)
        {
            generatedSetterHelperImpl(subject, SUBJECT$56, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Subject" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewSubject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(SUBJECT$56, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Subject" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(SUBJECT$56);
                return target;
            }
        }
        
        /**
         * Removes the ith "Subject" element
         */
        public void removeSubject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBJECT$56, i);
            }
        }
        
        /**
         * Gets array of all "Keyword" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getKeywordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYWORD$58, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Keyword" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType getKeywordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(KEYWORD$58, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Keyword" element
         */
        public int sizeOfKeywordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYWORD$58);
            }
        }
        
        /**
         * Sets array of all "Keyword" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setKeywordArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] keywordArray)
        {
            check_orphaned();
            arraySetterHelper(keywordArray, KEYWORD$58);
        }
        
        /**
         * Sets ith "Keyword" element
         */
        public void setKeywordArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType keyword)
        {
            generatedSetterHelperImpl(keyword, KEYWORD$58, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Keyword" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewKeyword(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(KEYWORD$58, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Keyword" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType addNewKeyword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(KEYWORD$58);
                return target;
            }
        }
        
        /**
         * Removes the ith "Keyword" element
         */
        public void removeKeyword(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYWORD$58, i);
            }
        }
        
        /**
         * Gets array of all "Abstract" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getAbstractArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ABSTRACT$60, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Abstract" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType getAbstractArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(ABSTRACT$60, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Abstract" element
         */
        public int sizeOfAbstractArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ABSTRACT$60);
            }
        }
        
        /**
         * Sets array of all "Abstract" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAbstractArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] xabstractArray)
        {
            check_orphaned();
            arraySetterHelper(xabstractArray, ABSTRACT$60);
        }
        
        /**
         * Sets ith "Abstract" element
         */
        public void setAbstractArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType xabstract)
        {
            generatedSetterHelperImpl(xabstract, ABSTRACT$60, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Abstract" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewAbstract(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(ABSTRACT$60, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Abstract" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType addNewAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(ABSTRACT$60);
                return target;
            }
        }
        
        /**
         * Removes the ith "Abstract" element
         */
        public void removeAbstract(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ABSTRACT$60, i);
            }
        }
        
        /**
         * Gets array of all "Status" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STATUS$62, targetList);
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] result = new eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Status" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getStatusArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(STATUS$62, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Status" element
         */
        public int sizeOfStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUS$62);
            }
        }
        
        /**
         * Sets array of all "Status" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setStatusArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] statusArray)
        {
            check_orphaned();
            arraySetterHelper(statusArray, STATUS$62);
        }
        
        /**
         * Sets ith "Status" element
         */
        public void setStatusArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType status)
        {
            generatedSetterHelperImpl(status, STATUS$62, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Status" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(STATUS$62, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Status" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(STATUS$62);
                return target;
            }
        }
        
        /**
         * Removes the ith "Status" element
         */
        public void removeStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUS$62, i);
            }
        }
        
        /**
         * Gets array of all "OriginatesFrom" elements
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom[] getOriginatesFromArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORIGINATESFROM$64, targetList);
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom[] result = new eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OriginatesFrom" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom getOriginatesFromArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom)get_store().find_element_user(ORIGINATESFROM$64, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "OriginatesFrom" element
         */
        public int sizeOfOriginatesFromArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORIGINATESFROM$64);
            }
        }
        
        /**
         * Sets array of all "OriginatesFrom" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOriginatesFromArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom[] originatesFromArray)
        {
            check_orphaned();
            arraySetterHelper(originatesFromArray, ORIGINATESFROM$64);
        }
        
        /**
         * Sets ith "OriginatesFrom" element
         */
        public void setOriginatesFromArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom originatesFrom)
        {
            generatedSetterHelperImpl(originatesFrom, ORIGINATESFROM$64, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OriginatesFrom" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom insertNewOriginatesFrom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom)get_store().insert_element_user(ORIGINATESFROM$64, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OriginatesFrom" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom addNewOriginatesFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom)get_store().add_element_user(ORIGINATESFROM$64);
                return target;
            }
        }
        
        /**
         * Removes the ith "OriginatesFrom" element
         */
        public void removeOriginatesFrom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORIGINATESFROM$64, i);
            }
        }
        
        /**
         * Gets array of all "PresentedAt" elements
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt[] getPresentedAtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PRESENTEDAT$66, targetList);
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt[] result = new eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PresentedAt" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt getPresentedAtArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt)get_store().find_element_user(PRESENTEDAT$66, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PresentedAt" element
         */
        public int sizeOfPresentedAtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRESENTEDAT$66);
            }
        }
        
        /**
         * Sets array of all "PresentedAt" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPresentedAtArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt[] presentedAtArray)
        {
            check_orphaned();
            arraySetterHelper(presentedAtArray, PRESENTEDAT$66);
        }
        
        /**
         * Sets ith "PresentedAt" element
         */
        public void setPresentedAtArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt presentedAt)
        {
            generatedSetterHelperImpl(presentedAt, PRESENTEDAT$66, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PresentedAt" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt insertNewPresentedAt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt)get_store().insert_element_user(PRESENTEDAT$66, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PresentedAt" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt addNewPresentedAt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt)get_store().add_element_user(PRESENTEDAT$66);
                return target;
            }
        }
        
        /**
         * Removes the ith "PresentedAt" element
         */
        public void removePresentedAt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRESENTEDAT$66, i);
            }
        }
        
        /**
         * Gets array of all "OutputFrom" elements
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom[] getOutputFromArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUTPUTFROM$68, targetList);
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom[] result = new eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OutputFrom" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom getOutputFromArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom)get_store().find_element_user(OUTPUTFROM$68, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "OutputFrom" element
         */
        public int sizeOfOutputFromArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUTPUTFROM$68);
            }
        }
        
        /**
         * Sets array of all "OutputFrom" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOutputFromArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom[] outputFromArray)
        {
            check_orphaned();
            arraySetterHelper(outputFromArray, OUTPUTFROM$68);
        }
        
        /**
         * Sets ith "OutputFrom" element
         */
        public void setOutputFromArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom outputFrom)
        {
            generatedSetterHelperImpl(outputFrom, OUTPUTFROM$68, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OutputFrom" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom insertNewOutputFrom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom)get_store().insert_element_user(OUTPUTFROM$68, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OutputFrom" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom addNewOutputFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom)get_store().add_element_user(OUTPUTFROM$68);
                return target;
            }
        }
        
        /**
         * Removes the ith "OutputFrom" element
         */
        public void removeOutputFrom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUTPUTFROM$68, i);
            }
        }
        
        /**
         * Gets array of all "Coverage" elements
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage[] getCoverageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COVERAGE$70, targetList);
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage[] result = new eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Coverage" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage getCoverageArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage)get_store().find_element_user(COVERAGE$70, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Coverage" element
         */
        public int sizeOfCoverageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COVERAGE$70);
            }
        }
        
        /**
         * Sets array of all "Coverage" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCoverageArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage[] coverageArray)
        {
            check_orphaned();
            arraySetterHelper(coverageArray, COVERAGE$70);
        }
        
        /**
         * Sets ith "Coverage" element
         */
        public void setCoverageArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage coverage)
        {
            generatedSetterHelperImpl(coverage, COVERAGE$70, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Coverage" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage insertNewCoverage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage)get_store().insert_element_user(COVERAGE$70, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Coverage" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage addNewCoverage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage)get_store().add_element_user(COVERAGE$70);
                return target;
            }
        }
        
        /**
         * Removes the ith "Coverage" element
         */
        public void removeCoverage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COVERAGE$70, i);
            }
        }
        
        /**
         * Gets array of all "References" elements
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References[] getReferencesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REFERENCES$72, targetList);
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References[] result = new eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "References" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References getReferencesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References)get_store().find_element_user(REFERENCES$72, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "References" element
         */
        public int sizeOfReferencesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFERENCES$72);
            }
        }
        
        /**
         * Sets array of all "References" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setReferencesArray(eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References[] referencesArray)
        {
            check_orphaned();
            arraySetterHelper(referencesArray, REFERENCES$72);
        }
        
        /**
         * Sets ith "References" element
         */
        public void setReferencesArray(int i, eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References references)
        {
            generatedSetterHelperImpl(references, REFERENCES$72, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "References" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References insertNewReferences(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References)get_store().insert_element_user(REFERENCES$72, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "References" element
         */
        public eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References addNewReferences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References target = null;
                target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References)get_store().add_element_user(REFERENCES$72);
                return target;
            }
        }
        
        /**
         * Removes the ith "References" element
         */
        public void removeReferences(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFERENCES$72, i);
            }
        }
        
        /**
         * Gets the "Access" element
         */
        public org.purl.coar.accessRight.AccessDocument.Access getAccess()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.purl.coar.accessRight.AccessDocument.Access target = null;
                target = (org.purl.coar.accessRight.AccessDocument.Access)get_store().find_element_user(ACCESS$74, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Access" element
         */
        public boolean isSetAccess()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACCESS$74) != 0;
            }
        }
        
        /**
         * Sets the "Access" element
         */
        public void setAccess(org.purl.coar.accessRight.AccessDocument.Access access)
        {
            generatedSetterHelperImpl(access, ACCESS$74, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Access" element
         */
        public org.purl.coar.accessRight.AccessDocument.Access addNewAccess()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.purl.coar.accessRight.AccessDocument.Access target = null;
                target = (org.purl.coar.accessRight.AccessDocument.Access)get_store().add_element_user(ACCESS$74);
                return target;
            }
        }
        
        /**
         * Unsets the "Access" element
         */
        public void unsetAccess()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACCESS$74, 0);
            }
        }
        
        /**
         * Gets array of all "Classification" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CLASSIFICATION$76, targetList);
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] result = new eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Classification" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getClassificationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(CLASSIFICATION$76, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Classification" element
         */
        public int sizeOfClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASSIFICATION$76);
            }
        }
        
        /**
         * Sets array of all "Classification" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setClassificationArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] classificationArray)
        {
            check_orphaned();
            arraySetterHelper(classificationArray, CLASSIFICATION$76);
        }
        
        /**
         * Sets ith "Classification" element
         */
        public void setClassificationArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType classification)
        {
            generatedSetterHelperImpl(classification, CLASSIFICATION$76, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Classification" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(CLASSIFICATION$76, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Classification" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(CLASSIFICATION$76);
                return target;
            }
        }
        
        /**
         * Removes the ith "Classification" element
         */
        public void removeClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASSIFICATION$76, i);
            }
        }
        
        /**
         * Gets array of all "Link" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericLinkType[] getLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINK$78, targetList);
                eu.openaire.cerifProfile.x11.CfGenericLinkType[] result = new eu.openaire.cerifProfile.x11.CfGenericLinkType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Link" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericLinkType getLinkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericLinkType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().find_element_user(LINK$78, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Link" element
         */
        public int sizeOfLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINK$78);
            }
        }
        
        /**
         * Sets array of all "Link" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLinkArray(eu.openaire.cerifProfile.x11.CfGenericLinkType[] linkArray)
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$78);
        }
        
        /**
         * Sets ith "Link" element
         */
        public void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfGenericLinkType link)
        {
            generatedSetterHelperImpl(link, LINK$78, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Link" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericLinkType insertNewLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericLinkType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().insert_element_user(LINK$78, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Link" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericLinkType addNewLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericLinkType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().add_element_user(LINK$78);
                return target;
            }
        }
        
        /**
         * Removes the ith "Link" element
         */
        public void removeLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINK$78, i);
            }
        }
        /**
         * An XML PublishedIn(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class PublishedInImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PublishedIn
        {
            private static final long serialVersionUID = 1L;
            
            public PublishedInImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBLICATION$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Publication");
            
            
            /**
             * Gets the "Publication" element
             */
            public eu.openaire.cerifProfile.x11.PublicationDocument.Publication getPublication()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.PublicationDocument.Publication target = null;
                    target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication)get_store().find_element_user(PUBLICATION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Publication" element
             */
            public void setPublication(eu.openaire.cerifProfile.x11.PublicationDocument.Publication publication)
            {
                generatedSetterHelperImpl(publication, PUBLICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Publication" element
             */
            public eu.openaire.cerifProfile.x11.PublicationDocument.Publication addNewPublication()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.PublicationDocument.Publication target = null;
                    target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication)get_store().add_element_user(PUBLICATION$0);
                    return target;
                }
            }
        }
        /**
         * An XML PartOf(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class PartOfImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkWithDisplayNameBaseTypeImpl implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PartOf
        {
            private static final long serialVersionUID = 1L;
            
            public PartOfImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBLICATION$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Publication");
            
            
            /**
             * Gets the "Publication" element
             */
            public eu.openaire.cerifProfile.x11.PublicationDocument.Publication getPublication()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.PublicationDocument.Publication target = null;
                    target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication)get_store().find_element_user(PUBLICATION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Publication" element
             */
            public void setPublication(eu.openaire.cerifProfile.x11.PublicationDocument.Publication publication)
            {
                generatedSetterHelperImpl(publication, PUBLICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Publication" element
             */
            public eu.openaire.cerifProfile.x11.PublicationDocument.Publication addNewPublication()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.PublicationDocument.Publication target = null;
                    target = (eu.openaire.cerifProfile.x11.PublicationDocument.Publication)get_store().add_element_user(PUBLICATION$0);
                    return target;
                }
            }
        }
        /**
         * An XML DOI(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is an atomic type that is a restriction of eu.openaire.cerifProfile.x11.PublicationDocument$Publication$DOI.
         */
        public static class DOIImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication.DOI
        {
            private static final long serialVersionUID = 1L;
            
            public DOIImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected DOIImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            
        }
        /**
         * An XML ISSN(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is an atomic type that is a restriction of eu.openaire.cerifProfile.x11.PublicationDocument$Publication$ISSN.
         */
        public static class ISSNImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISSN
        {
            private static final long serialVersionUID = 1L;
            
            public ISSNImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected ISSNImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName MEDIUM$0 = 
                new javax.xml.namespace.QName("", "medium");
            
            
            /**
             * Gets the "medium" attribute
             */
            public org.issn.vocabularies.medium.EnumType.Enum getMedium()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIUM$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.issn.vocabularies.medium.EnumType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "medium" attribute
             */
            public org.issn.vocabularies.medium.EnumType xgetMedium()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.issn.vocabularies.medium.EnumType target = null;
                    target = (org.issn.vocabularies.medium.EnumType)get_store().find_attribute_user(MEDIUM$0);
                    return target;
                }
            }
            
            /**
             * True if has "medium" attribute
             */
            public boolean isSetMedium()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(MEDIUM$0) != null;
                }
            }
            
            /**
             * Sets the "medium" attribute
             */
            public void setMedium(org.issn.vocabularies.medium.EnumType.Enum medium)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIUM$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIUM$0);
                    }
                    target.setEnumValue(medium);
                }
            }
            
            /**
             * Sets (as xml) the "medium" attribute
             */
            public void xsetMedium(org.issn.vocabularies.medium.EnumType medium)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.issn.vocabularies.medium.EnumType target = null;
                    target = (org.issn.vocabularies.medium.EnumType)get_store().find_attribute_user(MEDIUM$0);
                    if (target == null)
                    {
                      target = (org.issn.vocabularies.medium.EnumType)get_store().add_attribute_user(MEDIUM$0);
                    }
                    target.set(medium);
                }
            }
            
            /**
             * Unsets the "medium" attribute
             */
            public void unsetMedium()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(MEDIUM$0);
                }
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
        public static class ISBNImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication.ISBN, eu.openaire.cerifProfile.x11.ISBN13SimpleType, eu.openaire.cerifProfile.x11.ISBN10SimpleType
        {
            private static final long serialVersionUID = 1L;
            
            public ISBNImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected ISBNImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName MEDIUM$0 = 
                new javax.xml.namespace.QName("", "medium");
            
            
            /**
             * Gets the "medium" attribute
             */
            public org.issn.vocabularies.medium.EnumType.Enum getMedium()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIUM$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.issn.vocabularies.medium.EnumType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "medium" attribute
             */
            public org.issn.vocabularies.medium.EnumType xgetMedium()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.issn.vocabularies.medium.EnumType target = null;
                    target = (org.issn.vocabularies.medium.EnumType)get_store().find_attribute_user(MEDIUM$0);
                    return target;
                }
            }
            
            /**
             * True if has "medium" attribute
             */
            public boolean isSetMedium()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(MEDIUM$0) != null;
                }
            }
            
            /**
             * Sets the "medium" attribute
             */
            public void setMedium(org.issn.vocabularies.medium.EnumType.Enum medium)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIUM$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIUM$0);
                    }
                    target.setEnumValue(medium);
                }
            }
            
            /**
             * Sets (as xml) the "medium" attribute
             */
            public void xsetMedium(org.issn.vocabularies.medium.EnumType medium)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.issn.vocabularies.medium.EnumType target = null;
                    target = (org.issn.vocabularies.medium.EnumType)get_store().find_attribute_user(MEDIUM$0);
                    if (target == null)
                    {
                      target = (org.issn.vocabularies.medium.EnumType)get_store().add_attribute_user(MEDIUM$0);
                    }
                    target.set(medium);
                }
            }
            
            /**
             * Unsets the "medium" attribute
             */
            public void unsetMedium()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(MEDIUM$0);
                }
            }
        }
        /**
         * An XML Authors(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class AuthorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Authors
        {
            private static final long serialVersionUID = 1L;
            
            public AuthorsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AUTHOR$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Author");
            
            
            /**
             * Gets array of all "Author" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] getAuthorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(AUTHOR$0, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Author" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType getAuthorArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType)get_store().find_element_user(AUTHOR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Author" element
             */
            public int sizeOfAuthorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AUTHOR$0);
                }
            }
            
            /**
             * Sets array of all "Author" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setAuthorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] authorArray)
            {
                check_orphaned();
                arraySetterHelper(authorArray, AUTHOR$0);
            }
            
            /**
             * Sets ith "Author" element
             */
            public void setAuthorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType author)
            {
                generatedSetterHelperImpl(author, AUTHOR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Author" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType insertNewAuthor(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType)get_store().insert_element_user(AUTHOR$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Author" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType addNewAuthor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType)get_store().add_element_user(AUTHOR$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Author" element
             */
            public void removeAuthor(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AUTHOR$0, i);
                }
            }
        }
        /**
         * An XML Editors(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class EditorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Editors
        {
            private static final long serialVersionUID = 1L;
            
            public EditorsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EDITOR$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Editor");
            
            
            /**
             * Gets array of all "Editor" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] getEditorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(EDITOR$0, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Editor" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType getEditorArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType)get_store().find_element_user(EDITOR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Editor" element
             */
            public int sizeOfEditorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EDITOR$0);
                }
            }
            
            /**
             * Sets array of all "Editor" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setEditorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] editorArray)
            {
                check_orphaned();
                arraySetterHelper(editorArray, EDITOR$0);
            }
            
            /**
             * Sets ith "Editor" element
             */
            public void setEditorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType editor)
            {
                generatedSetterHelperImpl(editor, EDITOR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Editor" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType insertNewEditor(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType)get_store().insert_element_user(EDITOR$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Editor" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType addNewEditor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType)get_store().add_element_user(EDITOR$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Editor" element
             */
            public void removeEditor(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EDITOR$0, i);
                }
            }
        }
        /**
         * An XML Publishers(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class PublishersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Publishers
        {
            private static final long serialVersionUID = 1L;
            
            public PublishersImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBLISHER$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Publisher");
            
            
            /**
             * Gets array of all "Publisher" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getPublisherArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PUBLISHER$0, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Publisher" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getPublisherArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().find_element_user(PUBLISHER$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Publisher" element
             */
            public int sizeOfPublisherArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PUBLISHER$0);
                }
            }
            
            /**
             * Sets array of all "Publisher" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setPublisherArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] publisherArray)
            {
                check_orphaned();
                arraySetterHelper(publisherArray, PUBLISHER$0);
            }
            
            /**
             * Sets ith "Publisher" element
             */
            public void setPublisherArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType publisher)
            {
                generatedSetterHelperImpl(publisher, PUBLISHER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Publisher" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewPublisher(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().insert_element_user(PUBLISHER$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Publisher" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewPublisher()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().add_element_user(PUBLISHER$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Publisher" element
             */
            public void removePublisher(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PUBLISHER$0, i);
                }
            }
        }
        /**
         * An XML OriginatesFrom(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class OriginatesFromImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OriginatesFrom
        {
            private static final long serialVersionUID = 1L;
            
            public OriginatesFromImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PROJECTFUNDINGSUBSTITUTIONGROUPHEAD$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ProjectFunding__SubstitutionGroupHead");
            private static final org.apache.xmlbeans.QNameSet PROJECTFUNDINGSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ProjectFunding__SubstitutionGroupHead"),
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Project"),
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Funding"),
            });
            
            
            /**
             * Gets the "ProjectFunding__SubstitutionGroupHead" element
             */
            public eu.openaire.cerifProfile.x11.ProjectFundingBaseType getProjectFundingSubstitutionGroupHead()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ProjectFundingBaseType target = null;
                    target = (eu.openaire.cerifProfile.x11.ProjectFundingBaseType)get_store().find_element_user(PROJECTFUNDINGSUBSTITUTIONGROUPHEAD$1, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "ProjectFunding__SubstitutionGroupHead" element
             */
            public void setProjectFundingSubstitutionGroupHead(eu.openaire.cerifProfile.x11.ProjectFundingBaseType projectFundingSubstitutionGroupHead)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ProjectFundingBaseType target = null;
                    target = (eu.openaire.cerifProfile.x11.ProjectFundingBaseType)get_store().find_element_user(PROJECTFUNDINGSUBSTITUTIONGROUPHEAD$1, 0);
                    if (target == null)
                    {
                      target = (eu.openaire.cerifProfile.x11.ProjectFundingBaseType)get_store().add_element_user(PROJECTFUNDINGSUBSTITUTIONGROUPHEAD$0);
                    }
                    target.set(projectFundingSubstitutionGroupHead);
                }
            }
            
            /**
             * Appends and returns a new empty "ProjectFunding__SubstitutionGroupHead" element
             */
            public eu.openaire.cerifProfile.x11.ProjectFundingBaseType addNewProjectFundingSubstitutionGroupHead()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ProjectFundingBaseType target = null;
                    target = (eu.openaire.cerifProfile.x11.ProjectFundingBaseType)get_store().add_element_user(PROJECTFUNDINGSUBSTITUTIONGROUPHEAD$0);
                    return target;
                }
            }
        }
        /**
         * An XML PresentedAt(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class PresentedAtImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication.PresentedAt
        {
            private static final long serialVersionUID = 1L;
            
            public PresentedAtImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EVENT$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Event");
            
            
            /**
             * Gets the "Event" element
             */
            public eu.openaire.cerifProfile.x11.EventDocument.Event getEvent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.EventDocument.Event target = null;
                    target = (eu.openaire.cerifProfile.x11.EventDocument.Event)get_store().find_element_user(EVENT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Event" element
             */
            public void setEvent(eu.openaire.cerifProfile.x11.EventDocument.Event event)
            {
                generatedSetterHelperImpl(event, EVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Event" element
             */
            public eu.openaire.cerifProfile.x11.EventDocument.Event addNewEvent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.EventDocument.Event target = null;
                    target = (eu.openaire.cerifProfile.x11.EventDocument.Event)get_store().add_element_user(EVENT$0);
                    return target;
                }
            }
        }
        /**
         * An XML OutputFrom(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class OutputFromImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication.OutputFrom
        {
            private static final long serialVersionUID = 1L;
            
            public OutputFromImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EVENT$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Event");
            
            
            /**
             * Gets the "Event" element
             */
            public eu.openaire.cerifProfile.x11.EventDocument.Event getEvent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.EventDocument.Event target = null;
                    target = (eu.openaire.cerifProfile.x11.EventDocument.Event)get_store().find_element_user(EVENT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Event" element
             */
            public void setEvent(eu.openaire.cerifProfile.x11.EventDocument.Event event)
            {
                generatedSetterHelperImpl(event, EVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Event" element
             */
            public eu.openaire.cerifProfile.x11.EventDocument.Event addNewEvent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.EventDocument.Event target = null;
                    target = (eu.openaire.cerifProfile.x11.EventDocument.Event)get_store().add_element_user(EVENT$0);
                    return target;
                }
            }
        }
        /**
         * An XML Coverage(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class CoverageImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication.Coverage
        {
            private static final long serialVersionUID = 1L;
            
            public CoverageImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EVENT$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Event");
            
            
            /**
             * Gets the "Event" element
             */
            public eu.openaire.cerifProfile.x11.EventDocument.Event getEvent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.EventDocument.Event target = null;
                    target = (eu.openaire.cerifProfile.x11.EventDocument.Event)get_store().find_element_user(EVENT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Event" element
             */
            public void setEvent(eu.openaire.cerifProfile.x11.EventDocument.Event event)
            {
                generatedSetterHelperImpl(event, EVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Event" element
             */
            public eu.openaire.cerifProfile.x11.EventDocument.Event addNewEvent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.EventDocument.Event target = null;
                    target = (eu.openaire.cerifProfile.x11.EventDocument.Event)get_store().add_element_user(EVENT$0);
                    return target;
                }
            }
        }
        /**
         * An XML References(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class ReferencesImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.PublicationDocument.Publication.References
        {
            private static final long serialVersionUID = 1L;
            
            public ReferencesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RESEARCHOUTPUTSUBSTITUTIONGROUPHEAD$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ResearchOutput__SubstitutionGroupHead");
            private static final org.apache.xmlbeans.QNameSet RESEARCHOUTPUTSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Patent"),
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Publication"),
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Product"),
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ResearchOutput__SubstitutionGroupHead"),
            });
            
            
            /**
             * Gets the "ResearchOutput__SubstitutionGroupHead" element
             */
            public eu.openaire.cerifProfile.x11.ResearchOutputBaseType getResearchOutputSubstitutionGroupHead()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ResearchOutputBaseType target = null;
                    target = (eu.openaire.cerifProfile.x11.ResearchOutputBaseType)get_store().find_element_user(RESEARCHOUTPUTSUBSTITUTIONGROUPHEAD$1, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "ResearchOutput__SubstitutionGroupHead" element
             */
            public void setResearchOutputSubstitutionGroupHead(eu.openaire.cerifProfile.x11.ResearchOutputBaseType researchOutputSubstitutionGroupHead)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ResearchOutputBaseType target = null;
                    target = (eu.openaire.cerifProfile.x11.ResearchOutputBaseType)get_store().find_element_user(RESEARCHOUTPUTSUBSTITUTIONGROUPHEAD$1, 0);
                    if (target == null)
                    {
                      target = (eu.openaire.cerifProfile.x11.ResearchOutputBaseType)get_store().add_element_user(RESEARCHOUTPUTSUBSTITUTIONGROUPHEAD$0);
                    }
                    target.set(researchOutputSubstitutionGroupHead);
                }
            }
            
            /**
             * Appends and returns a new empty "ResearchOutput__SubstitutionGroupHead" element
             */
            public eu.openaire.cerifProfile.x11.ResearchOutputBaseType addNewResearchOutputSubstitutionGroupHead()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ResearchOutputBaseType target = null;
                    target = (eu.openaire.cerifProfile.x11.ResearchOutputBaseType)get_store().add_element_user(RESEARCHOUTPUTSUBSTITUTIONGROUPHEAD$0);
                    return target;
                }
            }
        }
    }
}
