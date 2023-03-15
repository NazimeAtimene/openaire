/*
 * XML Type:  cfIdAttr__BaseType
 * Namespace: http://purl.org/coar/access_right
 * Java type: org.purl.coar.accessRight.CfIdAttrBaseType
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.accessRight.impl;
/**
 * An XML cfIdAttr__BaseType(@http://purl.org/coar/access_right).
 *
 * This is a complex type.
 */
public class CfIdAttrBaseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.purl.coar.accessRight.CfIdAttrBaseType
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
    public org.purl.coar.accessRight.CfIdSimpleType xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.CfIdSimpleType target = null;
            target = (org.purl.coar.accessRight.CfIdSimpleType)get_store().find_attribute_user(ID$0);
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
    public void xsetId(org.purl.coar.accessRight.CfIdSimpleType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.CfIdSimpleType target = null;
            target = (org.purl.coar.accessRight.CfIdSimpleType)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.purl.coar.accessRight.CfIdSimpleType)get_store().add_attribute_user(ID$0);
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
