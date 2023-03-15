/*
 * An XML document type.
 * Localname: phase
 * Namespace: http://purl.oclc.org/dsdl/schematron
 * Java type: org.oclc.purl.dsdl.schematron.PhaseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oclc.purl.dsdl.schematron.impl;
/**
 * A document containing one phase(@http://purl.oclc.org/dsdl/schematron) element.
 *
 * This is a complex type.
 */
public class PhaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.PhaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public PhaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHASE$0 = 
        new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "phase");
    
    
    /**
     * Gets the "phase" element
     */
    public org.oclc.purl.dsdl.schematron.PhaseDocument.Phase getPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.PhaseDocument.Phase target = null;
            target = (org.oclc.purl.dsdl.schematron.PhaseDocument.Phase)get_store().find_element_user(PHASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "phase" element
     */
    public void setPhase(org.oclc.purl.dsdl.schematron.PhaseDocument.Phase phase)
    {
        generatedSetterHelperImpl(phase, PHASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "phase" element
     */
    public org.oclc.purl.dsdl.schematron.PhaseDocument.Phase addNewPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oclc.purl.dsdl.schematron.PhaseDocument.Phase target = null;
            target = (org.oclc.purl.dsdl.schematron.PhaseDocument.Phase)get_store().add_element_user(PHASE$0);
            return target;
        }
    }
    /**
     * An XML phase(@http://purl.oclc.org/dsdl/schematron).
     *
     * This is a complex type.
     */
    public static class PhaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oclc.purl.dsdl.schematron.PhaseDocument.Phase
    {
        private static final long serialVersionUID = 1L;
        
        public PhaseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCLUDE$0 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "include");
        private static final javax.xml.namespace.QName P$2 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "p");
        private static final javax.xml.namespace.QName LET$4 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "let");
        private static final javax.xml.namespace.QName ACTIVE$6 = 
            new javax.xml.namespace.QName("http://purl.oclc.org/dsdl/schematron", "active");
        private static final javax.xml.namespace.QName ID$8 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName ICON$10 = 
            new javax.xml.namespace.QName("", "icon");
        private static final javax.xml.namespace.QName SEE$12 = 
            new javax.xml.namespace.QName("", "see");
        private static final javax.xml.namespace.QName FPI$14 = 
            new javax.xml.namespace.QName("", "fpi");
        private static final javax.xml.namespace.QName LANG$16 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName SPACE$18 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "space");
        
        
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
         * Gets array of all "p" elements
         */
        public org.oclc.purl.dsdl.schematron.PDocument.P[] getPArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(P$2, targetList);
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
                target = (org.oclc.purl.dsdl.schematron.PDocument.P)get_store().find_element_user(P$2, i);
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
                return get_store().count_elements(P$2);
            }
        }
        
        /**
         * Sets array of all "p" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPArray(org.oclc.purl.dsdl.schematron.PDocument.P[] pArray)
        {
            check_orphaned();
            arraySetterHelper(pArray, P$2);
        }
        
        /**
         * Sets ith "p" element
         */
        public void setPArray(int i, org.oclc.purl.dsdl.schematron.PDocument.P p)
        {
            generatedSetterHelperImpl(p, P$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.oclc.purl.dsdl.schematron.PDocument.P)get_store().insert_element_user(P$2, i);
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
                target = (org.oclc.purl.dsdl.schematron.PDocument.P)get_store().add_element_user(P$2);
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
                get_store().remove_element(P$2, i);
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
                get_store().find_all_element_users(LET$4, targetList);
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
                target = (org.oclc.purl.dsdl.schematron.LetDocument.Let)get_store().find_element_user(LET$4, i);
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
                return get_store().count_elements(LET$4);
            }
        }
        
        /**
         * Sets array of all "let" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLetArray(org.oclc.purl.dsdl.schematron.LetDocument.Let[] letArray)
        {
            check_orphaned();
            arraySetterHelper(letArray, LET$4);
        }
        
        /**
         * Sets ith "let" element
         */
        public void setLetArray(int i, org.oclc.purl.dsdl.schematron.LetDocument.Let let)
        {
            generatedSetterHelperImpl(let, LET$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.oclc.purl.dsdl.schematron.LetDocument.Let)get_store().insert_element_user(LET$4, i);
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
                target = (org.oclc.purl.dsdl.schematron.LetDocument.Let)get_store().add_element_user(LET$4);
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
                get_store().remove_element(LET$4, i);
            }
        }
        
        /**
         * Gets array of all "active" elements
         */
        public org.oclc.purl.dsdl.schematron.ActiveDocument.Active[] getActiveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ACTIVE$6, targetList);
                org.oclc.purl.dsdl.schematron.ActiveDocument.Active[] result = new org.oclc.purl.dsdl.schematron.ActiveDocument.Active[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "active" element
         */
        public org.oclc.purl.dsdl.schematron.ActiveDocument.Active getActiveArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ActiveDocument.Active target = null;
                target = (org.oclc.purl.dsdl.schematron.ActiveDocument.Active)get_store().find_element_user(ACTIVE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "active" element
         */
        public int sizeOfActiveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACTIVE$6);
            }
        }
        
        /**
         * Sets array of all "active" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setActiveArray(org.oclc.purl.dsdl.schematron.ActiveDocument.Active[] activeArray)
        {
            check_orphaned();
            arraySetterHelper(activeArray, ACTIVE$6);
        }
        
        /**
         * Sets ith "active" element
         */
        public void setActiveArray(int i, org.oclc.purl.dsdl.schematron.ActiveDocument.Active active)
        {
            generatedSetterHelperImpl(active, ACTIVE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "active" element
         */
        public org.oclc.purl.dsdl.schematron.ActiveDocument.Active insertNewActive(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ActiveDocument.Active target = null;
                target = (org.oclc.purl.dsdl.schematron.ActiveDocument.Active)get_store().insert_element_user(ACTIVE$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "active" element
         */
        public org.oclc.purl.dsdl.schematron.ActiveDocument.Active addNewActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oclc.purl.dsdl.schematron.ActiveDocument.Active target = null;
                target = (org.oclc.purl.dsdl.schematron.ActiveDocument.Active)get_store().add_element_user(ACTIVE$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "active" element
         */
        public void removeActive(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACTIVE$6, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
                }
                target.set(id);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICON$10);
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
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(ICON$10);
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
                return get_store().find_attribute_user(ICON$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICON$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ICON$10);
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
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(ICON$10);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().add_attribute_user(ICON$10);
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
                get_store().remove_attribute(ICON$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEE$12);
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
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(SEE$12);
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
                return get_store().find_attribute_user(SEE$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEE$12);
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
                target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().find_attribute_user(SEE$12);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.UriValue)get_store().add_attribute_user(SEE$12);
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
                get_store().remove_attribute(SEE$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPI$14);
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
                target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().find_attribute_user(FPI$14);
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
                return get_store().find_attribute_user(FPI$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPI$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FPI$14);
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
                target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().find_attribute_user(FPI$14);
                if (target == null)
                {
                    target = (org.oclc.purl.dsdl.schematron.FpiValue)get_store().add_attribute_user(FPI$14);
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
                get_store().remove_attribute(FPI$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$16);
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
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$16);
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
                return get_store().find_attribute_user(LANG$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$16);
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
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$16);
                if (target == null)
                {
                    target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().add_attribute_user(LANG$16);
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
                get_store().remove_attribute(LANG$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$18);
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
                target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$18);
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
                return get_store().find_attribute_user(SPACE$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPACE$18);
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
                target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$18);
                if (target == null)
                {
                    target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().add_attribute_user(SPACE$18);
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
                get_store().remove_attribute(SPACE$18);
            }
        }
    }
}
