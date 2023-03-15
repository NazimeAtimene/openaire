/*
 * XML Type:  cfLinkWithDisplayNameToPersonWithAffiliations__Type
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * An XML cfLinkWithDisplayNameToPersonWithAffiliations__Type(@https://www.openaire.eu/cerif-profile/1.1/).
 *
 * This is a complex type.
 */
public class CfLinkWithDisplayNameToPersonWithAffiliationsTypeImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkWithDisplayNameBaseTypeImpl implements eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType
{
    private static final long serialVersionUID = 1L;
    
    public CfLinkWithDisplayNameToPersonWithAffiliationsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Person__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet PERSONSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Person__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Person"),
    });
    private static final javax.xml.namespace.QName AFFILIATION$2 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Affiliation");
    
    
    /**
     * Gets the "Person__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.PersonBaseType getPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.PersonBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.PersonBaseType)get_store().find_element_user(PERSONSUBSTITUTIONGROUPHEAD$1, 0);
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
    public void setPersonSubstitutionGroupHead(eu.openaire.cerifProfile.x11.PersonBaseType personSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.PersonBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.PersonBaseType)get_store().find_element_user(PERSONSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.x11.PersonBaseType)get_store().add_element_user(PERSONSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(personSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "Person__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.PersonBaseType addNewPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.PersonBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.PersonBaseType)get_store().add_element_user(PERSONSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "Affiliation" elements
     */
    public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation[] getAffiliationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AFFILIATION$2, targetList);
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Affiliation" element
     */
    public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation getAffiliationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation target = null;
            target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation)get_store().find_element_user(AFFILIATION$2, i);
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
    public void setAffiliationArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation[] affiliationArray)
    {
        check_orphaned();
        arraySetterHelper(affiliationArray, AFFILIATION$2);
    }
    
    /**
     * Sets ith "Affiliation" element
     */
    public void setAffiliationArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation affiliation)
    {
        generatedSetterHelperImpl(affiliation, AFFILIATION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Affiliation" element
     */
    public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation insertNewAffiliation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation target = null;
            target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation)get_store().insert_element_user(AFFILIATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Affiliation" element
     */
    public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation addNewAffiliation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation target = null;
            target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation)get_store().add_element_user(AFFILIATION$2);
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
     * An XML Affiliation(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class AffiliationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType.Affiliation
    {
        private static final long serialVersionUID = 1L;
        
        public AffiliationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DISPLAYNAME$0 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "DisplayName");
        private static final javax.xml.namespace.QName ORGUNITSUBSTITUTIONGROUPHEAD$2 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit__SubstitutionGroupHead");
        private static final org.apache.xmlbeans.QNameSet ORGUNITSUBSTITUTIONGROUPHEAD$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit__SubstitutionGroupHead"),
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit"),
        });
        
        
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
        public eu.openaire.cerifProfile.x11.OrgUnitBaseType getOrgUnitSubstitutionGroupHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.OrgUnitBaseType target = null;
                target = (eu.openaire.cerifProfile.x11.OrgUnitBaseType)get_store().find_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$3, 0);
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
        public void setOrgUnitSubstitutionGroupHead(eu.openaire.cerifProfile.x11.OrgUnitBaseType orgUnitSubstitutionGroupHead)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.OrgUnitBaseType target = null;
                target = (eu.openaire.cerifProfile.x11.OrgUnitBaseType)get_store().find_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$3, 0);
                if (target == null)
                {
                    target = (eu.openaire.cerifProfile.x11.OrgUnitBaseType)get_store().add_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$2);
                }
                target.set(orgUnitSubstitutionGroupHead);
            }
        }
        
        /**
         * Appends and returns a new empty "OrgUnit__SubstitutionGroupHead" element
         */
        public eu.openaire.cerifProfile.x11.OrgUnitBaseType addNewOrgUnitSubstitutionGroupHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.OrgUnitBaseType target = null;
                target = (eu.openaire.cerifProfile.x11.OrgUnitBaseType)get_store().add_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$2);
                return target;
            }
        }
    }
}
