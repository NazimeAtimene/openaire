/*
 * An XML document type.
 * Localname: value-of
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.ValueOfDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one value-of(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class ValueOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.ValueOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEOF$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "value-of");
    
    
    /**
     * Gets the "value-of" element
     */
    public org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf getValueOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf target = null;
            target = (org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf)get_store().find_element_user(VALUEOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "value-of" element
     */
    public void setValueOf(org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf valueOf)
    {
        generatedSetterHelperImpl(valueOf, VALUEOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value-of" element
     */
    public org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf addNewValueOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf target = null;
            target = (org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf)get_store().add_element_user(VALUEOF$0);
            return target;
        }
    }
    /**
     * An XML value-of(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class ValueOfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf
    {
        private static final long serialVersionUID = 1L;
        
        public ValueOfImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SELECT$0 = 
            new javax.xml.namespace.QName("", "select");
        
        
        /**
         * Gets the "select" attribute
         */
        public java.lang.String getSelect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "select" attribute
         */
        public org.oclc.purl.dsdl.schematron.PathValue xgetSelect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PathValue target = null;
                target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().find_attribute_user(SELECT$0);
                return target;
            }
        }
        
        /**
         * Sets the "select" attribute
         */
        public void setSelect(java.lang.String select)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SELECT$0);
                }
                target.setStringValue(select);
            }
        }
        
        /**
         * Sets (as xml) the "select" attribute
         */
        public void xsetSelect(org.oclc.purl.dsdl.schematron.PathValue select)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PathValue target = null;
                target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().find_attribute_user(SELECT$0);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().add_attribute_user(SELECT$0);
                }
                target.set(select);
            }
        }
    }
}
