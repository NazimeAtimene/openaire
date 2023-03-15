/*
 * An XML document type.
 * Localname: description
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.DescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one description(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class DescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.DescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "description");
    
    
    /**
     * Gets the "description" element
     */
    public com.schematronQuickfix.validator.process.DescriptionDocument.Description getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.DescriptionDocument.Description target = null;
            target = (com.schematronQuickfix.validator.process.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(com.schematronQuickfix.validator.process.DescriptionDocument.Description description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
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
     * An XML description(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.DescriptionDocument.Description
    {
        private static final long serialVersionUID = 1L;
        
        public DescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "title");
        private static final javax.xml.namespace.QName P$2 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "p");
        private static final javax.xml.namespace.QName LANG$4 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
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
         * Gets array of all "p" elements
         */
        public com.schematronQuickfix.validator.process.PDocument.P[] getPArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(P$2, targetList);
                com.schematronQuickfix.validator.process.PDocument.P[] result = new com.schematronQuickfix.validator.process.PDocument.P[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "p" element
         */
        public com.schematronQuickfix.validator.process.PDocument.P getPArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.PDocument.P target = null;
                target = (com.schematronQuickfix.validator.process.PDocument.P)get_store().find_element_user(P$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "p" element
         */
        public int sizeOfPArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(P$2);
            }
        }
        
        /**
         * Sets array of all "p" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPArray(com.schematronQuickfix.validator.process.PDocument.P[] pArray)
        {
            check_orphaned();
            arraySetterHelper(pArray, P$2);
        }
        
        /**
         * Sets ith "p" element
         */
        public void setPArray(int i, com.schematronQuickfix.validator.process.PDocument.P p)
        {
            generatedSetterHelperImpl(p, P$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "p" element
         */
        public com.schematronQuickfix.validator.process.PDocument.P insertNewP(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.PDocument.P target = null;
                target = (com.schematronQuickfix.validator.process.PDocument.P)get_store().insert_element_user(P$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "p" element
         */
        public com.schematronQuickfix.validator.process.PDocument.P addNewP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.PDocument.P target = null;
                target = (com.schematronQuickfix.validator.process.PDocument.P)get_store().add_element_user(P$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "p" element
         */
        public void removeP(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(P$2, i);
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
