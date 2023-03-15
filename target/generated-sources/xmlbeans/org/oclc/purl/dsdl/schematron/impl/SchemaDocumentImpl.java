/*
 * An XML document type.
 * Localname: schema
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.SchemaDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one schema(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class SchemaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.SchemaDocument
{
    private static final long serialVersionUID = 1L;
    
    public SchemaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEMA$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "schema");
    
    
    /**
     * Gets the "schema" element
     */
    public org.oclc.purl.dsdl.schematron.SchemaDocument.Schema getSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.SchemaDocument.Schema target = null;
            target = (org.oclc.purl.dsdl.schematron.SchemaDocument.Schema)get_store().find_element_user(SCHEMA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "schema" element
     */
    public void setSchema(org.oclc.purl.dsdl.schematron.SchemaDocument.Schema schema)
    {
        generatedSetterHelperImpl(schema, SCHEMA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "schema" element
     */
    public org.oclc.purl.dsdl.schematron.SchemaDocument.Schema addNewSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.SchemaDocument.Schema target = null;
            target = (org.oclc.purl.dsdl.schematron.SchemaDocument.Schema)get_store().add_element_user(SCHEMA$0);
            return target;
        }
    }
    /**
     * An XML schema(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class SchemaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.SchemaDocument.Schema
    {
        private static final long serialVersionUID = 1L;
        
        public SchemaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCLUDE$0 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "include");
        private static final javax.xml.namespace.QName EXTENDS$2 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "extends");
        private static final javax.xml.namespace.QName TITLE$4 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "title");
        private static final javax.xml.namespace.QName NS$6 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "ns");
        private static final javax.xml.namespace.QName P$8 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "p");
        private static final javax.xml.namespace.QName LET$10 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "let");
        private static final javax.xml.namespace.QName PHASE$12 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "phase");
        private static final javax.xml.namespace.QName PATTERN$14 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "pattern");
        private static final javax.xml.namespace.QName DIAGNOSTICS$16 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "diagnostics");
        private static final javax.xml.namespace.QName ID$18 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName ICON$20 = 
            new javax.xml.namespace.QName("", "icon");
        private static final javax.xml.namespace.QName SEE$22 = 
            new javax.xml.namespace.QName("", "see");
        private static final javax.xml.namespace.QName FPI$24 = 
            new javax.xml.namespace.QName("", "fpi");
        private static final javax.xml.namespace.QName LANG$26 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName SPACE$28 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "space");
        private static final javax.xml.namespace.QName SCHEMAVERSION$30 = 
            new javax.xml.namespace.QName("", "schemaVersion");
        private static final javax.xml.namespace.QName DEFAULTPHASE$32 = 
            new javax.xml.namespace.QName("", "defaultPhase");
        private static final javax.xml.namespace.QName QUERYBINDING$34 = 
            new javax.xml.namespace.QName("", "queryBinding");
        
        
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
         * Gets array of all "extends" elements
         */
        public org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends[] getExtendsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTENDS$2, targetList);
                org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends[] result = new org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "extends" element
         */
        public org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends getExtendsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends target = null;
                target = (org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends)get_store().find_element_user(EXTENDS$2, i);
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
                return get_store().count_elements(EXTENDS$2);
            }
        }
        
        /**
         * Sets array of all "extends" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setExtendsArray(org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends[] xextendsArray)
        {
            check_orphaned();
            arraySetterHelper(xextendsArray, EXTENDS$2);
        }
        
        /**
         * Sets ith "extends" element
         */
        public void setExtendsArray(int i, org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends xextends)
        {
            generatedSetterHelperImpl(xextends, EXTENDS$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extends" element
         */
        public org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends insertNewExtends(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends target = null;
                target = (org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends)get_store().insert_element_user(EXTENDS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extends" element
         */
        public org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends addNewExtends()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends target = null;
                target = (org.oclc.purl.dsdl.schematron.ExtendsDocument.Extends)get_store().add_element_user(EXTENDS$2);
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
                get_store().remove_element(EXTENDS$2, i);
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
                get_store().find_all_element_users(TITLE$4, targetList);
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
                target = (org.oclc.purl.dsdl.schematron.TitleDocument.Title)get_store().find_element_user(TITLE$4, i);
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
                return get_store().count_elements(TITLE$4);
            }
        }
        
        /**
         * Sets array of all "title" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTitleArray(org.oclc.purl.dsdl.schematron.TitleDocument.Title[] titleArray)
        {
            check_orphaned();
            arraySetterHelper(titleArray, TITLE$4);
        }
        
        /**
         * Sets ith "title" element
         */
        public void setTitleArray(int i, org.oclc.purl.dsdl.schematron.TitleDocument.Title title)
        {
            generatedSetterHelperImpl(title, TITLE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.oclc.purl.dsdl.schematron.TitleDocument.Title)get_store().insert_element_user(TITLE$4, i);
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
                target = (org.oclc.purl.dsdl.schematron.TitleDocument.Title)get_store().add_element_user(TITLE$4);
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
                get_store().remove_element(TITLE$4, i);
            }
        }
        
        /**
         * Gets array of all "ns" elements
         */
        public org.oclc.purl.dsdl.schematron.NsDocument.Ns[] getNsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NS$6, targetList);
                org.oclc.purl.dsdl.schematron.NsDocument.Ns[] result = new org.oclc.purl.dsdl.schematron.NsDocument.Ns[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ns" element
         */
        public org.oclc.purl.dsdl.schematron.NsDocument.Ns getNsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NsDocument.Ns target = null;
                target = (org.oclc.purl.dsdl.schematron.NsDocument.Ns)get_store().find_element_user(NS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ns" element
         */
        public int sizeOfNsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NS$6);
            }
        }
        
        /**
         * Sets array of all "ns" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNsArray(org.oclc.purl.dsdl.schematron.NsDocument.Ns[] nsArray)
        {
            check_orphaned();
            arraySetterHelper(nsArray, NS$6);
        }
        
        /**
         * Sets ith "ns" element
         */
        public void setNsArray(int i, org.oclc.purl.dsdl.schematron.NsDocument.Ns ns)
        {
            generatedSetterHelperImpl(ns, NS$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ns" element
         */
        public org.oclc.purl.dsdl.schematron.NsDocument.Ns insertNewNs(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NsDocument.Ns target = null;
                target = (org.oclc.purl.dsdl.schematron.NsDocument.Ns)get_store().insert_element_user(NS$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ns" element
         */
        public org.oclc.purl.dsdl.schematron.NsDocument.Ns addNewNs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NsDocument.Ns target = null;
                target = (org.oclc.purl.dsdl.schematron.NsDocument.Ns)get_store().add_element_user(NS$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "ns" element
         */
        public void removeNs(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NS$6, i);
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
                get_store().find_all_element_users(P$8, targetList);
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
                target = (org.oclc.purl.dsdl.schematron.PDocument.P)get_store().find_element_user(P$8, i);
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
                return get_store().count_elements(P$8);
            }
        }
        
        /**
         * Sets array of all "p" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPArray(org.oclc.purl.dsdl.schematron.PDocument.P[] pArray)
        {
            check_orphaned();
            arraySetterHelper(pArray, P$8);
        }
        
        /**
         * Sets ith "p" element
         */
        public void setPArray(int i, org.oclc.purl.dsdl.schematron.PDocument.P p)
        {
            generatedSetterHelperImpl(p, P$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.oclc.purl.dsdl.schematron.PDocument.P)get_store().insert_element_user(P$8, i);
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
                target = (org.oclc.purl.dsdl.schematron.PDocument.P)get_store().add_element_user(P$8);
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
                get_store().remove_element(P$8, i);
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
                get_store().find_all_element_users(LET$10, targetList);
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
                target = (org.oclc.purl.dsdl.schematron.LetDocument.Let)get_store().find_element_user(LET$10, i);
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
                return get_store().count_elements(LET$10);
            }
        }
        
        /**
         * Sets array of all "let" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLetArray(org.oclc.purl.dsdl.schematron.LetDocument.Let[] letArray)
        {
            check_orphaned();
            arraySetterHelper(letArray, LET$10);
        }
        
        /**
         * Sets ith "let" element
         */
        public void setLetArray(int i, org.oclc.purl.dsdl.schematron.LetDocument.Let let)
        {
            generatedSetterHelperImpl(let, LET$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.oclc.purl.dsdl.schematron.LetDocument.Let)get_store().insert_element_user(LET$10, i);
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
                target = (org.oclc.purl.dsdl.schematron.LetDocument.Let)get_store().add_element_user(LET$10);
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
                get_store().remove_element(LET$10, i);
            }
        }
        
        /**
         * Gets array of all "phase" elements
         */
        public org.oclc.purl.dsdl.schematron.PhaseDocument.Phase[] getPhaseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PHASE$12, targetList);
                org.oclc.purl.dsdl.schematron.PhaseDocument.Phase[] result = new org.oclc.purl.dsdl.schematron.PhaseDocument.Phase[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "phase" element
         */
        public org.oclc.purl.dsdl.schematron.PhaseDocument.Phase getPhaseArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PhaseDocument.Phase target = null;
                target = (org.oclc.purl.dsdl.schematron.PhaseDocument.Phase)get_store().find_element_user(PHASE$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "phase" element
         */
        public int sizeOfPhaseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PHASE$12);
            }
        }
        
        /**
         * Sets array of all "phase" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPhaseArray(org.oclc.purl.dsdl.schematron.PhaseDocument.Phase[] phaseArray)
        {
            check_orphaned();
            arraySetterHelper(phaseArray, PHASE$12);
        }
        
        /**
         * Sets ith "phase" element
         */
        public void setPhaseArray(int i, org.oclc.purl.dsdl.schematron.PhaseDocument.Phase phase)
        {
            generatedSetterHelperImpl(phase, PHASE$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "phase" element
         */
        public org.oclc.purl.dsdl.schematron.PhaseDocument.Phase insertNewPhase(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PhaseDocument.Phase target = null;
                target = (org.oclc.purl.dsdl.schematron.PhaseDocument.Phase)get_store().insert_element_user(PHASE$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "phase" element
         */
        public org.oclc.purl.dsdl.schematron.PhaseDocument.Phase addNewPhase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PhaseDocument.Phase target = null;
                target = (org.oclc.purl.dsdl.schematron.PhaseDocument.Phase)get_store().add_element_user(PHASE$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "phase" element
         */
        public void removePhase(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PHASE$12, i);
            }
        }
        
        /**
         * Gets array of all "pattern" elements
         */
        public org.oclc.purl.dsdl.schematron.PatternDocument.Pattern[] getPatternArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PATTERN$14, targetList);
                org.oclc.purl.dsdl.schematron.PatternDocument.Pattern[] result = new org.oclc.purl.dsdl.schematron.PatternDocument.Pattern[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "pattern" element
         */
        public org.oclc.purl.dsdl.schematron.PatternDocument.Pattern getPatternArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PatternDocument.Pattern target = null;
                target = (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern)get_store().find_element_user(PATTERN$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "pattern" element
         */
        public int sizeOfPatternArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PATTERN$14);
            }
        }
        
        /**
         * Sets array of all "pattern" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPatternArray(org.oclc.purl.dsdl.schematron.PatternDocument.Pattern[] patternArray)
        {
            check_orphaned();
            arraySetterHelper(patternArray, PATTERN$14);
        }
        
        /**
         * Sets ith "pattern" element
         */
        public void setPatternArray(int i, org.oclc.purl.dsdl.schematron.PatternDocument.Pattern pattern)
        {
            generatedSetterHelperImpl(pattern, PATTERN$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pattern" element
         */
        public org.oclc.purl.dsdl.schematron.PatternDocument.Pattern insertNewPattern(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PatternDocument.Pattern target = null;
                target = (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern)get_store().insert_element_user(PATTERN$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pattern" element
         */
        public org.oclc.purl.dsdl.schematron.PatternDocument.Pattern addNewPattern()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.PatternDocument.Pattern target = null;
                target = (org.oclc.purl.dsdl.schematron.PatternDocument.Pattern)get_store().add_element_user(PATTERN$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "pattern" element
         */
        public void removePattern(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PATTERN$14, i);
            }
        }
        
        /**
         * Gets array of all "diagnostics" elements
         */
        public org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics[] getDiagnosticsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DIAGNOSTICS$16, targetList);
                org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics[] result = new org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "diagnostics" element
         */
        public org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics getDiagnosticsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics target = null;
                target = (org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics)get_store().find_element_user(DIAGNOSTICS$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "diagnostics" element
         */
        public int sizeOfDiagnosticsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIAGNOSTICS$16);
            }
        }
        
        /**
         * Sets array of all "diagnostics" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDiagnosticsArray(org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics[] diagnosticsArray)
        {
            check_orphaned();
            arraySetterHelper(diagnosticsArray, DIAGNOSTICS$16);
        }
        
        /**
         * Sets ith "diagnostics" element
         */
        public void setDiagnosticsArray(int i, org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics diagnostics)
        {
            generatedSetterHelperImpl(diagnostics, DIAGNOSTICS$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "diagnostics" element
         */
        public org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics insertNewDiagnostics(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics target = null;
                target = (org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics)get_store().insert_element_user(DIAGNOSTICS$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "diagnostics" element
         */
        public org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics addNewDiagnostics()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics target = null;
                target = (org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics)get_store().add_element_user(DIAGNOSTICS$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "diagnostics" element
         */
        public void removeDiagnostics(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIAGNOSTICS$16, i);
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
        public org.apache.xmlbeans.XmlID xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$18);
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
                return get_store().find_attribute_user(ID$18) != null;
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
        public void xsetId(org.apache.xmlbeans.XmlID id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$18);
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
                get_store().remove_attribute(ID$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICON$20);
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
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(ICON$20);
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
                return get_store().find_attribute_user(ICON$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICON$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ICON$20);
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
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(ICON$20);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().add_attribute_user(ICON$20);
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
                get_store().remove_attribute(ICON$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEE$22);
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
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(SEE$22);
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
                return get_store().find_attribute_user(SEE$22) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEE$22);
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
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(SEE$22);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().add_attribute_user(SEE$22);
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
                get_store().remove_attribute(SEE$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPI$24);
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
                target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().find_attribute_user(FPI$24);
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
                return get_store().find_attribute_user(FPI$24) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPI$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FPI$24);
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
                target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().find_attribute_user(FPI$24);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().add_attribute_user(FPI$24);
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
                get_store().remove_attribute(FPI$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$26);
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
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$26);
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
                return get_store().find_attribute_user(LANG$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$26);
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
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$26);
                if (target == null)
                {
                    target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().add_attribute_user(LANG$26);
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
                get_store().remove_attribute(LANG$26);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$28);
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
                target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$28);
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
                return get_store().find_attribute_user(SPACE$28) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPACE$28);
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
                target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$28);
                if (target == null)
                {
                    target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().add_attribute_user(SPACE$28);
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
                get_store().remove_attribute(SPACE$28);
            }
        }
        
        /**
         * Gets the "schemaVersion" attribute
         */
        public java.lang.String getSchemaVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMAVERSION$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "schemaVersion" attribute
         */
        public org.oclc.purl.dsdl.schematron.NonEmptyString xgetSchemaVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NonEmptyString target = null;
                target = (org.oclc.purl.dsdl.schematron.NonEmptyString)get_store().find_attribute_user(SCHEMAVERSION$30);
                return target;
            }
        }
        
        /**
         * True if has "schemaVersion" attribute
         */
        public boolean isSetSchemaVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SCHEMAVERSION$30) != null;
            }
        }
        
        /**
         * Sets the "schemaVersion" attribute
         */
        public void setSchemaVersion(java.lang.String schemaVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMAVERSION$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMAVERSION$30);
                }
                target.setStringValue(schemaVersion);
            }
        }
        
        /**
         * Sets (as xml) the "schemaVersion" attribute
         */
        public void xsetSchemaVersion(org.oclc.purl.dsdl.schematron.NonEmptyString schemaVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NonEmptyString target = null;
                target = (org.oclc.purl.dsdl.schematron.NonEmptyString)get_store().find_attribute_user(SCHEMAVERSION$30);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.NonEmptyString)get_store().add_attribute_user(SCHEMAVERSION$30);
                }
                target.set(schemaVersion);
            }
        }
        
        /**
         * Unsets the "schemaVersion" attribute
         */
        public void unsetSchemaVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SCHEMAVERSION$30);
            }
        }
        
        /**
         * Gets the "defaultPhase" attribute
         */
        public java.lang.String getDefaultPhase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTPHASE$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "defaultPhase" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetDefaultPhase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(DEFAULTPHASE$32);
                return target;
            }
        }
        
        /**
         * True if has "defaultPhase" attribute
         */
        public boolean isSetDefaultPhase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTPHASE$32) != null;
            }
        }
        
        /**
         * Sets the "defaultPhase" attribute
         */
        public void setDefaultPhase(java.lang.String defaultPhase)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTPHASE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTPHASE$32);
                }
                target.setStringValue(defaultPhase);
            }
        }
        
        /**
         * Sets (as xml) the "defaultPhase" attribute
         */
        public void xsetDefaultPhase(org.apache.xmlbeans.XmlIDREF defaultPhase)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(DEFAULTPHASE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(DEFAULTPHASE$32);
                }
                target.set(defaultPhase);
            }
        }
        
        /**
         * Unsets the "defaultPhase" attribute
         */
        public void unsetDefaultPhase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTPHASE$32);
            }
        }
        
        /**
         * Gets the "queryBinding" attribute
         */
        public java.lang.String getQueryBinding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYBINDING$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "queryBinding" attribute
         */
        public org.oclc.purl.dsdl.schematron.NonEmptyString xgetQueryBinding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NonEmptyString target = null;
                target = (org.oclc.purl.dsdl.schematron.NonEmptyString)get_store().find_attribute_user(QUERYBINDING$34);
                return target;
            }
        }
        
        /**
         * True if has "queryBinding" attribute
         */
        public boolean isSetQueryBinding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(QUERYBINDING$34) != null;
            }
        }
        
        /**
         * Sets the "queryBinding" attribute
         */
        public void setQueryBinding(java.lang.String queryBinding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYBINDING$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUERYBINDING$34);
                }
                target.setStringValue(queryBinding);
            }
        }
        
        /**
         * Sets (as xml) the "queryBinding" attribute
         */
        public void xsetQueryBinding(org.oclc.purl.dsdl.schematron.NonEmptyString queryBinding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.NonEmptyString target = null;
                target = (org.oclc.purl.dsdl.schematron.NonEmptyString)get_store().find_attribute_user(QUERYBINDING$34);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.NonEmptyString)get_store().add_attribute_user(QUERYBINDING$34);
                }
                target.set(queryBinding);
            }
        }
        
        /**
         * Unsets the "queryBinding" attribute
         */
        public void unsetQueryBinding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(QUERYBINDING$34);
            }
        }
    }
}
