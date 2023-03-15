/*
 * An XML document type.
 * Localname: title
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.TitleDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one title(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class TitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.TitleDocument
{
    private static final long serialVersionUID = 1L;
    
    public TitleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "title");
    
    
    /**
     * Gets the "title" element
     */
    public com.schematronQuickfix.validator.process.TitleDocument.Title getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.TitleDocument.Title target = null;
            target = (com.schematronQuickfix.validator.process.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(com.schematronQuickfix.validator.process.TitleDocument.Title title)
    {
        generatedSetterHelperImpl(title, TITLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "title" element
     */
    public com.schematronQuickfix.validator.process.TitleDocument.Title addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.TitleDocument.Title target = null;
            target = (com.schematronQuickfix.validator.process.TitleDocument.Title)get_store().add_element_user(TITLE$0);
            return target;
        }
    }
    /**
     * An XML title(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class TitleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.TitleDocument.Title
    {
        private static final long serialVersionUID = 1L;
        
        public TitleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "name");
        private static final javax.xml.namespace.QName VALUEOF$2 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "value-of");
        private static final javax.xml.namespace.QName LANG$4 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets array of all "name" elements
         */
        public org.oclc.purl.dsdl.schematron.NameDocument.Name[] getNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$0, targetList);
                org.oclc.purl.dsdl.schematron.NameDocument.Name[] result = new org.oclc.purl.dsdl.schematron.NameDocument.Name[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "name" element
         */
        public org.oclc.purl.dsdl.schematron.NameDocument.Name getNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NameDocument.Name target = null;
                target = (org.oclc.purl.dsdl.schematron.NameDocument.Name)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "name" element
         */
        public int sizeOfNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0);
            }
        }
        
        /**
         * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNameArray(org.oclc.purl.dsdl.schematron.NameDocument.Name[] nameArray)
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$0);
        }
        
        /**
         * Sets ith "name" element
         */
        public void setNameArray(int i, org.oclc.purl.dsdl.schematron.NameDocument.Name name)
        {
            generatedSetterHelperImpl(name, NAME$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        public org.oclc.purl.dsdl.schematron.NameDocument.Name insertNewName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NameDocument.Name target = null;
                target = (org.oclc.purl.dsdl.schematron.NameDocument.Name)get_store().insert_element_user(NAME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
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
         * Removes the ith "name" element
         */
        public void removeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, i);
            }
        }
        
        /**
         * Gets array of all "value-of" elements
         */
        public org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf[] getValueOfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALUEOF$2, targetList);
                org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf[] result = new org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "value-of" element
         */
        public org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf getValueOfArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf target = null;
                target = (org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf)get_store().find_element_user(VALUEOF$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "value-of" element
         */
        public int sizeOfValueOfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALUEOF$2);
            }
        }
        
        /**
         * Sets array of all "value-of" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setValueOfArray(org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf[] valueOfArray)
        {
            check_orphaned();
            arraySetterHelper(valueOfArray, VALUEOF$2);
        }
        
        /**
         * Sets ith "value-of" element
         */
        public void setValueOfArray(int i, org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf valueOf)
        {
            generatedSetterHelperImpl(valueOf, VALUEOF$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "value-of" element
         */
        public org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf insertNewValueOf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf target = null;
                target = (org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf)get_store().insert_element_user(VALUEOF$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "value-of" element
         */
        public org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf addNewValueOf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf target = null;
                target = (org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf)get_store().add_element_user(VALUEOF$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "value-of" element
         */
        public void removeValueOf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALUEOF$2, i);
            }
        }
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.w3.xml.x1998.namespace.LangAttribute.Lang xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.xml.x1998.namespace.LangAttribute.Lang target = null;
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$4);
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$4) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$4);
                }
                target.setStringValue(lang);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.w3.xml.x1998.namespace.LangAttribute.Lang lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.xml.x1998.namespace.LangAttribute.Lang target = null;
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$4);
                if (target == null)
                {
                    target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().add_attribute_user(LANG$4);
                }
                target.set(lang);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$4);
            }
        }
    }
}
