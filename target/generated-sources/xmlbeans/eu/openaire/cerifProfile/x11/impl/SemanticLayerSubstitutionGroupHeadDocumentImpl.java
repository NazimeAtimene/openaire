/*
 * An XML document type.
 * Localname: SemanticLayer__SubstitutionGroupHead
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.SemanticLayerSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one SemanticLayer__SubstitutionGroupHead(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class SemanticLayerSubstitutionGroupHeadDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.SemanticLayerSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public SemanticLayerSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEMANTICLAYERSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "SemanticLayer__SubstitutionGroupHead");
    private static final org.apache.xmlbeans.QNameSet SEMANTICLAYERSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "SemanticLayer__SubstitutionGroupHead"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Class"),
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ClassScheme"),
    });
    
    
    /**
     * Gets the "SemanticLayer__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.SemanticLayerBaseType getSemanticLayerSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.SemanticLayerBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.SemanticLayerBaseType)get_store().find_element_user(SEMANTICLAYERSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SemanticLayer__SubstitutionGroupHead" element
     */
    public void setSemanticLayerSubstitutionGroupHead(eu.openaire.cerifProfile.x11.SemanticLayerBaseType semanticLayerSubstitutionGroupHead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.SemanticLayerBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.SemanticLayerBaseType)get_store().find_element_user(SEMANTICLAYERSUBSTITUTIONGROUPHEAD$1, 0);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.x11.SemanticLayerBaseType)get_store().add_element_user(SEMANTICLAYERSUBSTITUTIONGROUPHEAD$0);
            }
            target.set(semanticLayerSubstitutionGroupHead);
        }
    }
    
    /**
     * Appends and returns a new empty "SemanticLayer__SubstitutionGroupHead" element
     */
    public eu.openaire.cerifProfile.x11.SemanticLayerBaseType addNewSemanticLayerSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.SemanticLayerBaseType target = null;
            target = (eu.openaire.cerifProfile.x11.SemanticLayerBaseType)get_store().add_element_user(SEMANTICLAYERSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
