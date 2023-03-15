/*
 * XML Type:  cfLinkWithDisplayNameToPersonOrOrgUnit__Type
 * Namespace: http://purl.org/coar/access_right
 * Java type: org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonOrOrgUnitType
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.accessRight.impl;
/**
 * An XML cfLinkWithDisplayNameToPersonOrOrgUnit__Type(@http://purl.org/coar/access_right).
 *
 * This is a complex type.
 */
public class CfLinkWithDisplayNameToPersonOrOrgUnitTypeImpl extends org.purl.coar.accessRight.impl.CfLinkWithDisplayNameBaseTypeImpl implements org.purl.coar.accessRight.CfLinkWithDisplayNameToPersonOrOrgUnitType
{
    private static final long serialVersionUID = 1L;
    
    public CfLinkWithDisplayNameToPersonOrOrgUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "PersonOrOrgUnit__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "PersonOrOrgUnit__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "Person__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "OrgUnit__SubstitutionGroupHead"),
    });
    
    
    /**
     * Gets the "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    public org.purl.coar.accessRight.PersonOrOrgUnitBaseType getPersonOrOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.PersonOrOrgUnitBaseType target = null;
            target = (org.purl.coar.accessRight.PersonOrOrgUnitBaseType)get_store().find_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    public void setPersonOrOrgUnitSubstitutionGroupHead(org.purl.coar.accessRight.PersonOrOrgUnitBaseType personOrOrgUnitSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.PersonOrOrgUnitBaseType target = null;
            target = (org.purl.coar.accessRight.PersonOrOrgUnitBaseType)get_store().find_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (org.purl.coar.accessRight.PersonOrOrgUnitBaseType)get_store().add_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(personOrOrgUnitSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    public org.purl.coar.accessRight.PersonOrOrgUnitBaseType addNewPersonOrOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.PersonOrOrgUnitBaseType target = null;
            target = (org.purl.coar.accessRight.PersonOrOrgUnitBaseType)get_store().add_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
