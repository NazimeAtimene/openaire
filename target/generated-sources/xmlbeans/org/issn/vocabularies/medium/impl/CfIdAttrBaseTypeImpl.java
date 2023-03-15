/*
 * XML Type:  cfIdAttr__BaseType
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.CfIdAttrBaseType
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium.impl;
/**
 * An XML cfIdAttr__BaseType(@http://issn.org/vocabularies/Medium).
 *
 * This is a complex type.
 */
public class CfIdAttrBaseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.issn.vocabularies.medium.CfIdAttrBaseType
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
    public org.issn.vocabularies.medium.CfIdSimpleType xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.CfIdSimpleType target = null;
            target = (org.issn.vocabularies.medium.CfIdSimpleType)get_store().find_attribute_user(ID$0);
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
    public void xsetId(org.issn.vocabularies.medium.CfIdSimpleType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.CfIdSimpleType target = null;
            target = (org.issn.vocabularies.medium.CfIdSimpleType)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.issn.vocabularies.medium.CfIdSimpleType)get_store().add_attribute_user(ID$0);
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
