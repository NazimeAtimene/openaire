/*
 * An XML document type.
 * Localname: with-param
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.WithParamDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one with-param(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class WithParamDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.WithParamDocument
{
    private static final long serialVersionUID = 1L;
    
    public WithParamDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WITHPARAM$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "with-param");
    
    
    /**
     * Gets the "with-param" element
     */
    public com.schematronQuickfix.validator.process.WithParamDocument.WithParam getWithParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.WithParamDocument.WithParam target = null;
            target = (com.schematronQuickfix.validator.process.WithParamDocument.WithParam)get_store().find_element_user(WITHPARAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "with-param" element
     */
    public void setWithParam(com.schematronQuickfix.validator.process.WithParamDocument.WithParam withParam)
    {
        generatedSetterHelperImpl(withParam, WITHPARAM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "with-param" element
     */
    public com.schematronQuickfix.validator.process.WithParamDocument.WithParam addNewWithParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.WithParamDocument.WithParam target = null;
            target = (com.schematronQuickfix.validator.process.WithParamDocument.WithParam)get_store().add_element_user(WITHPARAM$0);
            return target;
        }
    }
    /**
     * An XML with-param(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class WithParamImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.WithParamDocument.WithParam
    {
        private static final long serialVersionUID = 1L;
        
        public WithParamImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName SELECT$2 = 
            new javax.xml.namespace.QName("", "select");
        
        
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
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
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
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "select" attribute
         */
        public java.lang.String getSelect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECT$2);
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
        public org.apache.xmlbeans.XmlString xgetSelect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SELECT$2);
                return target;
            }
        }
        
        /**
         * True if has "select" attribute
         */
        public boolean isSetSelect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SELECT$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SELECT$2);
                }
                target.setStringValue(select);
            }
        }
        
        /**
         * Sets (as xml) the "select" attribute
         */
        public void xsetSelect(org.apache.xmlbeans.XmlString select)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SELECT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SELECT$2);
                }
                target.set(select);
            }
        }
        
        /**
         * Unsets the "select" attribute
         */
        public void unsetSelect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SELECT$2);
            }
        }
    }
}
