/*
 * An XML document type.
 * Localname: delete
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.DeleteDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one delete(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class DeleteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.DeleteDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETE$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "delete");
    
    
    /**
     * Gets the "delete" element
     */
    public com.schematronQuickfix.validator.process.DeleteDocument.Delete getDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.DeleteDocument.Delete target = null;
            target = (com.schematronQuickfix.validator.process.DeleteDocument.Delete)get_store().find_element_user(DELETE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "delete" element
     */
    public void setDelete(com.schematronQuickfix.validator.process.DeleteDocument.Delete delete)
    {
        generatedSetterHelperImpl(delete, DELETE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "delete" element
     */
    public com.schematronQuickfix.validator.process.DeleteDocument.Delete addNewDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.DeleteDocument.Delete target = null;
            target = (com.schematronQuickfix.validator.process.DeleteDocument.Delete)get_store().add_element_user(DELETE$0);
            return target;
        }
    }
    /**
     * An XML delete(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class DeleteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.DeleteDocument.Delete
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MATCH$0 = 
            new javax.xml.namespace.QName("", "match");
        private static final javax.xml.namespace.QName USEWHEN$2 = 
            new javax.xml.namespace.QName("", "use-when");
        
        
        /**
         * Gets the "match" attribute
         */
        public java.lang.String getMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATCH$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MATCH$0);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "match" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATCH$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(MATCH$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "match" attribute
         */
        public boolean isSetMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MATCH$0) != null;
            }
        }
        
        /**
         * Sets the "match" attribute
         */
        public void setMatch(java.lang.String match)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATCH$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MATCH$0);
                }
                target.setStringValue(match);
            }
        }
        
        /**
         * Sets (as xml) the "match" attribute
         */
        public void xsetMatch(org.apache.xmlbeans.XmlString match)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATCH$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MATCH$0);
                }
                target.set(match);
            }
        }
        
        /**
         * Unsets the "match" attribute
         */
        public void unsetMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MATCH$0);
            }
        }
        
        /**
         * Gets the "use-when" attribute
         */
        public java.lang.String getUseWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWHEN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEWHEN$2);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "use-when" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUseWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEWHEN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(USEWHEN$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "use-when" attribute
         */
        public boolean isSetUseWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USEWHEN$2) != null;
            }
        }
        
        /**
         * Sets the "use-when" attribute
         */
        public void setUseWhen(java.lang.String useWhen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWHEN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEWHEN$2);
                }
                target.setStringValue(useWhen);
            }
        }
        
        /**
         * Sets (as xml) the "use-when" attribute
         */
        public void xsetUseWhen(org.apache.xmlbeans.XmlString useWhen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEWHEN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USEWHEN$2);
                }
                target.set(useWhen);
            }
        }
        
        /**
         * Unsets the "use-when" attribute
         */
        public void unsetUseWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USEWHEN$2);
            }
        }
    }
}
