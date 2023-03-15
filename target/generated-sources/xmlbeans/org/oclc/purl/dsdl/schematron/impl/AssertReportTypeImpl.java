/*
 * XML Type:  assertReportType
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.AssertReportType
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * An XML assertReportType(@http://purl.oclc.org/dsdl/schematron).
 *
 * This is a complex type.
 */
public class AssertReportTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.AssertReportType
{
    private static final long serialVersionUID = 1L;
    
    public AssertReportTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName TEST$10 = 
        new javax.xml.namespace.QName("", "test");
    private static final javax.xml.namespace.QName FLAG$12 = 
        new javax.xml.namespace.QName("", "flag");
    private static final javax.xml.namespace.QName ID$14 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName DIAGNOSTICS$16 = 
        new javax.xml.namespace.QName("", "diagnostics");
    private static final javax.xml.namespace.QName ICON$18 = 
        new javax.xml.namespace.QName("", "icon");
    private static final javax.xml.namespace.QName SEE$20 = 
        new javax.xml.namespace.QName("", "see");
    private static final javax.xml.namespace.QName FPI$22 = 
        new javax.xml.namespace.QName("", "fpi");
    private static final javax.xml.namespace.QName LANG$24 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SPACE$26 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "space");
    private static final javax.xml.namespace.QName ROLE$28 = 
        new javax.xml.namespace.QName("", "role");
    private static final javax.xml.namespace.QName SUBJECT$30 = 
        new javax.xml.namespace.QName("", "subject");
    private static final javax.xml.namespace.QName FIX$32 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "fix");
    private static final javax.xml.namespace.QName DEFAULTFIX$34 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "default-fix");
    
    
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
     * Gets the "test" attribute
     */
    public java.lang.String getTest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEST$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "test" attribute
     */
    public org.oclc.purl.dsdl.schematron.ExprValue xgetTest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.ExprValue target = null;
            target = (org.oclc.purl.dsdl.schematron.ExprValue)get_store().find_attribute_user(TEST$10);
            return target;
        }
    }
    
    /**
     * Sets the "test" attribute
     */
    public void setTest(java.lang.String test)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEST$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEST$10);
            }
            target.setStringValue(test);
        }
    }
    
    /**
     * Sets (as xml) the "test" attribute
     */
    public void xsetTest(org.oclc.purl.dsdl.schematron.ExprValue test)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.ExprValue target = null;
            target = (org.oclc.purl.dsdl.schematron.ExprValue)get_store().find_attribute_user(TEST$10);
            if (target == null)
            {
                target = (org.oclc.purl.dsdl.schematron.ExprValue)get_store().add_attribute_user(TEST$10);
            }
            target.set(test);
        }
    }
    
    /**
     * Gets the "flag" attribute
     */
    public java.lang.String getFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLAG$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "flag" attribute
     */
    public org.oclc.purl.dsdl.schematron.FlagValue xgetFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.FlagValue target = null;
            target = (org.oclc.purl.dsdl.schematron.FlagValue)get_store().find_attribute_user(FLAG$12);
            return target;
        }
    }
    
    /**
     * True if has "flag" attribute
     */
    public boolean isSetFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FLAG$12) != null;
        }
    }
    
    /**
     * Sets the "flag" attribute
     */
    public void setFlag(java.lang.String flag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLAG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLAG$12);
            }
            target.setStringValue(flag);
        }
    }
    
    /**
     * Sets (as xml) the "flag" attribute
     */
    public void xsetFlag(org.oclc.purl.dsdl.schematron.FlagValue flag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.FlagValue target = null;
            target = (org.oclc.purl.dsdl.schematron.FlagValue)get_store().find_attribute_user(FLAG$12);
            if (target == null)
            {
                target = (org.oclc.purl.dsdl.schematron.FlagValue)get_store().add_attribute_user(FLAG$12);
            }
            target.set(flag);
        }
    }
    
    /**
     * Unsets the "flag" attribute
     */
    public void unsetFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FLAG$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
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
            return get_store().find_attribute_user(ID$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$14);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$14);
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
            get_store().remove_attribute(ID$14);
        }
    }
    
    /**
     * Gets the "diagnostics" attribute
     */
    public java.util.List getDiagnostics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIAGNOSTICS$16);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "diagnostics" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetDiagnostics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(DIAGNOSTICS$16);
            return target;
        }
    }
    
    /**
     * True if has "diagnostics" attribute
     */
    public boolean isSetDiagnostics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIAGNOSTICS$16) != null;
        }
    }
    
    /**
     * Sets the "diagnostics" attribute
     */
    public void setDiagnostics(java.util.List diagnostics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIAGNOSTICS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIAGNOSTICS$16);
            }
            target.setListValue(diagnostics);
        }
    }
    
    /**
     * Sets (as xml) the "diagnostics" attribute
     */
    public void xsetDiagnostics(org.apache.xmlbeans.XmlIDREFS diagnostics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(DIAGNOSTICS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(DIAGNOSTICS$16);
            }
            target.set(diagnostics);
        }
    }
    
    /**
     * Unsets the "diagnostics" attribute
     */
    public void unsetDiagnostics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIAGNOSTICS$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICON$18);
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
            target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(ICON$18);
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
            return get_store().find_attribute_user(ICON$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICON$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ICON$18);
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
            target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(ICON$18);
            if (target == null)
            {
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().add_attribute_user(ICON$18);
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
            get_store().remove_attribute(ICON$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEE$20);
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
            target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(SEE$20);
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
            return get_store().find_attribute_user(SEE$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEE$20);
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
            target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(SEE$20);
            if (target == null)
            {
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().add_attribute_user(SEE$20);
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
            get_store().remove_attribute(SEE$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPI$22);
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
            target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().find_attribute_user(FPI$22);
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
            return get_store().find_attribute_user(FPI$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPI$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FPI$22);
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
            target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().find_attribute_user(FPI$22);
            if (target == null)
            {
                target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().add_attribute_user(FPI$22);
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
            get_store().remove_attribute(FPI$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$24);
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
            target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$24);
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
            return get_store().find_attribute_user(LANG$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$24);
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
            target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$24);
            if (target == null)
            {
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().add_attribute_user(LANG$24);
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
            get_store().remove_attribute(LANG$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$26);
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
            target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$26);
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
            return get_store().find_attribute_user(SPACE$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPACE$26);
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
            target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$26);
            if (target == null)
            {
                target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().add_attribute_user(SPACE$26);
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
            get_store().remove_attribute(SPACE$26);
        }
    }
    
    /**
     * Gets the "role" attribute
     */
    public java.lang.String getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "role" attribute
     */
    public org.oclc.purl.dsdl.schematron.RoleValue xgetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.RoleValue target = null;
            target = (org.oclc.purl.dsdl.schematron.RoleValue)get_store().find_attribute_user(ROLE$28);
            return target;
        }
    }
    
    /**
     * True if has "role" attribute
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROLE$28) != null;
        }
    }
    
    /**
     * Sets the "role" attribute
     */
    public void setRole(java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$28);
            }
            target.setStringValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "role" attribute
     */
    public void xsetRole(org.oclc.purl.dsdl.schematron.RoleValue role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.RoleValue target = null;
            target = (org.oclc.purl.dsdl.schematron.RoleValue)get_store().find_attribute_user(ROLE$28);
            if (target == null)
            {
                target = (org.oclc.purl.dsdl.schematron.RoleValue)get_store().add_attribute_user(ROLE$28);
            }
            target.set(role);
        }
    }
    
    /**
     * Unsets the "role" attribute
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROLE$28);
        }
    }
    
    /**
     * Gets the "subject" attribute
     */
    public java.lang.String getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBJECT$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subject" attribute
     */
    public org.oclc.purl.dsdl.schematron.PathValue xgetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.PathValue target = null;
            target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().find_attribute_user(SUBJECT$30);
            return target;
        }
    }
    
    /**
     * True if has "subject" attribute
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUBJECT$30) != null;
        }
    }
    
    /**
     * Sets the "subject" attribute
     */
    public void setSubject(java.lang.String subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBJECT$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBJECT$30);
            }
            target.setStringValue(subject);
        }
    }
    
    /**
     * Sets (as xml) the "subject" attribute
     */
    public void xsetSubject(org.oclc.purl.dsdl.schematron.PathValue subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.PathValue target = null;
            target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().find_attribute_user(SUBJECT$30);
            if (target == null)
            {
                target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().add_attribute_user(SUBJECT$30);
            }
            target.set(subject);
        }
    }
    
    /**
     * Unsets the "subject" attribute
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUBJECT$30);
        }
    }
    
    /**
     * Gets the "fix" attribute
     */
    public java.lang.String getFix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIX$32);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fix" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIX$32);
            return target;
        }
    }
    
    /**
     * True if has "fix" attribute
     */
    public boolean isSetFix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIX$32) != null;
        }
    }
    
    /**
     * Sets the "fix" attribute
     */
    public void setFix(java.lang.String fix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIX$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIX$32);
            }
            target.setStringValue(fix);
        }
    }
    
    /**
     * Sets (as xml) the "fix" attribute
     */
    public void xsetFix(org.apache.xmlbeans.XmlString fix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIX$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIX$32);
            }
            target.set(fix);
        }
    }
    
    /**
     * Unsets the "fix" attribute
     */
    public void unsetFix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIX$32);
        }
    }
    
    /**
     * Gets the "default-fix" attribute
     */
    public java.lang.String getDefaultFix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTFIX$34);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "default-fix" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDefaultFix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTFIX$34);
            return target;
        }
    }
    
    /**
     * True if has "default-fix" attribute
     */
    public boolean isSetDefaultFix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTFIX$34) != null;
        }
    }
    
    /**
     * Sets the "default-fix" attribute
     */
    public void setDefaultFix(java.lang.String defaultFix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTFIX$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTFIX$34);
            }
            target.setStringValue(defaultFix);
        }
    }
    
    /**
     * Sets (as xml) the "default-fix" attribute
     */
    public void xsetDefaultFix(org.apache.xmlbeans.XmlString defaultFix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTFIX$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTFIX$34);
            }
            target.set(defaultFix);
        }
    }
    
    /**
     * Unsets the "default-fix" attribute
     */
    public void unsetDefaultFix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTFIX$34);
        }
    }
}
