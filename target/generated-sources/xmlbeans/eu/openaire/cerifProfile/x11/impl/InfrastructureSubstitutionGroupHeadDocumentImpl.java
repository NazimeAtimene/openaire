/*
 * An XML document type.
 * Localname: Infrastructure__SubstitutionGroupHead
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.InfrastructureSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one Infrastructure__SubstitutionGroupHead(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class InfrastructureSubstitutionGroupHeadDocumentImpl extends eu.openaire.cerifProfile.x11.impl.IndividualSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.InfrastructureSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public InfrastructureSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INFRASTRUCTURESUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Infrastructure__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet INFRASTRUCTURESUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Service"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Infrastructure__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Equipment"),
    });
    
    
    /**
     * Gets the "Infrastructure__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.InfrastructureBaseType getInfrastructureSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.InfrastructureBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.InfrastructureBaseType)get_store().find_element_user(INFRASTRUCTURESUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Infrastructure__SubstitutionGroupHead" element
     */
    public void setInfrastructureSubstitutionGroupHead(eu.openaire.cerifProfile.x11.InfrastructureBaseType infrastructureSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.InfrastructureBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.InfrastructureBaseType)get_store().find_element_user(INFRASTRUCTURESUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.x11.InfrastructureBaseType)get_store().add_element_user(INFRASTRUCTURESUBSTITUTIONGROUPHEAD$0);
            }
            target.set(infrastructureSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "Infrastructure__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.InfrastructureBaseType addNewInfrastructureSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.InfrastructureBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.InfrastructureBaseType)get_store().add_element_user(INFRASTRUCTURESUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
