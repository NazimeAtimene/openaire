/*
 * An XML document type.
 * Localname: Class
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.ClassDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one Class(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class ClassDocumentImpl extends eu.openaire.cerifProfile.x11.impl.SemanticLayerSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.ClassDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClassDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASS1$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Class");
    
    
    /**
     * Gets the "Class" element
     */
    public eu.openaire.cerifProfile.x11.ClassDocument.Class getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ClassDocument.Class target = null;
            target = (eu.openaire.cerifProfile.x11.ClassDocument.Class)get_store().find_element_user(CLASS1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Class" element
     */
    public void setClass1(eu.openaire.cerifProfile.x11.ClassDocument.Class class1)
    {
        generatedSetterHelperImpl(class1, CLASS1$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Class" element
     */
    public eu.openaire.cerifProfile.x11.ClassDocument.Class addNewClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ClassDocument.Class target = null;
            target = (eu.openaire.cerifProfile.x11.ClassDocument.Class)get_store().add_element_user(CLASS1$0);
            return target;
        }
    }
    /**
     * An XML Class(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class ClassImpl extends eu.openaire.cerifProfile.x11.impl.CfClassBaseTypeImpl implements eu.openaire.cerifProfile.x11.ClassDocument.Class
    {
        private static final long serialVersionUID = 1L;
        
        public ClassImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLASSSCHEMEID$0 = 
            new javax.xml.namespace.QName("", "classSchemeId");
        
        
        /**
         * Gets the "classSchemeId" attribute
         */
        public java.lang.String getClassSchemeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSSCHEMEID$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "classSchemeId" attribute
         */
        public org.apache.xmlbeans.XmlString xgetClassSchemeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSSCHEMEID$0);
                return target;
            }
        }
        
        /**
         * True if has "classSchemeId" attribute
         */
        public boolean isSetClassSchemeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLASSSCHEMEID$0) != null;
            }
        }
        
        /**
         * Sets the "classSchemeId" attribute
         */
        public void setClassSchemeId(java.lang.String classSchemeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSSCHEMEID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSSCHEMEID$0);
                }
                target.setStringValue(classSchemeId);
            }
        }
        
        /**
         * Sets (as xml) the "classSchemeId" attribute
         */
        public void xsetClassSchemeId(org.apache.xmlbeans.XmlString classSchemeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSSCHEMEID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASSSCHEMEID$0);
                }
                target.set(classSchemeId);
            }
        }
        
        /**
         * Unsets the "classSchemeId" attribute
         */
        public void unsetClassSchemeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLASSSCHEMEID$0);
            }
        }
    }
}
