/*
 * An XML document type.
 * Localname: diagnostic
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.DiagnosticDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one diagnostic(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class DiagnosticDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.DiagnosticDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiagnosticDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGNOSTIC$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "diagnostic");
    
    
    /**
     * Gets the "diagnostic" element
     */
    public org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic getDiagnostic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic target = null;
            target = (org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic)get_store().find_element_user(DIAGNOSTIC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "diagnostic" element
     */
    public void setDiagnostic(org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic diagnostic)
    {
        generatedSetterHelperImpl(diagnostic, DIAGNOSTIC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "diagnostic" element
     */
    public org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic addNewDiagnostic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic target = null;
            target = (org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic)get_store().add_element_user(DIAGNOSTIC$0);
            return target;
        }
    }
    /**
     * An XML diagnostic(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class DiagnosticImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic
    {
        private static final long serialVersionUID = 1L;
        
        public DiagnosticImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUEOF$0 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "value-of");
        private static final javax.xml.namespace.QName EMPH$2 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "emph");
        private static final javax.xml.namespace.QName DIR$4 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "dir");
        private static final javax.xml.namespace.QName SPAN$6 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "span");
        private static final javax.xml.namespace.QName ID$8 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName ICON$10 = 
            new javax.xml.namespace.QName("", "icon");
        private static final javax.xml.namespace.QName SEE$12 = 
            new javax.xml.namespace.QName("", "see");
        private static final javax.xml.namespace.QName FPI$14 = 
            new javax.xml.namespace.QName("", "fpi");
        private static final javax.xml.namespace.QName LANG$16 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName SPACE$18 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "space");
        
        
        /**
         * Gets array of all "value-of" elements
         */
        public org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf[] getValueOfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALUEOF$0, targetList);
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
                target = (org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf)get_store().find_element_user(VALUEOF$0, i);
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
                return get_store().count_elements(VALUEOF$0);
            }
        }
        
        /**
         * Sets array of all "value-of" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setValueOfArray(org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf[] valueOfArray)
        {
            check_orphaned();
            arraySetterHelper(valueOfArray, VALUEOF$0);
        }
        
        /**
         * Sets ith "value-of" element
         */
        public void setValueOfArray(int i, org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf valueOf)
        {
            generatedSetterHelperImpl(valueOf, VALUEOF$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf)get_store().insert_element_user(VALUEOF$0, i);
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
                target = (org.oclc.purl.dsdl.schematron.ValueOfDocument.ValueOf)get_store().add_element_user(VALUEOF$0);
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
                get_store().remove_element(VALUEOF$0, i);
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
         * Gets array of all "dir" elements
         */
        public org.oclc.purl.dsdl.schematron.DirDocument.Dir[] getDirArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DIR$4, targetList);
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
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().find_element_user(DIR$4, i);
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
                return get_store().count_elements(DIR$4);
            }
        }
        
        /**
         * Sets array of all "dir" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDirArray(org.oclc.purl.dsdl.schematron.DirDocument.Dir[] dirArray)
        {
            check_orphaned();
            arraySetterHelper(dirArray, DIR$4);
        }
        
        /**
         * Sets ith "dir" element
         */
        public void setDirArray(int i, org.oclc.purl.dsdl.schematron.DirDocument.Dir dir)
        {
            generatedSetterHelperImpl(dir, DIR$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().insert_element_user(DIR$4, i);
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
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().add_element_user(DIR$4);
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
                get_store().remove_element(DIR$4, i);
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
                get_store().find_all_element_users(SPAN$6, targetList);
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
                target = (org.oclc.purl.dsdl.schematron.SpanDocument.Span)get_store().find_element_user(SPAN$6, i);
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
                return get_store().count_elements(SPAN$6);
            }
        }
        
        /**
         * Sets array of all "span" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSpanArray(org.oclc.purl.dsdl.schematron.SpanDocument.Span[] spanArray)
        {
            check_orphaned();
            arraySetterHelper(spanArray, SPAN$6);
        }
        
        /**
         * Sets ith "span" element
         */
        public void setSpanArray(int i, org.oclc.purl.dsdl.schematron.SpanDocument.Span span)
        {
            generatedSetterHelperImpl(span, SPAN$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.oclc.purl.dsdl.schematron.SpanDocument.Span)get_store().insert_element_user(SPAN$6, i);
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
                target = (org.oclc.purl.dsdl.schematron.SpanDocument.Span)get_store().add_element_user(SPAN$6);
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
                get_store().remove_element(SPAN$6, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "icon" attribute
         */
        public java.lang.String getIcon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICON$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "icon" attribute
         */
        public org.oclc.purl.dsdl.schematron.UriValue xgetIcon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.UriValue target = null;
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(ICON$10);
                return target;
            }
        }
        
        /**
         * True if has "icon" attribute
         */
        public boolean isSetIcon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ICON$10) != null;
            }
        }
        
        /**
         * Sets the "icon" attribute
         */
        public void setIcon(java.lang.String icon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICON$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ICON$10);
                }
                target.setStringValue(icon);
            }
        }
        
        /**
         * Sets (as xml) the "icon" attribute
         */
        public void xsetIcon(org.oclc.purl.dsdl.schematron.UriValue icon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.UriValue target = null;
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(ICON$10);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().add_attribute_user(ICON$10);
                }
                target.set(icon);
            }
        }
        
        /**
         * Unsets the "icon" attribute
         */
        public void unsetIcon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ICON$10);
            }
        }
        
        /**
         * Gets the "see" attribute
         */
        public java.lang.String getSee()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEE$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "see" attribute
         */
        public org.oclc.purl.dsdl.schematron.UriValue xgetSee()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.UriValue target = null;
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(SEE$12);
                return target;
            }
        }
        
        /**
         * True if has "see" attribute
         */
        public boolean isSetSee()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SEE$12) != null;
            }
        }
        
        /**
         * Sets the "see" attribute
         */
        public void setSee(java.lang.String see)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEE$12);
                }
                target.setStringValue(see);
            }
        }
        
        /**
         * Sets (as xml) the "see" attribute
         */
        public void xsetSee(org.oclc.purl.dsdl.schematron.UriValue see)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.UriValue target = null;
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(SEE$12);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().add_attribute_user(SEE$12);
                }
                target.set(see);
            }
        }
        
        /**
         * Unsets the "see" attribute
         */
        public void unsetSee()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SEE$12);
            }
        }
        
        /**
         * Gets the "fpi" attribute
         */
        public java.lang.String getFpi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPI$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fpi" attribute
         */
        public org.oclc.purl.dsdl.schematron.FpiValue xgetFpi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.FpiValue target = null;
                target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().find_attribute_user(FPI$14);
                return target;
            }
        }
        
        /**
         * True if has "fpi" attribute
         */
        public boolean isSetFpi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FPI$14) != null;
            }
        }
        
        /**
         * Sets the "fpi" attribute
         */
        public void setFpi(java.lang.String fpi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPI$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FPI$14);
                }
                target.setStringValue(fpi);
            }
        }
        
        /**
         * Sets (as xml) the "fpi" attribute
         */
        public void xsetFpi(org.oclc.purl.dsdl.schematron.FpiValue fpi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.FpiValue target = null;
                target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().find_attribute_user(FPI$14);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().add_attribute_user(FPI$14);
                }
                target.set(fpi);
            }
        }
        
        /**
         * Unsets the "fpi" attribute
         */
        public void unsetFpi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FPI$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$16);
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
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$16);
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
                return get_store().find_attribute_user(LANG$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$16);
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
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$16);
                if (target == null)
                {
                    target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().add_attribute_user(LANG$16);
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
                get_store().remove_attribute(LANG$16);
            }
        }
        
        /**
         * Gets the "space" attribute
         */
        public org.w3.xml.x1998.namespace.SpaceAttribute.Space.Enum getSpace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$18);
                if (target == null)
                {
                    return null;
                }
                return (org.w3.xml.x1998.namespace.SpaceAttribute.Space.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "space" attribute
         */
        public org.w3.xml.x1998.namespace.SpaceAttribute.Space xgetSpace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.xml.x1998.namespace.SpaceAttribute.Space target = null;
                target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$18);
                return target;
            }
        }
        
        /**
         * True if has "space" attribute
         */
        public boolean isSetSpace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SPACE$18) != null;
            }
        }
        
        /**
         * Sets the "space" attribute
         */
        public void setSpace(org.w3.xml.x1998.namespace.SpaceAttribute.Space.Enum space)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPACE$18);
                }
                target.setEnumValue(space);
            }
        }
        
        /**
         * Sets (as xml) the "space" attribute
         */
        public void xsetSpace(org.w3.xml.x1998.namespace.SpaceAttribute.Space space)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.xml.x1998.namespace.SpaceAttribute.Space target = null;
                target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$18);
                if (target == null)
                {
                    target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().add_attribute_user(SPACE$18);
                }
                target.set(space);
            }
        }
        
        /**
         * Unsets the "space" attribute
         */
        public void unsetSpace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SPACE$18);
            }
        }
    }
}
