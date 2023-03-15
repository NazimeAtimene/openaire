/*
 * XML Type:  cfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnit__Type
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium.impl;
/**
 * An XML cfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnit__Type(@http://issn.org/vocabularies/Medium).
 *
 * This is a complex type.
 */
public class CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitTypeImpl extends org.issn.vocabularies.medium.impl.CfLinkWithDisplayNameBaseTypeImpl implements org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType
{
    private static final long serialVersionUID = 1L;
    
    public CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "Person__SubstitutionGroupHead");
    private static final javax.xml.namespace.QName AFFILIATION$2 = 
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "Affiliation");
    private static final javax.xml.namespace.QName ORGUNITSUBSTITUTIONGROUPHEAD$4 = 
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "OrgUnit__SubstitutionGroupHead");
    
    
    /**
     * Gets the "Person__SubstitutionGroupHead" element
     */
    public org.issn.vocabularies.medium.PersonBaseType getPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.PersonBaseType target = null;
            target = (org.issn.vocabularies.medium.PersonBaseType)get_store().find_element_user(PERSONSUBSTITUTIONGROUPHEAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Person__SubstitutionGroupHead" element
     */
    public boolean isSetPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONSUBSTITUTIONGROUPHEAD$0) != 0;
        }
    }
    
    /**
     * Sets the "Person__SubstitutionGroupHead" element
     */
    public void setPersonSubstitutionGroupHead(org.issn.vocabularies.medium.PersonBaseType personSubstitutionGroupHead)
    {
        generatedSetterHelperImpl(personSubstitutionGroupHead, PERSONSUBSTITUTIONGROUPHEAD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Person__SubstitutionGroupHead" element
     */
    public org.issn.vocabularies.medium.PersonBaseType addNewPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.PersonBaseType target = null;
            target = (org.issn.vocabularies.medium.PersonBaseType)get_store().add_element_user(PERSONSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Person__SubstitutionGroupHead" element
     */
    public void unsetPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONSUBSTITUTIONGROUPHEAD$0, 0);
        }
    }
    
    /**
     * Gets array of all "Affiliation" elements
     */
    public org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation[] getAffiliationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AFFILIATION$2, targetList);
            org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation[] result = new org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Affiliation" element
     */
    public org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation getAffiliationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation target = null;
            target = (org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation)get_store().find_element_user(AFFILIATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Affiliation" element
     */
    public int sizeOfAffiliationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AFFILIATION$2);
        }
    }
    
    /**
     * Sets array of all "Affiliation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAffiliationArray(org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation[] affiliationArray)
    {
        check_orphaned();
        arraySetterHelper(affiliationArray, AFFILIATION$2);
    }
    
    /**
     * Sets ith "Affiliation" element
     */
    public void setAffiliationArray(int i, org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation affiliation)
    {
        generatedSetterHelperImpl(affiliation, AFFILIATION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Affiliation" element
     */
    public org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation insertNewAffiliation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation target = null;
            target = (org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation)get_store().insert_element_user(AFFILIATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Affiliation" element
     */
    public org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation addNewAffiliation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation target = null;
            target = (org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation)get_store().add_element_user(AFFILIATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Affiliation" element
     */
    public void removeAffiliation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AFFILIATION$2, i);
        }
    }
    
    /**
     * Gets the "OrgUnit__SubstitutionGroupHead" element
     */
    public org.issn.vocabularies.medium.OrgUnitBaseType getOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.OrgUnitBaseType target = null;
            target = (org.issn.vocabularies.medium.OrgUnitBaseType)get_store().find_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OrgUnit__SubstitutionGroupHead" element
     */
    public boolean isSetOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGUNITSUBSTITUTIONGROUPHEAD$4) != 0;
        }
    }
    
    /**
     * Sets the "OrgUnit__SubstitutionGroupHead" element
     */
    public void setOrgUnitSubstitutionGroupHead(org.issn.vocabularies.medium.OrgUnitBaseType orgUnitSubstitutionGroupHead)
    {
        generatedSetterHelperImpl(orgUnitSubstitutionGroupHead, ORGUNITSUBSTITUTIONGROUPHEAD$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrgUnit__SubstitutionGroupHead" element
     */
    public org.issn.vocabularies.medium.OrgUnitBaseType addNewOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.OrgUnitBaseType target = null;
            target = (org.issn.vocabularies.medium.OrgUnitBaseType)get_store().add_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$4);
            return target;
        }
    }
    
    /**
     * Unsets the "OrgUnit__SubstitutionGroupHead" element
     */
    public void unsetOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGUNITSUBSTITUTIONGROUPHEAD$4, 0);
        }
    }
    /**
     * An XML Affiliation(@http://issn.org/vocabularies/Medium).
     *
     * This is a complex type.
     */
    public static class AffiliationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation
    {
        private static final long serialVersionUID = 1L;
        
        public AffiliationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DISPLAYNAME$0 = 
            new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "DisplayName");
        private static final javax.xml.namespace.QName ORGUNITSUBSTITUTIONGROUPHEAD$2 = 
            new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "OrgUnit__SubstitutionGroupHead");
        
        
        /**
         * Gets the "DisplayName" element
         */
        public java.lang.String getDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DisplayName" element
         */
        public org.apache.xmlbeans.XmlString xgetDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "DisplayName" element
         */
        public boolean isSetDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "DisplayName" element
         */
        public void setDisplayName(java.lang.String displayName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYNAME$0);
                }
                target.setStringValue(displayName);
            }
        }
        
        /**
         * Sets (as xml) the "DisplayName" element
         */
        public void xsetDisplayName(org.apache.xmlbeans.XmlString displayName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYNAME$0);
                }
                target.set(displayName);
            }
        }
        
        /**
         * Unsets the "DisplayName" element
         */
        public void unsetDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYNAME$0, 0);
            }
        }
        
        /**
         * Gets the "OrgUnit__SubstitutionGroupHead" element
         */
        public org.issn.vocabularies.medium.OrgUnitBaseType getOrgUnitSubstitutionGroupHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.issn.vocabularies.medium.OrgUnitBaseType target = null;
                target = (org.issn.vocabularies.medium.OrgUnitBaseType)get_store().find_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "OrgUnit__SubstitutionGroupHead" element
         */
        public void setOrgUnitSubstitutionGroupHead(org.issn.vocabularies.medium.OrgUnitBaseType orgUnitSubstitutionGroupHead)
        {
            generatedSetterHelperImpl(orgUnitSubstitutionGroupHead, ORGUNITSUBSTITUTIONGROUPHEAD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "OrgUnit__SubstitutionGroupHead" element
         */
        public org.issn.vocabularies.medium.OrgUnitBaseType addNewOrgUnitSubstitutionGroupHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.issn.vocabularies.medium.OrgUnitBaseType target = null;
                target = (org.issn.vocabularies.medium.OrgUnitBaseType)get_store().add_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$2);
                return target;
            }
        }
    }
}
