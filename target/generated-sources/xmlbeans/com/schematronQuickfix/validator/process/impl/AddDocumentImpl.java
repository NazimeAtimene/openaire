/*
 * An XML document type.
 * Localname: add
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.AddDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one add(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class AddDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.AddDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADD$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "add");
    
    
    /**
     * Gets the "add" element
     */
    public com.schematronQuickfix.validator.process.AddDocument.Add getAdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.AddDocument.Add target = null;
            target = (com.schematronQuickfix.validator.process.AddDocument.Add)get_store().find_element_user(ADD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "add" element
     */
    public void setAdd(com.schematronQuickfix.validator.process.AddDocument.Add add)
    {
        generatedSetterHelperImpl(add, ADD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "add" element
     */
    public com.schematronQuickfix.validator.process.AddDocument.Add addNewAdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.AddDocument.Add target = null;
            target = (com.schematronQuickfix.validator.process.AddDocument.Add)get_store().add_element_user(ADD$0);
            return target;
        }
    }
    /**
     * An XML add(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class AddImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.AddDocument.Add
    {
        private static final long serialVersionUID = 1L;
        
        public AddImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName POSITION$0 = 
            new javax.xml.namespace.QName("", "position");
        private static final javax.xml.namespace.QName MATCH$2 = 
            new javax.xml.namespace.QName("", "match");
        private static final javax.xml.namespace.QName USEWHEN$4 = 
            new javax.xml.namespace.QName("", "use-when");
        private static final javax.xml.namespace.QName NODETYPE$6 = 
            new javax.xml.namespace.QName("", "node-type");
        private static final javax.xml.namespace.QName SELECT$8 = 
            new javax.xml.namespace.QName("", "select");
        private static final javax.xml.namespace.QName TARGET$10 = 
            new javax.xml.namespace.QName("", "target");
        
        
        /**
         * Gets the "position" attribute
         */
        public com.schematronQuickfix.validator.process.PositionType.Enum getPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$0);
                if (target == null)
                {
                    return null;
                }
                return (com.schematronQuickfix.validator.process.PositionType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "position" attribute
         */
        public com.schematronQuickfix.validator.process.PositionType xgetPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.PositionType target = null;
                target = (com.schematronQuickfix.validator.process.PositionType)get_store().find_attribute_user(POSITION$0);
                return target;
            }
        }
        
        /**
         * True if has "position" attribute
         */
        public boolean isSetPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POSITION$0) != null;
            }
        }
        
        /**
         * Sets the "position" attribute
         */
        public void setPosition(com.schematronQuickfix.validator.process.PositionType.Enum position)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITION$0);
                }
                target.setEnumValue(position);
            }
        }
        
        /**
         * Sets (as xml) the "position" attribute
         */
        public void xsetPosition(com.schematronQuickfix.validator.process.PositionType position)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.PositionType target = null;
                target = (com.schematronQuickfix.validator.process.PositionType)get_store().find_attribute_user(POSITION$0);
                if (target == null)
                {
                    target = (com.schematronQuickfix.validator.process.PositionType)get_store().add_attribute_user(POSITION$0);
                }
                target.set(position);
            }
        }
        
        /**
         * Unsets the "position" attribute
         */
        public void unsetPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POSITION$0);
            }
        }
        
        /**
         * Gets the "match" attribute
         */
        public java.lang.String getMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATCH$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MATCH$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATCH$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(MATCH$2);
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
                return get_store().find_attribute_user(MATCH$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATCH$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MATCH$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATCH$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MATCH$2);
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
                get_store().remove_attribute(MATCH$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWHEN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEWHEN$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEWHEN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(USEWHEN$4);
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
                return get_store().find_attribute_user(USEWHEN$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWHEN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEWHEN$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEWHEN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USEWHEN$4);
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
                get_store().remove_attribute(USEWHEN$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODETYPE$6);
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
                target = (com.schematronQuickfix.validator.process.NodeTypeType)get_store().find_attribute_user(NODETYPE$6);
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
                return get_store().find_attribute_user(NODETYPE$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODETYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NODETYPE$6);
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
                target = (com.schematronQuickfix.validator.process.NodeTypeType)get_store().find_attribute_user(NODETYPE$6);
                if (target == null)
                {
                    target = (com.schematronQuickfix.validator.process.NodeTypeType)get_store().add_attribute_user(NODETYPE$6);
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
                get_store().remove_attribute(NODETYPE$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECT$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SELECT$8);
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
                return get_store().find_attribute_user(SELECT$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SELECT$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SELECT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SELECT$8);
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
                get_store().remove_attribute(SELECT$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$10);
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
                return get_store().find_attribute_user(TARGET$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGET$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGET$10);
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
                get_store().remove_attribute(TARGET$10);
            }
        }
    }
}
