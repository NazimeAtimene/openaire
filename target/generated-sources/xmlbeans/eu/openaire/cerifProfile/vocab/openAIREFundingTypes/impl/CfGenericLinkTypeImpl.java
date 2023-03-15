/*
 * XML Type:  cfGenericLink__Type
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types
 * Java type: eu.openaire.cerifProfile.vocab.openAIREFundingTypes.CfGenericLinkType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.openAIREFundingTypes.impl;
/**
 * An XML cfGenericLink__Type(@https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types).
 *
 * This is a complex type.
 */
public class CfGenericLinkTypeImpl extends eu.openaire.cerifProfile.vocab.openAIREFundingTypes.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.vocab.openAIREFundingTypes.CfGenericLinkType
{
    private static final long serialVersionUID = 1L;
    
    public CfGenericLinkTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDIVIDUALSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types", "Individual__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet INDIVIDUALSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types", "Individual__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types", "PersonOrOrgUnit__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types", "Person__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types", "OrgUnit__SubstitutionGroupHead"),
    });
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "Individual__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.openAIREFundingTypes.CfIdAttrBaseType getIndividualSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.openAIREFundingTypes.CfIdAttrBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.CfIdAttrBaseType)get_store().find_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Individual__SubstitutionGroupHead" element
     */
    public void setIndividualSubstitutionGroupHead(eu.openaire.cerifProfile.vocab.openAIREFundingTypes.CfIdAttrBaseType individualSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.openAIREFundingTypes.CfIdAttrBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.CfIdAttrBaseType)get_store().find_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.CfIdAttrBaseType)get_store().add_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(individualSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "Individual__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.openAIREFundingTypes.CfIdAttrBaseType addNewIndividualSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.openAIREFundingTypes.CfIdAttrBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.openAIREFundingTypes.CfIdAttrBaseType)get_store().add_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
}
