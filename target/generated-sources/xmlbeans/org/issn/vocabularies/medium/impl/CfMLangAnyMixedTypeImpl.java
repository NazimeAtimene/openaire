/*
 * XML Type:  cfMLangAnyMixed__Type
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.CfMLangAnyMixedType
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium.impl;
/**
 * An XML cfMLangAnyMixed__Type(@http://issn.org/vocabularies/Medium).
 *
 * This is a complex type.
 */
public class CfMLangAnyMixedTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.issn.vocabularies.medium.CfMLangAnyMixedType
{
    private static final long serialVersionUID = 1L;
    
    public CfMLangAnyMixedTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
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
     * Gets the "trans" attribute
     */
    public org.issn.vocabularies.medium.CfTransType.Enum getTrans()
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
            return (org.issn.vocabularies.medium.CfTransType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "trans" attribute
     */
    public org.issn.vocabularies.medium.CfTransType xgetTrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.CfTransType target = null;
            target = (org.issn.vocabularies.medium.CfTransType)get_store().find_attribute_user(TRANS$2);
            if (target == null)
            {
                target = (org.issn.vocabularies.medium.CfTransType)get_default_attribute_value(TRANS$2);
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
    public void setTrans(org.issn.vocabularies.medium.CfTransType.Enum trans)
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
    public void xsetTrans(org.issn.vocabularies.medium.CfTransType trans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.CfTransType target = null;
            target = (org.issn.vocabularies.medium.CfTransType)get_store().find_attribute_user(TRANS$2);
            if (target == null)
            {
                target = (org.issn.vocabularies.medium.CfTransType)get_store().add_attribute_user(TRANS$2);
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
