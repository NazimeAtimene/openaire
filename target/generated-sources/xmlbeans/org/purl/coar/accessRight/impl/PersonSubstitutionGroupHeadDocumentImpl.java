/*
 * An XML document type.
 * Localname: Person__SubstitutionGroupHead
 * Namespace: http://purl.org/coar/access_right
 * Java type: org.purl.coar.accessRight.PersonSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.accessRight.impl;
/**
 * A document containing one Person__SubstitutionGroupHead(@http://purl.org/coar/access_right) element.
 *
 * This is a complex type.
 */
public class PersonSubstitutionGroupHeadDocumentImpl extends org.purl.coar.accessRight.impl.PersonOrOrgUnitSubstitutionGroupHeadDocumentImpl implements org.purl.coar.accessRight.PersonSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "Person__SubstitutionGroupHead");
    
    
    /**
     * Gets the "Person__SubstitutionGroupHead" element
     */
    public org.purl.coar.accessRight.PersonBaseType getPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.PersonBaseType target = null;
            target = (org.purl.coar.accessRight.PersonBaseType)get_store().find_element_user(PERSONSUBSTITUTIONGROUPHEAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Person__SubstitutionGroupHead" element
     */
    public void setPersonSubstitutionGroupHead(org.purl.coar.accessRight.PersonBaseType personSubstitutionGroupHead)
    {
        generatedSetterHelperImpl(personSubstitutionGroupHead, PERSONSUBSTITUTIONGROUPHEAD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Person__SubstitutionGroupHead" element
     */
    public org.purl.coar.accessRight.PersonBaseType addNewPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.PersonBaseType target = null;
            target = (org.purl.coar.accessRight.PersonBaseType)get_store().add_element_user(PERSONSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
