/*
 * An XML document type.
 * Localname: Funding
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.FundingDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one Funding(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class FundingDocumentImpl extends eu.openaire.cerifProfile.x11.impl.ProjectFundingSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.FundingDocument
{
    private static final long serialVersionUID = 1L;
    
    public FundingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FUNDING$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Funding");
    
    
    /**
     * Gets the "Funding" element
     */
    public eu.openaire.cerifProfile.x11.FundingDocument.Funding getFunding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.FundingDocument.Funding target = null;
            target = (eu.openaire.cerifProfile.x11.FundingDocument.Funding)get_store().find_element_user(FUNDING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Funding" element
     */
    public void setFunding(eu.openaire.cerifProfile.x11.FundingDocument.Funding funding)
    {
        generatedSetterHelperImpl(funding, FUNDING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Funding" element
     */
    public eu.openaire.cerifProfile.x11.FundingDocument.Funding addNewFunding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.FundingDocument.Funding target = null;
            target = (eu.openaire.cerifProfile.x11.FundingDocument.Funding)get_store().add_element_user(FUNDING$0);
            return target;
        }
    }
    /**
     * An XML Funding(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class FundingImpl extends eu.openaire.cerifProfile.x11.impl.ProjectFundingBaseTypeImpl implements eu.openaire.cerifProfile.x11.FundingDocument.Funding
    {
        private static final long serialVersionUID = 1L;
        
        public FundingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types", "Type");
        private static final javax.xml.namespace.QName ACRONYM$2 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Acronym");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Name");
        private static final javax.xml.namespace.QName AMOUNT$6 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Amount");
        private static final javax.xml.namespace.QName IDENTIFIER$8 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Identifier");
        private static final javax.xml.namespace.QName DESCRIPTION$10 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Description");
        private static final javax.xml.namespace.QName SUBJECT$12 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Subject");
        private static final javax.xml.namespace.QName KEYWORD$14 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Keyword");
        private static final javax.xml.namespace.QName FUNDER$16 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Funder");
        private static final javax.xml.namespace.QName PARTOF$18 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PartOf");
        private static final javax.xml.namespace.QName DURATION$20 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Duration");
        private static final javax.xml.namespace.QName OAMANDATE$22 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OAMandate");
        private static final javax.xml.namespace.QName CLASSIFICATION$24 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Classification");
        private static final javax.xml.namespace.QName LINK$26 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Link");
        
        
        /**
         * Gets the "Type" element
         */
        public eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type target = null;
                target = (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type)get_store().find_element_user(TYPE$0, 0);
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
        public void setType(eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type type)
        {
            generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Type" element
         */
        public eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type target = null;
                target = (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.TypeDocument.Type)get_store().add_element_user(TYPE$0);
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
         * Gets the "Acronym" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(ACRONYM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Acronym" element
         */
        public boolean isSetAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACRONYM$2) != 0;
            }
        }
        
        /**
         * Sets the "Acronym" element
         */
        public void setAcronym(eu.openaire.cerifProfile.x11.CfStringType acronym)
        {
            generatedSetterHelperImpl(acronym, ACRONYM$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Acronym" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(ACRONYM$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Acronym" element
         */
        public void unsetAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACRONYM$2, 0);
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
         * Gets the "Amount" element
         */
        public eu.openaire.cerifProfile.x11.CfAmountType getAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfAmountType target = null;
                target = (eu.openaire.cerifProfile.x11.CfAmountType)get_store().find_element_user(AMOUNT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Amount" element
         */
        public boolean isSetAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AMOUNT$6) != 0;
            }
        }
        
        /**
         * Sets the "Amount" element
         */
        public void setAmount(eu.openaire.cerifProfile.x11.CfAmountType amount)
        {
            generatedSetterHelperImpl(amount, AMOUNT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Amount" element
         */
        public eu.openaire.cerifProfile.x11.CfAmountType addNewAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfAmountType target = null;
                target = (eu.openaire.cerifProfile.x11.CfAmountType)get_store().add_element_user(AMOUNT$6);
                return target;
            }
        }
        
        /**
         * Unsets the "Amount" element
         */
        public void unsetAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AMOUNT$6, 0);
            }
        }
        
        /**
         * Gets array of all "Identifier" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] getIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDENTIFIER$8, targetList);
                eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] result = new eu.openaire.cerifProfile.x11.CfGenericIdentifierType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Identifier" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericIdentifierType getIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericIdentifierType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().find_element_user(IDENTIFIER$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Identifier" element
         */
        public int sizeOfIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFIER$8);
            }
        }
        
        /**
         * Sets array of all "Identifier" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIdentifierArray(eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] identifierArray)
        {
            check_orphaned();
            arraySetterHelper(identifierArray, IDENTIFIER$8);
        }
        
        /**
         * Sets ith "Identifier" element
         */
        public void setIdentifierArray(int i, eu.openaire.cerifProfile.x11.CfGenericIdentifierType identifier)
        {
            generatedSetterHelperImpl(identifier, IDENTIFIER$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericIdentifierType insertNewIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericIdentifierType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().insert_element_user(IDENTIFIER$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericIdentifierType addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericIdentifierType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().add_element_user(IDENTIFIER$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "Identifier" element
         */
        public void removeIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFIER$8, i);
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
                get_store().find_all_element_users(DESCRIPTION$10, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(DESCRIPTION$10, i);
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
                return get_store().count_elements(DESCRIPTION$10);
            }
        }
        
        /**
         * Sets array of all "Description" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDescriptionArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] descriptionArray)
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$10);
        }
        
        /**
         * Sets ith "Description" element
         */
        public void setDescriptionArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType description)
        {
            generatedSetterHelperImpl(description, DESCRIPTION$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(DESCRIPTION$10, i);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(DESCRIPTION$10);
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
                get_store().remove_element(DESCRIPTION$10, i);
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
                get_store().find_all_element_users(SUBJECT$12, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(SUBJECT$12, i);
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
                return get_store().count_elements(SUBJECT$12);
            }
        }
        
        /**
         * Sets array of all "Subject" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSubjectArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] subjectArray)
        {
            check_orphaned();
            arraySetterHelper(subjectArray, SUBJECT$12);
        }
        
        /**
         * Sets ith "Subject" element
         */
        public void setSubjectArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType subject)
        {
            generatedSetterHelperImpl(subject, SUBJECT$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(SUBJECT$12, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(SUBJECT$12);
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
                get_store().remove_element(SUBJECT$12, i);
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
                get_store().find_all_element_users(KEYWORD$14, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(KEYWORD$14, i);
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
                return get_store().count_elements(KEYWORD$14);
            }
        }
        
        /**
         * Sets array of all "Keyword" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setKeywordArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] keywordArray)
        {
            check_orphaned();
            arraySetterHelper(keywordArray, KEYWORD$14);
        }
        
        /**
         * Sets ith "Keyword" element
         */
        public void setKeywordArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType keyword)
        {
            generatedSetterHelperImpl(keyword, KEYWORD$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(KEYWORD$14, i);
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
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(KEYWORD$14);
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
                get_store().remove_element(KEYWORD$14, i);
            }
        }
        
        /**
         * Gets array of all "Funder" elements
         */
        public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getFunderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FUNDER$16, targetList);
                eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Funder" element
         */
        public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getFunderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().find_element_user(FUNDER$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Funder" element
         */
        public int sizeOfFunderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FUNDER$16);
            }
        }
        
        /**
         * Sets array of all "Funder" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFunderArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] funderArray)
        {
            check_orphaned();
            arraySetterHelper(funderArray, FUNDER$16);
        }
        
        /**
         * Sets ith "Funder" element
         */
        public void setFunderArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType funder)
        {
            generatedSetterHelperImpl(funder, FUNDER$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Funder" element
         */
        public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewFunder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().insert_element_user(FUNDER$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Funder" element
         */
        public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewFunder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().add_element_user(FUNDER$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "Funder" element
         */
        public void removeFunder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FUNDER$16, i);
            }
        }
        
        /**
         * Gets the "PartOf" element
         */
        public eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf getPartOf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf target = null;
                target = (eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf)get_store().find_element_user(PARTOF$18, 0);
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
                return get_store().count_elements(PARTOF$18) != 0;
            }
        }
        
        /**
         * Sets the "PartOf" element
         */
        public void setPartOf(eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf partOf)
        {
            generatedSetterHelperImpl(partOf, PARTOF$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "PartOf" element
         */
        public eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf addNewPartOf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf target = null;
                target = (eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf)get_store().add_element_user(PARTOF$18);
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
                get_store().remove_element(PARTOF$18, 0);
            }
        }
        
        /**
         * Gets the "Duration" element
         */
        public eu.openaire.cerifProfile.x11.CfLinkBaseType getDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfLinkBaseType target = null;
                target = (eu.openaire.cerifProfile.x11.CfLinkBaseType)get_store().find_element_user(DURATION$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Duration" element
         */
        public boolean isSetDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DURATION$20) != 0;
            }
        }
        
        /**
         * Sets the "Duration" element
         */
        public void setDuration(eu.openaire.cerifProfile.x11.CfLinkBaseType duration)
        {
            generatedSetterHelperImpl(duration, DURATION$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Duration" element
         */
        public eu.openaire.cerifProfile.x11.CfLinkBaseType addNewDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfLinkBaseType target = null;
                target = (eu.openaire.cerifProfile.x11.CfLinkBaseType)get_store().add_element_user(DURATION$20);
                return target;
            }
        }
        
        /**
         * Unsets the "Duration" element
         */
        public void unsetDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DURATION$20, 0);
            }
        }
        
        /**
         * Gets array of all "OAMandate" elements
         */
        public eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate[] getOAMandateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OAMANDATE$22, targetList);
                eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate[] result = new eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OAMandate" element
         */
        public eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate getOAMandateArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate target = null;
                target = (eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate)get_store().find_element_user(OAMANDATE$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "OAMandate" element
         */
        public int sizeOfOAMandateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OAMANDATE$22);
            }
        }
        
        /**
         * Sets array of all "OAMandate" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOAMandateArray(eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate[] oaMandateArray)
        {
            check_orphaned();
            arraySetterHelper(oaMandateArray, OAMANDATE$22);
        }
        
        /**
         * Sets ith "OAMandate" element
         */
        public void setOAMandateArray(int i, eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate oaMandate)
        {
            generatedSetterHelperImpl(oaMandate, OAMANDATE$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OAMandate" element
         */
        public eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate insertNewOAMandate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate target = null;
                target = (eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate)get_store().insert_element_user(OAMANDATE$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OAMandate" element
         */
        public eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate addNewOAMandate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate target = null;
                target = (eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate)get_store().add_element_user(OAMANDATE$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "OAMandate" element
         */
        public void removeOAMandate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OAMANDATE$22, i);
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
                get_store().find_all_element_users(CLASSIFICATION$24, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(CLASSIFICATION$24, i);
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
                return get_store().count_elements(CLASSIFICATION$24);
            }
        }
        
        /**
         * Sets array of all "Classification" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setClassificationArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] classificationArray)
        {
            check_orphaned();
            arraySetterHelper(classificationArray, CLASSIFICATION$24);
        }
        
        /**
         * Sets ith "Classification" element
         */
        public void setClassificationArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType classification)
        {
            generatedSetterHelperImpl(classification, CLASSIFICATION$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(CLASSIFICATION$24, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(CLASSIFICATION$24);
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
                get_store().remove_element(CLASSIFICATION$24, i);
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
                get_store().find_all_element_users(LINK$26, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().find_element_user(LINK$26, i);
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
                return get_store().count_elements(LINK$26);
            }
        }
        
        /**
         * Sets array of all "Link" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLinkArray(eu.openaire.cerifProfile.x11.CfGenericLinkType[] linkArray)
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$26);
        }
        
        /**
         * Sets ith "Link" element
         */
        public void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfGenericLinkType link)
        {
            generatedSetterHelperImpl(link, LINK$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().insert_element_user(LINK$26, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().add_element_user(LINK$26);
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
                get_store().remove_element(LINK$26, i);
            }
        }
        /**
         * An XML PartOf(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class PartOfImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkWithDisplayNameBaseTypeImpl implements eu.openaire.cerifProfile.x11.FundingDocument.Funding.PartOf
        {
            private static final long serialVersionUID = 1L;
            
            public PartOfImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FUNDING$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Funding");
            
            
            /**
             * Gets the "Funding" element
             */
            public eu.openaire.cerifProfile.x11.FundingDocument.Funding getFunding()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.FundingDocument.Funding target = null;
                    target = (eu.openaire.cerifProfile.x11.FundingDocument.Funding)get_store().find_element_user(FUNDING$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Funding" element
             */
            public void setFunding(eu.openaire.cerifProfile.x11.FundingDocument.Funding funding)
            {
                generatedSetterHelperImpl(funding, FUNDING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Funding" element
             */
            public eu.openaire.cerifProfile.x11.FundingDocument.Funding addNewFunding()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.FundingDocument.Funding target = null;
                    target = (eu.openaire.cerifProfile.x11.FundingDocument.Funding)get_store().add_element_user(FUNDING$0);
                    return target;
                }
            }
        }
        /**
         * An XML OAMandate(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class OAMandateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.FundingDocument.Funding.OAMandate
        {
            private static final long serialVersionUID = 1L;
            
            public OAMandateImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MANDATED$0 = 
                new javax.xml.namespace.QName("", "mandated");
            private static final javax.xml.namespace.QName URI$2 = 
                new javax.xml.namespace.QName("", "uri");
            private static final javax.xml.namespace.QName STARTDATE$4 = 
                new javax.xml.namespace.QName("", "startDate");
            private static final javax.xml.namespace.QName ENDDATE$6 = 
                new javax.xml.namespace.QName("", "endDate");
            
            
            /**
             * Gets the "mandated" attribute
             */
            public boolean getMandated()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANDATED$0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "mandated" attribute
             */
            public org.apache.xmlbeans.XmlBoolean xgetMandated()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MANDATED$0);
                    return target;
                }
            }
            
            /**
             * Sets the "mandated" attribute
             */
            public void setMandated(boolean mandated)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANDATED$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MANDATED$0);
                    }
                    target.setBooleanValue(mandated);
                }
            }
            
            /**
             * Sets (as xml) the "mandated" attribute
             */
            public void xsetMandated(org.apache.xmlbeans.XmlBoolean mandated)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MANDATED$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MANDATED$0);
                    }
                    target.set(mandated);
                }
            }
            
            /**
             * Gets the "uri" attribute
             */
            public java.lang.String getUri()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "uri" attribute
             */
            public org.apache.xmlbeans.XmlAnyURI xgetUri()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$2);
                    return target;
                }
            }
            
            /**
             * True if has "uri" attribute
             */
            public boolean isSetUri()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(URI$2) != null;
                }
            }
            
            /**
             * Sets the "uri" attribute
             */
            public void setUri(java.lang.String uri)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$2);
                    }
                    target.setStringValue(uri);
                }
            }
            
            /**
             * Sets (as xml) the "uri" attribute
             */
            public void xsetUri(org.apache.xmlbeans.XmlAnyURI uri)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(URI$2);
                    }
                    target.set(uri);
                }
            }
            
            /**
             * Unsets the "uri" attribute
             */
            public void unsetUri()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(URI$2);
                }
            }
            
            /**
             * Gets the "startDate" attribute
             */
            public java.util.Calendar getStartDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "startDate" attribute
             */
            public eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType xgetStartDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType)get_store().find_attribute_user(STARTDATE$4);
                    return target;
                }
            }
            
            /**
             * True if has "startDate" attribute
             */
            public boolean isSetStartDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(STARTDATE$4) != null;
                }
            }
            
            /**
             * Sets the "startDate" attribute
             */
            public void setStartDate(java.util.Calendar startDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTDATE$4);
                    }
                    target.setCalendarValue(startDate);
                }
            }
            
            /**
             * Sets (as xml) the "startDate" attribute
             */
            public void xsetStartDate(eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType startDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType)get_store().find_attribute_user(STARTDATE$4);
                    if (target == null)
                    {
                      target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType)get_store().add_attribute_user(STARTDATE$4);
                    }
                    target.set(startDate);
                }
            }
            
            /**
             * Unsets the "startDate" attribute
             */
            public void unsetStartDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(STARTDATE$4);
                }
            }
            
            /**
             * Gets the "endDate" attribute
             */
            public java.util.Calendar getEndDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "endDate" attribute
             */
            public eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType xgetEndDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType)get_store().find_attribute_user(ENDDATE$6);
                    return target;
                }
            }
            
            /**
             * True if has "endDate" attribute
             */
            public boolean isSetEndDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ENDDATE$6) != null;
                }
            }
            
            /**
             * Sets the "endDate" attribute
             */
            public void setEndDate(java.util.Calendar endDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDDATE$6);
                    }
                    target.setCalendarValue(endDate);
                }
            }
            
            /**
             * Sets (as xml) the "endDate" attribute
             */
            public void xsetEndDate(eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType endDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType)get_store().find_attribute_user(ENDDATE$6);
                    if (target == null)
                    {
                      target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType)get_store().add_attribute_user(ENDDATE$6);
                    }
                    target.set(endDate);
                }
            }
            
            /**
             * Unsets the "endDate" attribute
             */
            public void unsetEndDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ENDDATE$6);
                }
            }
        }
    }
}
