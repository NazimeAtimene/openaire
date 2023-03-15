/*
 * An XML document type.
 * Localname: OrgUnit__SubstitutionGroupHead
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.OrgUnitSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one OrgUnit__SubstitutionGroupHead(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class OrgUnitSubstitutionGroupHeadDocumentImpl extends eu.openaire.cerifProfile.x11.impl.PersonOrOrgUnitSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.OrgUnitSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrgUnitSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGUNITSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet ORGUNITSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit"),
    });
    
    
    /**
     * Gets the "OrgUnit__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.OrgUnitBaseType getOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.OrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.OrgUnitBaseType)get_store().find_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$1, 0);
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
    public void setOrgUnitSubstitutionGroupHead(eu.openaire.cerifProfile.x11.OrgUnitBaseType orgUnitSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.OrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.OrgUnitBaseType)get_store().find_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.x11.OrgUnitBaseType)get_store().add_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(orgUnitSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "OrgUnit__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.OrgUnitBaseType addNewOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.OrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.OrgUnitBaseType)get_store().add_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}