/*
 * An XML document type.
 * Localname: PersonOrOrgUnit__SubstitutionGroupHead
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.PersonOrOrgUnitSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium.impl;
/**
 * A document containing one PersonOrOrgUnit__SubstitutionGroupHead(@http://issn.org/vocabularies/Medium) element.
 *
 * This is a complex type.
 */
public class PersonOrOrgUnitSubstitutionGroupHeadDocumentImpl extends org.issn.vocabularies.medium.impl.IndividualSubstitutionGroupHeadDocumentImpl implements org.issn.vocabularies.medium.PersonOrOrgUnitSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonOrOrgUnitSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
