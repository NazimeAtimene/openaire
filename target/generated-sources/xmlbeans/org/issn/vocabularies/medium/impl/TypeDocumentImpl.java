/*
 * An XML document type.
 * Localname: Type
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.TypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium.impl;
/**
 * A document containing one Type(@http://issn.org/vocabularies/Medium) element.
 *
 * This is a complex type.
 */
public class TypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.issn.vocabularies.medium.TypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "Type");
    
    
    /**
     * Gets the "Type" element
     */
    public org.issn.vocabularies.medium.TypeDocument.Type getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.TypeDocument.Type target = null;
            target = (org.issn.vocabularies.medium.TypeDocument.Type)get_store().find_element_user(TYPE$0, 0);
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
    public void setType(org.issn.vocabularies.medium.TypeDocument.Type type)
    {
        generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Type" element
     */
    public org.issn.vocabularies.medium.TypeDocument.Type addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.TypeDocument.Type target = null;
            target = (org.issn.vocabularies.medium.TypeDocument.Type)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    /**
     * An XML Type(@http://issn.org/vocabularies/Medium).
     *
     * This is an atomic type that is a restriction of org.issn.vocabularies.medium.TypeDocument$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.issn.vocabularies.medium.TypeDocument.Type
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
