/*
 * An XML document type.
 * Localname: Individual__SubstitutionGroupHead
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types
 * Java type: eu.openaire.cerifProfile.vocab.coarPatentTypes.IndividualSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.coarPatentTypes.impl;
/**
 * A document containing one Individual__SubstitutionGroupHead(@https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types) element.
 *
 * This is a complex type.
 */
public class IndividualSubstitutionGroupHeadDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.vocab.coarPatentTypes.IndividualSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndividualSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDIVIDUALSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types", "Individual__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet INDIVIDUALSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types", "OrgUnit__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types", "Person__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types", "PersonOrOrgUnit__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types", "Individual__SubstitutionGroupHead"),
    });
    
    
    /**
     * Gets the "Individual__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.coarPatentTypes.CfIdAttrBaseType getIndividualSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPatentTypes.CfIdAttrBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfIdAttrBaseType)get_store().find_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$1, 0);
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
    public void setIndividualSubstitutionGroupHead(eu.openaire.cerifProfile.vocab.coarPatentTypes.CfIdAttrBaseType individualSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPatentTypes.CfIdAttrBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfIdAttrBaseType)get_store().find_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfIdAttrBaseType)get_store().add_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(individualSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "Individual__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.vocab.coarPatentTypes.CfIdAttrBaseType addNewIndividualSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPatentTypes.CfIdAttrBaseType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfIdAttrBaseType)get_store().add_element_user(INDIVIDUALSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
