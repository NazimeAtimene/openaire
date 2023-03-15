/*
 * An XML document type.
 * Localname: OrgUnit__SubstitutionGroupHead
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility
 * Java type: eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.OrgUnitSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.impl;
/**
 * A document containing one OrgUnit__SubstitutionGroupHead(@https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility) element.
 *
 * This is a complex type.
 */
public class OrgUnitSubstitutionGroupHeadDocumentImpl extends eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.impl.PersonOrOrgUnitSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.OrgUnitSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrgUnitSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGUNITSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility", "OrgUnit__SubstitutionGroupHead");
    
    
    /**
     * Gets the "OrgUnit__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.OrgUnitBaseType getOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.OrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.OrgUnitBaseType)get_store().find_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$0, 0);
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
    public void setOrgUnitSubstitutionGroupHead(eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.OrgUnitBaseType orgUnitSubstitutionGroupHead)
    {
        generatedSetterHelperImpl(orgUnitSubstitutionGroupHead, ORGUNITSUBSTITUTIONGROUPHEAD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrgUnit__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.OrgUnitBaseType addNewOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.OrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.OrgUnitBaseType)get_store().add_element_user(ORGUNITSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
