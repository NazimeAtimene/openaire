/*
 * An XML document type.
 * Localname: p
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.PDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one p(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class PDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.PDocument
{
    private static final long serialVersionUID = 1L;
    
    public PDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName P$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "p");
    
    
    /**
     * Gets the "p" element
     */
    public org.oclc.purl.dsdl.schematron.PDocument.P getP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.PDocument.P target = null;
            target = (org.oclc.purl.dsdl.schematron.PDocument.P)get_store().find_element_user(P$0, 0);
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
    public void setP(org.oclc.purl.dsdl.schematron.PDocument.P p)
    {
        generatedSetterHelperImpl(p, P$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "p" element
     */
    public org.oclc.purl.dsdl.schematron.PDocument.P addNewP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.PDocument.P target = null;
            target = (org.oclc.purl.dsdl.schematron.PDocument.P)get_store().add_element_user(P$0);
            return target;
        }
    }
    /**
     * An XML p(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class PImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.PDocument.P
    {
        private static final long serialVersionUID = 1L;
        
        public PImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIR$0 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "dir");
        private static final javax.xml.namespace.QName EMPH$2 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "emph");
        private static final javax.xml.namespace.QName SPAN$4 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "span");
        private static final javax.xml.namespace.QName ID$6 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CLASS1$8 = 
            new javax.xml.namespace.QName("", "class");
        private static final javax.xml.namespace.QName ICON$10 = 
            new javax.xml.namespace.QName("", "icon");
        
        
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
        
        /**
         * Gets the "class" attribute
         */
        public java.lang.String getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "class" attribute
         */
        public org.oclc.purl.dsdl.schematron.ClassValue xgetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ClassValue target = null;
                target = (org.oclc.purl.dsdl.schematron.ClassValue)get_store().find_attribute_user(CLASS1$8);
                return target;
            }
        }
        
        /**
         * True if has "class" attribute
         */
        public boolean isSetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLASS1$8) != null;
            }
        }
        
        /**
         * Sets the "class" attribute
         */
        public void setClass1(java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$8);
                }
                target.setStringValue(class1);
            }
        }
        
        /**
         * Sets (as xml) the "class" attribute
         */
        public void xsetClass1(org.oclc.purl.dsdl.schematron.ClassValue class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ClassValue target = null;
                target = (org.oclc.purl.dsdl.schematron.ClassValue)get_store().find_attribute_user(CLASS1$8);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.ClassValue)get_store().add_attribute_user(CLASS1$8);
                }
                target.set(class1);
            }
        }
        
        /**
         * Unsets the "class" attribute
         */
        public void unsetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLASS1$8);
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
    }
}
