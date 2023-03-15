/*
 * An XML document type.
 * Localname: stringReplace
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.StringReplaceDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one stringReplace(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class StringReplaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.StringReplaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public StringReplaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRINGREPLACE$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "stringReplace");
    
    
    /**
     * Gets the "stringReplace" element
     */
    public com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace getStringReplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace target = null;
            target = (com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace)get_store().find_element_user(STRINGREPLACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "stringReplace" element
     */
    public void setStringReplace(com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace stringReplace)
    {
        generatedSetterHelperImpl(stringReplace, STRINGREPLACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "stringReplace" element
     */
    public com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace addNewStringReplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace target = null;
            target = (com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace)get_store().add_element_user(STRINGREPLACE$0);
            return target;
        }
    }
    /**
     * An XML stringReplace(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class StringReplaceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace
    {
        private static final long serialVersionUID = 1L;
        
        public StringReplaceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MATCH$0 = 
            new javax.xml.namespace.QName("", "match");
        private static final javax.xml.namespace.QName USEWHEN$2 = 
            new javax.xml.namespace.QName("", "use-when");
        private static final javax.xml.namespace.QName REGEX$4 = 
            new javax.xml.namespace.QName("", "regex");
        private static final javax.xml.namespace.QName SELECT$6 = 
            new javax.xml.namespace.QName("", "select");
        
        
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
         * Gets the "regex" attribute
         */
        public java.lang.String getRegex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGEX$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "regex" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRegex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REGEX$4);
                return target;
            }
        }
        
        /**
         * Sets the "regex" attribute
         */
        public void setRegex(java.lang.String regex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGEX$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REGEX$4);
                }
                target.setStringValue(regex);
            }
        }
        
        /**
         * Sets (as xml) the "regex" attribute
         */
        public void xsetRegex(org.apache.xmlbeans.XmlString regex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REGEX$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REGEX$4);
                }
                target.set(regex);
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
    }
}
