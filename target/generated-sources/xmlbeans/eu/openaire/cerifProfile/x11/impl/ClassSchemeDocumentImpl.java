/*
 * An XML document type.
 * Localname: ClassScheme
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.ClassSchemeDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one ClassScheme(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class ClassSchemeDocumentImpl extends eu.openaire.cerifProfile.x11.impl.SemanticLayerSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.ClassSchemeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClassSchemeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASSSCHEME$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ClassScheme");
    
    
    /**
     * Gets the "ClassScheme" element
     */
    public eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme getClassScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme target = null;
            target = (eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme)get_store().find_element_user(CLASSSCHEME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ClassScheme" element
     */
    public void setClassScheme(eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme classScheme)
    {
        generatedSetterHelperImpl(classScheme, CLASSSCHEME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClassScheme" element
     */
    public eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme addNewClassScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme target = null;
            target = (eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme)get_store().add_element_user(CLASSSCHEME$0);
            return target;
        }
    }
    /**
     * An XML ClassScheme(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class ClassSchemeImpl extends eu.openaire.cerifProfile.x11.impl.SemanticLayerBaseTypeImpl implements eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme
    {
        private static final long serialVersionUID = 1L;
        
        public ClassSchemeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Name");
        private static final javax.xml.namespace.QName DESCRIPTION$2 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Description");
        private static final javax.xml.namespace.QName IDENTIFIER$4 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Identifier");
        private static final javax.xml.namespace.QName CLASS1$6 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Class");
        private static final javax.xml.namespace.QName LINK$8 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Link");
        
        
        /**
         * Gets array of all "Name" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] getNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$0, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Name" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType getNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Name" element
         */
        public int sizeOfNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0);
            }
        }
        
        /**
         * Sets array of all "Name" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNameArray(eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] nameArray)
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$0);
        }
        
        /**
         * Sets ith "Name" element
         */
        public void setNameArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType name)
        {
            generatedSetterHelperImpl(name, NAME$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Name" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType insertNewName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().insert_element_user(NAME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Name" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().add_element_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Name" element
         */
        public void removeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, i);
            }
        }
        
        /**
         * Gets array of all "Description" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] getDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DESCRIPTION$2, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Description" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType getDescriptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().find_element_user(DESCRIPTION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Description" element
         */
        public int sizeOfDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$2);
            }
        }
        
        /**
         * Sets array of all "Description" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDescriptionArray(eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] descriptionArray)
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$2);
        }
        
        /**
         * Sets ith "Description" element
         */
        public void setDescriptionArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType description)
        {
            generatedSetterHelperImpl(description, DESCRIPTION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Description" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType insertNewDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().insert_element_user(DESCRIPTION$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Description" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType addNewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().add_element_user(DESCRIPTION$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Description" element
         */
        public void removeDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$2, i);
            }
        }
        
        /**
         * Gets array of all "Identifier" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] getIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDENTIFIER$4, targetList);
                eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] result = new eu.openaire.cerifProfile.x11.CfGenericIdentifierType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Identifier" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericIdentifierType getIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericIdentifierType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().find_element_user(IDENTIFIER$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Identifier" element
         */
        public int sizeOfIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFIER$4);
            }
        }
        
        /**
         * Sets array of all "Identifier" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIdentifierArray(eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] identifierArray)
        {
            check_orphaned();
            arraySetterHelper(identifierArray, IDENTIFIER$4);
        }
        
        /**
         * Sets ith "Identifier" element
         */
        public void setIdentifierArray(int i, eu.openaire.cerifProfile.x11.CfGenericIdentifierType identifier)
        {
            generatedSetterHelperImpl(identifier, IDENTIFIER$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericIdentifierType insertNewIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericIdentifierType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().insert_element_user(IDENTIFIER$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericIdentifierType addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericIdentifierType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().add_element_user(IDENTIFIER$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Identifier" element
         */
        public void removeIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFIER$4, i);
            }
        }
        
        /**
         * Gets array of all "Class" elements
         */
        public eu.openaire.cerifProfile.x11.CfClassBaseType[] getClass1Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CLASS1$6, targetList);
                eu.openaire.cerifProfile.x11.CfClassBaseType[] result = new eu.openaire.cerifProfile.x11.CfClassBaseType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Class" element
         */
        public eu.openaire.cerifProfile.x11.CfClassBaseType getClass1Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfClassBaseType target = null;
                target = (eu.openaire.cerifProfile.x11.CfClassBaseType)get_store().find_element_user(CLASS1$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Class" element
         */
        public int sizeOfClass1Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASS1$6);
            }
        }
        
        /**
         * Sets array of all "Class" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setClass1Array(eu.openaire.cerifProfile.x11.CfClassBaseType[] class1Array)
        {
            check_orphaned();
            arraySetterHelper(class1Array, CLASS1$6);
        }
        
        /**
         * Sets ith "Class" element
         */
        public void setClass1Array(int i, eu.openaire.cerifProfile.x11.CfClassBaseType class1)
        {
            generatedSetterHelperImpl(class1, CLASS1$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Class" element
         */
        public eu.openaire.cerifProfile.x11.CfClassBaseType insertNewClass1(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfClassBaseType target = null;
                target = (eu.openaire.cerifProfile.x11.CfClassBaseType)get_store().insert_element_user(CLASS1$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Class" element
         */
        public eu.openaire.cerifProfile.x11.CfClassBaseType addNewClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfClassBaseType target = null;
                target = (eu.openaire.cerifProfile.x11.CfClassBaseType)get_store().add_element_user(CLASS1$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "Class" element
         */
        public void removeClass1(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASS1$6, i);
            }
        }
        
        /**
         * Gets array of all "Link" elements
         */
        public eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link[] getLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINK$8, targetList);
                eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link[] result = new eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Link" element
         */
        public eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link getLinkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link target = null;
                target = (eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link)get_store().find_element_user(LINK$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Link" element
         */
        public int sizeOfLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINK$8);
            }
        }
        
        /**
         * Sets array of all "Link" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLinkArray(eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link[] linkArray)
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$8);
        }
        
        /**
         * Sets ith "Link" element
         */
        public void setLinkArray(int i, eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link link)
        {
            generatedSetterHelperImpl(link, LINK$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Link" element
         */
        public eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link insertNewLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link target = null;
                target = (eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link)get_store().insert_element_user(LINK$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Link" element
         */
        public eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link addNewLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link target = null;
                target = (eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link)get_store().add_element_user(LINK$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "Link" element
         */
        public void removeLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINK$8, i);
            }
        }
        /**
         * An XML Link(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class LinkImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.ClassSchemeDocument.ClassScheme.Link
        {
            private static final long serialVersionUID = 1L;
            
            public LinkImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEMANTICLAYERSUBSTITUTIONGROUPHEAD$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "SemanticLayer__SubstitutionGroupHead");
            private static final org.apache.xmlbeans.QNameSet SEMANTICLAYERSUBSTITUTIONGROUPHEAD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "SemanticLayer__SubstitutionGroupHead"),
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Class"),
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "ClassScheme"),
            });
            
            
            /**
             * Gets the "SemanticLayer__SubstitutionGroupHead" element
             */
            public eu.openaire.cerifProfile.x11.SemanticLayerBaseType getSemanticLayerSubstitutionGroupHead()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.SemanticLayerBaseType target = null;
                    target = (eu.openaire.cerifProfile.x11.SemanticLayerBaseType)get_store().find_element_user(SEMANTICLAYERSUBSTITUTIONGROUPHEAD$1, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "SemanticLayer__SubstitutionGroupHead" element
             */
            public void setSemanticLayerSubstitutionGroupHead(eu.openaire.cerifProfile.x11.SemanticLayerBaseType semanticLayerSubstitutionGroupHead)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.SemanticLayerBaseType target = null;
                    target = (eu.openaire.cerifProfile.x11.SemanticLayerBaseType)get_store().find_element_user(SEMANTICLAYERSUBSTITUTIONGROUPHEAD$1, 0);
                    if (target == null)
                    {
                      target = (eu.openaire.cerifProfile.x11.SemanticLayerBaseType)get_store().add_element_user(SEMANTICLAYERSUBSTITUTIONGROUPHEAD$0);
                    }
                    target.set(semanticLayerSubstitutionGroupHead);
                }
            }
            
            /**
             * Appends and returns a new empty "SemanticLayer__SubstitutionGroupHead" element
             */
            public eu.openaire.cerifProfile.x11.SemanticLayerBaseType addNewSemanticLayerSubstitutionGroupHead()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.SemanticLayerBaseType target = null;
                    target = (eu.openaire.cerifProfile.x11.SemanticLayerBaseType)get_store().add_element_user(SEMANTICLAYERSUBSTITUTIONGROUPHEAD$0);
                    return target;
                }
            }
        }
    }
}
