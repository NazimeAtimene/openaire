/*
 * An XML document type.
 * Localname: title
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.TitleDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one title(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class TitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.TitleDocument
{
    private static final long serialVersionUID = 1L;
    
    public TitleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "title");
    
    
    /**
     * Gets the "title" element
     */
    public org.oclc.purl.dsdl.schematron.TitleDocument.Title getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.TitleDocument.Title target = null;
            target = (org.oclc.purl.dsdl.schematron.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(org.oclc.purl.dsdl.schematron.TitleDocument.Title title)
    {
        generatedSetterHelperImpl(title, TITLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "title" element
     */
    public org.oclc.purl.dsdl.schematron.TitleDocument.Title addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.TitleDocument.Title target = null;
            target = (org.oclc.purl.dsdl.schematron.TitleDocument.Title)get_store().add_element_user(TITLE$0);
            return target;
        }
    }
    /**
     * An XML title(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class TitleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.TitleDocument.Title
    {
        private static final long serialVersionUID = 1L;
        
        public TitleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIR$0 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "dir");
        
        
        /**
         * Gets array of all "dir" elements
         */
        public org.oclc.purl.dsdl.schematron.DirDocument.Dir[] getDirArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DIR$0, targetList);
                org.oclc.purl.dsdl.schematron.DirDocument.Dir[] result = new org.oclc.purl.dsdl.schematron.DirDocument.Dir[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dir" element
         */
        public org.oclc.purl.dsdl.schematron.DirDocument.Dir getDirArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DirDocument.Dir target = null;
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().find_element_user(DIR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dir" element
         */
        public int sizeOfDirArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIR$0);
            }
        }
        
        /**
         * Sets array of all "dir" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDirArray(org.oclc.purl.dsdl.schematron.DirDocument.Dir[] dirArray)
        {
            check_orphaned();
            arraySetterHelper(dirArray, DIR$0);
        }
        
        /**
         * Sets ith "dir" element
         */
        public void setDirArray(int i, org.oclc.purl.dsdl.schematron.DirDocument.Dir dir)
        {
            generatedSetterHelperImpl(dir, DIR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dir" element
         */
        public org.oclc.purl.dsdl.schematron.DirDocument.Dir insertNewDir(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DirDocument.Dir target = null;
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().insert_element_user(DIR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dir" element
         */
        public org.oclc.purl.dsdl.schematron.DirDocument.Dir addNewDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.DirDocument.Dir target = null;
                target = (org.oclc.purl.dsdl.schematron.DirDocument.Dir)get_store().add_element_user(DIR$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "dir" element
         */
        public void removeDir(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIR$0, i);
            }
        }
    }
}
