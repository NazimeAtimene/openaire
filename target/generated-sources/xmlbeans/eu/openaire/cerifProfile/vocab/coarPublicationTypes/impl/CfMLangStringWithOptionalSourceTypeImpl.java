/*
 * XML Type:  cfMLangStringWithOptionalSource__Type
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/COAR_Publication_Types
 * Java type: eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfMLangStringWithOptionalSourceType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.coarPublicationTypes.impl;
/**
 * An XML cfMLangStringWithOptionalSource__Type(@https://www.openaire.eu/cerif-profile/vocab/COAR_Publication_Types).
 *
 * This is an atomic type that is a restriction of eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfMLangStringWithOptionalSourceType.
 */
public class CfMLangStringWithOptionalSourceTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfMLangStringWithOptionalSourceType
{
    private static final long serialVersionUID = 1L;
    
    public CfMLangStringWithOptionalSourceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CfMLangStringWithOptionalSourceTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName LANG$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName TRANS$2 = 
        new javax.xml.namespace.QName("", "trans");
    private static final javax.xml.namespace.QName SOURCE$4 = 
        new javax.xml.namespace.QName("", "source");
    
    
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
    public eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfTransType.Enum getTrans()
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
            return (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfTransType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "trans" attribute
     */
    public eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfTransType xgetTrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfTransType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfTransType)get_store().find_attribute_user(TRANS$2);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfTransType)get_default_attribute_value(TRANS$2);
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
    public void setTrans(eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfTransType.Enum trans)
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
    public void xsetTrans(eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfTransType trans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfTransType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfTransType)get_store().find_attribute_user(TRANS$2);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.vocab.coarPublicationTypes.CfTransType)get_store().add_attribute_user(TRANS$2);
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
    
    /**
     * Gets the "source" attribute
     */
    public java.lang.String getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCE$4);
            return target;
        }
    }
    
    /**
     * True if has "source" attribute
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOURCE$4) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(java.lang.String source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$4);
            }
            target.setStringValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(org.apache.xmlbeans.XmlString source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOURCE$4);
            }
            target.set(source);
        }
    }
    
    /**
     * Unsets the "source" attribute
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOURCE$4);
        }
    }
}
