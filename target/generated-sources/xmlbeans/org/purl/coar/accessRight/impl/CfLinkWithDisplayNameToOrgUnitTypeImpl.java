/*
 * XML Type:  cfLinkWithDisplayNameToOrgUnit__Type
 * Namespace: http://purl.org/coar/access_right
 * Java type: org.purl.coar.accessRight.CfLinkWithDisplayNameToOrgUnitType
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.accessRight.impl;
/**
 * An XML cfLinkWithDisplayNameToOrgUnit__Type(@http://purl.org/coar/access_right).
 *
 * This is a complex type.
 */
public class CfLinkWithDisplayNameToOrgUnitTypeImpl extends org.purl.coar.accessRight.impl.CfLinkWithDisplayNameBaseTypeImpl implements org.purl.coar.accessRight.CfLinkWithDisplayNameToOrgUnitType
{
    private static final long serialVersionUID = 1L;
    
    public CfLinkWithDisplayNameToOrgUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGUNITSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "OrgUnit__SubstitutionGroupHead");
    
    
    /**
     * Gets the "OrgUnit__SubstitutionGroupHead" element
     */
    public org.purl.coar.accessRight.OrgUnitBaseType getOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.OrgUnitBaseType target = null;
            target = (org.purl.coar.accessRight.OrgUnitBaseType)get_store().find_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrgUnit__SubstitutionGroupHead" element
     */
    public void setOrgUnitSubstitutionGroupHead(org.purl.coar.accessRight.OrgUnitBaseType orgUnitSubstitutionGroupHead)
    {
        generatedSetterHelperImpl(orgUnitSubstitutionGroupHead, ORGUNITSUBSTITUTIONGROUPHEAD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrgUnit__SubstitutionGroupHead" element
     */
    public org.purl.coar.accessRight.OrgUnitBaseType addNewOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.OrgUnitBaseType target = null;
            target = (org.purl.coar.accessRight.OrgUnitBaseType)get_store().add_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
