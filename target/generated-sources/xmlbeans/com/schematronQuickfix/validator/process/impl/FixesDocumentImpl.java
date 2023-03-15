/*
 * An XML document type.
 * Localname: fixes
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.FixesDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one fixes(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class FixesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.FixesDocument
{
    private static final long serialVersionUID = 1L;
    
    public FixesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIXES$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "fixes");
    
    
    /**
     * Gets the "fixes" element
     */
    public com.schematronQuickfix.validator.process.FixesDocument.Fixes getFixes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.FixesDocument.Fixes target = null;
            target = (com.schematronQuickfix.validator.process.FixesDocument.Fixes)get_store().find_element_user(FIXES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fixes" element
     */
    public void setFixes(com.schematronQuickfix.validator.process.FixesDocument.Fixes fixes)
    {
        generatedSetterHelperImpl(fixes, FIXES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fixes" element
     */
    public com.schematronQuickfix.validator.process.FixesDocument.Fixes addNewFixes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.FixesDocument.Fixes target = null;
            target = (com.schematronQuickfix.validator.process.FixesDocument.Fixes)get_store().add_element_user(FIXES$0);
            return target;
        }
    }
    /**
     * An XML fixes(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class FixesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.FixesDocument.Fixes
    {
        private static final long serialVersionUID = 1L;
        
        public FixesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIX$0 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "fix");
        private static final javax.xml.namespace.QName GROUP$2 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "group");
        private static final javax.xml.namespace.QName LANG$4 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName ID$6 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets array of all "fix" elements
         */
        public com.schematronQuickfix.validator.process.FixDocument.Fix[] getFixArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIX$0, targetList);
                com.schematronQuickfix.validator.process.FixDocument.Fix[] result = new com.schematronQuickfix.validator.process.FixDocument.Fix[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fix" element
         */
        public com.schematronQuickfix.validator.process.FixDocument.Fix getFixArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.FixDocument.Fix target = null;
                target = (com.schematronQuickfix.validator.process.FixDocument.Fix)get_store().find_element_user(FIX$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fix" element
         */
        public int sizeOfFixArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIX$0);
            }
        }
        
        /**
         * Sets array of all "fix" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFixArray(com.schematronQuickfix.validator.process.FixDocument.Fix[] fixArray)
        {
            check_orphaned();
            arraySetterHelper(fixArray, FIX$0);
        }
        
        /**
         * Sets ith "fix" element
         */
        public void setFixArray(int i, com.schematronQuickfix.validator.process.FixDocument.Fix fix)
        {
            generatedSetterHelperImpl(fix, FIX$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fix" element
         */
        public com.schematronQuickfix.validator.process.FixDocument.Fix insertNewFix(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.FixDocument.Fix target = null;
                target = (com.schematronQuickfix.validator.process.FixDocument.Fix)get_store().insert_element_user(FIX$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fix" element
         */
        public com.schematronQuickfix.validator.process.FixDocument.Fix addNewFix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.FixDocument.Fix target = null;
                target = (com.schematronQuickfix.validator.process.FixDocument.Fix)get_store().add_element_user(FIX$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "fix" element
         */
        public void removeFix(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIX$0, i);
            }
        }
        
        /**
         * Gets array of all "group" elements
         */
        public com.schematronQuickfix.validator.process.GroupDocument.Group[] getGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GROUP$2, targetList);
                com.schematronQuickfix.validator.process.GroupDocument.Group[] result = new com.schematronQuickfix.validator.process.GroupDocument.Group[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "group" element
         */
        public com.schematronQuickfix.validator.process.GroupDocument.Group getGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.GroupDocument.Group target = null;
                target = (com.schematronQuickfix.validator.process.GroupDocument.Group)get_store().find_element_user(GROUP$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "group" element
         */
        public int sizeOfGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GROUP$2);
            }
        }
        
        /**
         * Sets array of all "group" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setGroupArray(com.schematronQuickfix.validator.process.GroupDocument.Group[] groupArray)
        {
            check_orphaned();
            arraySetterHelper(groupArray, GROUP$2);
        }
        
        /**
         * Sets ith "group" element
         */
        public void setGroupArray(int i, com.schematronQuickfix.validator.process.GroupDocument.Group group)
        {
            generatedSetterHelperImpl(group, GROUP$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "group" element
         */
        public com.schematronQuickfix.validator.process.GroupDocument.Group insertNewGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.GroupDocument.Group target = null;
                target = (com.schematronQuickfix.validator.process.GroupDocument.Group)get_store().insert_element_user(GROUP$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "group" element
         */
        public com.schematronQuickfix.validator.process.GroupDocument.Group addNewGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.GroupDocument.Group target = null;
                target = (com.schematronQuickfix.validator.process.GroupDocument.Group)get_store().add_element_user(GROUP$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "group" element
         */
        public void removeGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GROUP$2, i);
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
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlID xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$6) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlID id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$6);
            }
        }
    }
}
