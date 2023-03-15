/*
 * XML Type:  cfClass__BaseType
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.CfClassBaseType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * An XML cfClass__BaseType(@https://www.openaire.eu/cerif-profile/1.1/).
 *
 * This is a complex type.
 */
public class CfClassBaseTypeImpl extends eu.openaire.cerifProfile.x11.impl.SemanticLayerBaseTypeImpl implements eu.openaire.cerifProfile.x11.CfClassBaseType
{
    private static final long serialVersionUID = 1L;
    
    public CfClassBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERM$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Term");
    private static final javax.xml.namespace.QName ROLEEXPRESSION$2 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "RoleExpression");
    private static final javax.xml.namespace.QName ROLEEXPRESSIONOPPOSITE$4 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "RoleExpressionOpposite");
    private static final javax.xml.namespace.QName DEFINITION$6 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Definition");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Description");
    private static final javax.xml.namespace.QName EXAMPLE$10 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Example");
    private static final javax.xml.namespace.QName IDENTIFIER$12 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Identifier");
    private static final javax.xml.namespace.QName BROADER$14 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Broader");
    private static final javax.xml.namespace.QName NARROWER$16 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Narrower");
    private static final javax.xml.namespace.QName RELATED$18 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Related");
    private static final javax.xml.namespace.QName LINK$20 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Link");
    
    
    /**
     * Gets array of all "Term" elements
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] getTermArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TERM$0, targetList);
            eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Term" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType getTermArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().find_element_user(TERM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Term" element
     */
    public int sizeOfTermArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TERM$0);
        }
    }
    
    /**
     * Sets array of all "Term" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTermArray(eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] termArray)
    {
        check_orphaned();
        arraySetterHelper(termArray, TERM$0);
    }
    
    /**
     * Sets ith "Term" element
     */
    public void setTermArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType term)
    {
        generatedSetterHelperImpl(term, TERM$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Term" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType insertNewTerm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().insert_element_user(TERM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Term" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType addNewTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().add_element_user(TERM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Term" element
     */
    public void removeTerm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TERM$0, i);
        }
    }
    
    /**
     * Gets array of all "RoleExpression" elements
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringType[] getRoleExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLEEXPRESSION$2, targetList);
            eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RoleExpression" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringType getRoleExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(ROLEEXPRESSION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RoleExpression" element
     */
    public int sizeOfRoleExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLEEXPRESSION$2);
        }
    }
    
    /**
     * Sets array of all "RoleExpression" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRoleExpressionArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] roleExpressionArray)
    {
        check_orphaned();
        arraySetterHelper(roleExpressionArray, ROLEEXPRESSION$2);
    }
    
    /**
     * Sets ith "RoleExpression" element
     */
    public void setRoleExpressionArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType roleExpression)
    {
        generatedSetterHelperImpl(roleExpression, ROLEEXPRESSION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RoleExpression" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewRoleExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(ROLEEXPRESSION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RoleExpression" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringType addNewRoleExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(ROLEEXPRESSION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "RoleExpression" element
     */
    public void removeRoleExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLEEXPRESSION$2, i);
        }
    }
    
    /**
     * Gets array of all "RoleExpressionOpposite" elements
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringType[] getRoleExpressionOppositeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLEEXPRESSIONOPPOSITE$4, targetList);
            eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RoleExpressionOpposite" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringType getRoleExpressionOppositeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(ROLEEXPRESSIONOPPOSITE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RoleExpressionOpposite" element
     */
    public int sizeOfRoleExpressionOppositeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLEEXPRESSIONOPPOSITE$4);
        }
    }
    
    /**
     * Sets array of all "RoleExpressionOpposite" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRoleExpressionOppositeArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] roleExpressionOppositeArray)
    {
        check_orphaned();
        arraySetterHelper(roleExpressionOppositeArray, ROLEEXPRESSIONOPPOSITE$4);
    }
    
    /**
     * Sets ith "RoleExpressionOpposite" element
     */
    public void setRoleExpressionOppositeArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType roleExpressionOpposite)
    {
        generatedSetterHelperImpl(roleExpressionOpposite, ROLEEXPRESSIONOPPOSITE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RoleExpressionOpposite" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewRoleExpressionOpposite(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(ROLEEXPRESSIONOPPOSITE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RoleExpressionOpposite" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringType addNewRoleExpressionOpposite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(ROLEEXPRESSIONOPPOSITE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "RoleExpressionOpposite" element
     */
    public void removeRoleExpressionOpposite(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLEEXPRESSIONOPPOSITE$4, i);
        }
    }
    
    /**
     * Gets array of all "Definition" elements
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] getDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEFINITION$6, targetList);
            eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Definition" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType getDefinitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().find_element_user(DEFINITION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Definition" element
     */
    public int sizeOfDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFINITION$6);
        }
    }
    
    /**
     * Sets array of all "Definition" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDefinitionArray(eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] definitionArray)
    {
        check_orphaned();
        arraySetterHelper(definitionArray, DEFINITION$6);
    }
    
    /**
     * Sets ith "Definition" element
     */
    public void setDefinitionArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType definition)
    {
        generatedSetterHelperImpl(definition, DEFINITION$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Definition" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType insertNewDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().insert_element_user(DEFINITION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Definition" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType addNewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().add_element_user(DEFINITION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Definition" element
     */
    public void removeDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFINITION$6, i);
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
            get_store().find_all_element_users(DESCRIPTION$8, targetList);
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
            target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().find_element_user(DESCRIPTION$8, i);
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
            return get_store().count_elements(DESCRIPTION$8);
        }
    }
    
    /**
     * Sets array of all "Description" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDescriptionArray(eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] descriptionArray)
    {
        check_orphaned();
        arraySetterHelper(descriptionArray, DESCRIPTION$8);
    }
    
    /**
     * Sets ith "Description" element
     */
    public void setDescriptionArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().insert_element_user(DESCRIPTION$8, i);
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
            target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().add_element_user(DESCRIPTION$8);
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
            get_store().remove_element(DESCRIPTION$8, i);
        }
    }
    
    /**
     * Gets array of all "Example" elements
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] getExampleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXAMPLE$10, targetList);
            eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Example" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType getExampleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().find_element_user(EXAMPLE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Example" element
     */
    public int sizeOfExampleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLE$10);
        }
    }
    
    /**
     * Sets array of all "Example" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setExampleArray(eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType[] exampleArray)
    {
        check_orphaned();
        arraySetterHelper(exampleArray, EXAMPLE$10);
    }
    
    /**
     * Sets ith "Example" element
     */
    public void setExampleArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType example)
    {
        generatedSetterHelperImpl(example, EXAMPLE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Example" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType insertNewExample(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().insert_element_user(EXAMPLE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Example" element
     */
    public eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType addNewExample()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType target = null;
            target = (eu.openaire.cerifProfile.x11.CfMLangStringWithOptionalSourceType)get_store().add_element_user(EXAMPLE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "Example" element
     */
    public void removeExample(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLE$10, i);
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
            get_store().find_all_element_users(IDENTIFIER$12, targetList);
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
            target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().find_element_user(IDENTIFIER$12, i);
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
            return get_store().count_elements(IDENTIFIER$12);
        }
    }
    
    /**
     * Sets array of all "Identifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifierArray(eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] identifierArray)
    {
        check_orphaned();
        arraySetterHelper(identifierArray, IDENTIFIER$12);
    }
    
    /**
     * Sets ith "Identifier" element
     */
    public void setIdentifierArray(int i, eu.openaire.cerifProfile.x11.CfGenericIdentifierType identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().insert_element_user(IDENTIFIER$12, i);
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
            target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().add_element_user(IDENTIFIER$12);
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
            get_store().remove_element(IDENTIFIER$12, i);
        }
    }
    
    /**
     * Gets array of all "Broader" elements
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Broader[] getBroaderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BROADER$14, targetList);
            eu.openaire.cerifProfile.x11.CfClassBaseType.Broader[] result = new eu.openaire.cerifProfile.x11.CfClassBaseType.Broader[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Broader" element
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Broader getBroaderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfClassBaseType.Broader target = null;
            target = (eu.openaire.cerifProfile.x11.CfClassBaseType.Broader)get_store().find_element_user(BROADER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Broader" element
     */
    public int sizeOfBroaderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BROADER$14);
        }
    }
    
    /**
     * Sets array of all "Broader" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBroaderArray(eu.openaire.cerifProfile.x11.CfClassBaseType.Broader[] broaderArray)
    {
        check_orphaned();
        arraySetterHelper(broaderArray, BROADER$14);
    }
    
    /**
     * Sets ith "Broader" element
     */
    public void setBroaderArray(int i, eu.openaire.cerifProfile.x11.CfClassBaseType.Broader broader)
    {
        generatedSetterHelperImpl(broader, BROADER$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Broader" element
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Broader insertNewBroader(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfClassBaseType.Broader target = null;
            target = (eu.openaire.cerifProfile.x11.CfClassBaseType.Broader)get_store().insert_element_user(BROADER$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Broader" element
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Broader addNewBroader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfClassBaseType.Broader target = null;
            target = (eu.openaire.cerifProfile.x11.CfClassBaseType.Broader)get_store().add_element_user(BROADER$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "Broader" element
     */
    public void removeBroader(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BROADER$14, i);
        }
    }
    
    /**
     * Gets array of all "Narrower" elements
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower[] getNarrowerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NARROWER$16, targetList);
            eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower[] result = new eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Narrower" element
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower getNarrowerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower target = null;
            target = (eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower)get_store().find_element_user(NARROWER$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Narrower" element
     */
    public int sizeOfNarrowerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NARROWER$16);
        }
    }
    
    /**
     * Sets array of all "Narrower" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNarrowerArray(eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower[] narrowerArray)
    {
        check_orphaned();
        arraySetterHelper(narrowerArray, NARROWER$16);
    }
    
    /**
     * Sets ith "Narrower" element
     */
    public void setNarrowerArray(int i, eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower narrower)
    {
        generatedSetterHelperImpl(narrower, NARROWER$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Narrower" element
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower insertNewNarrower(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower target = null;
            target = (eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower)get_store().insert_element_user(NARROWER$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Narrower" element
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower addNewNarrower()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower target = null;
            target = (eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower)get_store().add_element_user(NARROWER$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "Narrower" element
     */
    public void removeNarrower(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NARROWER$16, i);
        }
    }
    
    /**
     * Gets array of all "Related" elements
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Related[] getRelatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATED$18, targetList);
            eu.openaire.cerifProfile.x11.CfClassBaseType.Related[] result = new eu.openaire.cerifProfile.x11.CfClassBaseType.Related[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Related" element
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Related getRelatedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfClassBaseType.Related target = null;
            target = (eu.openaire.cerifProfile.x11.CfClassBaseType.Related)get_store().find_element_user(RELATED$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Related" element
     */
    public int sizeOfRelatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATED$18);
        }
    }
    
    /**
     * Sets array of all "Related" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelatedArray(eu.openaire.cerifProfile.x11.CfClassBaseType.Related[] relatedArray)
    {
        check_orphaned();
        arraySetterHelper(relatedArray, RELATED$18);
    }
    
    /**
     * Sets ith "Related" element
     */
    public void setRelatedArray(int i, eu.openaire.cerifProfile.x11.CfClassBaseType.Related related)
    {
        generatedSetterHelperImpl(related, RELATED$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Related" element
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Related insertNewRelated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfClassBaseType.Related target = null;
            target = (eu.openaire.cerifProfile.x11.CfClassBaseType.Related)get_store().insert_element_user(RELATED$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Related" element
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Related addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfClassBaseType.Related target = null;
            target = (eu.openaire.cerifProfile.x11.CfClassBaseType.Related)get_store().add_element_user(RELATED$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "Related" element
     */
    public void removeRelated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATED$18, i);
        }
    }
    
    /**
     * Gets array of all "Link" elements
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Link[] getLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINK$20, targetList);
            eu.openaire.cerifProfile.x11.CfClassBaseType.Link[] result = new eu.openaire.cerifProfile.x11.CfClassBaseType.Link[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Link" element
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Link getLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfClassBaseType.Link target = null;
            target = (eu.openaire.cerifProfile.x11.CfClassBaseType.Link)get_store().find_element_user(LINK$20, i);
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
            return get_store().count_elements(LINK$20);
        }
    }
    
    /**
     * Sets array of all "Link" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLinkArray(eu.openaire.cerifProfile.x11.CfClassBaseType.Link[] linkArray)
    {
        check_orphaned();
        arraySetterHelper(linkArray, LINK$20);
    }
    
    /**
     * Sets ith "Link" element
     */
    public void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfClassBaseType.Link link)
    {
        generatedSetterHelperImpl(link, LINK$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Link" element
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Link insertNewLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfClassBaseType.Link target = null;
            target = (eu.openaire.cerifProfile.x11.CfClassBaseType.Link)get_store().insert_element_user(LINK$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Link" element
     */
    public eu.openaire.cerifProfile.x11.CfClassBaseType.Link addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.CfClassBaseType.Link target = null;
            target = (eu.openaire.cerifProfile.x11.CfClassBaseType.Link)get_store().add_element_user(LINK$20);
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
            get_store().remove_element(LINK$20, i);
        }
    }
    /**
     * An XML Broader(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class BroaderImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.CfClassBaseType.Broader
    {
        private static final long serialVersionUID = 1L;
        
        public BroaderImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
    /**
     * An XML Narrower(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class NarrowerImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.CfClassBaseType.Narrower
    {
        private static final long serialVersionUID = 1L;
        
        public NarrowerImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
    /**
     * An XML Related(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class RelatedImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.CfClassBaseType.Related
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
    /**
     * An XML Link(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class LinkImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.CfClassBaseType.Link
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
