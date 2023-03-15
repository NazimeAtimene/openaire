/*
 * An XML document type.
 * Localname: Compatibility
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility
 * Java type: eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.impl;
/**
 * A document containing one Compatibility(@https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility) element.
 *
 * This is a complex type.
 */
public class CompatibilityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompatibilityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPATIBILITY$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility", "Compatibility");
    
    
    /**
     * Gets the "Compatibility" element
     */
    public eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility getCompatibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility target = null;
            target = (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility)get_store().find_element_user(COMPATIBILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Compatibility" element
     */
    public void setCompatibility(eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility compatibility)
    {
        generatedSetterHelperImpl(compatibility, COMPATIBILITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Compatibility" element
     */
    public eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility addNewCompatibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility target = null;
            target = (eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility)get_store().add_element_user(COMPATIBILITY$0);
            return target;
        }
    }
    /**
     * An XML Compatibility(@https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility).
     *
     * This is an atomic type that is a restriction of eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument$Compatibility.
     */
    public static class CompatibilityImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements eu.openaire.cerifProfile.vocab.openAIREServiceCompatibility.CompatibilityDocument.Compatibility
    {
        private static final long serialVersionUID = 1L;
        
        public CompatibilityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected CompatibilityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        
    }
}
