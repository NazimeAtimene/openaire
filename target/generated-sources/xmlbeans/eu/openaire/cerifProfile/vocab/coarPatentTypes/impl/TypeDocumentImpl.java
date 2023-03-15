/*
 * An XML document type.
 * Localname: Type
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types
 * Java type: eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.coarPatentTypes.impl;
/**
 * A document containing one Type(@https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types) element.
 *
 * This is a complex type.
 */
public class TypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types", "Type");
    
    
    /**
     * Gets the "Type" element
     */
    public eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type type)
    {
        generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Type" element
     */
    public eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    /**
     * An XML Type(@https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types).
     *
     * This is an atomic type that is a restriction of eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements eu.openaire.cerifProfile.vocab.coarPatentTypes.TypeDocument.Type
    {
        private static final long serialVersionUID = 1L;
        
        public TypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        
    }
}
