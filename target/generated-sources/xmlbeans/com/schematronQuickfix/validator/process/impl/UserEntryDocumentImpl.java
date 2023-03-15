/*
 * An XML document type.
 * Localname: user-entry
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.UserEntryDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one user-entry(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class UserEntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.UserEntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public UserEntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERENTRY$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "user-entry");
    
    
    /**
     * Gets the "user-entry" element
     */
    public com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry getUserEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry target = null;
            target = (com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry)get_store().find_element_user(USERENTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "user-entry" element
     */
    public void setUserEntry(com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry userEntry)
    {
        generatedSetterHelperImpl(userEntry, USERENTRY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "user-entry" element
     */
    public com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry addNewUserEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry target = null;
            target = (com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry)get_store().add_element_user(USERENTRY$0);
            return target;
        }
    }
    /**
     * An XML user-entry(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class UserEntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry
    {
        private static final long serialVersionUID = 1L;
        
        public UserEntryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "description");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DEFAULT$4 = 
            new javax.xml.namespace.QName("", "default");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName LANG$8 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets array of all "description" elements
         */
        public com.schematronQuickfix.validator.process.DescriptionDocument.Description[] getDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DESCRIPTION$0, targetList);
                com.schematronQuickfix.validator.process.DescriptionDocument.Description[] result = new com.schematronQuickfix.validator.process.DescriptionDocument.Description[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "description" element
         */
        public com.schematronQuickfix.validator.process.DescriptionDocument.Description getDescriptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.DescriptionDocument.Description target = null;
                target = (com.schematronQuickfix.validator.process.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "description" element
         */
        public int sizeOfDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$0);
            }
        }
        
        /**
         * Sets array of all "description" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDescriptionArray(com.schematronQuickfix.validator.process.DescriptionDocument.Description[] descriptionArray)
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$0);
        }
        
        /**
         * Sets ith "description" element
         */
        public void setDescriptionArray(int i, com.schematronQuickfix.validator.process.DescriptionDocument.Description description)
        {
            generatedSetterHelperImpl(description, DESCRIPTION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "description" element
         */
        public com.schematronQuickfix.validator.process.DescriptionDocument.Description insertNewDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.DescriptionDocument.Description target = null;
                target = (com.schematronQuickfix.validator.process.DescriptionDocument.Description)get_store().insert_element_user(DESCRIPTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "description" element
         */
        public com.schematronQuickfix.validator.process.DescriptionDocument.Description addNewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.DescriptionDocument.Description target = null;
                target = (com.schematronQuickfix.validator.process.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "description" element
         */
        public void removeDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$0, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$4);
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
                return get_store().find_attribute_user(DEFAULT$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULT$4);
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
                get_store().remove_attribute(DEFAULT$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
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
                return get_store().find_attribute_user(TYPE$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
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
                get_store().remove_attribute(TYPE$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$8);
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
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$8);
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
                return get_store().find_attribute_user(LANG$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$8);
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
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$8);
                if (target == null)
                {
                    target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().add_attribute_user(LANG$8);
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
                get_store().remove_attribute(LANG$8);
            }
        }
    }
}
