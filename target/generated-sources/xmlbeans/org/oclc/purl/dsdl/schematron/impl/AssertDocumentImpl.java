/*
 * An XML document type.
 * Localname: assert
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.AssertDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one assert(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class AssertDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.AssertDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssertDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSERT$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "assert");
    
    
    /**
     * Gets the "assert" element
     */
    public org.oclc.purl.dsdl.schematron.AssertReportType getAssert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.AssertReportType target = null;
            target = (org.oclc.purl.dsdl.schematron.AssertReportType)get_store().find_element_user(ASSERT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "assert" element
     */
    public void setAssert(org.oclc.purl.dsdl.schematron.AssertReportType xassert)
    {
        generatedSetterHelperImpl(xassert, ASSERT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "assert" element
     */
    public org.oclc.purl.dsdl.schematron.AssertReportType addNewAssert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.AssertReportType target = null;
            target = (org.oclc.purl.dsdl.schematron.AssertReportType)get_store().add_element_user(ASSERT$0);
            return target;
        }
    }
}
