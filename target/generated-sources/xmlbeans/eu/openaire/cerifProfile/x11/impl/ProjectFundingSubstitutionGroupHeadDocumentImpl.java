/*
 * An XML document type.
 * Localname: ProjectFunding__SubstitutionGroupHead
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.ProjectFundingSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one ProjectFunding__SubstitutionGroupHead(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class ProjectFundingSubstitutionGroupHeadDocumentImpl extends eu.openaire.cerifProfile.x11.impl.IndividualSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.ProjectFundingSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProjectFundingSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROJECTFUNDINGSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ProjectFunding__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet PROJECTFUNDINGSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ProjectFunding__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Project"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Funding"),
    });
    
    
    /**
     * Gets the "ProjectFunding__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.ProjectFundingBaseType getProjectFundingSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ProjectFundingBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.ProjectFundingBaseType)get_store().find_element_user(PROJECTFUNDINGSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProjectFunding__SubstitutionGroupHead" element
     */
    public void setProjectFundingSubstitutionGroupHead(eu.openaire.cerifProfile.x11.ProjectFundingBaseType projectFundingSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ProjectFundingBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.ProjectFundingBaseType)get_store().find_element_user(PROJECTFUNDINGSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.x11.ProjectFundingBaseType)get_store().add_element_user(PROJECTFUNDINGSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(projectFundingSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "ProjectFunding__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.ProjectFundingBaseType addNewProjectFundingSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ProjectFundingBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.ProjectFundingBaseType)get_store().add_element_user(PROJECTFUNDINGSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
