/*
 * XML Type:  cfGenericLink__Type
 * Namespace: http://purl.org/coar/resource_type
 * Java type: org.purl.coar.resourceType.CfGenericLinkType
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.resourceType.impl;
/**
 * An XML cfGenericLink__Type(@http://purl.org/coar/resource_type).
 *
 * This is a complex type.
 */
public class CfGenericLinkTypeImpl extends org.purl.coar.resourceType.impl.CfLinkBaseTypeImpl implements org.purl.coar.resourceType.CfGenericLinkType
{
    private static final long serialVersionUID = 1L;
    
    public CfGenericLinkTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDIVIDUALSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("http://purl.org/coar/resource_type", "Individual__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet INDIVIDUALSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/coar/resource_type", "Person__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("http://purl.org/coar/resource_type", "OrgUnit__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("http://purl.org/coar/resource_type", "Individual__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("http://purl.org/coar/resource_type", "PersonOrOrgUnit__SubstitutionGroupHead"),
    });
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "Individual__SubstitutionGroupHead" element
     */
    public org.purl.coar.resourceType.CfIdAttrBaseType getIndividualSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.resourceType.CfIdAttrBaseType target = null;
            target = (org.purl.coar.resourceType.CfIdAttrBaseType)get_store().find_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$1, 0);
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
    public void setIndividualSubstitutionGroupHead(org.purl.coar.resourceType.CfIdAttrBaseType individualSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.resourceType.CfIdAttrBaseType target = null;
            target = (org.purl.coar.resourceType.CfIdAttrBaseType)get_store().find_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (org.purl.coar.resourceType.CfIdAttrBaseType)get_store().add_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(individualSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "Individual__SubstitutionGroupHead" element
     */
    public org.purl.coar.resourceType.CfIdAttrBaseType addNewIndividualSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.resourceType.CfIdAttrBaseType target = null;
            target = (org.purl.coar.resourceType.CfIdAttrBaseType)get_store().add_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
}
