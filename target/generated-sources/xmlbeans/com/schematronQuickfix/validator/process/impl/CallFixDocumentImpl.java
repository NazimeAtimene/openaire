/*
 * An XML document type.
 * Localname: call-fix
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.CallFixDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one call-fix(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class CallFixDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.CallFixDocument
{
    private static final long serialVersionUID = 1L;
    
    public CallFixDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLFIX$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "call-fix");
    
    
    /**
     * Gets the "call-fix" element
     */
    public com.schematronQuickfix.validator.process.CallFixDocument.CallFix getCallFix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.CallFixDocument.CallFix target = null;
            target = (com.schematronQuickfix.validator.process.CallFixDocument.CallFix)get_store().find_element_user(CALLFIX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "call-fix" element
     */
    public void setCallFix(com.schematronQuickfix.validator.process.CallFixDocument.CallFix callFix)
    {
        generatedSetterHelperImpl(callFix, CALLFIX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "call-fix" element
     */
    public com.schematronQuickfix.validator.process.CallFixDocument.CallFix addNewCallFix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.CallFixDocument.CallFix target = null;
            target = (com.schematronQuickfix.validator.process.CallFixDocument.CallFix)get_store().add_element_user(CALLFIX$0);
            return target;
        }
    }
    /**
     * An XML call-fix(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class CallFixImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.CallFixDocument.CallFix
    {
        private static final long serialVersionUID = 1L;
        
        public CallFixImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WITHPARAM$0 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "with-param");
        private static final javax.xml.namespace.QName REF$2 = 
            new javax.xml.namespace.QName("", "ref");
        
        
        /**
         * Gets array of all "with-param" elements
         */
        public com.schematronQuickfix.validator.process.WithParamDocument.WithParam[] getWithParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WITHPARAM$0, targetList);
                com.schematronQuickfix.validator.process.WithParamDocument.WithParam[] result = new com.schematronQuickfix.validator.process.WithParamDocument.WithParam[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "with-param" element
         */
        public com.schematronQuickfix.validator.process.WithParamDocument.WithParam getWithParamArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.WithParamDocument.WithParam target = null;
                target = (com.schematronQuickfix.validator.process.WithParamDocument.WithParam)get_store().find_element_user(WITHPARAM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "with-param" element
         */
        public int sizeOfWithParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WITHPARAM$0);
            }
        }
        
        /**
         * Sets array of all "with-param" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setWithParamArray(com.schematronQuickfix.validator.process.WithParamDocument.WithParam[] withParamArray)
        {
            check_orphaned();
            arraySetterHelper(withParamArray, WITHPARAM$0);
        }
        
        /**
         * Sets ith "with-param" element
         */
        public void setWithParamArray(int i, com.schematronQuickfix.validator.process.WithParamDocument.WithParam withParam)
        {
            generatedSetterHelperImpl(withParam, WITHPARAM$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "with-param" element
         */
        public com.schematronQuickfix.validator.process.WithParamDocument.WithParam insertNewWithParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.WithParamDocument.WithParam target = null;
                target = (com.schematronQuickfix.validator.process.WithParamDocument.WithParam)get_store().insert_element_user(WITHPARAM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "with-param" element
         */
        public com.schematronQuickfix.validator.process.WithParamDocument.WithParam addNewWithParam()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.WithParamDocument.WithParam target = null;
                target = (com.schematronQuickfix.validator.process.WithParamDocument.WithParam)get_store().add_element_user(WITHPARAM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "with-param" element
         */
        public void removeWithParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WITHPARAM$0, i);
            }
        }
        
        /**
         * Gets the "ref" attribute
         */
        public java.lang.String getRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ref" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$2);
                return target;
            }
        }
        
        /**
         * Sets the "ref" attribute
         */
        public void setRef(java.lang.String ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$2);
                }
                target.setStringValue(ref);
            }
        }
        
        /**
         * Sets (as xml) the "ref" attribute
         */
        public void xsetRef(org.apache.xmlbeans.XmlString ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$2);
                }
                target.set(ref);
            }
        }
    }
}
