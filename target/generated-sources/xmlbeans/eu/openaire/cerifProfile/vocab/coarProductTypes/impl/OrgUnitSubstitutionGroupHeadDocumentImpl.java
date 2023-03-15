/*
 * An XML document type.
 * Localname: OrgUnit__SubstitutionGroupHead
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/COAR_Product_Types
 * Java type: eu.openaire.cerifProfile.vocab.coarProductTypes.OrgUnitSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.coarProductTypes.impl;
/**
 * A document containing one OrgUnit__SubstitutionGroupHead(@https://www.openaire.eu/cerif-profile/vocab/COAR_Product_Types) element.
 *
 * This is a complex type.
 */
public class OrgUnitSubstitutionGroupHeadDocumentImpl extends eu.openaire.cerifProfile.vocab.coarProductTypes.impl.PersonOrOrgUnitSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.vocab.coarProductTypes.OrgUnitSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrgUnitSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGUNITSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Product_Types", "OrgUnit__SubstitutionGroupHead");
    
    
    /**
     * Gets the "OrgUnit__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.coarProductTypes.OrgUnitBaseType getOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarProductTypes.OrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarProductTypes.OrgUnitBaseType)get_store().find_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$0, 0);
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
    public void setOrgUnitSubstitutionGroupHead(eu.openaire.cerifProfile.vocab.coarProductTypes.OrgUnitBaseType orgUnitSubstitutionGroupHead)
    {
        generatedSetterHelperImpl(orgUnitSubstitutionGroupHead, ORGUNITSUBSTITUTIONGROUPHEAD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrgUnit__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.coarProductTypes.OrgUnitBaseType addNewOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarProductTypes.OrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarProductTypes.OrgUnitBaseType)get_store().add_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}