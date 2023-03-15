/*
 * XML Type:  cfMLangString__Type
 * Namespace: http://purl.org/coar/resource_type
 * Java type: org.purl.coar.resourceType.CfMLangStringType
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.resourceType.impl;
/**
 * An XML cfMLangString__Type(@http://purl.org/coar/resource_type).
 *
 * This is an atomic type that is a restriction of org.purl.coar.resourceType.CfMLangStringType.
 */
public class CfMLangStringTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.purl.coar.resourceType.CfMLangStringType
{
    private static final long serialVersionUID = 1L;
    
    public CfMLangStringTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CfMLangStringTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName LANG$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName TRANS$2 = 
        new javax.xml.namespace.QName("", "trans");
    
    
    /**
     * Gets the "lang" attribute
     */
    public java.lang.String getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.w3.xml.x1998.namespace.LangAttribute.Lang xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.xml.x1998.namespace.LangAttribute.Lang target = null;
            target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$0);
            return target;
        }
    }
    
    /**
     * True if has "lang" attribute
     */
    public boolean isSetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANG$0) != null;
        }
    }
    
    /**
     * Sets the "lang" attribute
     */
    public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
            }
            target.setStringValue(lang);
        }
    }
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.w3.xml.x1998.namespace.LangAttribute.Lang lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.xml.x1998.namespace.LangAttribute.Lang target = null;
            target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$0);
            if (target == null)
            {
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().add_attribute_user(LANG$0);
            }
            target.set(lang);
        }
    }
    
    /**
     * Unsets the "lang" attribute
     */
    public void unsetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANG$0);
        }
    }
    
    /**
     * Gets the "trans" attribute
     */
    public org.purl.coar.resourceType.CfTransType.Enum getTrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRANS$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.purl.coar.resourceType.CfTransType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "trans" attribute
     */
    public org.purl.coar.resourceType.CfTransType xgetTrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.resourceType.CfTransType target = null;
            target = (org.purl.coar.resourceType.CfTransType)get_store().find_attribute_user(TRANS$2);
            if (target == null)
            {
                target = (org.purl.coar.resourceType.CfTransType)get_default_attribute_value(TRANS$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "trans" attribute
     */
    public boolean isSetTrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRANS$2) != null;
        }
    }
    
    /**
     * Sets the "trans" attribute
     */
    public void setTrans(org.purl.coar.resourceType.CfTransType.Enum trans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANS$2);
            }
            target.setEnumValue(trans);
        }
    }
    
    /**
     * Sets (as xml) the "trans" attribute
     */
    public void xsetTrans(org.purl.coar.resourceType.CfTransType trans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.resourceType.CfTransType target = null;
            target = (org.purl.coar.resourceType.CfTransType)get_store().find_attribute_user(TRANS$2);
            if (target == null)
            {
                target = (org.purl.coar.resourceType.CfTransType)get_store().add_attribute_user(TRANS$2);
            }
            target.set(trans);
        }
    }
    
    /**
     * Unsets the "trans" attribute
     */
    public void unsetTrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRANS$2);
        }
    }
}
