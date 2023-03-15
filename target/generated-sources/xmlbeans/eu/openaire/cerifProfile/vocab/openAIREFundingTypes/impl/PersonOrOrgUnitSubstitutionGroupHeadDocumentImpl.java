/*
 * An XML document type.
 * Localname: PersonOrOrgUnit__SubstitutionGroupHead
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types
 * Java type: eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonOrOrgUnitSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.openAIREFundingTypes.impl;
/**
 * A document containing one PersonOrOrgUnit__SubstitutionGroupHead(@https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types) element.
 *
 * This is a complex type.
 */
public class PersonOrOrgUnitSubstitutionGroupHeadDocumentImpl extends eu.openaire.cerifProfile.vocab.openAIREFundingTypes.impl.IndividualSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonOrOrgUnitSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonOrOrgUnitSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types", "PersonOrOrgUnit__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types", "PersonOrOrgUnit__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types", "Person__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types", "OrgUnit__SubstitutionGroupHead"),
    });
    
    
    /**
     * Gets the "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonOrOrgUnitBaseType getPersonOrOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonOrOrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonOrOrgUnitBaseType)get_store().find_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1, 0);
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
    public void setPersonOrOrgUnitSubstitutionGroupHead(eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonOrOrgUnitBaseType personOrOrgUnitSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonOrOrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonOrOrgUnitBaseType)get_store().find_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonOrOrgUnitBaseType)get_store().add_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(personOrOrgUnitSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonOrOrgUnit__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonOrOrgUnitBaseType addNewPersonOrOrgUnitSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonOrOrgUnitBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonOrOrgUnitBaseType)get_store().add_element_user(PERSONORORGUNITSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
