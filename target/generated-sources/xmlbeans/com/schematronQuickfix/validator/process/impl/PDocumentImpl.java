/*
 * An XML document type.
 * Localname: p
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.PDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one p(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class PDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.PDocument
{
    private static final long serialVersionUID = 1L;
    
    public PDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName P$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "p");
    
    
    /**
     * Gets the "p" element
     */
    public com.schematronQuickfix.validator.process.PDocument.P getP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.PDocument.P target = null;
            target = (com.schematronQuickfix.validator.process.PDocument.P)get_store().find_element_user(P$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "p" element
     */
    public void setP(com.schematronQuickfix.validator.process.PDocument.P p)
    {
        generatedSetterHelperImpl(p, P$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "p" element
     */
    public com.schematronQuickfix.validator.process.PDocument.P addNewP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.PDocument.P target = null;
            target = (com.schematronQuickfix.validator.process.PDocument.P)get_store().add_element_user(P$0);
            return target;
        }
    }
    /**
     * An XML p(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class PImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.PDocument.P
    {
        private static final long serialVersionUID = 1L;
        
        public PImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "name");
        private static final javax.xml.namespace.QName VALUEOF$2 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "value-of");
        private static final javax.xml.namespace.QName EMPH$4 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "emph");
        private static final javax.xml.namespace.QName DIR$6 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "dir");
        private static final javax.xml.namespace.QName SPAN$8 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "span");
        private static final javax.xml.namespace.QName LANG$10 = 
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
         * Gets array of all "emph" elements
         */
        public org.oclc.purl.dsdl.schematron.EmphDocument.Emph[] getEmphArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EMPH$4, targetList);
                org.oclc.purl.dsdl.schematron.EmphDocument.Emph[] result = new org.oclc.purl.dsdl.schematron.EmphDocument.Emph[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "emph" element
         */
        public org.oclc.purl.dsdl.schematron.EmphDocument.Emph getEmphArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.EmphDocument.Emph target = null;
                target = (org.oclc.purl.dsdl.schematron.EmphDocument.Emph)get_store().find_element_user(EMPH$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "emph" element
         */
        public int sizeOfEmphArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMPH$4);
            }
        }
        
        /**
         * Sets array of all "emph" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEmphArray(org.oclc.purl.dsdl.schematron.EmphDocument.Emph[] emphArray)
        {
            check_orphaned();
            arraySetterHelper(emphArray, EMPH$4);
        }
        
        /**
         * Sets ith "emph" element
         */
        public void setEmphArray(int i, org.oclc.purl.dsdl.schematron.EmphDocument.Emph emph)
        {
            generatedSetterHelperImpl(emph, EMPH$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "emph" element
         */
        public org.oclc.purl.dsdl.schematron.EmphDocument.Emph insertNewEmph(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.EmphDocument.Emph target = null;
                target = (org.oclc.purl.dsdl.schematron.EmphDocument.Emph)get_store().insert_element_user(EMPH$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "emph" element
         */
        public org.oclc.purl.dsdl.schematron.EmphDocument.Emph addNewEmph()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.EmphDocument.Emph target = null;
                target = (org.oclc.purl.dsdl.schematron.EmphDocument.Emph)get_store().add_element_user(EMPH$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "emph" element
         */
        public void removeEmph(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMPH$4, i);
            }
        }
        
        /**
         * Gets array of all "dir" elements
         */
        public org.oclc.purl.dsdl.schematron.DirDocument.Dir[] getDirArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DIR$6, targetList);
                org.oclc.purl.dsdl.schematron.DirDocument.Dir[] result = new org.oclc.purl.dsdl.schematron.DirDocument.Dir[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dir" element
         */
        public org.oclc.purl.dsdl.schematron.DirDocument.Dir getDirArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DirDocument.Dir target = null;
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().find_element_user(DIR$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dir" element
         */
        public int sizeOfDirArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIR$6);
            }
        }
        
        /**
         * Sets array of all "dir" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDirArray(org.oclc.purl.dsdl.schematron.DirDocument.Dir[] dirArray)
        {
            check_orphaned();
            arraySetterHelper(dirArray, DIR$6);
        }
        
        /**
         * Sets ith "dir" element
         */
        public void setDirArray(int i, org.oclc.purl.dsdl.schematron.DirDocument.Dir dir)
        {
            generatedSetterHelperImpl(dir, DIR$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dir" element
         */
        public org.oclc.purl.dsdl.schematron.DirDocument.Dir insertNewDir(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DirDocument.Dir target = null;
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().insert_element_user(DIR$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dir" element
         */
        public org.oclc.purl.dsdl.schematron.DirDocument.Dir addNewDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DirDocument.Dir target = null;
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().add_element_user(DIR$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "dir" element
         */
        public void removeDir(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIR$6, i);
            }
        }
        
        /**
         * Gets array of all "span" elements
         */
        public org.oclc.purl.dsdl.schematron.SpanDocument.Span[] getSpanArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SPAN$8, targetList);
                org.oclc.purl.dsdl.schematron.SpanDocument.Span[] result = new org.oclc.purl.dsdl.schematron.SpanDocument.Span[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "span" element
         */
        public org.oclc.purl.dsdl.schematron.SpanDocument.Span getSpanArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.SpanDocument.Span target = null;
                target = (org.oclc.purl.dsdl.schematron.SpanDocument.Span)get_store().find_element_user(SPAN$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "span" element
         */
        public int sizeOfSpanArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SPAN$8);
            }
        }
        
        /**
         * Sets array of all "span" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSpanArray(org.oclc.purl.dsdl.schematron.SpanDocument.Span[] spanArray)
        {
            check_orphaned();
            arraySetterHelper(spanArray, SPAN$8);
        }
        
        /**
         * Sets ith "span" element
         */
        public void setSpanArray(int i, org.oclc.purl.dsdl.schematron.SpanDocument.Span span)
        {
            generatedSetterHelperImpl(span, SPAN$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "span" element
         */
        public org.oclc.purl.dsdl.schematron.SpanDocument.Span insertNewSpan(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.SpanDocument.Span target = null;
                target = (org.oclc.purl.dsdl.schematron.SpanDocument.Span)get_store().insert_element_user(SPAN$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "span" element
         */
        public org.oclc.purl.dsdl.schematron.SpanDocument.Span addNewSpan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.SpanDocument.Span target = null;
                target = (org.oclc.purl.dsdl.schematron.SpanDocument.Span)get_store().add_element_user(SPAN$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "span" element
         */
        public void removeSpan(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SPAN$8, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$10);
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
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$10);
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
                return get_store().find_attribute_user(LANG$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$10);
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
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$10);
                if (target == null)
                {
                    target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().add_attribute_user(LANG$10);
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
                get_store().remove_attribute(LANG$10);
            }
        }
    }
}
