/*
 * An XML document type.
 * Localname: report
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.ReportDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one report(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class ReportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.ReportDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORT$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "report");
    
    
    /**
     * Gets the "report" element
     */
    public org.oclc.purl.dsdl.schematron.AssertReportType getReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.AssertReportType target = null;
            target = (org.oclc.purl.dsdl.schematron.AssertReportType)get_store().find_element_user(REPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "report" element
     */
    public void setReport(org.oclc.purl.dsdl.schematron.AssertReportType report)
    {
        generatedSetterHelperImpl(report, REPORT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "report" element
     */
    public org.oclc.purl.dsdl.schematron.AssertReportType addNewReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.AssertReportType target = null;
            target = (org.oclc.purl.dsdl.schematron.AssertReportType)get_store().add_element_user(REPORT$0);
            return target;
        }
    }
}
