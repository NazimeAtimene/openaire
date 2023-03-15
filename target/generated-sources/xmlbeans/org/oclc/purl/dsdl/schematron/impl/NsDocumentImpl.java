/*
 * An XML document type.
 * Localname: ns
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.NsDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one ns(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class NsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.NsDocument
{
    private static final long serialVersionUID = 1L;
    
    public NsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NS$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "ns");
    
    
    /**
     * Gets the "ns" element
     */
    public org.oclc.purl.dsdl.schematron.NsDocument.Ns getNs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.NsDocument.Ns target = null;
            target = (org.oclc.purl.dsdl.schematron.NsDocument.Ns)get_store().find_element_user(NS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ns" element
     */
    public void setNs(org.oclc.purl.dsdl.schematron.NsDocument.Ns ns)
    {
        generatedSetterHelperImpl(ns, NS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ns" element
     */
    public org.oclc.purl.dsdl.schematron.NsDocument.Ns addNewNs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.NsDocument.Ns target = null;
            target = (org.oclc.purl.dsdl.schematron.NsDocument.Ns)get_store().add_element_user(NS$0);
            return target;
        }
    }
    /**
     * An XML ns(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class NsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.NsDocument.Ns
    {
        private static final long serialVersionUID = 1L;
        
        public NsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName URI$0 = 
            new javax.xml.namespace.QName("", "uri");
        private static final javax.xml.namespace.QName PREFIX$2 = 
            new javax.xml.namespace.QName("", "prefix");
        
        
        /**
         * Gets the "uri" attribute
         */
        public java.lang.String getUri()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "uri" attribute
         */
        public org.oclc.purl.dsdl.schematron.UriValue xgetUri()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.UriValue target = null;
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(URI$0);
                return target;
            }
        }
        
        /**
         * Sets the "uri" attribute
         */
        public void setUri(java.lang.String uri)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$0);
                }
                target.setStringValue(uri);
            }
        }
        
        /**
         * Sets (as xml) the "uri" attribute
         */
        public void xsetUri(org.oclc.purl.dsdl.schematron.UriValue uri)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.UriValue target = null;
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(URI$0);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().add_attribute_user(URI$0);
                }
                target.set(uri);
            }
        }
        
        /**
         * Gets the "prefix" attribute
         */
        public java.lang.String getPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFIX$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "prefix" attribute
         */
        public org.oclc.purl.dsdl.schematron.NameValue xgetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NameValue target = null;
                target = (org.oclc.purl.dsdl.schematron.NameValue)get_store().find_attribute_user(PREFIX$2);
                return target;
            }
        }
        
        /**
         * Sets the "prefix" attribute
         */
        public void setPrefix(java.lang.String prefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFIX$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFIX$2);
                }
                target.setStringValue(prefix);
            }
        }
        
        /**
         * Sets (as xml) the "prefix" attribute
         */
        public void xsetPrefix(org.oclc.purl.dsdl.schematron.NameValue prefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NameValue target = null;
                target = (org.oclc.purl.dsdl.schematron.NameValue)get_store().find_attribute_user(PREFIX$2);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.NameValue)get_store().add_attribute_user(PREFIX$2);
                }
                target.set(prefix);
            }
        }
    }
}
