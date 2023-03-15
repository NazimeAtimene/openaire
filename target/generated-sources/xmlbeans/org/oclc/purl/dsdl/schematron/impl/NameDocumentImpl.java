/*
 * An XML document type.
 * Localname: name
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.NameDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one name(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class NameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.NameDocument
{
    private static final long serialVersionUID = 1L;
    
    public NameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "name");
    
    
    /**
     * Gets the "name" element
     */
    public org.oclc.purl.dsdl.schematron.NameDocument.Name getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.NameDocument.Name target = null;
            target = (org.oclc.purl.dsdl.schematron.NameDocument.Name)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.oclc.purl.dsdl.schematron.NameDocument.Name name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.oclc.purl.dsdl.schematron.NameDocument.Name addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.NameDocument.Name target = null;
            target = (org.oclc.purl.dsdl.schematron.NameDocument.Name)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    /**
     * An XML name(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class NameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.NameDocument.Name
    {
        private static final long serialVersionUID = 1L;
        
        public NameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PATH$0 = 
            new javax.xml.namespace.QName("", "path");
        
        
        /**
         * Gets the "path" attribute
         */
        public java.lang.String getPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "path" attribute
         */
        public org.oclc.purl.dsdl.schematron.PathValue xgetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PathValue target = null;
                target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().find_attribute_user(PATH$0);
                return target;
            }
        }
        
        /**
         * True if has "path" attribute
         */
        public boolean isSetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PATH$0) != null;
            }
        }
        
        /**
         * Sets the "path" attribute
         */
        public void setPath(java.lang.String path)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATH$0);
                }
                target.setStringValue(path);
            }
        }
        
        /**
         * Sets (as xml) the "path" attribute
         */
        public void xsetPath(org.oclc.purl.dsdl.schematron.PathValue path)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PathValue target = null;
                target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().find_attribute_user(PATH$0);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().add_attribute_user(PATH$0);
                }
                target.set(path);
            }
        }
        
        /**
         * Unsets the "path" attribute
         */
        public void unsetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PATH$0);
            }
        }
    }
}
