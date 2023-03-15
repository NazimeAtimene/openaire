/*
 * An XML document type.
 * Localname: Access
 * Namespace: http://purl.org/coar/access_right
 * Java type: org.purl.coar.accessRight.AccessDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.coar.accessRight.impl;
/**
 * A document containing one Access(@http://purl.org/coar/access_right) element.
 *
 * This is a complex type.
 */
public class AccessDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.purl.coar.accessRight.AccessDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESS$0 = 
        new javax.xml.namespace.QName("http://purl.org/coar/access_right", "Access");
    
    
    /**
     * Gets the "Access" element
     */
    public org.purl.coar.accessRight.AccessDocument.Access getAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.AccessDocument.Access target = null;
            target = (org.purl.coar.accessRight.AccessDocument.Access)get_store().find_element_user(ACCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Access" element
     */
    public void setAccess(org.purl.coar.accessRight.AccessDocument.Access access)
    {
        generatedSetterHelperImpl(access, ACCESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Access" element
     */
    public org.purl.coar.accessRight.AccessDocument.Access addNewAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.coar.accessRight.AccessDocument.Access target = null;
            target = (org.purl.coar.accessRight.AccessDocument.Access)get_store().add_element_user(ACCESS$0);
            return target;
        }
    }
    /**
     * An XML Access(@http://purl.org/coar/access_right).
     *
     * This is an atomic type that is a restriction of org.purl.coar.accessRight.AccessDocument$Access.
     */
    public static class AccessImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.purl.coar.accessRight.AccessDocument.Access
    {
        private static final long serialVersionUID = 1L;
        
        public AccessImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected AccessImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName STARTDATE$0 = 
            new javax.xml.namespace.QName("", "startDate");
        private static final javax.xml.namespace.QName ENDDATE$2 = 
            new javax.xml.namespace.QName("", "endDate");
        
        
        /**
         * Gets the "startDate" attribute
         */
        public java.util.Calendar getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "startDate" attribute
         */
        public org.purl.coar.accessRight.CfGenericDateTimeSimpleType xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.purl.coar.accessRight.CfGenericDateTimeSimpleType target = null;
                target = (org.purl.coar.accessRight.CfGenericDateTimeSimpleType)get_store().find_attribute_user(STARTDATE$0);
                return target;
            }
        }
        
        /**
         * True if has "startDate" attribute
         */
        public boolean isSetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STARTDATE$0) != null;
            }
        }
        
        /**
         * Sets the "startDate" attribute
         */
        public void setStartDate(java.util.Calendar startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTDATE$0);
                }
                target.setCalendarValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "startDate" attribute
         */
        public void xsetStartDate(org.purl.coar.accessRight.CfGenericDateTimeSimpleType startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.purl.coar.accessRight.CfGenericDateTimeSimpleType target = null;
                target = (org.purl.coar.accessRight.CfGenericDateTimeSimpleType)get_store().find_attribute_user(STARTDATE$0);
                if (target == null)
                {
                    target = (org.purl.coar.accessRight.CfGenericDateTimeSimpleType)get_store().add_attribute_user(STARTDATE$0);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Unsets the "startDate" attribute
         */
        public void unsetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STARTDATE$0);
            }
        }
        
        /**
         * Gets the "endDate" attribute
         */
        public java.util.Calendar getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "endDate" attribute
         */
        public org.purl.coar.accessRight.CfGenericDateTimeSimpleType xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.purl.coar.accessRight.CfGenericDateTimeSimpleType target = null;
                target = (org.purl.coar.accessRight.CfGenericDateTimeSimpleType)get_store().find_attribute_user(ENDDATE$2);
                return target;
            }
        }
        
        /**
         * True if has "endDate" attribute
         */
        public boolean isSetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDDATE$2) != null;
            }
        }
        
        /**
         * Sets the "endDate" attribute
         */
        public void setEndDate(java.util.Calendar endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDDATE$2);
                }
                target.setCalendarValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "endDate" attribute
         */
        public void xsetEndDate(org.purl.coar.accessRight.CfGenericDateTimeSimpleType endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.purl.coar.accessRight.CfGenericDateTimeSimpleType target = null;
                target = (org.purl.coar.accessRight.CfGenericDateTimeSimpleType)get_store().find_attribute_user(ENDDATE$2);
                if (target == null)
                {
                    target = (org.purl.coar.accessRight.CfGenericDateTimeSimpleType)get_store().add_attribute_user(ENDDATE$2);
                }
                target.set(endDate);
            }
        }
        
        /**
         * Unsets the "endDate" attribute
         */
        public void unsetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDDATE$2);
            }
        }
    }
}
