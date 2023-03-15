/*
 * An XML document type.
 * Localname: span
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.SpanDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one span(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class SpanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.SpanDocument
{
    private static final long serialVersionUID = 1L;
    
    public SpanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPAN$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "span");
    
    
    /**
     * Gets the "span" element
     */
    public org.oclc.purl.dsdl.schematron.SpanDocument.Span getSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.SpanDocument.Span target = null;
            target = (org.oclc.purl.dsdl.schematron.SpanDocument.Span)get_store().find_element_user(SPAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "span" element
     */
    public void setSpan(org.oclc.purl.dsdl.schematron.SpanDocument.Span span)
    {
        generatedSetterHelperImpl(span, SPAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "span" element
     */
    public org.oclc.purl.dsdl.schematron.SpanDocument.Span addNewSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.SpanDocument.Span target = null;
            target = (org.oclc.purl.dsdl.schematron.SpanDocument.Span)get_store().add_element_user(SPAN$0);
            return target;
        }
    }
    /**
     * An XML span(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class SpanImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.SpanDocument.Span
    {
        private static final long serialVersionUID = 1L;
        
        public SpanImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLASS1$0 = 
            new javax.xml.namespace.QName("", "class");
        
        
        /**
         * Gets the "class" attribute
         */
        public java.lang.String getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "class" attribute
         */
        public org.oclc.purl.dsdl.schematron.ClassValue xgetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ClassValue target = null;
                target = (org.oclc.purl.dsdl.schematron.ClassValue)get_store().find_attribute_user(CLASS1$0);
                return target;
            }
        }
        
        /**
         * Sets the "class" attribute
         */
        public void setClass1(java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$0);
                }
                target.setStringValue(class1);
            }
        }
        
        /**
         * Sets (as xml) the "class" attribute
         */
        public void xsetClass1(org.oclc.purl.dsdl.schematron.ClassValue class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ClassValue target = null;
                target = (org.oclc.purl.dsdl.schematron.ClassValue)get_store().find_attribute_user(CLASS1$0);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.ClassValue)get_store().add_attribute_user(CLASS1$0);
                }
                target.set(class1);
            }
        }
    }
}
