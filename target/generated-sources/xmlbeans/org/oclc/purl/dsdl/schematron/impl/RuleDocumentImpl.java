/*
 * An XML document type.
 * Localname: rule
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.RuleDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one rule(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class RuleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.RuleDocument
{
    private static final long serialVersionUID = 1L;
    
    public RuleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RULE$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "rule");
    
    
    /**
     * Gets the "rule" element
     */
    public org.oclc.purl.dsdl.schematron.RuleDocument.Rule getRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.RuleDocument.Rule target = null;
            target = (org.oclc.purl.dsdl.schematron.RuleDocument.Rule)get_store().find_element_user(RULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rule" element
     */
    public void setRule(org.oclc.purl.dsdl.schematron.RuleDocument.Rule rule)
    {
        generatedSetterHelperImpl(rule, RULE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rule" element
     */
    public org.oclc.purl.dsdl.schematron.RuleDocument.Rule addNewRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.RuleDocument.Rule target = null;
            target = (org.oclc.purl.dsdl.schematron.RuleDocument.Rule)get_store().add_element_user(RULE$0);
            return target;
        }
    }
    /**
     * An XML rule(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class RuleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.RuleDocument.Rule
    {
        private static final long serialVersionUID = 1L;
        
        public RuleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCLUDE$0 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "include");
        private static final javax.xml.namespace.QName LET$2 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "let");
        private static final javax.xml.namespace.QName ASSERT$4 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "assert");
        private static final javax.xml.namespace.QName REPORT$6 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "report");
        private static final javax.xml.namespace.QName EXTENDS$8 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "extends");
        private static final javax.xml.namespace.QName FLAG$10 = 
            new javax.xml.namespace.QName("", "flag");
        private static final javax.xml.namespace.QName ICON$12 = 
            new javax.xml.namespace.QName("", "icon");
        private static final javax.xml.namespace.QName SEE$14 = 
            new javax.xml.namespace.QName("", "see");
        private static final javax.xml.namespace.QName FPI$16 = 
            new javax.xml.namespace.QName("", "fpi");
        private static final javax.xml.namespace.QName LANG$18 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName SPACE$20 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "space");
        private static final javax.xml.namespace.QName ROLE$22 = 
            new javax.xml.namespace.QName("", "role");
        private static final javax.xml.namespace.QName SUBJECT$24 = 
            new javax.xml.namespace.QName("", "subject");
        private static final javax.xml.namespace.QName ABSTRACT$26 = 
            new javax.xml.namespace.QName("", "abstract");
        private static final javax.xml.namespace.QName ID$28 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CONTEXT$30 = 
            new javax.xml.namespace.QName("", "context");
        
        
        /**
         * Gets array of all "include" elements
         */
        public org.oclc.purl.dsdl.schematron.IncludeDocument.Include[] getIncludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INCLUDE$0, targetList);
                org.oclc.purl.dsdl.schematron.IncludeDocument.Include[] result = new org.oclc.purl.dsdl.schematron.IncludeDocument.Include[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "include" element
         */
        public org.oclc.purl.dsdl.schematron.IncludeDocument.Include getIncludeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.IncludeDocument.Include target = null;
                target = (org.oclc.purl.dsdl.schematron.IncludeDocument.Include)get_store().find_element_user(INCLUDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "include" element
         */
        public int sizeOfIncludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCLUDE$0);
            }
        }
        
        /**
         * Sets array of all "include" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIncludeArray(org.oclc.purl.dsdl.schematron.IncludeDocument.Include[] includeArray)
        {
            check_orphaned();
            arraySetterHelper(includeArray, INCLUDE$0);
        }
        
        /**
         * Sets ith "include" element
         */
        public void setIncludeArray(int i, org.oclc.purl.dsdl.schematron.IncludeDocument.Include include)
        {
            generatedSetterHelperImpl(include, INCLUDE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "include" element
         */
        public org.oclc.purl.dsdl.schematron.IncludeDocument.Include insertNewInclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.IncludeDocument.Include target = null;
                target = (org.oclc.purl.dsdl.schematron.IncludeDocument.Include)get_store().insert_element_user(INCLUDE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "include" element
         */
        public org.oclc.purl.dsdl.schematron.IncludeDocument.Include addNewInclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.IncludeDocument.Include target = null;
                target = (org.oclc.purl.dsdl.schematron.IncludeDocument.Include)get_store().add_element_user(INCLUDE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "include" element
         */
        public void removeInclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCLUDE$0, i);
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
         * Gets array of all "assert" elements
         */
        public org.oclc.purl.dsdl.schematron.AssertReportType[] getAssertArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ASSERT$4, targetList);
                org.oclc.purl.dsdl.schematron.AssertReportType[] result = new org.oclc.purl.dsdl.schematron.AssertReportType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "assert" element
         */
        public org.oclc.purl.dsdl.schematron.AssertReportType getAssertArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.AssertReportType target = null;
                target = (org.oclc.purl.dsdl.schematron.AssertReportType)get_store().find_element_user(ASSERT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "assert" element
         */
        public int sizeOfAssertArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ASSERT$4);
            }
        }
        
        /**
         * Sets array of all "assert" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAssertArray(org.oclc.purl.dsdl.schematron.AssertReportType[] xassertArray)
        {
            check_orphaned();
            arraySetterHelper(xassertArray, ASSERT$4);
        }
        
        /**
         * Sets ith "assert" element
         */
        public void setAssertArray(int i, org.oclc.purl.dsdl.schematron.AssertReportType xassert)
        {
            generatedSetterHelperImpl(xassert, ASSERT$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "assert" element
         */
        public org.oclc.purl.dsdl.schematron.AssertReportType insertNewAssert(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.AssertReportType target = null;
                target = (org.oclc.purl.dsdl.schematron.AssertReportType)get_store().insert_element_user(ASSERT$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "assert" element
         */
        public org.oclc.purl.dsdl.schematron.AssertReportType addNewAssert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.AssertReportType target = null;
                target = (org.oclc.purl.dsdl.schematron.AssertReportType)get_store().add_element_user(ASSERT$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "assert" element
         */
        public void removeAssert(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ASSERT$4, i);
            }
        }
        
        /**
         * Gets array of all "report" elements
         */
        public org.oclc.purl.dsdl.schematron.AssertReportType[] getReportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPORT$6, targetList);
                org.oclc.purl.dsdl.schematron.AssertReportType[] result = new org.oclc.purl.dsdl.schematron.AssertReportType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "report" element
         */
        public org.oclc.purl.dsdl.schematron.AssertReportType getReportArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.AssertReportType target = null;
                target = (org.oclc.purl.dsdl.schematron.AssertReportType)get_store().find_element_user(REPORT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "report" element
         */
        public int sizeOfReportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORT$6);
            }
        }
        
        /**
         * Sets array of all "report" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setReportArray(org.oclc.purl.dsdl.schematron.AssertReportType[] reportArray)
        {
            check_orphaned();
            arraySetterHelper(reportArray, REPORT$6);
        }
        
        /**
         * Sets ith "report" element
         */
        public void setReportArray(int i, org.oclc.purl.dsdl.schematron.AssertReportType report)
        {
            generatedSetterHelperImpl(report, REPORT$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "report" element
         */
        public org.oclc.purl.dsdl.schematron.AssertReportType insertNewReport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.AssertReportType target = null;
                target = (org.oclc.purl.dsdl.schematron.AssertReportType)get_store().insert_element_user(REPORT$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "report" element
         */
        public org.oclc.purl.dsdl.schematron.AssertReportType addNewReport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.AssertReportType target = null;
                target = (org.oclc.purl.dsdl.schematron.AssertReportType)get_store().add_element_user(REPORT$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "report" element
         */
        public void removeReport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORT$6, i);
            }
        }
        
        /**
         * Gets array of all "extends" elements
         */
        public org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends[] getExtendsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTENDS$8, targetList);
                org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends[] result = new org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "extends" element
         */
        public org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends getExtendsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends target = null;
                target = (org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends)get_store().find_element_user(EXTENDS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "extends" element
         */
        public int sizeOfExtendsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENDS$8);
            }
        }
        
        /**
         * Sets array of all "extends" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setExtendsArray(org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends[] xextendsArray)
        {
            check_orphaned();
            arraySetterHelper(xextendsArray, EXTENDS$8);
        }
        
        /**
         * Sets ith "extends" element
         */
        public void setExtendsArray(int i, org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends xextends)
        {
            generatedSetterHelperImpl(xextends, EXTENDS$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extends" element
         */
        public org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends insertNewExtends(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends target = null;
                target = (org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends)get_store().insert_element_user(EXTENDS$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extends" element
         */
        public org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends addNewExtends()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends target = null;
                target = (org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends)get_store().add_element_user(EXTENDS$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "extends" element
         */
        public void removeExtends(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENDS$8, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLAG$10);
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
                target = (org.oclc.purl.dsdl.schematron.FlagValue)get_store().find_attribute_user(FLAG$10);
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
                return get_store().find_attribute_user(FLAG$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLAG$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLAG$10);
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
                target = (org.oclc.purl.dsdl.schematron.FlagValue)get_store().find_attribute_user(FLAG$10);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.FlagValue)get_store().add_attribute_user(FLAG$10);
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
                get_store().remove_attribute(FLAG$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICON$12);
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
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(ICON$12);
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
                return get_store().find_attribute_user(ICON$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICON$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ICON$12);
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
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(ICON$12);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().add_attribute_user(ICON$12);
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
                get_store().remove_attribute(ICON$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEE$14);
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
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(SEE$14);
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
                return get_store().find_attribute_user(SEE$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEE$14);
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
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(SEE$14);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().add_attribute_user(SEE$14);
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
                get_store().remove_attribute(SEE$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPI$16);
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
                target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().find_attribute_user(FPI$16);
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
                return get_store().find_attribute_user(FPI$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPI$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FPI$16);
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
                target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().find_attribute_user(FPI$16);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().add_attribute_user(FPI$16);
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
                get_store().remove_attribute(FPI$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$18);
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
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$18);
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
                return get_store().find_attribute_user(LANG$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$18);
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
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$18);
                if (target == null)
                {
                    target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().add_attribute_user(LANG$18);
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
                get_store().remove_attribute(LANG$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$20);
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
                target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$20);
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
                return get_store().find_attribute_user(SPACE$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPACE$20);
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
                target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$20);
                if (target == null)
                {
                    target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().add_attribute_user(SPACE$20);
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
                get_store().remove_attribute(SPACE$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$22);
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
                target = (org.oclc.purl.dsdl.schematron.RoleValue)get_store().find_attribute_user(ROLE$22);
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
        public void setRole(java.lang.String role)
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
                target = (org.oclc.purl.dsdl.schematron.RoleValue)get_store().find_attribute_user(ROLE$22);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.RoleValue)get_store().add_attribute_user(ROLE$22);
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
         * Gets the "subject" attribute
         */
        public java.lang.String getSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBJECT$24);
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
                target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().find_attribute_user(SUBJECT$24);
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
                return get_store().find_attribute_user(SUBJECT$24) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBJECT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBJECT$24);
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
                target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().find_attribute_user(SUBJECT$24);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().add_attribute_user(SUBJECT$24);
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
                get_store().remove_attribute(SUBJECT$24);
            }
        }
        
        /**
         * Gets the "abstract" attribute
         */
        public org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract.Enum getAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ABSTRACT$26);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "abstract" attribute
         */
        public org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract xgetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract target = null;
                target = (org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract)get_store().find_attribute_user(ABSTRACT$26);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract)get_default_attribute_value(ABSTRACT$26);
                }
                return target;
            }
        }
        
        /**
         * True if has "abstract" attribute
         */
        public boolean isSetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ABSTRACT$26) != null;
            }
        }
        
        /**
         * Sets the "abstract" attribute
         */
        public void setAbstract(org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract.Enum xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABSTRACT$26);
                }
                target.setEnumValue(xabstract);
            }
        }
        
        /**
         * Sets (as xml) the "abstract" attribute
         */
        public void xsetAbstract(org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract target = null;
                target = (org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract)get_store().find_attribute_user(ABSTRACT$26);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract)get_store().add_attribute_user(ABSTRACT$26);
                }
                target.set(xabstract);
            }
        }
        
        /**
         * Unsets the "abstract" attribute
         */
        public void unsetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ABSTRACT$26);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$28);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$28);
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
                return get_store().find_attribute_user(ID$28) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$28);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$28);
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
                get_store().remove_attribute(ID$28);
            }
        }
        
        /**
         * Gets the "context" attribute
         */
        public java.lang.String getContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXT$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "context" attribute
         */
        public org.oclc.purl.dsdl.schematron.PathValue xgetContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PathValue target = null;
                target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().find_attribute_user(CONTEXT$30);
                return target;
            }
        }
        
        /**
         * True if has "context" attribute
         */
        public boolean isSetContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONTEXT$30) != null;
            }
        }
        
        /**
         * Sets the "context" attribute
         */
        public void setContext(java.lang.String context)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXT$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTEXT$30);
                }
                target.setStringValue(context);
            }
        }
        
        /**
         * Sets (as xml) the "context" attribute
         */
        public void xsetContext(org.oclc.purl.dsdl.schematron.PathValue context)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PathValue target = null;
                target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().find_attribute_user(CONTEXT$30);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.PathValue)get_store().add_attribute_user(CONTEXT$30);
                }
                target.set(context);
            }
        }
        
        /**
         * Unsets the "context" attribute
         */
        public void unsetContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONTEXT$30);
            }
        }
        /**
         * An XML extends(@http://purl.oclc.org/dsdl/schematron).
         *
         * This is a complex type.
         */
        public static class ExtendsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Extends
        {
            private static final long serialVersionUID = 1L;
            
            public ExtendsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RULE$0 = 
                new javax.xml.namespace.QName("", "rule");
            
            
            /**
             * Gets the "rule" attribute
             */
            public java.lang.String getRule()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RULE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "rule" attribute
             */
            public org.apache.xmlbeans.XmlIDREF xgetRule()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlIDREF target = null;
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(RULE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "rule" attribute
             */
            public void setRule(java.lang.String rule)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RULE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RULE$0);
                    }
                    target.setStringValue(rule);
                }
            }
            
            /**
             * Sets (as xml) the "rule" attribute
             */
            public void xsetRule(org.apache.xmlbeans.XmlIDREF rule)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlIDREF target = null;
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(RULE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(RULE$0);
                    }
                    target.set(rule);
                }
            }
        }
        /**
         * An XML abstract(@).
         *
         * This is an atomic type that is a restriction of org.oclc.purl.dsdl.schematron.RuleDocument$Rule$Abstract.
         */
        public static class AbstractImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.oclc.purl.dsdl.schematron.RuleDocument.Rule.Abstract
        {
            private static final long serialVersionUID = 1L;
            
            public AbstractImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AbstractImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
