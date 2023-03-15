/*
 * An XML document type.
 * Localname: Patent
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.PatentDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one Patent(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class PatentDocumentImpl extends eu.openaire.cerifProfile.x11.impl.ResearchOutputSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.PatentDocument
{
    private static final long serialVersionUID = 1L;
    
    public PatentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATENT$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Patent");
    
    
    /**
     * Gets the "Patent" element
     */
    public eu.openaire.cerifProfile.x11.PatentDocument.Patent getPatent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.PatentDocument.Patent target = null;
            target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent)get_store().find_element_user(PATENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Patent" element
     */
    public void setPatent(eu.openaire.cerifProfile.x11.PatentDocument.Patent patent)
    {
        generatedSetterHelperImpl(patent, PATENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Patent" element
     */
    public eu.openaire.cerifProfile.x11.PatentDocument.Patent addNewPatent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.PatentDocument.Patent target = null;
            target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent)get_store().add_element_user(PATENT$0);
            return target;
        }
    }
    /**
     * An XML Patent(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class PatentImpl extends eu.openaire.cerifProfile.x11.impl.ResearchOutputBaseTypeImpl implements eu.openaire.cerifProfile.x11.PatentDocument.Patent
    {
        private static final long serialVersionUID = 1L;
        
        public PatentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types", "Type");
        private static final javax.xml.namespace.QName TITLE$2 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Title");
        private static final javax.xml.namespace.QName VERSIONINFO$4 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "VersionInfo");
        private static final javax.xml.namespace.QName REGISTRATIONDATE$6 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "RegistrationDate");
        private static final javax.xml.namespace.QName APPROVALDATE$8 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ApprovalDate");
        private static final javax.xml.namespace.QName PUBLICATIONDATE$10 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PublicationDate");
        private static final javax.xml.namespace.QName COUNTRYCODE$12 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "CountryCode");
        private static final javax.xml.namespace.QName ISSUER$14 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Issuer");
        private static final javax.xml.namespace.QName PATENTNUMBER$16 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PatentNumber");
        private static final javax.xml.namespace.QName URL$18 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "URL");
        private static final javax.xml.namespace.QName INVENTORS$20 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Inventors");
        private static final javax.xml.namespace.QName HOLDERS$22 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Holders");
        private static final javax.xml.namespace.QName ABSTRACT$24 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Abstract");
        private static final javax.xml.namespace.QName SUBJECT$26 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Subject");
        private static final javax.xml.namespace.QName KEYWORD$28 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Keyword");
        private static final javax.xml.namespace.QName ORIGINATESFROM$30 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OriginatesFrom");
        private static final javax.xml.namespace.QName PREDECESSOR$32 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Predecessor");
        private static final javax.xml.namespace.QName REFERENCES$34 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "References");
        private static final javax.xml.namespace.QName CLASSIFICATION$36 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Classification");
        private static final javax.xml.namespace.QName LINK$38 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Link");
        
        
        /**
         * Gets the "Type" element
         */
        public eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type target = null;
                target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type)get_store().find_element_user(TYPE$0, 0);
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
        public void setType(eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type type)
        {
            generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Type" element
         */
        public eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type target = null;
                target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type)get_store().add_element_user(TYPE$0);
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
         * Gets array of all "Title" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TITLE$2, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(TITLE$2, i);
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
                return get_store().count_elements(TITLE$2);
            }
        }
        
        /**
         * Sets array of all "Title" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTitleArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] titleArray)
        {
            check_orphaned();
            arraySetterHelper(titleArray, TITLE$2);
        }
        
        /**
         * Sets ith "Title" element
         */
        public void setTitleArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType title)
        {
            generatedSetterHelperImpl(title, TITLE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(TITLE$2, i);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(TITLE$2);
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
                get_store().remove_element(TITLE$2, i);
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
                get_store().find_all_element_users(VERSIONINFO$4, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(VERSIONINFO$4, i);
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
                return get_store().count_elements(VERSIONINFO$4);
            }
        }
        
        /**
         * Sets array of all "VersionInfo" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setVersionInfoArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] versionInfoArray)
        {
            check_orphaned();
            arraySetterHelper(versionInfoArray, VERSIONINFO$4);
        }
        
        /**
         * Sets ith "VersionInfo" element
         */
        public void setVersionInfoArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType versionInfo)
        {
            generatedSetterHelperImpl(versionInfo, VERSIONINFO$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(VERSIONINFO$4, i);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(VERSIONINFO$4);
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
                get_store().remove_element(VERSIONINFO$4, i);
            }
        }
        
        /**
         * Gets the "RegistrationDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType getRegistrationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().find_element_user(REGISTRATIONDATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "RegistrationDate" element
         */
        public boolean isSetRegistrationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REGISTRATIONDATE$6) != 0;
            }
        }
        
        /**
         * Sets the "RegistrationDate" element
         */
        public void setRegistrationDate(eu.openaire.cerifProfile.x11.CfDateType registrationDate)
        {
            generatedSetterHelperImpl(registrationDate, REGISTRATIONDATE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "RegistrationDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType addNewRegistrationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().add_element_user(REGISTRATIONDATE$6);
                return target;
            }
        }
        
        /**
         * Unsets the "RegistrationDate" element
         */
        public void unsetRegistrationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REGISTRATIONDATE$6, 0);
            }
        }
        
        /**
         * Gets the "ApprovalDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType getApprovalDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().find_element_user(APPROVALDATE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ApprovalDate" element
         */
        public boolean isSetApprovalDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APPROVALDATE$8) != 0;
            }
        }
        
        /**
         * Sets the "ApprovalDate" element
         */
        public void setApprovalDate(eu.openaire.cerifProfile.x11.CfDateType approvalDate)
        {
            generatedSetterHelperImpl(approvalDate, APPROVALDATE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ApprovalDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType addNewApprovalDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().add_element_user(APPROVALDATE$8);
                return target;
            }
        }
        
        /**
         * Unsets the "ApprovalDate" element
         */
        public void unsetApprovalDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APPROVALDATE$8, 0);
            }
        }
        
        /**
         * Gets the "PublicationDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType getPublicationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().find_element_user(PUBLICATIONDATE$10, 0);
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
                return get_store().count_elements(PUBLICATIONDATE$10) != 0;
            }
        }
        
        /**
         * Sets the "PublicationDate" element
         */
        public void setPublicationDate(eu.openaire.cerifProfile.x11.CfDateType publicationDate)
        {
            generatedSetterHelperImpl(publicationDate, PUBLICATIONDATE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "PublicationDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType addNewPublicationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().add_element_user(PUBLICATIONDATE$10);
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
                get_store().remove_element(PUBLICATIONDATE$10, 0);
            }
        }
        
        /**
         * Gets the "CountryCode" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(COUNTRYCODE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "CountryCode" element
         */
        public boolean isSetCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COUNTRYCODE$12) != 0;
            }
        }
        
        /**
         * Sets the "CountryCode" element
         */
        public void setCountryCode(eu.openaire.cerifProfile.x11.CfStringType countryCode)
        {
            generatedSetterHelperImpl(countryCode, COUNTRYCODE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CountryCode" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(COUNTRYCODE$12);
                return target;
            }
        }
        
        /**
         * Unsets the "CountryCode" element
         */
        public void unsetCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COUNTRYCODE$12, 0);
            }
        }
        
        /**
         * Gets array of all "Issuer" elements
         */
        public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType[] getIssuerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ISSUER$14, targetList);
                eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Issuer" element
         */
        public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType getIssuerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType target = null;
                target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType)get_store().find_element_user(ISSUER$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Issuer" element
         */
        public int sizeOfIssuerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISSUER$14);
            }
        }
        
        /**
         * Sets array of all "Issuer" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIssuerArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType[] issuerArray)
        {
            check_orphaned();
            arraySetterHelper(issuerArray, ISSUER$14);
        }
        
        /**
         * Sets ith "Issuer" element
         */
        public void setIssuerArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType issuer)
        {
            generatedSetterHelperImpl(issuer, ISSUER$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Issuer" element
         */
        public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType insertNewIssuer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType target = null;
                target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType)get_store().insert_element_user(ISSUER$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Issuer" element
         */
        public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType addNewIssuer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType target = null;
                target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToOrgUnitType)get_store().add_element_user(ISSUER$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "Issuer" element
         */
        public void removeIssuer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISSUER$14, i);
            }
        }
        
        /**
         * Gets the "PatentNumber" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getPatentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(PATENTNUMBER$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PatentNumber" element
         */
        public boolean isSetPatentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PATENTNUMBER$16) != 0;
            }
        }
        
        /**
         * Sets the "PatentNumber" element
         */
        public void setPatentNumber(eu.openaire.cerifProfile.x11.CfStringType patentNumber)
        {
            generatedSetterHelperImpl(patentNumber, PATENTNUMBER$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "PatentNumber" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewPatentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(PATENTNUMBER$16);
                return target;
            }
        }
        
        /**
         * Unsets the "PatentNumber" element
         */
        public void unsetPatentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PATENTNUMBER$16, 0);
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
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(URL$18, 0);
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
                return get_store().count_elements(URL$18) != 0;
            }
        }
        
        /**
         * Sets the "URL" element
         */
        public void setURL(eu.openaire.cerifProfile.x11.CfStringType url)
        {
            generatedSetterHelperImpl(url, URL$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(URL$18);
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
                get_store().remove_element(URL$18, 0);
            }
        }
        
        /**
         * Gets the "Inventors" element
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors getInventors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors target = null;
                target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors)get_store().find_element_user(INVENTORS$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Inventors" element
         */
        public boolean isSetInventors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INVENTORS$20) != 0;
            }
        }
        
        /**
         * Sets the "Inventors" element
         */
        public void setInventors(eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors inventors)
        {
            generatedSetterHelperImpl(inventors, INVENTORS$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Inventors" element
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors addNewInventors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors target = null;
                target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors)get_store().add_element_user(INVENTORS$20);
                return target;
            }
        }
        
        /**
         * Unsets the "Inventors" element
         */
        public void unsetInventors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INVENTORS$20, 0);
            }
        }
        
        /**
         * Gets the "Holders" element
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders getHolders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders target = null;
                target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders)get_store().find_element_user(HOLDERS$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Holders" element
         */
        public boolean isSetHolders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOLDERS$22) != 0;
            }
        }
        
        /**
         * Sets the "Holders" element
         */
        public void setHolders(eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders holders)
        {
            generatedSetterHelperImpl(holders, HOLDERS$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Holders" element
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders addNewHolders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders target = null;
                target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders)get_store().add_element_user(HOLDERS$22);
                return target;
            }
        }
        
        /**
         * Unsets the "Holders" element
         */
        public void unsetHolders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOLDERS$22, 0);
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
                get_store().find_all_element_users(ABSTRACT$24, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(ABSTRACT$24, i);
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
                return get_store().count_elements(ABSTRACT$24);
            }
        }
        
        /**
         * Sets array of all "Abstract" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAbstractArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] xabstractArray)
        {
            check_orphaned();
            arraySetterHelper(xabstractArray, ABSTRACT$24);
        }
        
        /**
         * Sets ith "Abstract" element
         */
        public void setAbstractArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType xabstract)
        {
            generatedSetterHelperImpl(xabstract, ABSTRACT$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(ABSTRACT$24, i);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(ABSTRACT$24);
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
                get_store().remove_element(ABSTRACT$24, i);
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
         * Gets array of all "OriginatesFrom" elements
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom[] getOriginatesFromArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORIGINATESFROM$30, targetList);
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom[] result = new eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OriginatesFrom" element
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom getOriginatesFromArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom target = null;
                target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom)get_store().find_element_user(ORIGINATESFROM$30, i);
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
                return get_store().count_elements(ORIGINATESFROM$30);
            }
        }
        
        /**
         * Sets array of all "OriginatesFrom" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOriginatesFromArray(eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom[] originatesFromArray)
        {
            check_orphaned();
            arraySetterHelper(originatesFromArray, ORIGINATESFROM$30);
        }
        
        /**
         * Sets ith "OriginatesFrom" element
         */
        public void setOriginatesFromArray(int i, eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom originatesFrom)
        {
            generatedSetterHelperImpl(originatesFrom, ORIGINATESFROM$30, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OriginatesFrom" element
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom insertNewOriginatesFrom(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom target = null;
                target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom)get_store().insert_element_user(ORIGINATESFROM$30, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OriginatesFrom" element
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom addNewOriginatesFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom target = null;
                target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom)get_store().add_element_user(ORIGINATESFROM$30);
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
                get_store().remove_element(ORIGINATESFROM$30, i);
            }
        }
        
        /**
         * Gets array of all "Predecessor" elements
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor[] getPredecessorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PREDECESSOR$32, targetList);
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor[] result = new eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Predecessor" element
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor getPredecessorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor target = null;
                target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor)get_store().find_element_user(PREDECESSOR$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Predecessor" element
         */
        public int sizeOfPredecessorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PREDECESSOR$32);
            }
        }
        
        /**
         * Sets array of all "Predecessor" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPredecessorArray(eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor[] predecessorArray)
        {
            check_orphaned();
            arraySetterHelper(predecessorArray, PREDECESSOR$32);
        }
        
        /**
         * Sets ith "Predecessor" element
         */
        public void setPredecessorArray(int i, eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor predecessor)
        {
            generatedSetterHelperImpl(predecessor, PREDECESSOR$32, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Predecessor" element
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor insertNewPredecessor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor target = null;
                target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor)get_store().insert_element_user(PREDECESSOR$32, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Predecessor" element
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor addNewPredecessor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor target = null;
                target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor)get_store().add_element_user(PREDECESSOR$32);
                return target;
            }
        }
        
        /**
         * Removes the ith "Predecessor" element
         */
        public void removePredecessor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PREDECESSOR$32, i);
            }
        }
        
        /**
         * Gets array of all "References" elements
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.References[] getReferencesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REFERENCES$34, targetList);
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.References[] result = new eu.openaire.cerifProfile.x11.PatentDocument.Patent.References[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "References" element
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.References getReferencesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.References target = null;
                target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent.References)get_store().find_element_user(REFERENCES$34, i);
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
                return get_store().count_elements(REFERENCES$34);
            }
        }
        
        /**
         * Sets array of all "References" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setReferencesArray(eu.openaire.cerifProfile.x11.PatentDocument.Patent.References[] referencesArray)
        {
            check_orphaned();
            arraySetterHelper(referencesArray, REFERENCES$34);
        }
        
        /**
         * Sets ith "References" element
         */
        public void setReferencesArray(int i, eu.openaire.cerifProfile.x11.PatentDocument.Patent.References references)
        {
            generatedSetterHelperImpl(references, REFERENCES$34, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "References" element
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.References insertNewReferences(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.References target = null;
                target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent.References)get_store().insert_element_user(REFERENCES$34, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "References" element
         */
        public eu.openaire.cerifProfile.x11.PatentDocument.Patent.References addNewReferences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.PatentDocument.Patent.References target = null;
                target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent.References)get_store().add_element_user(REFERENCES$34);
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
                get_store().remove_element(REFERENCES$34, i);
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
                get_store().find_all_element_users(CLASSIFICATION$36, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(CLASSIFICATION$36, i);
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
                return get_store().count_elements(CLASSIFICATION$36);
            }
        }
        
        /**
         * Sets array of all "Classification" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setClassificationArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] classificationArray)
        {
            check_orphaned();
            arraySetterHelper(classificationArray, CLASSIFICATION$36);
        }
        
        /**
         * Sets ith "Classification" element
         */
        public void setClassificationArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType classification)
        {
            generatedSetterHelperImpl(classification, CLASSIFICATION$36, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(CLASSIFICATION$36, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(CLASSIFICATION$36);
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
                get_store().remove_element(CLASSIFICATION$36, i);
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
                get_store().find_all_element_users(LINK$38, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().find_element_user(LINK$38, i);
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
                return get_store().count_elements(LINK$38);
            }
        }
        
        /**
         * Sets array of all "Link" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLinkArray(eu.openaire.cerifProfile.x11.CfGenericLinkType[] linkArray)
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$38);
        }
        
        /**
         * Sets ith "Link" element
         */
        public void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfGenericLinkType link)
        {
            generatedSetterHelperImpl(link, LINK$38, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().insert_element_user(LINK$38, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().add_element_user(LINK$38);
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
                get_store().remove_element(LINK$38, i);
            }
        }
        /**
         * An XML Inventors(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class InventorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.PatentDocument.Patent.Inventors
        {
            private static final long serialVersionUID = 1L;
            
            public InventorsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INVENTOR$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Inventor");
            
            
            /**
             * Gets array of all "Inventor" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] getInventorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INVENTOR$0, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Inventor" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType getInventorArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType)get_store().find_element_user(INVENTOR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Inventor" element
             */
            public int sizeOfInventorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INVENTOR$0);
                }
            }
            
            /**
             * Sets array of all "Inventor" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setInventorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] inventorArray)
            {
                check_orphaned();
                arraySetterHelper(inventorArray, INVENTOR$0);
            }
            
            /**
             * Sets ith "Inventor" element
             */
            public void setInventorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType inventor)
            {
                generatedSetterHelperImpl(inventor, INVENTOR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Inventor" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType insertNewInventor(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType)get_store().insert_element_user(INVENTOR$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Inventor" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType addNewInventor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType)get_store().add_element_user(INVENTOR$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Inventor" element
             */
            public void removeInventor(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INVENTOR$0, i);
                }
            }
        }
        /**
         * An XML Holders(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class HoldersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.PatentDocument.Patent.Holders
        {
            private static final long serialVersionUID = 1L;
            
            public HoldersImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName HOLDER$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Holder");
            
            
            /**
             * Gets array of all "Holder" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getHolderArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(HOLDER$0, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Holder" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getHolderArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().find_element_user(HOLDER$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Holder" element
             */
            public int sizeOfHolderArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(HOLDER$0);
                }
            }
            
            /**
             * Sets array of all "Holder" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setHolderArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] holderArray)
            {
                check_orphaned();
                arraySetterHelper(holderArray, HOLDER$0);
            }
            
            /**
             * Sets ith "Holder" element
             */
            public void setHolderArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType holder)
            {
                generatedSetterHelperImpl(holder, HOLDER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Holder" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewHolder(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().insert_element_user(HOLDER$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Holder" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewHolder()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().add_element_user(HOLDER$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Holder" element
             */
            public void removeHolder(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(HOLDER$0, i);
                }
            }
        }
        /**
         * An XML OriginatesFrom(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class OriginatesFromImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.PatentDocument.Patent.OriginatesFrom
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
         * An XML Predecessor(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class PredecessorImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.PatentDocument.Patent.Predecessor
        {
            private static final long serialVersionUID = 1L;
            
            public PredecessorImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PATENT$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Patent");
            
            
            /**
             * Gets the "Patent" element
             */
            public eu.openaire.cerifProfile.x11.PatentDocument.Patent getPatent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.PatentDocument.Patent target = null;
                    target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent)get_store().find_element_user(PATENT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Patent" element
             */
            public void setPatent(eu.openaire.cerifProfile.x11.PatentDocument.Patent patent)
            {
                generatedSetterHelperImpl(patent, PATENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Patent" element
             */
            public eu.openaire.cerifProfile.x11.PatentDocument.Patent addNewPatent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.PatentDocument.Patent target = null;
                    target = (eu.openaire.cerifProfile.x11.PatentDocument.Patent)get_store().add_element_user(PATENT$0);
                    return target;
                }
            }
        }
        /**
         * An XML References(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class ReferencesImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.PatentDocument.Patent.References
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
