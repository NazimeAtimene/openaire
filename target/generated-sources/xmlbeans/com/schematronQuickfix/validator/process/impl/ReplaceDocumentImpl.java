/*
 * An XML document type.
 * Localname: replace
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.ReplaceDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one replace(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class ReplaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.ReplaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReplaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPLACE$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "replace");
    
    
    /**
     * Gets the "replace" element
     */
    public com.schematronQuickfix.validator.process.ReplaceDocument.Replace getReplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.ReplaceDocument.Replace target = null;
            target = (com.schematronQuickfix.validator.process.ReplaceDocument.Replace)get_store().find_element_user(REPLACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "replace" element
     */
    public void setReplace(com.schematronQuickfix.validator.process.ReplaceDocument.Replace replace)
    {
        generatedSetterHelperImpl(replace, REPLACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "replace" element
     */
    public com.schematronQuickfix.validator.process.ReplaceDocument.Replace addNewReplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.ReplaceDocument.Replace target = null;
            target = (com.schematronQuickfix.validator.process.ReplaceDocument.Replace)get_store().add_element_user(REPLACE$0);
            return target;
        }
    }
    /**
     * An XML replace(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class ReplaceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.ReplaceDocument.Replace
    {
        private static final long serialVersionUID = 1L;
        
        public ReplaceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MATCH$0 = 
            new javax.xml.namespace.QName("", "match");
        private static final javax.xml.namespace.QName USEWHEN$2 = 
            new javax.xml.namespace.QName("", "use-when");
        private static final javax.xml.namespace.QName NODETYPE$4 = 
            new javax.xml.namespace.QName("", "node-type");
        private static final javax.xml.namespace.QName SELECT$6 = 
            new javax.xml.namespace.QName("", "select");
        private static final javax.xml.namespace.QName TARGET$8 = 
            new javax.xml.namespace.QName("", "target");
        
        
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
        
        /**
         * Gets the "node-type" attribute
         */
        public com.schematronQuickfix.validator.process.NodeTypeType.Enum getNodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODETYPE$4);
                if (target == null)
                {
                    return null;
                }
                return (com.schematronQuickfix.validator.process.NodeTypeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "node-type" attribute
         */
        public com.schematronQuickfix.validator.process.NodeTypeType xgetNodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.NodeTypeType target = null;
                target = (com.schematronQuickfix.validator.process.NodeTypeType)get_store().find_attribute_user(NODETYPE$4);
                return target;
            }
        }
        
        /**
         * True if has "node-type" attribute
         */
        public boolean isSetNodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NODETYPE$4) != null;
            }
        }
        
        /**
         * Sets the "node-type" attribute
         */
        public void setNodeType(com.schematronQuickfix.validator.process.NodeTypeType.Enum nodeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODETYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NODETYPE$4);
                }
                target.setEnumValue(nodeType);
            }
        }
        
        /**
         * Sets (as xml) the "node-type" attribute
         */
        public void xsetNodeType(com.schematronQuickfix.validator.process.NodeTypeType nodeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.NodeTypeType target = null;
                target = (com.schematronQuickfix.validator.process.NodeTypeType)get_store().find_attribute_user(NODETYPE$4);
                if (target == null)
                {
                    target = (com.schematronQuickfix.validator.process.NodeTypeType)get_store().add_attribute_user(NODETYPE$4);
                }
                target.set(nodeType);
            }
        }
        
        /**
         * Unsets the "node-type" attribute
         */
        public void unsetNodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NODETYPE$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECT$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SELECT$6);
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
                return get_store().find_attribute_user(SELECT$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SELECT$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SELECT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SELECT$6);
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
                get_store().remove_attribute(SELECT$6);
            }
        }
        
        /**
         * Gets the "target" attribute
         */
        public java.lang.String getTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "target" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$8);
                return target;
            }
        }
        
        /**
         * True if has "target" attribute
         */
        public boolean isSetTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGET$8) != null;
            }
        }
        
        /**
         * Sets the "target" attribute
         */
        public void setTarget(java.lang.String targetValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGET$8);
                }
                target.setStringValue(targetValue);
            }
        }
        
        /**
         * Sets (as xml) the "target" attribute
         */
        public void xsetTarget(org.apache.xmlbeans.XmlString targetValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGET$8);
                }
                target.set(targetValue);
            }
        }
        
        /**
         * Unsets the "target" attribute
         */
        public void unsetTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGET$8);
            }
        }
    }
}
