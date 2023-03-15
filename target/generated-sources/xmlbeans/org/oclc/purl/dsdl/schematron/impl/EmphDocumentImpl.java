/*
 * An XML document type.
 * Localname: emph
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.EmphDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one emph(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class EmphDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.EmphDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmphDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPH$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "emph");
    
    
    /**
     * Gets the "emph" element
     */
    public org.oclc.purl.dsdl.schematron.EmphDocument.Emph getEmph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.EmphDocument.Emph target = null;
            target = (org.oclc.purl.dsdl.schematron.EmphDocument.Emph)get_store().find_element_user(EMPH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "emph" element
     */
    public void setEmph(org.oclc.purl.dsdl.schematron.EmphDocument.Emph emph)
    {
        generatedSetterHelperImpl(emph, EMPH$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "emph" element
     */
    public org.oclc.purl.dsdl.schematron.EmphDocument.Emph addNewEmph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.EmphDocument.Emph target = null;
            target = (org.oclc.purl.dsdl.schematron.EmphDocument.Emph)get_store().add_element_user(EMPH$0);
            return target;
        }
    }
    /**
     * An XML emph(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is an atomic type that is a restriction of org.oclc.purl.dsdl.schematron.EmphDocument$Emph.
     */
    public static class EmphImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.oclc.purl.dsdl.schematron.EmphDocument.Emph
    {
        private static final long serialVersionUID = 1L;
        
        public EmphImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected EmphImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        
    }
}
