/*
 * XML Type:  cfAmount__Type
 * Namespace: http://purl.org/coar/resource_type
 * Java type: org.purl.coar.resourceType.CfAmountType
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.resourceType.impl;
/**
 * An XML cfAmount__Type(@http://purl.org/coar/resource_type).
 *
 * This is an atomic type that is a restriction of org.purl.coar.resourceType.CfAmountType.
 */
public class CfAmountTypeImpl extends org.apache.xmlbeans.impl.values.JavaFloatHolderEx implements org.purl.coar.resourceType.CfAmountType
{
    private static final long serialVersionUID = 1L;
    
    public CfAmountTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CfAmountTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CURRENCY$0 = 
        new javax.xml.namespace.QName("", "currency");
    
    
    /**
     * Gets the "currency" attribute
     */
    public java.lang.String getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCY$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "currency" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CURRENCY$0);
            return target;
        }
    }
    
    /**
     * Sets the "currency" attribute
     */
    public void setCurrency(java.lang.String currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENCY$0);
            }
            target.setStringValue(currency);
        }
    }
    
    /**
     * Sets (as xml) the "currency" attribute
     */
    public void xsetCurrency(org.apache.xmlbeans.XmlString currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CURRENCY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CURRENCY$0);
            }
            target.set(currency);
        }
    }
}
