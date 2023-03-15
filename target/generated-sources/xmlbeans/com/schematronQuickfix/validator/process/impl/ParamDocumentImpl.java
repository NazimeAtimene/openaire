/*
 * An XML document type.
 * Localname: param
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.ParamDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one param(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class ParamDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.ParamDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParamDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAM$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "param");
    
    
    /**
     * Gets the "param" element
     */
    public com.schematronQuickfix.validator.process.ParamDocument.Param getParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.ParamDocument.Param target = null;
            target = (com.schematronQuickfix.validator.process.ParamDocument.Param)get_store().find_element_user(PARAM$0, 0);
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
    public void setParam(com.schematronQuickfix.validator.process.ParamDocument.Param param)
    {
        generatedSetterHelperImpl(param, PARAM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "param" element
     */
    public com.schematronQuickfix.validator.process.ParamDocument.Param addNewParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.ParamDocument.Param target = null;
            target = (com.schematronQuickfix.validator.process.ParamDocument.Param)get_store().add_element_user(PARAM$0);
            return target;
        }
    }
    /**
     * An XML param(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class ParamImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.ParamDocument.Param
    {
        private static final long serialVersionUID = 1L;
        
        public ParamImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUIRED$0 = 
            new javax.xml.namespace.QName("", "required");
        private static final javax.xml.namespace.QName ABSTRACT$2 = 
            new javax.xml.namespace.QName("", "abstract");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DEFAULT$6 = 
            new javax.xml.namespace.QName("", "default");
        private static final javax.xml.namespace.QName TYPE$8 = 
            new javax.xml.namespace.QName("", "type");
        
        
        /**
         * Gets the "required" attribute
         */
        public com.schematronQuickfix.validator.process.ParamDocument.Param.Required.Enum getRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REQUIRED$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.schematronQuickfix.validator.process.ParamDocument.Param.Required.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "required" attribute
         */
        public com.schematronQuickfix.validator.process.ParamDocument.Param.Required xgetRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.ParamDocument.Param.Required target = null;
                target = (com.schematronQuickfix.validator.process.ParamDocument.Param.Required)get_store().find_attribute_user(REQUIRED$0);
                if (target == null)
                {
                    target = (com.schematronQuickfix.validator.process.ParamDocument.Param.Required)get_default_attribute_value(REQUIRED$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "required" attribute
         */
        public boolean isSetRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUIRED$0) != null;
            }
        }
        
        /**
         * Sets the "required" attribute
         */
        public void setRequired(com.schematronQuickfix.validator.process.ParamDocument.Param.Required.Enum required)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRED$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUIRED$0);
                }
                target.setEnumValue(required);
            }
        }
        
        /**
         * Sets (as xml) the "required" attribute
         */
        public void xsetRequired(com.schematronQuickfix.validator.process.ParamDocument.Param.Required required)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.ParamDocument.Param.Required target = null;
                target = (com.schematronQuickfix.validator.process.ParamDocument.Param.Required)get_store().find_attribute_user(REQUIRED$0);
                if (target == null)
                {
                    target = (com.schematronQuickfix.validator.process.ParamDocument.Param.Required)get_store().add_attribute_user(REQUIRED$0);
                }
                target.set(required);
            }
        }
        
        /**
         * Unsets the "required" attribute
         */
        public void unsetRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUIRED$0);
            }
        }
        
        /**
         * Gets the "abstract" attribute
         */
        public boolean getAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ABSTRACT$2);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "abstract" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ABSTRACT$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "abstract" attribute
         */
        public boolean isSetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ABSTRACT$2) != null;
            }
        }
        
        /**
         * Sets the "abstract" attribute
         */
        public void setAbstract(boolean xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABSTRACT$2);
                }
                target.setBooleanValue(xabstract);
            }
        }
        
        /**
         * Sets (as xml) the "abstract" attribute
         */
        public void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABSTRACT$2);
                }
                target.set(xabstract);
            }
        }
        
        /**
         * Unsets the "abstract" attribute
         */
        public void unsetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ABSTRACT$2);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "default" attribute
         */
        public java.lang.String getDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$6);
                return target;
            }
        }
        
        /**
         * True if has "default" attribute
         */
        public boolean isSetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULT$6) != null;
            }
        }
        
        /**
         * Sets the "default" attribute
         */
        public void setDefault(java.lang.String xdefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$6);
                }
                target.setStringValue(xdefault);
            }
        }
        
        /**
         * Sets (as xml) the "default" attribute
         */
        public void xsetDefault(org.apache.xmlbeans.XmlString xdefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULT$6);
                }
                target.set(xdefault);
            }
        }
        
        /**
         * Unsets the "default" attribute
         */
        public void unsetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULT$6);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$8);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$8) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$8);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$8);
            }
        }
        /**
         * An XML required(@).
         *
         * This is an atomic type that is a restriction of com.schematronQuickfix.validator.process.ParamDocument$Param$Required.
         */
        public static class RequiredImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.schematronQuickfix.validator.process.ParamDocument.Param.Required
        {
            private static final long serialVersionUID = 1L;
            
            public RequiredImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RequiredImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
