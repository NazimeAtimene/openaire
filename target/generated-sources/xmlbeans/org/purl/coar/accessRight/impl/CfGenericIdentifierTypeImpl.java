/*
 * XML Type:  cfGenericIdentifier__Type
 * Namespace: http://purl.org/coar/access_right
 * Java type: org.purl.coar.accessRight.CfGenericIdentifierType
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.accessRight.impl;
/**
 * An XML cfGenericIdentifier__Type(@http://purl.org/coar/access_right).
 *
 * This is an atomic type that is a restriction of org.purl.coar.accessRight.CfGenericIdentifierType.
 */
public class CfGenericIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.purl.coar.accessRight.CfGenericIdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public CfGenericIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CfGenericIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ISSUERSERVICEID$0 = 
        new javax.xml.namespace.QName("", "issuerServiceId");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    
    
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
    public org.apache.xmlbeans.XmlAnyURI xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TYPE$2);
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
    public void xsetType(org.apache.xmlbeans.XmlAnyURI type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
}
