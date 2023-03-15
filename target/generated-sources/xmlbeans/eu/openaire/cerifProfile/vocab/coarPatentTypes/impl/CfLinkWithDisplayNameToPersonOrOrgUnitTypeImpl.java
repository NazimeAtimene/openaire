/*
 * XML Type:  cfLinkWithDisplayNameToPersonOrOrgUnit__Type
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types
 * Java type: eu.openaire.cerifProfile.vocab.coarPatentTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.coarPatentTypes.impl;
/**
 * An XML cfLinkWithDisplayNameToPersonOrOrgUnit__Type(@https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types).
 *
 * This is a complex type.
 */
public class CfLinkWithDisplayNameToPersonOrOrgUnitTypeImpl extends eu.openaire.cerifProfile.vocab.coarPatentTypes.impl.CfLinkWithDisplayNameBaseTypeImpl implements eu.openaire.cerifProfile.vocab.coarPatentTypes.CfLinkWithDisplayNameToPersonOrOrgUnitType
{
    private static final long serialVersionUID = 1L;
    
    public CfLinkWithDisplayNameToPersonOrOrgUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types", "PersonOrOrgUnit__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types", "OrgUnit__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types", "Person__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types", "PersonOrOrgUnit__SubstitutionGroupHead"),
    });
    
    
    /**
     * Gets the "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.coarPatentTypes.PersonOrOrgUnitBaseType getPersonOrOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPatentTypes.PersonOrOrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.PersonOrOrgUnitBaseType)get_store().find_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1, 0);
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
    public void setPersonOrOrgUnitSubstitutionGroupHead(eu.openaire.cerifProfile.vocab.coarPatentTypes.PersonOrOrgUnitBaseType personOrOrgUnitSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPatentTypes.PersonOrOrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.PersonOrOrgUnitBaseType)get_store().find_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.PersonOrOrgUnitBaseType)get_store().add_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(personOrOrgUnitSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.coarPatentTypes.PersonOrOrgUnitBaseType addNewPersonOrOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPatentTypes.PersonOrOrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.PersonOrOrgUnitBaseType)get_store().add_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
