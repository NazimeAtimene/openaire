/*
 * XML Type:  cfLinkWithDisplayNameToPersonOrOrgUnit__Type
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonOrOrgUnitType
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium.impl;
/**
 * An XML cfLinkWithDisplayNameToPersonOrOrgUnit__Type(@http://issn.org/vocabularies/Medium).
 *
 * This is a complex type.
 */
public class CfLinkWithDisplayNameToPersonOrOrgUnitTypeImpl extends org.issn.vocabularies.medium.impl.CfLinkWithDisplayNameBaseTypeImpl implements org.issn.vocabularies.medium.CfLinkWithDisplayNameToPersonOrOrgUnitType
{
    private static final long serialVersionUID = 1L;
    
    public CfLinkWithDisplayNameToPersonOrOrgUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "PersonOrOrgUnit__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "Person__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "OrgUnit__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "PersonOrOrgUnit__SubstitutionGroupHead"),
    });
    
    
    /**
     * Gets the "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    public org.issn.vocabularies.medium.PersonOrOrgUnitBaseType getPersonOrOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.PersonOrOrgUnitBaseType target = null;
            target = (org.issn.vocabularies.medium.PersonOrOrgUnitBaseType)get_store().find_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1, 0);
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
    public void setPersonOrOrgUnitSubstitutionGroupHead(org.issn.vocabularies.medium.PersonOrOrgUnitBaseType personOrOrgUnitSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.PersonOrOrgUnitBaseType target = null;
            target = (org.issn.vocabularies.medium.PersonOrOrgUnitBaseType)get_store().find_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (org.issn.vocabularies.medium.PersonOrOrgUnitBaseType)get_store().add_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(personOrOrgUnitSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    public org.issn.vocabularies.medium.PersonOrOrgUnitBaseType addNewPersonOrOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.PersonOrOrgUnitBaseType target = null;
            target = (org.issn.vocabularies.medium.PersonOrOrgUnitBaseType)get_store().add_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
