/*
 * An XML document type.
 * Localname: Product
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.ProductDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one Product(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class ProductDocumentImpl extends eu.openaire.cerifProfile.x11.impl.ResearchOutputSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.ProductDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCT$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Product");
    
    
    /**
     * Gets the "Product" element
     */
    public eu.openaire.cerifProfile.x11.ProductDocument.Product getProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ProductDocument.Product target = null;
            target = (eu.openaire.cerifProfile.x11.ProductDocument.Product)get_store().find_element_user(PRODUCT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Product" element
     */
    public void setProduct(eu.openaire.cerifProfile.x11.ProductDocument.Product product)
    {
        generatedSetterHelperImpl(product, PRODUCT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Product" element
     */
    public eu.openaire.cerifProfile.x11.ProductDocument.Product addNewProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ProductDocument.Product target = null;
            target = (eu.openaire.cerifProfile.x11.ProductDocument.Product)get_store().add_element_user(PRODUCT$0);
            return target;
        }
    }
    /**
     * An XML Product(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class ProductImpl extends eu.openaire.cerifProfile.x11.impl.ResearchOutputBaseTypeImpl implements eu.openaire.cerifProfile.x11.ProductDocument.Product
    {
        private static final long serialVersionUID = 1L;
        
        public ProductImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Product_Types", "Type");
        private static final javax.xml.namespace.QName LANGUAGE$2 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Language");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Name");
        private static final javax.xml.namespace.QName VERSIONINFO$6 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "VersionInfo");
        private static final javax.xml.namespace.QName ARK$8 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ARK");
        private static final javax.xml.namespace.QName DOI$10 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "DOI");
        private static final javax.xml.namespace.QName HANDLE$12 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Handle");
        private static final javax.xml.namespace.QName URL$14 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "URL");
        private static final javax.xml.namespace.QName URN$16 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "URN");
        private static final javax.xml.namespace.QName CREATORS$18 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Creators");
        private static final javax.xml.namespace.QName PUBLISHERS$20 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Publishers");
        private static final javax.xml.namespace.QName LICENSE$22 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "License");
        private static final javax.xml.namespace.QName DESCRIPTION$24 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Description");
        private static final javax.xml.namespace.QName SUBJECT$26 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Subject");
        private static final javax.xml.namespace.QName KEYWORD$28 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Keyword");
        private static final javax.xml.namespace.QName PARTOF$30 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PartOf");
        private static final javax.xml.namespace.QName ORIGINATESFROM$32 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OriginatesFrom");
        private static final javax.xml.namespace.QName GENERATEDBY$34 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "GeneratedBy");
        private static final javax.xml.namespace.QName PRESENTEDAT$36 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PresentedAt");
        private static final javax.xml.namespace.QName COVERAGE$38 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Coverage");
        private static final javax.xml.namespace.QName REFERENCES$40 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "References");
        private static final javax.xml.namespace.QName ACCESS$42 = 
            new javax.xml.namespace.QName("http://purl.org/coar/access_right", "Access");
        private static final javax.xml.namespace.QName CLASSIFICATION$44 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Classification");
        private static final javax.xml.namespace.QName LINK$46 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Link");
        
        
        /**
         * Gets the "Type" element
         */
        public eu.openaire.cerifProfile.vocab.coarProductTypes.TypeDocument.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.vocab.coarProductTypes.TypeDocument.Type target = null;
                target = (eu.openaire.cerifProfile.vocab.coarProductTypes.TypeDocument.Type)get_store().find_element_user(TYPE$0, 0);
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
        public void setType(eu.openaire.cerifProfile.vocab.coarProductTypes.TypeDocument.Type type)
        {
            generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Type" element
         */
        public eu.openaire.cerifProfile.vocab.coarProductTypes.TypeDocument.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.vocab.coarProductTypes.TypeDocument.Type target = null;
                target = (eu.openaire.cerifProfile.vocab.coarProductTypes.TypeDocument.Type)get_store().add_element_user(TYPE$0);
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
         * Gets array of all "Language" elements
         */
        public eu.openaire.cerifProfile.x11.CfStringType[] getLanguageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LANGUAGE$2, targetList);
                eu.openaire.cerifProfile.x11.CfStringType[] result = new eu.openaire.cerifProfile.x11.CfStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Language" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getLanguageArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(LANGUAGE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Language" element
         */
        public int sizeOfLanguageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LANGUAGE$2);
            }
        }
        
        /**
         * Sets array of all "Language" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLanguageArray(eu.openaire.cerifProfile.x11.CfStringType[] languageArray)
        {
            check_orphaned();
            arraySetterHelper(languageArray, LANGUAGE$2);
        }
        
        /**
         * Sets ith "Language" element
         */
        public void setLanguageArray(int i, eu.openaire.cerifProfile.x11.CfStringType language)
        {
            generatedSetterHelperImpl(language, LANGUAGE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Language" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType insertNewLanguage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().insert_element_user(LANGUAGE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Language" element
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
         * Removes the ith "Language" element
         */
        public void removeLanguage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LANGUAGE$2, i);
            }
        }
        
        /**
         * Gets array of all "Name" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$4, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Name" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType getNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(NAME$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Name" element
         */
        public int sizeOfNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$4);
            }
        }
        
        /**
         * Sets array of all "Name" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNameArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] nameArray)
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$4);
        }
        
        /**
         * Sets ith "Name" element
         */
        public void setNameArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType name)
        {
            generatedSetterHelperImpl(name, NAME$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Name" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(NAME$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Name" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(NAME$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Name" element
         */
        public void removeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$4, i);
            }
        }
        
        /**
         * Gets array of all "VersionInfo" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getVersionInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VERSIONINFO$6, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "VersionInfo" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType getVersionInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(VERSIONINFO$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "VersionInfo" element
         */
        public int sizeOfVersionInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VERSIONINFO$6);
            }
        }
        
        /**
         * Sets array of all "VersionInfo" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setVersionInfoArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] versionInfoArray)
        {
            check_orphaned();
            arraySetterHelper(versionInfoArray, VERSIONINFO$6);
        }
        
        /**
         * Sets ith "VersionInfo" element
         */
        public void setVersionInfoArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType versionInfo)
        {
            generatedSetterHelperImpl(versionInfo, VERSIONINFO$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "VersionInfo" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewVersionInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(VERSIONINFO$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "VersionInfo" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType addNewVersionInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(VERSIONINFO$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "VersionInfo" element
         */
        public void removeVersionInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VERSIONINFO$6, i);
            }
        }
        
        /**
         * Gets the "ARK" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getARK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(ARK$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ARK" element
         */
        public boolean isSetARK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARK$8) != 0;
            }
        }
        
        /**
         * Sets the "ARK" element
         */
        public void setARK(eu.openaire.cerifProfile.x11.CfStringType ark)
        {
            generatedSetterHelperImpl(ark, ARK$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ARK" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewARK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(ARK$8);
                return target;
            }
        }
        
        /**
         * Unsets the "ARK" element
         */
        public void unsetARK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARK$8, 0);
            }
        }
        
        /**
         * Gets the "DOI" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI getDOI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI)get_store().find_element_user(DOI$10, 0);
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
                return get_store().count_elements(DOI$10) != 0;
            }
        }
        
        /**
         * Sets the "DOI" element
         */
        public void setDOI(eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI doi)
        {
            generatedSetterHelperImpl(doi, DOI$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DOI" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI addNewDOI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI)get_store().add_element_user(DOI$10);
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
                get_store().remove_element(DOI$10, 0);
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
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(HANDLE$12, 0);
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
                return get_store().count_elements(HANDLE$12) != 0;
            }
        }
        
        /**
         * Sets the "Handle" element
         */
        public void setHandle(eu.openaire.cerifProfile.x11.CfStringType handle)
        {
            generatedSetterHelperImpl(handle, HANDLE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(HANDLE$12);
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
                get_store().remove_element(HANDLE$12, 0);
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
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(URL$14, 0);
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
                return get_store().count_elements(URL$14) != 0;
            }
        }
        
        /**
         * Sets the "URL" element
         */
        public void setURL(eu.openaire.cerifProfile.x11.CfStringType url)
        {
            generatedSetterHelperImpl(url, URL$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(URL$14);
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
                get_store().remove_element(URL$14, 0);
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
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(URN$16, 0);
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
                return get_store().count_elements(URN$16) != 0;
            }
        }
        
        /**
         * Sets the "URN" element
         */
        public void setURN(eu.openaire.cerifProfile.x11.CfStringType urn)
        {
            generatedSetterHelperImpl(urn, URN$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(URN$16);
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
                get_store().remove_element(URN$16, 0);
            }
        }
        
        /**
         * Gets the "Creators" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators getCreators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators)get_store().find_element_user(CREATORS$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Creators" element
         */
        public boolean isSetCreators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATORS$18) != 0;
            }
        }
        
        /**
         * Sets the "Creators" element
         */
        public void setCreators(eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators creators)
        {
            generatedSetterHelperImpl(creators, CREATORS$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Creators" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators addNewCreators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators)get_store().add_element_user(CREATORS$18);
                return target;
            }
        }
        
        /**
         * Unsets the "Creators" element
         */
        public void unsetCreators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATORS$18, 0);
            }
        }
        
        /**
         * Gets the "Publishers" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers getPublishers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers)get_store().find_element_user(PUBLISHERS$20, 0);
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
                return get_store().count_elements(PUBLISHERS$20) != 0;
            }
        }
        
        /**
         * Sets the "Publishers" element
         */
        public void setPublishers(eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers publishers)
        {
            generatedSetterHelperImpl(publishers, PUBLISHERS$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Publishers" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers addNewPublishers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers)get_store().add_element_user(PUBLISHERS$20);
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
                get_store().remove_element(PUBLISHERS$20, 0);
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
                get_store().find_all_element_users(LICENSE$22, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(LICENSE$22, i);
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
                return get_store().count_elements(LICENSE$22);
            }
        }
        
        /**
         * Sets array of all "License" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLicenseArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] licenseArray)
        {
            check_orphaned();
            arraySetterHelper(licenseArray, LICENSE$22);
        }
        
        /**
         * Sets ith "License" element
         */
        public void setLicenseArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType license)
        {
            generatedSetterHelperImpl(license, LICENSE$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(LICENSE$22, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(LICENSE$22);
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
                get_store().remove_element(LICENSE$22, i);
            }
        }
        
        /**
         * Gets array of all "Description" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DESCRIPTION$24, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Description" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType getDescriptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(DESCRIPTION$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Description" element
         */
        public int sizeOfDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$24);
            }
        }
        
        /**
         * Sets array of all "Description" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDescriptionArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] descriptionArray)
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$24);
        }
        
        /**
         * Sets ith "Description" element
         */
        public void setDescriptionArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType description)
        {
            generatedSetterHelperImpl(description, DESCRIPTION$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Description" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(DESCRIPTION$24, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Description" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType addNewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(DESCRIPTION$24);
                return target;
            }
        }
        
        /**
         * Removes the ith "Description" element
         */
        public void removeDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$24, i);
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
                get_store().find_all_element_users(SUBJECT$26, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(SUBJECT$26, i);
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
                return get_store().count_elements(SUBJECT$26);
            }
        }
        
        /**
         * Sets array of all "Subject" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSubjectArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] subjectArray)
        {
            check_orphaned();
            arraySetterHelper(subjectArray, SUBJECT$26);
        }
        
        /**
         * Sets ith "Subject" element
         */
        public void setSubjectArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType subject)
        {
            generatedSetterHelperImpl(subject, SUBJECT$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(SUBJECT$26, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(SUBJECT$26);
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
                get_store().remove_element(SUBJECT$26, i);
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
                get_store().find_all_element_users(KEYWORD$28, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(KEYWORD$28, i);
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
                return get_store().count_elements(KEYWORD$28);
            }
        }
        
        /**
         * Sets array of all "Keyword" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setKeywordArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] keywordArray)
        {
            check_orphaned();
            arraySetterHelper(keywordArray, KEYWORD$28);
        }
        
        /**
         * Sets ith "Keyword" element
         */
        public void setKeywordArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType keyword)
        {
            generatedSetterHelperImpl(keyword, KEYWORD$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(KEYWORD$28, i);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(KEYWORD$28);
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
                get_store().remove_element(KEYWORD$28, i);
            }
        }
        
        /**
         * Gets the "PartOf" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf getPartOf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf)get_store().find_element_user(PARTOF$30, 0);
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
                return get_store().count_elements(PARTOF$30) != 0;
            }
        }
        
        /**
         * Sets the "PartOf" element
         */
        public void setPartOf(eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf partOf)
        {
            generatedSetterHelperImpl(partOf, PARTOF$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "PartOf" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf addNewPartOf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf)get_store().add_element_user(PARTOF$30);
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
                get_store().remove_element(PARTOF$30, 0);
            }
        }
        
        /**
         * Gets array of all "OriginatesFrom" elements
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom[] getOriginatesFromArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORIGINATESFROM$32, targetList);
                eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom[] result = new eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OriginatesFrom" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom getOriginatesFromArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom)get_store().find_element_user(ORIGINATESFROM$32, i);
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
                return get_store().count_elements(ORIGINATESFROM$32);
            }
        }
        
        /**
         * Sets array of all "OriginatesFrom" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOriginatesFromArray(eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom[] originatesFromArray)
        {
            check_orphaned();
            arraySetterHelper(originatesFromArray, ORIGINATESFROM$32);
        }
        
        /**
         * Sets ith "OriginatesFrom" element
         */
        public void setOriginatesFromArray(int i, eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom originatesFrom)
        {
            generatedSetterHelperImpl(originatesFrom, ORIGINATESFROM$32, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OriginatesFrom" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom insertNewOriginatesFrom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom)get_store().insert_element_user(ORIGINATESFROM$32, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OriginatesFrom" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom addNewOriginatesFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom)get_store().add_element_user(ORIGINATESFROM$32);
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
                get_store().remove_element(ORIGINATESFROM$32, i);
            }
        }
        
        /**
         * Gets array of all "GeneratedBy" elements
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy[] getGeneratedByArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GENERATEDBY$34, targetList);
                eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy[] result = new eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "GeneratedBy" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy getGeneratedByArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy)get_store().find_element_user(GENERATEDBY$34, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "GeneratedBy" element
         */
        public int sizeOfGeneratedByArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENERATEDBY$34);
            }
        }
        
        /**
         * Sets array of all "GeneratedBy" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setGeneratedByArray(eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy[] generatedByArray)
        {
            check_orphaned();
            arraySetterHelper(generatedByArray, GENERATEDBY$34);
        }
        
        /**
         * Sets ith "GeneratedBy" element
         */
        public void setGeneratedByArray(int i, eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy generatedBy)
        {
            generatedSetterHelperImpl(generatedBy, GENERATEDBY$34, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GeneratedBy" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy insertNewGeneratedBy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy)get_store().insert_element_user(GENERATEDBY$34, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GeneratedBy" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy addNewGeneratedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy)get_store().add_element_user(GENERATEDBY$34);
                return target;
            }
        }
        
        /**
         * Removes the ith "GeneratedBy" element
         */
        public void removeGeneratedBy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENERATEDBY$34, i);
            }
        }
        
        /**
         * Gets array of all "PresentedAt" elements
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt[] getPresentedAtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PRESENTEDAT$36, targetList);
                eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt[] result = new eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PresentedAt" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt getPresentedAtArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt)get_store().find_element_user(PRESENTEDAT$36, i);
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
                return get_store().count_elements(PRESENTEDAT$36);
            }
        }
        
        /**
         * Sets array of all "PresentedAt" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPresentedAtArray(eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt[] presentedAtArray)
        {
            check_orphaned();
            arraySetterHelper(presentedAtArray, PRESENTEDAT$36);
        }
        
        /**
         * Sets ith "PresentedAt" element
         */
        public void setPresentedAtArray(int i, eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt presentedAt)
        {
            generatedSetterHelperImpl(presentedAt, PRESENTEDAT$36, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PresentedAt" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt insertNewPresentedAt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt)get_store().insert_element_user(PRESENTEDAT$36, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PresentedAt" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt addNewPresentedAt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt)get_store().add_element_user(PRESENTEDAT$36);
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
                get_store().remove_element(PRESENTEDAT$36, i);
            }
        }
        
        /**
         * Gets array of all "Coverage" elements
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage[] getCoverageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COVERAGE$38, targetList);
                eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage[] result = new eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Coverage" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage getCoverageArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage)get_store().find_element_user(COVERAGE$38, i);
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
                return get_store().count_elements(COVERAGE$38);
            }
        }
        
        /**
         * Sets array of all "Coverage" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCoverageArray(eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage[] coverageArray)
        {
            check_orphaned();
            arraySetterHelper(coverageArray, COVERAGE$38);
        }
        
        /**
         * Sets ith "Coverage" element
         */
        public void setCoverageArray(int i, eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage coverage)
        {
            generatedSetterHelperImpl(coverage, COVERAGE$38, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Coverage" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage insertNewCoverage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage)get_store().insert_element_user(COVERAGE$38, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Coverage" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage addNewCoverage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage)get_store().add_element_user(COVERAGE$38);
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
                get_store().remove_element(COVERAGE$38, i);
            }
        }
        
        /**
         * Gets array of all "References" elements
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.References[] getReferencesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REFERENCES$40, targetList);
                eu.openaire.cerifProfile.x11.ProductDocument.Product.References[] result = new eu.openaire.cerifProfile.x11.ProductDocument.Product.References[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "References" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.References getReferencesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.References target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.References)get_store().find_element_user(REFERENCES$40, i);
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
                return get_store().count_elements(REFERENCES$40);
            }
        }
        
        /**
         * Sets array of all "References" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setReferencesArray(eu.openaire.cerifProfile.x11.ProductDocument.Product.References[] referencesArray)
        {
            check_orphaned();
            arraySetterHelper(referencesArray, REFERENCES$40);
        }
        
        /**
         * Sets ith "References" element
         */
        public void setReferencesArray(int i, eu.openaire.cerifProfile.x11.ProductDocument.Product.References references)
        {
            generatedSetterHelperImpl(references, REFERENCES$40, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "References" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.References insertNewReferences(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.References target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.References)get_store().insert_element_user(REFERENCES$40, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "References" element
         */
        public eu.openaire.cerifProfile.x11.ProductDocument.Product.References addNewReferences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProductDocument.Product.References target = null;
                target = (eu.openaire.cerifProfile.x11.ProductDocument.Product.References)get_store().add_element_user(REFERENCES$40);
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
                get_store().remove_element(REFERENCES$40, i);
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
                target = (org.purl.coar.accessRight.AccessDocument.Access)get_store().find_element_user(ACCESS$42, 0);
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
                return get_store().count_elements(ACCESS$42) != 0;
            }
        }
        
        /**
         * Sets the "Access" element
         */
        public void setAccess(org.purl.coar.accessRight.AccessDocument.Access access)
        {
            generatedSetterHelperImpl(access, ACCESS$42, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (org.purl.coar.accessRight.AccessDocument.Access)get_store().add_element_user(ACCESS$42);
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
                get_store().remove_element(ACCESS$42, 0);
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
                get_store().find_all_element_users(CLASSIFICATION$44, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(CLASSIFICATION$44, i);
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
                return get_store().count_elements(CLASSIFICATION$44);
            }
        }
        
        /**
         * Sets array of all "Classification" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setClassificationArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] classificationArray)
        {
            check_orphaned();
            arraySetterHelper(classificationArray, CLASSIFICATION$44);
        }
        
        /**
         * Sets ith "Classification" element
         */
        public void setClassificationArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType classification)
        {
            generatedSetterHelperImpl(classification, CLASSIFICATION$44, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(CLASSIFICATION$44, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(CLASSIFICATION$44);
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
                get_store().remove_element(CLASSIFICATION$44, i);
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
                get_store().find_all_element_users(LINK$46, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().find_element_user(LINK$46, i);
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
                return get_store().count_elements(LINK$46);
            }
        }
        
        /**
         * Sets array of all "Link" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLinkArray(eu.openaire.cerifProfile.x11.CfGenericLinkType[] linkArray)
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$46);
        }
        
        /**
         * Sets ith "Link" element
         */
        public void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfGenericLinkType link)
        {
            generatedSetterHelperImpl(link, LINK$46, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().insert_element_user(LINK$46, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().add_element_user(LINK$46);
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
                get_store().remove_element(LINK$46, i);
            }
        }
        /**
         * An XML DOI(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is an atomic type that is a restriction of eu.openaire.cerifProfile.x11.ProductDocument$Product$DOI.
         */
        public static class DOIImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements eu.openaire.cerifProfile.x11.ProductDocument.Product.DOI
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
         * An XML Creators(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class CreatorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.ProductDocument.Product.Creators
        {
            private static final long serialVersionUID = 1L;
            
            public CreatorsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CREATOR$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Creator");
            
            
            /**
             * Gets array of all "Creator" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] getCreatorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CREATOR$0, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Creator" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType getCreatorArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType)get_store().find_element_user(CREATOR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Creator" element
             */
            public int sizeOfCreatorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CREATOR$0);
                }
            }
            
            /**
             * Sets array of all "Creator" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setCreatorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[] creatorArray)
            {
                check_orphaned();
                arraySetterHelper(creatorArray, CREATOR$0);
            }
            
            /**
             * Sets ith "Creator" element
             */
            public void setCreatorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType creator)
            {
                generatedSetterHelperImpl(creator, CREATOR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Creator" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType insertNewCreator(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType)get_store().insert_element_user(CREATOR$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Creator" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType addNewCreator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType)get_store().add_element_user(CREATOR$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Creator" element
             */
            public void removeCreator(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CREATOR$0, i);
                }
            }
        }
        /**
         * An XML Publishers(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class PublishersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.ProductDocument.Product.Publishers
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
         * An XML PartOf(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class PartOfImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkWithDisplayNameBaseTypeImpl implements eu.openaire.cerifProfile.x11.ProductDocument.Product.PartOf
        {
            private static final long serialVersionUID = 1L;
            
            public PartOfImpl(org.apache.xmlbeans.SchemaType sType)
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
        /**
         * An XML OriginatesFrom(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class OriginatesFromImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.ProductDocument.Product.OriginatesFrom
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
         * An XML GeneratedBy(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class GeneratedByImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.ProductDocument.Product.GeneratedBy
        {
            private static final long serialVersionUID = 1L;
            
            public GeneratedByImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EQUIPMENT$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Equipment");
            
            
            /**
             * Gets the "Equipment" element
             */
            public eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment getEquipment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment target = null;
                    target = (eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment)get_store().find_element_user(EQUIPMENT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Equipment" element
             */
            public void setEquipment(eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment equipment)
            {
                generatedSetterHelperImpl(equipment, EQUIPMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Equipment" element
             */
            public eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment addNewEquipment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment target = null;
                    target = (eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment)get_store().add_element_user(EQUIPMENT$0);
                    return target;
                }
            }
        }
        /**
         * An XML PresentedAt(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class PresentedAtImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.ProductDocument.Product.PresentedAt
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
         * An XML Coverage(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class CoverageImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.ProductDocument.Product.Coverage
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
        public static class ReferencesImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.ProductDocument.Product.References
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
