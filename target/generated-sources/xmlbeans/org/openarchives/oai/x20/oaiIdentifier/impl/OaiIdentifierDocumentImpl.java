/*
 * An XML document type.
 * Localname: oai-identifier
 * Namespace: http://www.openarchives.org/OAI/2.0/oai-identifier
 * Java type: org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package org.openarchives.oai.x20.oaiIdentifier.impl;
/**
 * A document containing one oai-identifier(@http://www.openarchives.org/OAI/2.0/oai-identifier) element.
 *
 * This is a complex type.
 */
public class OaiIdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public OaiIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OAIIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/oai-identifier", "oai-identifier");
    
    
    /**
     * Gets the "oai-identifier" element
     */
    public org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType getOaiIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType target = null;
            target = (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType)get_store().find_element_user(OAIIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "oai-identifier" element
     */
    public void setOaiIdentifier(org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType oaiIdentifier)
    {
        generatedSetterHelperImpl(oaiIdentifier, OAIIDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "oai-identifier" element
     */
    public org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType addNewOaiIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType target = null;
            target = (org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType)get_store().add_element_user(OAIIDENTIFIER$0);
            return target;
        }
    }
}
