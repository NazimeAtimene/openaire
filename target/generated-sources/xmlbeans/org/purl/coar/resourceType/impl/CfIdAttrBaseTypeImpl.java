/*
 * XML Type:  cfIdAttr__BaseType
 * Namespace: http://purl.org/coar/resource_type
 * Java type: org.purl.coar.resourceType.CfIdAttrBaseType
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.resourceType.impl;
/**
 * An XML cfIdAttr__BaseType(@http://purl.org/coar/resource_type).
 *
 * This is a complex type.
 */
public class CfIdAttrBaseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.purl.coar.resourceType.CfIdAttrBaseType
{
    private static final long serialVersionUID = 1L;
    
    public CfIdAttrBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.purl.coar.resourceType.CfIdSimpleType xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.resourceType.CfIdSimpleType target = null;
            target = (org.purl.coar.resourceType.CfIdSimpleType)get_store().find_attribute_user(ID$0);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$0) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.purl.coar.resourceType.CfIdSimpleType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.resourceType.CfIdSimpleType target = null;
            target = (org.purl.coar.resourceType.CfIdSimpleType)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.purl.coar.resourceType.CfIdSimpleType)get_store().add_attribute_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$0);
        }
    }
}
