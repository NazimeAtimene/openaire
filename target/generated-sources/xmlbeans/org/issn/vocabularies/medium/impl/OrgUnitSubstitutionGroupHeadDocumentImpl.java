/*
 * An XML document type.
 * Localname: OrgUnit__SubstitutionGroupHead
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.OrgUnitSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium.impl;
/**
 * A document containing one OrgUnit__SubstitutionGroupHead(@http://issn.org/vocabularies/Medium) element.
 *
 * This is a complex type.
 */
public class OrgUnitSubstitutionGroupHeadDocumentImpl extends org.issn.vocabularies.medium.impl.PersonOrOrgUnitSubstitutionGroupHeadDocumentImpl implements org.issn.vocabularies.medium.OrgUnitSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrgUnitSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGUNITSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "OrgUnit__SubstitutionGroupHead");
    
    
    /**
     * Gets the "OrgUnit__SubstitutionGroupHead" element
     */
    public org.issn.vocabularies.medium.OrgUnitBaseType getOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.OrgUnitBaseType target = null;
            target = (org.issn.vocabularies.medium.OrgUnitBaseType)get_store().find_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$0, 0);
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
        generatedSetterHelperImpl(orgUnitSubstitutionGroupHead, ORGUNITSUBSTITUTIONGROUPHEAD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.issn.vocabularies.medium.OrgUnitBaseType)get_store().add_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
