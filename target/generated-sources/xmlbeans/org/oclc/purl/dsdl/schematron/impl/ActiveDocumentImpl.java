/*
 * An XML document type.
 * Localname: active
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.ActiveDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one active(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class ActiveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.ActiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVE$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "active");
    
    
    /**
     * Gets the "active" element
     */
    public org.oclc.purl.dsdl.schematron.ActiveDocument.Active getActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.ActiveDocument.Active target = null;
            target = (org.oclc.purl.dsdl.schematron.ActiveDocument.Active)get_store().find_element_user(ACTIVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "active" element
     */
    public void setActive(org.oclc.purl.dsdl.schematron.ActiveDocument.Active active)
    {
        generatedSetterHelperImpl(active, ACTIVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "active" element
     */
    public org.oclc.purl.dsdl.schematron.ActiveDocument.Active addNewActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.ActiveDocument.Active target = null;
            target = (org.oclc.purl.dsdl.schematron.ActiveDocument.Active)get_store().add_element_user(ACTIVE$0);
            return target;
        }
    }
    /**
     * An XML active(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class ActiveImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.ActiveDocument.Active
    {
        private static final long serialVersionUID = 1L;
        
        public ActiveImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIR$0 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "dir");
        private static final javax.xml.namespace.QName EMPH$2 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "emph");
        private static final javax.xml.namespace.QName SPAN$4 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "span");
        private static final javax.xml.namespace.QName PATTERN$6 = 
            new javax.xml.namespace.QName("", "pattern");
        
        
        /**
         * Gets array of all "dir" elements
         */
        public org.oclc.purl.dsdl.schematron.DirDocument.Dir[] getDirArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DIR$0, targetList);
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
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().find_element_user(DIR$0, i);
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
                return get_store().count_elements(DIR$0);
            }
        }
        
        /**
         * Sets array of all "dir" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDirArray(org.oclc.purl.dsdl.schematron.DirDocument.Dir[] dirArray)
        {
            check_orphaned();
            arraySetterHelper(dirArray, DIR$0);
        }
        
        /**
         * Sets ith "dir" element
         */
        public void setDirArray(int i, org.oclc.purl.dsdl.schematron.DirDocument.Dir dir)
        {
            generatedSetterHelperImpl(dir, DIR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().insert_element_user(DIR$0, i);
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
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().add_element_user(DIR$0);
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
                get_store().remove_element(DIR$0, i);
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
                get_store().find_all_element_users(EMPH$2, targetList);
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
                target = (org.oclc.purl.dsdl.schematron.EmphDocument.Emph)get_store().find_element_user(EMPH$2, i);
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
                return get_store().count_elements(EMPH$2);
            }
        }
        
        /**
         * Sets array of all "emph" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEmphArray(org.oclc.purl.dsdl.schematron.EmphDocument.Emph[] emphArray)
        {
            check_orphaned();
            arraySetterHelper(emphArray, EMPH$2);
        }
        
        /**
         * Sets ith "emph" element
         */
        public void setEmphArray(int i, org.oclc.purl.dsdl.schematron.EmphDocument.Emph emph)
        {
            generatedSetterHelperImpl(emph, EMPH$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.oclc.purl.dsdl.schematron.EmphDocument.Emph)get_store().insert_element_user(EMPH$2, i);
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
                target = (org.oclc.purl.dsdl.schematron.EmphDocument.Emph)get_store().add_element_user(EMPH$2);
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
                get_store().remove_element(EMPH$2, i);
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
                get_store().find_all_element_users(SPAN$4, targetList);
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
                target = (org.oclc.purl.dsdl.schematron.SpanDocument.Span)get_store().find_element_user(SPAN$4, i);
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
                return get_store().count_elements(SPAN$4);
            }
        }
        
        /**
         * Sets array of all "span" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSpanArray(org.oclc.purl.dsdl.schematron.SpanDocument.Span[] spanArray)
        {
            check_orphaned();
            arraySetterHelper(spanArray, SPAN$4);
        }
        
        /**
         * Sets ith "span" element
         */
        public void setSpanArray(int i, org.oclc.purl.dsdl.schematron.SpanDocument.Span span)
        {
            generatedSetterHelperImpl(span, SPAN$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.oclc.purl.dsdl.schematron.SpanDocument.Span)get_store().insert_element_user(SPAN$4, i);
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
                target = (org.oclc.purl.dsdl.schematron.SpanDocument.Span)get_store().add_element_user(SPAN$4);
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
                get_store().remove_element(SPAN$4, i);
            }
        }
        
        /**
         * Gets the "pattern" attribute
         */
        public java.lang.String getPattern()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATTERN$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pattern" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetPattern()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(PATTERN$6);
                return target;
            }
        }
        
        /**
         * Sets the "pattern" attribute
         */
        public void setPattern(java.lang.String pattern)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATTERN$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATTERN$6);
                }
                target.setStringValue(pattern);
            }
        }
        
        /**
         * Sets (as xml) the "pattern" attribute
         */
        public void xsetPattern(org.apache.xmlbeans.XmlIDREF pattern)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(PATTERN$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(PATTERN$6);
                }
                target.set(pattern);
            }
        }
    }
}
