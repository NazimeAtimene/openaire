/*
 * XML Type:  cfLinkWithDisplayNameToPersonWithAffiliations__Type
 * Namespace: http://purl.org/coar/access_right
 * Java type: org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.accessRight.impl;
/**
 * An XML cfLinkWithDisplayNameToPersonWithAffiliations__Type(@http://purl.org/coar/access_right).
 *
 * This is a complex type.
 */
public class CfLinkWithDisplayNameToPersonWithAffiliationsTypeImpl extends org.purl.coar.accessRight.impl.CfLinkWithDisplayNameBaseTypeImpl implements org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType
{
    private static final long serialVersionUID = 1L;
    
    public CfLinkWithDisplayNameToPersonWithAffiliationsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "Person__SubstitutionGroupHead");
    private static final javax.xml.namespace.QName AFFILIATION$2 = 
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "Affiliation");
    
    
    /**
     * Gets the "Person__SubstitutionGroupHead" element
     */
    public org.purl.coar.accessRight.PersonBaseType getPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.PersonBaseType target = null;
            target = (org.purl.coar.accessRight.PersonBaseType)get_store().find_element_user(PERSONSUBSTITUTIONGROUPHEAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Person__SubstitutionGroupHead" element
     */
    public void setPersonSubstitutionGroupHead(org.purl.coar.accessRight.PersonBaseType personSubstitutionGroupHead)
    {
        generatedSetterHelperImpl(personSubstitutionGroupHead, PERSONSUBSTITUTIONGROUPHEAD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Person__SubstitutionGroupHead" element
     */
    public org.purl.coar.accessRight.PersonBaseType addNewPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.PersonBaseType target = null;
            target = (org.purl.coar.accessRight.PersonBaseType)get_store().add_element_user(PERSONSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "Affiliation" elements
     */
    public org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation[] getAffiliationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AFFILIATION$2, targetList);
            org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation[] result = new org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Affiliation" element
     */
    public org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation getAffiliationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation target = null;
            target = (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation)get_store().find_element_user(AFFILIATION$2, i);
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
    public void setAffiliationArray(org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation[] affiliationArray)
    {
        check_orphaned();
        arraySetterHelper(affiliationArray, AFFILIATION$2);
    }
    
    /**
     * Sets ith "Affiliation" element
     */
    public void setAffiliationArray(int i, org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation affiliation)
    {
        generatedSetterHelperImpl(affiliation, AFFILIATION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Affiliation" element
     */
    public org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation insertNewAffiliation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation target = null;
            target = (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation)get_store().insert_element_user(AFFILIATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Affiliation" element
     */
    public org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation addNewAffiliation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation target = null;
            target = (org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation)get_store().add_element_user(AFFILIATION$2);
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
     * An XML Affiliation(@http://purl.org/coar/access_right).
     *
     * This is a complex type.
     */
    public static class AffiliationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation
    {
        private static final long serialVersionUID = 1L;
        
        public AffiliationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DISPLAYNAME$0 = 
            new javax.xml.namespace.QName("http://purl.org/coar/access_right", "DisplayName");
        private static final javax.xml.namespace.QName ORGUNITSUBSTITUTIONGROUPHEAD$2 = 
            new javax.xml.namespace.QName("http://purl.org/coar/access_right", "OrgUnit__SubstitutionGroupHead");
        
        
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
        public org.purl.coar.accessRight.OrgUnitBaseType getOrgUnitSubstitutionGroupHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.purl.coar.accessRight.OrgUnitBaseType target = null;
                target = (org.purl.coar.accessRight.OrgUnitBaseType)get_store().find_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$2, 0);
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
        public void setOrgUnitSubstitutionGroupHead(org.purl.coar.accessRight.OrgUnitBaseType orgUnitSubstitutionGroupHead)
        {
            generatedSetterHelperImpl(orgUnitSubstitutionGroupHead, ORGUNITSUBSTITUTIONGROUPHEAD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "OrgUnit__SubstitutionGroupHead" element
         */
        public org.purl.coar.accessRight.OrgUnitBaseType addNewOrgUnitSubstitutionGroupHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.purl.coar.accessRight.OrgUnitBaseType target = null;
                target = (org.purl.coar.accessRight.OrgUnitBaseType)get_store().add_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$2);
                return target;
            }
        }
    }
}
