/*
 * XML Type:  cfLinkWithDisplayName__BaseType
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.CfLinkWithDisplayNameBaseType
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium.impl;
/**
 * An XML cfLinkWithDisplayName__BaseType(@http://issn.org/vocabularies/Medium).
 *
 * This is a complex type.
 */
public class CfLinkWithDisplayNameBaseTypeImpl extends org.issn.vocabularies.medium.impl.CfLinkBaseTypeImpl implements org.issn.vocabularies.medium.CfLinkWithDisplayNameBaseType
{
    private static final long serialVersionUID = 1L;
    
    public CfLinkWithDisplayNameBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYNAME$0 = 
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "DisplayName");
    
    
    /**
     * Gets the "DisplayName" element
     */
    public java.lang.String getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DisplayName" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "DisplayName" element
     */
    public boolean isSetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "DisplayName" element
     */
    public void setDisplayName(java.lang.String displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYNAME$0);
            }
            target.setStringValue(displayName);
        }
    }
    
    /**
     * Sets (as xml) the "DisplayName" element
     */
    public void xsetDisplayName(org.apache.xmlbeans.XmlString displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYNAME$0);
            }
            target.set(displayName);
        }
    }
    
    /**
     * Unsets the "DisplayName" element
     */
    public void unsetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYNAME$0, 0);
        }
    }
}