/*
 * An XML document type.
 * Localname: Person__SubstitutionGroupHead
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types
 * Java type: eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.openAIREFundingTypes.impl;
/**
 * A document containing one Person__SubstitutionGroupHead(@https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types) element.
 *
 * This is a complex type.
 */
public class PersonSubstitutionGroupHeadDocumentImpl extends eu.openaire.cerifProfile.vocab.openAIREFundingTypes.impl.PersonOrOrgUnitSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types", "Person__SubstitutionGroupHead");
    
    
    /**
     * Gets the "Person__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonBaseType getPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonBaseType)get_store().find_element_user(PERSONSUBSTITUTIONGROUPHEAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Person__SubstitutionGroupHead" element
     */
    public void setPersonSubstitutionGroupHead(eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonBaseType personSubstitutionGroupHead)
    {
        generatedSetterHelperImpl(personSubstitutionGroupHead, PERSONSUBSTITUTIONGROUPHEAD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Person__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonBaseType addNewPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.PersonBaseType)get_store().add_element_user(PERSONSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
