/*
 * XML Type:  cfLinkWithDisplayName__BaseType
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameBaseType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * An XML cfLinkWithDisplayName__BaseType(@https://www.openaire.eu/cerif-profile/1.1/).
 *
 * This is a complex type.
 */
public class CfLinkWithDisplayNameBaseTypeImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameBaseType
{
    private static final long serialVersionUID = 1L;
    
    public CfLinkWithDisplayNameBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYNAME$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "DisplayName");
    
    
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
