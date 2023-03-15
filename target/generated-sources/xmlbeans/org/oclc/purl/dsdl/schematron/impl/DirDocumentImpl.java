/*
 * An XML document type.
 * Localname: dir
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.DirDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one dir(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class DirDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.DirDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIR$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "dir");
    
    
    /**
     * Gets the "dir" element
     */
    public org.oclc.purl.dsdl.schematron.DirDocument.Dir getDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.DirDocument.Dir target = null;
            target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().find_element_user(DIR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dir" element
     */
    public void setDir(org.oclc.purl.dsdl.schematron.DirDocument.Dir dir)
    {
        generatedSetterHelperImpl(dir, DIR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dir" element
     */
    public org.oclc.purl.dsdl.schematron.DirDocument.Dir addNewDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.DirDocument.Dir target = null;
            target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().add_element_user(DIR$0);
            return target;
        }
    }
    /**
     * An XML dir(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class DirImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.DirDocument.Dir
    {
        private static final long serialVersionUID = 1L;
        
        public DirImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public org.oclc.purl.dsdl.schematron.DirDocument.Dir.Value.Enum getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    return null;
                }
                return (org.oclc.purl.dsdl.schematron.DirDocument.Dir.Value.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.oclc.purl.dsdl.schematron.DirDocument.Dir.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DirDocument.Dir.Value target = null;
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir.Value)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$0) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(org.oclc.purl.dsdl.schematron.DirDocument.Dir.Value.Enum value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                }
                target.setEnumValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.oclc.purl.dsdl.schematron.DirDocument.Dir.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DirDocument.Dir.Value target = null;
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir.Value)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$0);
            }
        }
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of org.oclc.purl.dsdl.schematron.DirDocument$Dir$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.oclc.purl.dsdl.schematron.DirDocument.Dir.Value
        {
            private static final long serialVersionUID = 1L;
            
            public ValueImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
