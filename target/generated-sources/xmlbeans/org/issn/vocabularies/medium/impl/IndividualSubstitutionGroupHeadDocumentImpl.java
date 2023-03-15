/*
 * An XML document type.
 * Localname: Individual__SubstitutionGroupHead
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.IndividualSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium.impl;
/**
 * A document containing one Individual__SubstitutionGroupHead(@http://issn.org/vocabularies/Medium) element.
 *
 * This is a complex type.
 */
public class IndividualSubstitutionGroupHeadDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.issn.vocabularies.medium.IndividualSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndividualSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDIVIDUALSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "Individual__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet INDIVIDUALSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "Person__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "OrgUnit__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "Individual__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "PersonOrOrgUnit__SubstitutionGroupHead"),
    });
    
    
    /**
     * Gets the "Individual__SubstitutionGroupHead" element
     */
    public org.issn.vocabularies.medium.CfIdAttrBaseType getIndividualSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.CfIdAttrBaseType target = null;
            target = (org.issn.vocabularies.medium.CfIdAttrBaseType)get_store().find_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Individual__SubstitutionGroupHead" element
     */
    public void setIndividualSubstitutionGroupHead(org.issn.vocabularies.medium.CfIdAttrBaseType individualSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.CfIdAttrBaseType target = null;
            target = (org.issn.vocabularies.medium.CfIdAttrBaseType)get_store().find_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (org.issn.vocabularies.medium.CfIdAttrBaseType)get_store().add_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(individualSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "Individual__SubstitutionGroupHead" element
     */
    public org.issn.vocabularies.medium.CfIdAttrBaseType addNewIndividualSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.CfIdAttrBaseType target = null;
            target = (org.issn.vocabularies.medium.CfIdAttrBaseType)get_store().add_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
