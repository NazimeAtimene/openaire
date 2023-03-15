/*
 * An XML document type.
 * Localname: extends
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.ExtendsDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one extends(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class ExtendsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.ExtendsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtendsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENDS$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "extends");
    
    
    /**
     * Gets the "extends" element
     */
    public org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends getExtends()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends target = null;
            target = (org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends)get_store().find_element_user(EXTENDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "extends" element
     */
    public void setExtends(org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends xextends)
    {
        generatedSetterHelperImpl(xextends, EXTENDS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extends" element
     */
    public org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends addNewExtends()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends target = null;
            target = (org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends)get_store().add_element_user(EXTENDS$0);
            return target;
        }
    }
    /**
     * An XML extends(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class ExtendsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends
    {
        private static final long serialVersionUID = 1L;
        
        public ExtendsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HREF$0 = 
            new javax.xml.namespace.QName("", "href");
        
        
        /**
         * Gets the "href" attribute
         */
        public java.lang.String getHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "href" attribute
         */
        public org.oclc.purl.dsdl.schematron.UriValue xgetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.UriValue target = null;
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(HREF$0);
                return target;
            }
        }
        
        /**
         * Sets the "href" attribute
         */
        public void setHref(java.lang.String href)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$0);
                }
                target.setStringValue(href);
            }
        }
        
        /**
         * Sets (as xml) the "href" attribute
         */
        public void xsetHref(org.oclc.purl.dsdl.schematron.UriValue href)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.UriValue target = null;
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(HREF$0);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().add_attribute_user(HREF$0);
                }
                target.set(href);
            }
        }
    }
}
