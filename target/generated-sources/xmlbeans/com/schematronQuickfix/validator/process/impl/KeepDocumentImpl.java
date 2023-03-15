/*
 * An XML document type.
 * Localname: keep
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.KeepDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one keep(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class KeepDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.KeepDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeepDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEEP$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "keep");
    
    
    /**
     * Gets the "keep" element
     */
    public com.schematronQuickfix.validator.process.KeepDocument.Keep getKeep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.KeepDocument.Keep target = null;
            target = (com.schematronQuickfix.validator.process.KeepDocument.Keep)get_store().find_element_user(KEEP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "keep" element
     */
    public void setKeep(com.schematronQuickfix.validator.process.KeepDocument.Keep keep)
    {
        generatedSetterHelperImpl(keep, KEEP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "keep" element
     */
    public com.schematronQuickfix.validator.process.KeepDocument.Keep addNewKeep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.KeepDocument.Keep target = null;
            target = (com.schematronQuickfix.validator.process.KeepDocument.Keep)get_store().add_element_user(KEEP$0);
            return target;
        }
    }
    /**
     * An XML keep(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class KeepImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.KeepDocument.Keep
    {
        private static final long serialVersionUID = 1L;
        
        public KeepImpl(org.apache.xmlbeans.SchemaType sType)
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
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SELECT$0);
                }
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SELECT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(SELECT$0);
                }
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
                return get_store().find_attribute_user(SELECT$0) != null;
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
        public void xsetSelect(org.apache.xmlbeans.XmlString select)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SELECT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SELECT$0);
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
                get_store().remove_attribute(SELECT$0);
            }
        }
    }
}
