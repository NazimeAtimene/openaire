/*
 * An XML document type.
 * Localname: param
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.ParamDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one param(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class ParamDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.ParamDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParamDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAM$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "param");
    
    
    /**
     * Gets the "param" element
     */
    public org.oclc.purl.dsdl.schematron.ParamDocument.Param getParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.ParamDocument.Param target = null;
            target = (org.oclc.purl.dsdl.schematron.ParamDocument.Param)get_store().find_element_user(PARAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "param" element
     */
    public void setParam(org.oclc.purl.dsdl.schematron.ParamDocument.Param param)
    {
        generatedSetterHelperImpl(param, PARAM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "param" element
     */
    public org.oclc.purl.dsdl.schematron.ParamDocument.Param addNewParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.ParamDocument.Param target = null;
            target = (org.oclc.purl.dsdl.schematron.ParamDocument.Param)get_store().add_element_user(PARAM$0);
            return target;
        }
    }
    /**
     * An XML param(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class ParamImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.ParamDocument.Param
    {
        private static final long serialVersionUID = 1L;
        
        public ParamImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.oclc.purl.dsdl.schematron.NameValue xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NameValue target = null;
                target = (org.oclc.purl.dsdl.schematron.NameValue)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.oclc.purl.dsdl.schematron.NameValue name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NameValue target = null;
                target = (org.oclc.purl.dsdl.schematron.NameValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.NameValue)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.oclc.purl.dsdl.schematron.NonEmptyString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NonEmptyString target = null;
                target = (org.oclc.purl.dsdl.schematron.NonEmptyString)get_store().find_attribute_user(VALUE$2);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.oclc.purl.dsdl.schematron.NonEmptyString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NonEmptyString target = null;
                target = (org.oclc.purl.dsdl.schematron.NonEmptyString)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.NonEmptyString)get_store().add_attribute_user(VALUE$2);
                }
                target.set(value);
            }
        }
    }
}
