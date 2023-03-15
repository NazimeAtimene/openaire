/*
 * An XML document type.
 * Localname: fix
 * Namespace: http://www.schematron-quickfix.com/validator/process
 * Java type: com.schematronQuickfix.validator.process.FixDocument
 *
 * Automatically generated - do not modify.
 */
package com.schematronQuickfix.validator.process.impl;
/**
 * A document containing one fix(@http://www.schematron-quickfix.com/validator/process) element.
 *
 * This is a complex type.
 */
public class FixDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.FixDocument
{
    private static final long serialVersionUID = 1L;
    
    public FixDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIX$0 = 
        new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "fix");
    
    
    /**
     * Gets the "fix" element
     */
    public com.schematronQuickfix.validator.process.FixDocument.Fix getFix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.schematronQuickfix.validator.process.FixDocument.Fix target = null;
            target = (com.schematronQuickfix.validator.process.FixDocument.Fix)get_store().find_element_user(FIX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fix" element
     */
    public void setFix(com.schematronQuickfix.validator.process.FixDocument.Fix fix)
    {
        generatedSetterHelperImpl(fix, FIX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fix" element
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
     * An XML fix(@http://www.schematron-quickfix.com/validator/process).
     *
     * This is a complex type.
     */
    public static class FixImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.schematronQuickfix.validator.process.FixDocument.Fix
    {
        private static final long serialVersionUID = 1L;
        
        public FixImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARAM$0 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "param");
        private static final javax.xml.namespace.QName LET$2 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "let");
        private static final javax.xml.namespace.QName DESCRIPTION$4 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "description");
        private static final javax.xml.namespace.QName CALLFIX$6 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "call-fix");
        private static final javax.xml.namespace.QName USERENTRY$8 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "user-entry");
        private static final javax.xml.namespace.QName ADD$10 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "add");
        private static final javax.xml.namespace.QName DELETE$12 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "delete");
        private static final javax.xml.namespace.QName REPLACE$14 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "replace");
        private static final javax.xml.namespace.QName STRINGREPLACE$16 = 
            new javax.xml.namespace.QName("http://www.schematron-quickfix.com/validator/process", "stringReplace");
        private static final javax.xml.namespace.QName ID$18 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName USEWHEN$20 = 
            new javax.xml.namespace.QName("", "use-when");
        private static final javax.xml.namespace.QName ROLE$22 = 
            new javax.xml.namespace.QName("", "role");
        private static final javax.xml.namespace.QName LANG$24 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets array of all "param" elements
         */
        public com.schematronQuickfix.validator.process.ParamDocument.Param[] getParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAM$0, targetList);
                com.schematronQuickfix.validator.process.ParamDocument.Param[] result = new com.schematronQuickfix.validator.process.ParamDocument.Param[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "param" element
         */
        public com.schematronQuickfix.validator.process.ParamDocument.Param getParamArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.ParamDocument.Param target = null;
                target = (com.schematronQuickfix.validator.process.ParamDocument.Param)get_store().find_element_user(PARAM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "param" element
         */
        public int sizeOfParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAM$0);
            }
        }
        
        /**
         * Sets array of all "param" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setParamArray(com.schematronQuickfix.validator.process.ParamDocument.Param[] paramArray)
        {
            check_orphaned();
            arraySetterHelper(paramArray, PARAM$0);
        }
        
        /**
         * Sets ith "param" element
         */
        public void setParamArray(int i, com.schematronQuickfix.validator.process.ParamDocument.Param param)
        {
            generatedSetterHelperImpl(param, PARAM$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "param" element
         */
        public com.schematronQuickfix.validator.process.ParamDocument.Param insertNewParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.ParamDocument.Param target = null;
                target = (com.schematronQuickfix.validator.process.ParamDocument.Param)get_store().insert_element_user(PARAM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "param" element
         */
        public com.schematronQuickfix.validator.process.ParamDocument.Param addNewParam()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.ParamDocument.Param target = null;
                target = (com.schematronQuickfix.validator.process.ParamDocument.Param)get_store().add_element_user(PARAM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "param" element
         */
        public void removeParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAM$0, i);
            }
        }
        
        /**
         * Gets array of all "let" elements
         */
        public org.oclc.purl.dsdl.schematron.LetDocument.Let[] getLetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LET$2, targetList);
                org.oclc.purl.dsdl.schematron.LetDocument.Let[] result = new org.oclc.purl.dsdl.schematron.LetDocument.Let[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "let" element
         */
        public org.oclc.purl.dsdl.schematron.LetDocument.Let getLetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.LetDocument.Let target = null;
                target = (org.oclc.purl.dsdl.schematron.LetDocument.Let)get_store().find_element_user(LET$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "let" element
         */
        public int sizeOfLetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LET$2);
            }
        }
        
        /**
         * Sets array of all "let" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLetArray(org.oclc.purl.dsdl.schematron.LetDocument.Let[] letArray)
        {
            check_orphaned();
            arraySetterHelper(letArray, LET$2);
        }
        
        /**
         * Sets ith "let" element
         */
        public void setLetArray(int i, org.oclc.purl.dsdl.schematron.LetDocument.Let let)
        {
            generatedSetterHelperImpl(let, LET$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "let" element
         */
        public org.oclc.purl.dsdl.schematron.LetDocument.Let insertNewLet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.LetDocument.Let target = null;
                target = (org.oclc.purl.dsdl.schematron.LetDocument.Let)get_store().insert_element_user(LET$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "let" element
         */
        public org.oclc.purl.dsdl.schematron.LetDocument.Let addNewLet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.LetDocument.Let target = null;
                target = (org.oclc.purl.dsdl.schematron.LetDocument.Let)get_store().add_element_user(LET$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "let" element
         */
        public void removeLet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LET$2, i);
            }
        }
        
        /**
         * Gets array of all "description" elements
         */
        public com.schematronQuickfix.validator.process.DescriptionDocument.Description[] getDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DESCRIPTION$4, targetList);
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
                target = (com.schematronQuickfix.validator.process.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$4, i);
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
                return get_store().count_elements(DESCRIPTION$4);
            }
        }
        
        /**
         * Sets array of all "description" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDescriptionArray(com.schematronQuickfix.validator.process.DescriptionDocument.Description[] descriptionArray)
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$4);
        }
        
        /**
         * Sets ith "description" element
         */
        public void setDescriptionArray(int i, com.schematronQuickfix.validator.process.DescriptionDocument.Description description)
        {
            generatedSetterHelperImpl(description, DESCRIPTION$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (com.schematronQuickfix.validator.process.DescriptionDocument.Description)get_store().insert_element_user(DESCRIPTION$4, i);
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
                target = (com.schematronQuickfix.validator.process.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$4);
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
                get_store().remove_element(DESCRIPTION$4, i);
            }
        }
        
        /**
         * Gets the "call-fix" element
         */
        public com.schematronQuickfix.validator.process.CallFixDocument.CallFix getCallFix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.CallFixDocument.CallFix target = null;
                target = (com.schematronQuickfix.validator.process.CallFixDocument.CallFix)get_store().find_element_user(CALLFIX$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "call-fix" element
         */
        public boolean isSetCallFix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CALLFIX$6) != 0;
            }
        }
        
        /**
         * Sets the "call-fix" element
         */
        public void setCallFix(com.schematronQuickfix.validator.process.CallFixDocument.CallFix callFix)
        {
            generatedSetterHelperImpl(callFix, CALLFIX$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (com.schematronQuickfix.validator.process.CallFixDocument.CallFix)get_store().add_element_user(CALLFIX$6);
                return target;
            }
        }
        
        /**
         * Unsets the "call-fix" element
         */
        public void unsetCallFix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CALLFIX$6, 0);
            }
        }
        
        /**
         * Gets array of all "user-entry" elements
         */
        public com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry[] getUserEntryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(USERENTRY$8, targetList);
                com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry[] result = new com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "user-entry" element
         */
        public com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry getUserEntryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry target = null;
                target = (com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry)get_store().find_element_user(USERENTRY$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "user-entry" element
         */
        public int sizeOfUserEntryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USERENTRY$8);
            }
        }
        
        /**
         * Sets array of all "user-entry" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setUserEntryArray(com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry[] userEntryArray)
        {
            check_orphaned();
            arraySetterHelper(userEntryArray, USERENTRY$8);
        }
        
        /**
         * Sets ith "user-entry" element
         */
        public void setUserEntryArray(int i, com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry userEntry)
        {
            generatedSetterHelperImpl(userEntry, USERENTRY$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "user-entry" element
         */
        public com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry insertNewUserEntry(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry target = null;
                target = (com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry)get_store().insert_element_user(USERENTRY$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "user-entry" element
         */
        public com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry addNewUserEntry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry target = null;
                target = (com.schematronQuickfix.validator.process.UserEntryDocument.UserEntry)get_store().add_element_user(USERENTRY$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "user-entry" element
         */
        public void removeUserEntry(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USERENTRY$8, i);
            }
        }
        
        /**
         * Gets array of all "add" elements
         */
        public com.schematronQuickfix.validator.process.AddDocument.Add[] getAddArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADD$10, targetList);
                com.schematronQuickfix.validator.process.AddDocument.Add[] result = new com.schematronQuickfix.validator.process.AddDocument.Add[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "add" element
         */
        public com.schematronQuickfix.validator.process.AddDocument.Add getAddArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.AddDocument.Add target = null;
                target = (com.schematronQuickfix.validator.process.AddDocument.Add)get_store().find_element_user(ADD$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "add" element
         */
        public int sizeOfAddArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADD$10);
            }
        }
        
        /**
         * Sets array of all "add" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAddArray(com.schematronQuickfix.validator.process.AddDocument.Add[] addArray)
        {
            check_orphaned();
            arraySetterHelper(addArray, ADD$10);
        }
        
        /**
         * Sets ith "add" element
         */
        public void setAddArray(int i, com.schematronQuickfix.validator.process.AddDocument.Add add)
        {
            generatedSetterHelperImpl(add, ADD$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "add" element
         */
        public com.schematronQuickfix.validator.process.AddDocument.Add insertNewAdd(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.AddDocument.Add target = null;
                target = (com.schematronQuickfix.validator.process.AddDocument.Add)get_store().insert_element_user(ADD$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "add" element
         */
        public com.schematronQuickfix.validator.process.AddDocument.Add addNewAdd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.AddDocument.Add target = null;
                target = (com.schematronQuickfix.validator.process.AddDocument.Add)get_store().add_element_user(ADD$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "add" element
         */
        public void removeAdd(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADD$10, i);
            }
        }
        
        /**
         * Gets array of all "delete" elements
         */
        public com.schematronQuickfix.validator.process.DeleteDocument.Delete[] getDeleteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DELETE$12, targetList);
                com.schematronQuickfix.validator.process.DeleteDocument.Delete[] result = new com.schematronQuickfix.validator.process.DeleteDocument.Delete[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "delete" element
         */
        public com.schematronQuickfix.validator.process.DeleteDocument.Delete getDeleteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.DeleteDocument.Delete target = null;
                target = (com.schematronQuickfix.validator.process.DeleteDocument.Delete)get_store().find_element_user(DELETE$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "delete" element
         */
        public int sizeOfDeleteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELETE$12);
            }
        }
        
        /**
         * Sets array of all "delete" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDeleteArray(com.schematronQuickfix.validator.process.DeleteDocument.Delete[] deleteArray)
        {
            check_orphaned();
            arraySetterHelper(deleteArray, DELETE$12);
        }
        
        /**
         * Sets ith "delete" element
         */
        public void setDeleteArray(int i, com.schematronQuickfix.validator.process.DeleteDocument.Delete delete)
        {
            generatedSetterHelperImpl(delete, DELETE$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "delete" element
         */
        public com.schematronQuickfix.validator.process.DeleteDocument.Delete insertNewDelete(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.DeleteDocument.Delete target = null;
                target = (com.schematronQuickfix.validator.process.DeleteDocument.Delete)get_store().insert_element_user(DELETE$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "delete" element
         */
        public com.schematronQuickfix.validator.process.DeleteDocument.Delete addNewDelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.DeleteDocument.Delete target = null;
                target = (com.schematronQuickfix.validator.process.DeleteDocument.Delete)get_store().add_element_user(DELETE$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "delete" element
         */
        public void removeDelete(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELETE$12, i);
            }
        }
        
        /**
         * Gets array of all "replace" elements
         */
        public com.schematronQuickfix.validator.process.ReplaceDocument.Replace[] getReplaceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPLACE$14, targetList);
                com.schematronQuickfix.validator.process.ReplaceDocument.Replace[] result = new com.schematronQuickfix.validator.process.ReplaceDocument.Replace[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "replace" element
         */
        public com.schematronQuickfix.validator.process.ReplaceDocument.Replace getReplaceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.ReplaceDocument.Replace target = null;
                target = (com.schematronQuickfix.validator.process.ReplaceDocument.Replace)get_store().find_element_user(REPLACE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "replace" element
         */
        public int sizeOfReplaceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPLACE$14);
            }
        }
        
        /**
         * Sets array of all "replace" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setReplaceArray(com.schematronQuickfix.validator.process.ReplaceDocument.Replace[] replaceArray)
        {
            check_orphaned();
            arraySetterHelper(replaceArray, REPLACE$14);
        }
        
        /**
         * Sets ith "replace" element
         */
        public void setReplaceArray(int i, com.schematronQuickfix.validator.process.ReplaceDocument.Replace replace)
        {
            generatedSetterHelperImpl(replace, REPLACE$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "replace" element
         */
        public com.schematronQuickfix.validator.process.ReplaceDocument.Replace insertNewReplace(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.ReplaceDocument.Replace target = null;
                target = (com.schematronQuickfix.validator.process.ReplaceDocument.Replace)get_store().insert_element_user(REPLACE$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "replace" element
         */
        public com.schematronQuickfix.validator.process.ReplaceDocument.Replace addNewReplace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.ReplaceDocument.Replace target = null;
                target = (com.schematronQuickfix.validator.process.ReplaceDocument.Replace)get_store().add_element_user(REPLACE$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "replace" element
         */
        public void removeReplace(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPLACE$14, i);
            }
        }
        
        /**
         * Gets array of all "stringReplace" elements
         */
        public com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace[] getStringReplaceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STRINGREPLACE$16, targetList);
                com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace[] result = new com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "stringReplace" element
         */
        public com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace getStringReplaceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace target = null;
                target = (com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace)get_store().find_element_user(STRINGREPLACE$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "stringReplace" element
         */
        public int sizeOfStringReplaceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRINGREPLACE$16);
            }
        }
        
        /**
         * Sets array of all "stringReplace" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setStringReplaceArray(com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace[] stringReplaceArray)
        {
            check_orphaned();
            arraySetterHelper(stringReplaceArray, STRINGREPLACE$16);
        }
        
        /**
         * Sets ith "stringReplace" element
         */
        public void setStringReplaceArray(int i, com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace stringReplace)
        {
            generatedSetterHelperImpl(stringReplace, STRINGREPLACE$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "stringReplace" element
         */
        public com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace insertNewStringReplace(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace target = null;
                target = (com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace)get_store().insert_element_user(STRINGREPLACE$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "stringReplace" element
         */
        public com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace addNewStringReplace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace target = null;
                target = (com.schematronQuickfix.validator.process.StringReplaceDocument.StringReplace)get_store().add_element_user(STRINGREPLACE$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "stringReplace" element
         */
        public void removeStringReplace(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRINGREPLACE$16, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
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
        public org.apache.xmlbeans.XmlNCName xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(ID$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$18);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlNCName id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(ID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(ID$18);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "use-when" attribute
         */
        public java.lang.String getUseWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWHEN$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEWHEN$20);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "use-when" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUseWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEWHEN$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(USEWHEN$20);
                }
                return target;
            }
        }
        
        /**
         * True if has "use-when" attribute
         */
        public boolean isSetUseWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USEWHEN$20) != null;
            }
        }
        
        /**
         * Sets the "use-when" attribute
         */
        public void setUseWhen(java.lang.String useWhen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWHEN$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEWHEN$20);
                }
                target.setStringValue(useWhen);
            }
        }
        
        /**
         * Sets (as xml) the "use-when" attribute
         */
        public void xsetUseWhen(org.apache.xmlbeans.XmlString useWhen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEWHEN$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USEWHEN$20);
                }
                target.set(useWhen);
            }
        }
        
        /**
         * Unsets the "use-when" attribute
         */
        public void unsetUseWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USEWHEN$20);
            }
        }
        
        /**
         * Gets the "role" attribute
         */
        public com.schematronQuickfix.validator.process.FixDocument.Fix.Role.Enum getRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$22);
                if (target == null)
                {
                    return null;
                }
                return (com.schematronQuickfix.validator.process.FixDocument.Fix.Role.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "role" attribute
         */
        public com.schematronQuickfix.validator.process.FixDocument.Fix.Role xgetRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.FixDocument.Fix.Role target = null;
                target = (com.schematronQuickfix.validator.process.FixDocument.Fix.Role)get_store().find_attribute_user(ROLE$22);
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
                return get_store().find_attribute_user(ROLE$22) != null;
            }
        }
        
        /**
         * Sets the "role" attribute
         */
        public void setRole(com.schematronQuickfix.validator.process.FixDocument.Fix.Role.Enum role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$22);
                }
                target.setEnumValue(role);
            }
        }
        
        /**
         * Sets (as xml) the "role" attribute
         */
        public void xsetRole(com.schematronQuickfix.validator.process.FixDocument.Fix.Role role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.schematronQuickfix.validator.process.FixDocument.Fix.Role target = null;
                target = (com.schematronQuickfix.validator.process.FixDocument.Fix.Role)get_store().find_attribute_user(ROLE$22);
                if (target == null)
                {
                    target = (com.schematronQuickfix.validator.process.FixDocument.Fix.Role)get_store().add_attribute_user(ROLE$22);
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
                get_store().remove_attribute(ROLE$22);
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
         * An XML role(@).
         *
         * This is an atomic type that is a restriction of com.schematronQuickfix.validator.process.FixDocument$Fix$Role.
         */
        public static class RoleImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.schematronQuickfix.validator.process.FixDocument.Fix.Role
        {
            private static final long serialVersionUID = 1L;
            
            public RoleImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RoleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
