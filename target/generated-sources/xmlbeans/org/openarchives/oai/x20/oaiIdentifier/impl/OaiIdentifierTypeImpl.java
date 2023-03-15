/*
 * XML Type:  oai-identifierType
 * Namespace: http://www.openarchives.org/OAI/2.0/oai-identifier
 * Java type: org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType
 *
 * Automatically generated - do not modify.
 */
package org.openarchives.oai.x20.oaiIdentifier.impl;
/**
 * An XML oai-identifierType(@http://www.openarchives.org/OAI/2.0/oai-identifier).
 *
 * This is a complex type.
 */
public class OaiIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openarchives.oai.x20.oaiIdentifier.OaiIdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public OaiIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEME$0 = 
        new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/oai-identifier", "scheme");
    private static final javax.xml.namespace.QName REPOSITORYIDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/oai-identifier", "repositoryIdentifier");
    private static final javax.xml.namespace.QName DELIMITER$4 = 
        new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/oai-identifier", "delimiter");
    private static final javax.xml.namespace.QName SAMPLEIDENTIFIER$6 = 
        new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/oai-identifier", "sampleIdentifier");
    
    
    /**
     * Gets the "scheme" element
     */
    public java.lang.String getScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scheme" element
     */
    public org.apache.xmlbeans.XmlString xgetScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scheme" element
     */
    public void setScheme(java.lang.String scheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEME$0);
            }
            target.setStringValue(scheme);
        }
    }
    
    /**
     * Sets (as xml) the "scheme" element
     */
    public void xsetScheme(org.apache.xmlbeans.XmlString scheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEME$0);
            }
            target.set(scheme);
        }
    }
    
    /**
     * Gets the "repositoryIdentifier" element
     */
    public java.lang.String getRepositoryIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPOSITORYIDENTIFIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "repositoryIdentifier" element
     */
    public org.openarchives.oai.x20.oaiIdentifier.RepositoryIdentifierType xgetRepositoryIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.oai.x20.oaiIdentifier.RepositoryIdentifierType target = null;
            target = (org.openarchives.oai.x20.oaiIdentifier.RepositoryIdentifierType)get_store().find_element_user(REPOSITORYIDENTIFIER$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "repositoryIdentifier" element
     */
    public void setRepositoryIdentifier(java.lang.String repositoryIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPOSITORYIDENTIFIER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPOSITORYIDENTIFIER$2);
            }
            target.setStringValue(repositoryIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "repositoryIdentifier" element
     */
    public void xsetRepositoryIdentifier(org.openarchives.oai.x20.oaiIdentifier.RepositoryIdentifierType repositoryIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.oai.x20.oaiIdentifier.RepositoryIdentifierType target = null;
            target = (org.openarchives.oai.x20.oaiIdentifier.RepositoryIdentifierType)get_store().find_element_user(REPOSITORYIDENTIFIER$2, 0);
            if (target == null)
            {
                target = (org.openarchives.oai.x20.oaiIdentifier.RepositoryIdentifierType)get_store().add_element_user(REPOSITORYIDENTIFIER$2);
            }
            target.set(repositoryIdentifier);
        }
    }
    
    /**
     * Gets the "delimiter" element
     */
    public java.lang.String getDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIMITER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "delimiter" element
     */
    public org.apache.xmlbeans.XmlString xgetDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELIMITER$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "delimiter" element
     */
    public void setDelimiter(java.lang.String delimiter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIMITER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIMITER$4);
            }
            target.setStringValue(delimiter);
        }
    }
    
    /**
     * Sets (as xml) the "delimiter" element
     */
    public void xsetDelimiter(org.apache.xmlbeans.XmlString delimiter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELIMITER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DELIMITER$4);
            }
            target.set(delimiter);
        }
    }
    
    /**
     * Gets the "sampleIdentifier" element
     */
    public java.lang.String getSampleIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAMPLEIDENTIFIER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sampleIdentifier" element
     */
    public org.openarchives.oai.x20.oaiIdentifier.SampleIdentifierType xgetSampleIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.oai.x20.oaiIdentifier.SampleIdentifierType target = null;
            target = (org.openarchives.oai.x20.oaiIdentifier.SampleIdentifierType)get_store().find_element_user(SAMPLEIDENTIFIER$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sampleIdentifier" element
     */
    public void setSampleIdentifier(java.lang.String sampleIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAMPLEIDENTIFIER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAMPLEIDENTIFIER$6);
            }
            target.setStringValue(sampleIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "sampleIdentifier" element
     */
    public void xsetSampleIdentifier(org.openarchives.oai.x20.oaiIdentifier.SampleIdentifierType sampleIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.oai.x20.oaiIdentifier.SampleIdentifierType target = null;
            target = (org.openarchives.oai.x20.oaiIdentifier.SampleIdentifierType)get_store().find_element_user(SAMPLEIDENTIFIER$6, 0);
            if (target == null)
            {
                target = (org.openarchives.oai.x20.oaiIdentifier.SampleIdentifierType)get_store().add_element_user(SAMPLEIDENTIFIER$6);
            }
            target.set(sampleIdentifier);
        }
    }
}
