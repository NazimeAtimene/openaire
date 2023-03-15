/*
 * An XML document type.
 * Localname: pattern
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.PatternDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one pattern(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class PatternDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.PatternDocument
{
    private static final long serialVersionUID = 1L;
    
    public PatternDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATTERN$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "pattern");
    
    
    /**
     * Gets the "pattern" element
     */
    public org.oclc.purl.dsdl.schematron.PatternDocument.Pattern getPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.PatternDocument.Pattern target = null;
            target = (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern)get_store().find_element_user(PATTERN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pattern" element
     */
    public void setPattern(org.oclc.purl.dsdl.schematron.PatternDocument.Pattern pattern)
    {
        generatedSetterHelperImpl(pattern, PATTERN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pattern" element
     */
    public org.oclc.purl.dsdl.schematron.PatternDocument.Pattern addNewPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.PatternDocument.Pattern target = null;
            target = (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern)get_store().add_element_user(PATTERN$0);
            return target;
        }
    }
    /**
     * An XML pattern(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class PatternImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.PatternDocument.Pattern
    {
        private static final long serialVersionUID = 1L;
        
        public PatternImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCLUDE$0 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "include");
        private static final javax.xml.namespace.QName TITLE$2 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "title");
        private static final javax.xml.namespace.QName P$4 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "p");
        private static final javax.xml.namespace.QName LET$6 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "let");
        private static final javax.xml.namespace.QName RULE$8 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "rule");
        private static final javax.xml.namespace.QName PARAM$10 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "param");
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
        private static final javax.xml.namespace.QName ABSTRACT$22 = 
            new javax.xml.namespace.QName("", "abstract");
        private static final javax.xml.namespace.QName ID$24 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName ISA$26 = 
            new javax.xml.namespace.QName("", "is-a");
        
        
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
         * Gets array of all "title" elements
         */
        public org.oclc.purl.dsdl.schematron.TitleDocument.Title[] getTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TITLE$2, targetList);
                org.oclc.purl.dsdl.schematron.TitleDocument.Title[] result = new org.oclc.purl.dsdl.schematron.TitleDocument.Title[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "title" element
         */
        public org.oclc.purl.dsdl.schematron.TitleDocument.Title getTitleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.TitleDocument.Title target = null;
                target = (org.oclc.purl.dsdl.schematron.TitleDocument.Title)get_store().find_element_user(TITLE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "title" element
         */
        public int sizeOfTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$2);
            }
        }
        
        /**
         * Sets array of all "title" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTitleArray(org.oclc.purl.dsdl.schematron.TitleDocument.Title[] titleArray)
        {
            check_orphaned();
            arraySetterHelper(titleArray, TITLE$2);
        }
        
        /**
         * Sets ith "title" element
         */
        public void setTitleArray(int i, org.oclc.purl.dsdl.schematron.TitleDocument.Title title)
        {
            generatedSetterHelperImpl(title, TITLE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "title" element
         */
        public org.oclc.purl.dsdl.schematron.TitleDocument.Title insertNewTitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.TitleDocument.Title target = null;
                target = (org.oclc.purl.dsdl.schematron.TitleDocument.Title)get_store().insert_element_user(TITLE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "title" element
         */
        public org.oclc.purl.dsdl.schematron.TitleDocument.Title addNewTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.TitleDocument.Title target = null;
                target = (org.oclc.purl.dsdl.schematron.TitleDocument.Title)get_store().add_element_user(TITLE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "title" element
         */
        public void removeTitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$2, i);
            }
        }
        
        /**
         * Gets array of all "p" elements
         */
        public org.oclc.purl.dsdl.schematron.PDocument.P[] getPArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(P$4, targetList);
                org.oclc.purl.dsdl.schematron.PDocument.P[] result = new org.oclc.purl.dsdl.schematron.PDocument.P[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "p" element
         */
        public org.oclc.purl.dsdl.schematron.PDocument.P getPArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PDocument.P target = null;
                target = (org.oclc.purl.dsdl.schematron.PDocument.P)get_store().find_element_user(P$4, i);
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
                return get_store().count_elements(P$4);
            }
        }
        
        /**
         * Sets array of all "p" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPArray(org.oclc.purl.dsdl.schematron.PDocument.P[] pArray)
        {
            check_orphaned();
            arraySetterHelper(pArray, P$4);
        }
        
        /**
         * Sets ith "p" element
         */
        public void setPArray(int i, org.oclc.purl.dsdl.schematron.PDocument.P p)
        {
            generatedSetterHelperImpl(p, P$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "p" element
         */
        public org.oclc.purl.dsdl.schematron.PDocument.P insertNewP(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PDocument.P target = null;
                target = (org.oclc.purl.dsdl.schematron.PDocument.P)get_store().insert_element_user(P$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "p" element
         */
        public org.oclc.purl.dsdl.schematron.PDocument.P addNewP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PDocument.P target = null;
                target = (org.oclc.purl.dsdl.schematron.PDocument.P)get_store().add_element_user(P$4);
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
                get_store().remove_element(P$4, i);
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
                get_store().find_all_element_users(LET$6, targetList);
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
                target = (org.oclc.purl.dsdl.schematron.LetDocument.Let)get_store().find_element_user(LET$6, i);
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
                return get_store().count_elements(LET$6);
            }
        }
        
        /**
         * Sets array of all "let" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLetArray(org.oclc.purl.dsdl.schematron.LetDocument.Let[] letArray)
        {
            check_orphaned();
            arraySetterHelper(letArray, LET$6);
        }
        
        /**
         * Sets ith "let" element
         */
        public void setLetArray(int i, org.oclc.purl.dsdl.schematron.LetDocument.Let let)
        {
            generatedSetterHelperImpl(let, LET$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.oclc.purl.dsdl.schematron.LetDocument.Let)get_store().insert_element_user(LET$6, i);
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
                target = (org.oclc.purl.dsdl.schematron.LetDocument.Let)get_store().add_element_user(LET$6);
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
                get_store().remove_element(LET$6, i);
            }
        }
        
        /**
         * Gets array of all "rule" elements
         */
        public org.oclc.purl.dsdl.schematron.RuleDocument.Rule[] getRuleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RULE$8, targetList);
                org.oclc.purl.dsdl.schematron.RuleDocument.Rule[] result = new org.oclc.purl.dsdl.schematron.RuleDocument.Rule[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "rule" element
         */
        public org.oclc.purl.dsdl.schematron.RuleDocument.Rule getRuleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.RuleDocument.Rule target = null;
                target = (org.oclc.purl.dsdl.schematron.RuleDocument.Rule)get_store().find_element_user(RULE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "rule" element
         */
        public int sizeOfRuleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RULE$8);
            }
        }
        
        /**
         * Sets array of all "rule" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRuleArray(org.oclc.purl.dsdl.schematron.RuleDocument.Rule[] ruleArray)
        {
            check_orphaned();
            arraySetterHelper(ruleArray, RULE$8);
        }
        
        /**
         * Sets ith "rule" element
         */
        public void setRuleArray(int i, org.oclc.purl.dsdl.schematron.RuleDocument.Rule rule)
        {
            generatedSetterHelperImpl(rule, RULE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "rule" element
         */
        public org.oclc.purl.dsdl.schematron.RuleDocument.Rule insertNewRule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.RuleDocument.Rule target = null;
                target = (org.oclc.purl.dsdl.schematron.RuleDocument.Rule)get_store().insert_element_user(RULE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "rule" element
         */
        public org.oclc.purl.dsdl.schematron.RuleDocument.Rule addNewRule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.RuleDocument.Rule target = null;
                target = (org.oclc.purl.dsdl.schematron.RuleDocument.Rule)get_store().add_element_user(RULE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "rule" element
         */
        public void removeRule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RULE$8, i);
            }
        }
        
        /**
         * Gets array of all "param" elements
         */
        public org.oclc.purl.dsdl.schematron.ParamDocument.Param[] getParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAM$10, targetList);
                org.oclc.purl.dsdl.schematron.ParamDocument.Param[] result = new org.oclc.purl.dsdl.schematron.ParamDocument.Param[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "param" element
         */
        public org.oclc.purl.dsdl.schematron.ParamDocument.Param getParamArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ParamDocument.Param target = null;
                target = (org.oclc.purl.dsdl.schematron.ParamDocument.Param)get_store().find_element_user(PARAM$10, i);
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
                return get_store().count_elements(PARAM$10);
            }
        }
        
        /**
         * Sets array of all "param" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setParamArray(org.oclc.purl.dsdl.schematron.ParamDocument.Param[] paramArray)
        {
            check_orphaned();
            arraySetterHelper(paramArray, PARAM$10);
        }
        
        /**
         * Sets ith "param" element
         */
        public void setParamArray(int i, org.oclc.purl.dsdl.schematron.ParamDocument.Param param)
        {
            generatedSetterHelperImpl(param, PARAM$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "param" element
         */
        public org.oclc.purl.dsdl.schematron.ParamDocument.Param insertNewParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ParamDocument.Param target = null;
                target = (org.oclc.purl.dsdl.schematron.ParamDocument.Param)get_store().insert_element_user(PARAM$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "param" element
         */
        public org.oclc.purl.dsdl.schematron.ParamDocument.Param addNewParam()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ParamDocument.Param target = null;
                target = (org.oclc.purl.dsdl.schematron.ParamDocument.Param)get_store().add_element_user(PARAM$10);
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
                get_store().remove_element(PARAM$10, i);
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
         * Gets the "abstract" attribute
         */
        public org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract.Enum getAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ABSTRACT$22);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "abstract" attribute
         */
        public org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract xgetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract target = null;
                target = (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract)get_store().find_attribute_user(ABSTRACT$22);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract)get_default_attribute_value(ABSTRACT$22);
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
                return get_store().find_attribute_user(ABSTRACT$22) != null;
            }
        }
        
        /**
         * Sets the "abstract" attribute
         */
        public void setAbstract(org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract.Enum xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABSTRACT$22);
                }
                target.setEnumValue(xabstract);
            }
        }
        
        /**
         * Sets (as xml) the "abstract" attribute
         */
        public void xsetAbstract(org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract target = null;
                target = (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract)get_store().find_attribute_user(ABSTRACT$22);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract)get_store().add_attribute_user(ABSTRACT$22);
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
                get_store().remove_attribute(ABSTRACT$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$24);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$24);
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
                return get_store().find_attribute_user(ID$24) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$24);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$24);
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
                get_store().remove_attribute(ID$24);
            }
        }
        
        /**
         * Gets the "is-a" attribute
         */
        public java.lang.String getIsA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISA$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "is-a" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetIsA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(ISA$26);
                return target;
            }
        }
        
        /**
         * True if has "is-a" attribute
         */
        public boolean isSetIsA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ISA$26) != null;
            }
        }
        
        /**
         * Sets the "is-a" attribute
         */
        public void setIsA(java.lang.String isA)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISA$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISA$26);
                }
                target.setStringValue(isA);
            }
        }
        
        /**
         * Sets (as xml) the "is-a" attribute
         */
        public void xsetIsA(org.apache.xmlbeans.XmlIDREF isA)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(ISA$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(ISA$26);
                }
                target.set(isA);
            }
        }
        
        /**
         * Unsets the "is-a" attribute
         */
        public void unsetIsA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ISA$26);
            }
        }
        /**
         * An XML abstract(@).
         *
         * This is an atomic type that is a restriction of org.oclc.purl.dsdl.schematron.PatternDocument$Pattern$Abstract.
         */
        public static class AbstractImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.oclc.purl.dsdl.schematron.PatternDocument.Pattern.Abstract
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
