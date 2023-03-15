/*
 * An XML document type.
 * Localname: Type
 * Namespace: http://purl.org/coar/resource_type
 * Java type: org.purl.coar.resourceType.TypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.resourceType.impl;
/**
 * A document containing one Type(@http://purl.org/coar/resource_type) element.
 *
 * This is a complex type.
 */
public class TypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.purl.coar.resourceType.TypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://purl.org/coar/resource_type", "Type");
    
    
    /**
     * Gets the "Type" element
     */
    public org.purl.coar.resourceType.TypeDocument.Type getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.resourceType.TypeDocument.Type target = null;
            target = (org.purl.coar.resourceType.TypeDocument.Type)get_store().find_element_user(TYPE$0, 0);
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
    public void setType(org.purl.coar.resourceType.TypeDocument.Type type)
    {
        generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Type" element
     */
    public org.purl.coar.resourceType.TypeDocument.Type addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.resourceType.TypeDocument.Type target = null;
            target = (org.purl.coar.resourceType.TypeDocument.Type)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    /**
     * An XML Type(@http://purl.org/coar/resource_type).
     *
     * This is an atomic type that is a restriction of org.purl.coar.resourceType.TypeDocument$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.purl.coar.resourceType.TypeDocument.Type
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
