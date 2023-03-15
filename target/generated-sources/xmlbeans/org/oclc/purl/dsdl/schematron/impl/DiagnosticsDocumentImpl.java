/*
 * An XML document type.
 * Localname: diagnostics
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.DiagnosticsDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one diagnostics(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class DiagnosticsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.DiagnosticsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiagnosticsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGNOSTICS$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "diagnostics");
    
    
    /**
     * Gets the "diagnostics" element
     */
    public org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics getDiagnostics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics target = null;
            target = (org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics)get_store().find_element_user(DIAGNOSTICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "diagnostics" element
     */
    public void setDiagnostics(org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics diagnostics)
    {
        generatedSetterHelperImpl(diagnostics, DIAGNOSTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "diagnostics" element
     */
    public org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics addNewDiagnostics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics target = null;
            target = (org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics)get_store().add_element_user(DIAGNOSTICS$0);
            return target;
        }
    }
    /**
     * An XML diagnostics(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class DiagnosticsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.DiagnosticsDocument.Diagnostics
    {
        private static final long serialVersionUID = 1L;
        
        public DiagnosticsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCLUDE$0 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "include");
        private static final javax.xml.namespace.QName DIAGNOSTIC$2 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "diagnostic");
        
        
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
         * Gets array of all "diagnostic" elements
         */
        public org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic[] getDiagnosticArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DIAGNOSTIC$2, targetList);
                org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic[] result = new org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "diagnostic" element
         */
        public org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic getDiagnosticArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic target = null;
                target = (org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic)get_store().find_element_user(DIAGNOSTIC$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "diagnostic" element
         */
        public int sizeOfDiagnosticArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIAGNOSTIC$2);
            }
        }
        
        /**
         * Sets array of all "diagnostic" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDiagnosticArray(org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic[] diagnosticArray)
        {
            check_orphaned();
            arraySetterHelper(diagnosticArray, DIAGNOSTIC$2);
        }
        
        /**
         * Sets ith "diagnostic" element
         */
        public void setDiagnosticArray(int i, org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic diagnostic)
        {
            generatedSetterHelperImpl(diagnostic, DIAGNOSTIC$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "diagnostic" element
         */
        public org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic insertNewDiagnostic(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic target = null;
                target = (org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic)get_store().insert_element_user(DIAGNOSTIC$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "diagnostic" element
         */
        public org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic addNewDiagnostic()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic target = null;
                target = (org.oclc.purl.dsdl.schematron.DiagnosticDocument.Diagnostic)get_store().add_element_user(DIAGNOSTIC$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "diagnostic" element
         */
        public void removeDiagnostic(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIAGNOSTIC$2, i);
            }
        }
    }
}
