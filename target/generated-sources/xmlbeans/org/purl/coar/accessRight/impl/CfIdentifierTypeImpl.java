/*
 * XML Type:  cfIdentifier__Type
 * Namespace: http://purl.org/coar/access_right
 * Java type: org.purl.coar.accessRight.CfIdentifierType
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.accessRight.impl;
/**
 * An XML cfIdentifier__Type(@http://purl.org/coar/access_right).
 *
 * This is an atomic type that is a restriction of org.purl.coar.accessRight.CfIdentifierType.
 */
public class CfIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.purl.coar.accessRight.CfIdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public CfIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CfIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ISSUERSERVICEID$0 = 
        new javax.xml.namespace.QName("", "issuerServiceId");
    
    
    /**
     * Gets the "issuerServiceId" attribute
     */
    public java.lang.String getIssuerServiceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSUERSERVICEID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "issuerServiceId" attribute
     */
    public org.purl.coar.accessRight.CfIdSimpleType xgetIssuerServiceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.CfIdSimpleType target = null;
            target = (org.purl.coar.accessRight.CfIdSimpleType)get_store().find_attribute_user(ISSUERSERVICEID$0);
            return target;
        }
    }
    
    /**
     * True if has "issuerServiceId" attribute
     */
    public boolean isSetIssuerServiceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISSUERSERVICEID$0) != null;
        }
    }
    
    /**
     * Sets the "issuerServiceId" attribute
     */
    public void setIssuerServiceId(java.lang.String issuerServiceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSUERSERVICEID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISSUERSERVICEID$0);
            }
            target.setStringValue(issuerServiceId);
        }
    }
    
    /**
     * Sets (as xml) the "issuerServiceId" attribute
     */
    public void xsetIssuerServiceId(org.purl.coar.accessRight.CfIdSimpleType issuerServiceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.CfIdSimpleType target = null;
            target = (org.purl.coar.accessRight.CfIdSimpleType)get_store().find_attribute_user(ISSUERSERVICEID$0);
            if (target == null)
            {
                target = (org.purl.coar.accessRight.CfIdSimpleType)get_store().add_attribute_user(ISSUERSERVICEID$0);
            }
            target.set(issuerServiceId);
        }
    }
    
    /**
     * Unsets the "issuerServiceId" attribute
     */
    public void unsetIssuerServiceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISSUERSERVICEID$0);
        }
    }
}