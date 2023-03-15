/*
 * An XML document type.
 * Localname: ResearchOutput__SubstitutionGroupHead
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one ResearchOutput__SubstitutionGroupHead(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class ResearchOutputSubstitutionGroupHeadDocumentImpl extends eu.openaire.cerifProfile.x11.impl.IndividualSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.ResearchOutputSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResearchOutputSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESEARCHOUTPUTSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ResearchOutput__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet RESEARCHOUTPUTSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Patent"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Publication"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Product"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ResearchOutput__SubstitutionGroupHead"),
    });
    
    
    /**
     * Gets the "ResearchOutput__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.ResearchOutputBaseType getResearchOutputSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ResearchOutputBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.ResearchOutputBaseType)get_store().find_element_user(RESEARCHOUTPUTSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResearchOutput__SubstitutionGroupHead" element
     */
    public void setResearchOutputSubstitutionGroupHead(eu.openaire.cerifProfile.x11.ResearchOutputBaseType researchOutputSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ResearchOutputBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.ResearchOutputBaseType)get_store().find_element_user(RESEARCHOUTPUTSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.x11.ResearchOutputBaseType)get_store().add_element_user(RESEARCHOUTPUTSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(researchOutputSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "ResearchOutput__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.ResearchOutputBaseType addNewResearchOutputSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ResearchOutputBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.ResearchOutputBaseType)get_store().add_element_user(RESEARCHOUTPUTSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
