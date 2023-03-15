/*
 * An XML document type.
 * Localname: PersonOrOrgUnit__SubstitutionGroupHead
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.PersonOrOrgUnitSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one PersonOrOrgUnit__SubstitutionGroupHead(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class PersonOrOrgUnitSubstitutionGroupHeadDocumentImpl extends eu.openaire.cerifProfile.x11.impl.IndividualSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.PersonOrOrgUnitSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonOrOrgUnitSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PersonOrOrgUnit__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Person__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Person"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PersonOrOrgUnit__SubstitutionGroupHead"),
    });
    
    
    /**
     * Gets the "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.PersonOrOrgUnitBaseType getPersonOrOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.PersonOrOrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.PersonOrOrgUnitBaseType)get_store().find_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    public void setPersonOrOrgUnitSubstitutionGroupHead(eu.openaire.cerifProfile.x11.PersonOrOrgUnitBaseType personOrOrgUnitSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.PersonOrOrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.PersonOrOrgUnitBaseType)get_store().find_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.x11.PersonOrOrgUnitBaseType)get_store().add_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(personOrOrgUnitSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.PersonOrOrgUnitBaseType addNewPersonOrOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.PersonOrOrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.PersonOrOrgUnitBaseType)get_store().add_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
