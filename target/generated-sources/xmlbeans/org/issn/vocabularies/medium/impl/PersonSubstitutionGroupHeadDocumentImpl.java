/*
 * An XML document type.
 * Localname: Person__SubstitutionGroupHead
 * Namespace: http://issn.org/vocabularies/Medium
 * Java type: org.issn.vocabularies.medium.PersonSubstitutionGroupHeadDocument
 *
 * Automatically generated - do not modify.
 */
package org.issn.vocabularies.medium.impl;
/**
 * A document containing one Person__SubstitutionGroupHead(@http://issn.org/vocabularies/Medium) element.
 *
 * This is a complex type.
 */
public class PersonSubstitutionGroupHeadDocumentImpl extends org.issn.vocabularies.medium.impl.PersonOrOrgUnitSubstitutionGroupHeadDocumentImpl implements org.issn.vocabularies.medium.PersonSubstitutionGroupHeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonSubstitutionGroupHeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONSUBSTITUTIONGROUPHEAD$0 = 
        new javax.xml.namespace.QName("http://issn.org/vocabularies/Medium", "Person__SubstitutionGroupHead");
    
    
    /**
     * Gets the "Person__SubstitutionGroupHead" element
     */
    public org.issn.vocabularies.medium.PersonBaseType getPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.PersonBaseType target = null;
            target = (org.issn.vocabularies.medium.PersonBaseType)get_store().find_element_user(PERSONSUBSTITUTIONGROUPHEAD$0, 0);
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
    public void setPersonSubstitutionGroupHead(org.issn.vocabularies.medium.PersonBaseType personSubstitutionGroupHead)
    {
        generatedSetterHelperImpl(personSubstitutionGroupHead, PERSONSUBSTITUTIONGROUPHEAD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Person__SubstitutionGroupHead" element
     */
    public org.issn.vocabularies.medium.PersonBaseType addNewPersonSubstitutionGroupHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.issn.vocabularies.medium.PersonBaseType target = null;
            target = (org.issn.vocabularies.medium.PersonBaseType)get_store().add_element_user(PERSONSUBSTITUTIONGROUPHEAD$0);
            return target;
        }
    }
}
