/*
 * An XML document type.
 * Localname: Individual__SubstitutionGroupHead
 * Namespace: http://purl.org/coar/access_right
 * Java type: org.purl.coar.accessRight.IndividualSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.accessRight.impl;
/**
 * A document containing one Individual__SubstitutionGroupHead(@http://purl.org/coar/access_right) element.
 *
 * This is a complex type.
 */
public class IndividualSubstitutionGroupHeadDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.purl.coar.accessRight.IndividualSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndividualSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDIVIDUALSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "Individual__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet INDIVIDUALSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "Individual__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "PersonOrOrgUnit__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "Person__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "OrgUnit__SubstitutionGroupHead"),
    });
    
    
    /**
     * Gets the "Individual__SubstitutionGroupHead" element
     */
    public org.purl.coar.accessRight.CfIdAttrBaseType getIndividualSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.CfIdAttrBaseType target = null;
            target = (org.purl.coar.accessRight.CfIdAttrBaseType)get_store().find_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$1, 0);
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
    public void setIndividualSubstitutionGroupHead(org.purl.coar.accessRight.CfIdAttrBaseType individualSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.CfIdAttrBaseType target = null;
            target = (org.purl.coar.accessRight.CfIdAttrBaseType)get_store().find_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (org.purl.coar.accessRight.CfIdAttrBaseType)get_store().add_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(individualSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "Individual__SubstitutionGroupHead" element
     */
    public org.purl.coar.accessRight.CfIdAttrBaseType addNewIndividualSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.CfIdAttrBaseType target = null;
            target = (org.purl.coar.accessRight.CfIdAttrBaseType)get_store().add_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
