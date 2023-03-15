/*
 * An XML document type.
 * Localname: Project
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.ProjectDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * A document containing one Project(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public class ProjectDocumentImpl extends eu.openaire.cerifProfile.x11.impl.ProjectFundingSubstitutionGroupHeadDocumentImpl implements eu.openaire.cerifProfile.x11.ProjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROJECT$0 = 
        new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Project");
    
    
    /**
     * Gets the "Project" element
     */
    public eu.openaire.cerifProfile.x11.ProjectDocument.Project getProject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ProjectDocument.Project target = null;
            target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project)get_store().find_element_user(PROJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Project" element
     */
    public void setProject(eu.openaire.cerifProfile.x11.ProjectDocument.Project project)
    {
        generatedSetterHelperImpl(project, PROJECT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Project" element
     */
    public eu.openaire.cerifProfile.x11.ProjectDocument.Project addNewProject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.x11.ProjectDocument.Project target = null;
            target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project)get_store().add_element_user(PROJECT$0);
            return target;
        }
    }
    /**
     * An XML Project(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public static class ProjectImpl extends eu.openaire.cerifProfile.x11.impl.ProjectFundingBaseTypeImpl implements eu.openaire.cerifProfile.x11.ProjectDocument.Project
    {
        private static final long serialVersionUID = 1L;
        
        public ProjectImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Type");
        private static final javax.xml.namespace.QName ACRONYM$2 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Acronym");
        private static final javax.xml.namespace.QName TITLE$4 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Title");
        private static final javax.xml.namespace.QName IDENTIFIER$6 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Identifier");
        private static final javax.xml.namespace.QName STARTDATE$8 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "StartDate");
        private static final javax.xml.namespace.QName ENDDATE$10 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "EndDate");
        private static final javax.xml.namespace.QName CONSORTIUM$12 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Consortium");
        private static final javax.xml.namespace.QName TEAM$14 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Team");
        private static final javax.xml.namespace.QName FUNDED$16 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Funded");
        private static final javax.xml.namespace.QName SUBJECT$18 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Subject");
        private static final javax.xml.namespace.QName KEYWORD$20 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Keyword");
        private static final javax.xml.namespace.QName ABSTRACT$22 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Abstract");
        private static final javax.xml.namespace.QName STATUS$24 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Status");
        private static final javax.xml.namespace.QName USES$26 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Uses");
        private static final javax.xml.namespace.QName OAMANDATE$28 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "OAMandate");
        private static final javax.xml.namespace.QName CLASSIFICATION$30 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Classification");
        private static final javax.xml.namespace.QName LINK$32 = 
            new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Link");
        
        
        /**
         * Gets array of all "Type" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TYPE$0, targetList);
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] result = new eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Type" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(TYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Type" element
         */
        public int sizeOfTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPE$0);
            }
        }
        
        /**
         * Sets array of all "Type" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTypeArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] typeArray)
        {
            check_orphaned();
            arraySetterHelper(typeArray, TYPE$0);
        }
        
        /**
         * Sets ith "Type" element
         */
        public void setTypeArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType type)
        {
            generatedSetterHelperImpl(type, TYPE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Type" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(TYPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Type" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Type" element
         */
        public void removeType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPE$0, i);
            }
        }
        
        /**
         * Gets the "Acronym" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType getAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().find_element_user(ACRONYM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Acronym" element
         */
        public boolean isSetAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACRONYM$2) != 0;
            }
        }
        
        /**
         * Sets the "Acronym" element
         */
        public void setAcronym(eu.openaire.cerifProfile.x11.CfStringType acronym)
        {
            generatedSetterHelperImpl(acronym, ACRONYM$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Acronym" element
         */
        public eu.openaire.cerifProfile.x11.CfStringType addNewAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfStringType)get_store().add_element_user(ACRONYM$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Acronym" element
         */
        public void unsetAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACRONYM$2, 0);
            }
        }
        
        /**
         * Gets array of all "Title" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TITLE$4, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Title" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType getTitleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(TITLE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Title" element
         */
        public int sizeOfTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$4);
            }
        }
        
        /**
         * Sets array of all "Title" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTitleArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] titleArray)
        {
            check_orphaned();
            arraySetterHelper(titleArray, TITLE$4);
        }
        
        /**
         * Sets ith "Title" element
         */
        public void setTitleArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType title)
        {
            generatedSetterHelperImpl(title, TITLE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Title" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewTitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(TITLE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Title" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType addNewTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(TITLE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Title" element
         */
        public void removeTitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$4, i);
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
                get_store().find_all_element_users(IDENTIFIER$6, targetList);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().find_element_user(IDENTIFIER$6, i);
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
                return get_store().count_elements(IDENTIFIER$6);
            }
        }
        
        /**
         * Sets array of all "Identifier" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIdentifierArray(eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] identifierArray)
        {
            check_orphaned();
            arraySetterHelper(identifierArray, IDENTIFIER$6);
        }
        
        /**
         * Sets ith "Identifier" element
         */
        public void setIdentifierArray(int i, eu.openaire.cerifProfile.x11.CfGenericIdentifierType identifier)
        {
            generatedSetterHelperImpl(identifier, IDENTIFIER$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().insert_element_user(IDENTIFIER$6, i);
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
                target = (eu.openaire.cerifProfile.x11.CfGenericIdentifierType)get_store().add_element_user(IDENTIFIER$6);
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
                get_store().remove_element(IDENTIFIER$6, i);
            }
        }
        
        /**
         * Gets the "StartDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().find_element_user(STARTDATE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "StartDate" element
         */
        public boolean isSetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTDATE$8) != 0;
            }
        }
        
        /**
         * Sets the "StartDate" element
         */
        public void setStartDate(eu.openaire.cerifProfile.x11.CfDateType startDate)
        {
            generatedSetterHelperImpl(startDate, STARTDATE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "StartDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType addNewStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().add_element_user(STARTDATE$8);
                return target;
            }
        }
        
        /**
         * Unsets the "StartDate" element
         */
        public void unsetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTDATE$8, 0);
            }
        }
        
        /**
         * Gets the "EndDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().find_element_user(ENDDATE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "EndDate" element
         */
        public boolean isSetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDDATE$10) != 0;
            }
        }
        
        /**
         * Sets the "EndDate" element
         */
        public void setEndDate(eu.openaire.cerifProfile.x11.CfDateType endDate)
        {
            generatedSetterHelperImpl(endDate, ENDDATE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "EndDate" element
         */
        public eu.openaire.cerifProfile.x11.CfDateType addNewEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfDateType target = null;
                target = (eu.openaire.cerifProfile.x11.CfDateType)get_store().add_element_user(ENDDATE$10);
                return target;
            }
        }
        
        /**
         * Unsets the "EndDate" element
         */
        public void unsetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDDATE$10, 0);
            }
        }
        
        /**
         * Gets the "Consortium" element
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium getConsortium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium target = null;
                target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium)get_store().find_element_user(CONSORTIUM$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Consortium" element
         */
        public boolean isSetConsortium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONSORTIUM$12) != 0;
            }
        }
        
        /**
         * Sets the "Consortium" element
         */
        public void setConsortium(eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium consortium)
        {
            generatedSetterHelperImpl(consortium, CONSORTIUM$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Consortium" element
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium addNewConsortium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium target = null;
                target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium)get_store().add_element_user(CONSORTIUM$12);
                return target;
            }
        }
        
        /**
         * Unsets the "Consortium" element
         */
        public void unsetConsortium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONSORTIUM$12, 0);
            }
        }
        
        /**
         * Gets the "Team" element
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team getTeam()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team target = null;
                target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team)get_store().find_element_user(TEAM$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Team" element
         */
        public boolean isSetTeam()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEAM$14) != 0;
            }
        }
        
        /**
         * Sets the "Team" element
         */
        public void setTeam(eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team team)
        {
            generatedSetterHelperImpl(team, TEAM$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Team" element
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team addNewTeam()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team target = null;
                target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team)get_store().add_element_user(TEAM$14);
                return target;
            }
        }
        
        /**
         * Unsets the "Team" element
         */
        public void unsetTeam()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEAM$14, 0);
            }
        }
        
        /**
         * Gets array of all "Funded" elements
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded[] getFundedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FUNDED$16, targetList);
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded[] result = new eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Funded" element
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded getFundedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded target = null;
                target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded)get_store().find_element_user(FUNDED$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Funded" element
         */
        public int sizeOfFundedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FUNDED$16);
            }
        }
        
        /**
         * Sets array of all "Funded" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFundedArray(eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded[] fundedArray)
        {
            check_orphaned();
            arraySetterHelper(fundedArray, FUNDED$16);
        }
        
        /**
         * Sets ith "Funded" element
         */
        public void setFundedArray(int i, eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded funded)
        {
            generatedSetterHelperImpl(funded, FUNDED$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Funded" element
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded insertNewFunded(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded target = null;
                target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded)get_store().insert_element_user(FUNDED$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Funded" element
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded addNewFunded()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded target = null;
                target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded)get_store().add_element_user(FUNDED$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "Funded" element
         */
        public void removeFunded(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FUNDED$16, i);
            }
        }
        
        /**
         * Gets array of all "Subject" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getSubjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBJECT$18, targetList);
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] result = new eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Subject" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getSubjectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(SUBJECT$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Subject" element
         */
        public int sizeOfSubjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBJECT$18);
            }
        }
        
        /**
         * Sets array of all "Subject" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSubjectArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] subjectArray)
        {
            check_orphaned();
            arraySetterHelper(subjectArray, SUBJECT$18);
        }
        
        /**
         * Sets ith "Subject" element
         */
        public void setSubjectArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType subject)
        {
            generatedSetterHelperImpl(subject, SUBJECT$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Subject" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewSubject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(SUBJECT$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Subject" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(SUBJECT$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "Subject" element
         */
        public void removeSubject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBJECT$18, i);
            }
        }
        
        /**
         * Gets array of all "Keyword" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType[] getKeywordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYWORD$20, targetList);
                eu.openaire.cerifProfile.x11.CfMLangStringType[] result = new eu.openaire.cerifProfile.x11.CfMLangStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Keyword" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType getKeywordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().find_element_user(KEYWORD$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Keyword" element
         */
        public int sizeOfKeywordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYWORD$20);
            }
        }
        
        /**
         * Sets array of all "Keyword" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setKeywordArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] keywordArray)
        {
            check_orphaned();
            arraySetterHelper(keywordArray, KEYWORD$20);
        }
        
        /**
         * Sets ith "Keyword" element
         */
        public void setKeywordArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType keyword)
        {
            generatedSetterHelperImpl(keyword, KEYWORD$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Keyword" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType insertNewKeyword(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().insert_element_user(KEYWORD$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Keyword" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangStringType addNewKeyword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangStringType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangStringType)get_store().add_element_user(KEYWORD$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "Keyword" element
         */
        public void removeKeyword(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYWORD$20, i);
            }
        }
        
        /**
         * Gets array of all "Abstract" elements
         */
        public eu.openaire.cerifProfile.x11.CfMLangAnyMixedType[] getAbstractArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ABSTRACT$22, targetList);
                eu.openaire.cerifProfile.x11.CfMLangAnyMixedType[] result = new eu.openaire.cerifProfile.x11.CfMLangAnyMixedType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Abstract" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangAnyMixedType getAbstractArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangAnyMixedType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangAnyMixedType)get_store().find_element_user(ABSTRACT$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Abstract" element
         */
        public int sizeOfAbstractArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ABSTRACT$22);
            }
        }
        
        /**
         * Sets array of all "Abstract" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAbstractArray(eu.openaire.cerifProfile.x11.CfMLangAnyMixedType[] xabstractArray)
        {
            check_orphaned();
            arraySetterHelper(xabstractArray, ABSTRACT$22);
        }
        
        /**
         * Sets ith "Abstract" element
         */
        public void setAbstractArray(int i, eu.openaire.cerifProfile.x11.CfMLangAnyMixedType xabstract)
        {
            generatedSetterHelperImpl(xabstract, ABSTRACT$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Abstract" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangAnyMixedType insertNewAbstract(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangAnyMixedType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangAnyMixedType)get_store().insert_element_user(ABSTRACT$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Abstract" element
         */
        public eu.openaire.cerifProfile.x11.CfMLangAnyMixedType addNewAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfMLangAnyMixedType target = null;
                target = (eu.openaire.cerifProfile.x11.CfMLangAnyMixedType)get_store().add_element_user(ABSTRACT$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "Abstract" element
         */
        public void removeAbstract(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ABSTRACT$22, i);
            }
        }
        
        /**
         * Gets array of all "Status" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STATUS$24, targetList);
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] result = new eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Status" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getStatusArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(STATUS$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Status" element
         */
        public int sizeOfStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUS$24);
            }
        }
        
        /**
         * Sets array of all "Status" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setStatusArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] statusArray)
        {
            check_orphaned();
            arraySetterHelper(statusArray, STATUS$24);
        }
        
        /**
         * Sets ith "Status" element
         */
        public void setStatusArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType status)
        {
            generatedSetterHelperImpl(status, STATUS$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Status" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(STATUS$24, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Status" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(STATUS$24);
                return target;
            }
        }
        
        /**
         * Removes the ith "Status" element
         */
        public void removeStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUS$24, i);
            }
        }
        
        /**
         * Gets array of all "Uses" elements
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses[] getUsesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(USES$26, targetList);
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses[] result = new eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Uses" element
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses getUsesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses target = null;
                target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses)get_store().find_element_user(USES$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Uses" element
         */
        public int sizeOfUsesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USES$26);
            }
        }
        
        /**
         * Sets array of all "Uses" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setUsesArray(eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses[] usesArray)
        {
            check_orphaned();
            arraySetterHelper(usesArray, USES$26);
        }
        
        /**
         * Sets ith "Uses" element
         */
        public void setUsesArray(int i, eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses uses)
        {
            generatedSetterHelperImpl(uses, USES$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Uses" element
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses insertNewUses(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses target = null;
                target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses)get_store().insert_element_user(USES$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Uses" element
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses addNewUses()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses target = null;
                target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses)get_store().add_element_user(USES$26);
                return target;
            }
        }
        
        /**
         * Removes the ith "Uses" element
         */
        public void removeUses(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USES$26, i);
            }
        }
        
        /**
         * Gets array of all "OAMandate" elements
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate[] getOAMandateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OAMANDATE$28, targetList);
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate[] result = new eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OAMandate" element
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate getOAMandateArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate target = null;
                target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate)get_store().find_element_user(OAMANDATE$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "OAMandate" element
         */
        public int sizeOfOAMandateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OAMANDATE$28);
            }
        }
        
        /**
         * Sets array of all "OAMandate" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOAMandateArray(eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate[] oaMandateArray)
        {
            check_orphaned();
            arraySetterHelper(oaMandateArray, OAMANDATE$28);
        }
        
        /**
         * Sets ith "OAMandate" element
         */
        public void setOAMandateArray(int i, eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate oaMandate)
        {
            generatedSetterHelperImpl(oaMandate, OAMANDATE$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OAMandate" element
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate insertNewOAMandate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate target = null;
                target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate)get_store().insert_element_user(OAMANDATE$28, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OAMandate" element
         */
        public eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate addNewOAMandate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate target = null;
                target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate)get_store().add_element_user(OAMANDATE$28);
                return target;
            }
        }
        
        /**
         * Removes the ith "OAMandate" element
         */
        public void removeOAMandate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OAMANDATE$28, i);
            }
        }
        
        /**
         * Gets array of all "Classification" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CLASSIFICATION$30, targetList);
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] result = new eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Classification" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getClassificationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().find_element_user(CLASSIFICATION$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Classification" element
         */
        public int sizeOfClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASSIFICATION$30);
            }
        }
        
        /**
         * Sets array of all "Classification" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setClassificationArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] classificationArray)
        {
            check_orphaned();
            arraySetterHelper(classificationArray, CLASSIFICATION$30);
        }
        
        /**
         * Sets ith "Classification" element
         */
        public void setClassificationArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType classification)
        {
            generatedSetterHelperImpl(classification, CLASSIFICATION$30, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Classification" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().insert_element_user(CLASSIFICATION$30, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Classification" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericURIClassificationType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericURIClassificationType)get_store().add_element_user(CLASSIFICATION$30);
                return target;
            }
        }
        
        /**
         * Removes the ith "Classification" element
         */
        public void removeClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASSIFICATION$30, i);
            }
        }
        
        /**
         * Gets array of all "Link" elements
         */
        public eu.openaire.cerifProfile.x11.CfGenericLinkType[] getLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINK$32, targetList);
                eu.openaire.cerifProfile.x11.CfGenericLinkType[] result = new eu.openaire.cerifProfile.x11.CfGenericLinkType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Link" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericLinkType getLinkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericLinkType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().find_element_user(LINK$32, i);
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
                return get_store().count_elements(LINK$32);
            }
        }
        
        /**
         * Sets array of all "Link" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLinkArray(eu.openaire.cerifProfile.x11.CfGenericLinkType[] linkArray)
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$32);
        }
        
        /**
         * Sets ith "Link" element
         */
        public void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfGenericLinkType link)
        {
            generatedSetterHelperImpl(link, LINK$32, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Link" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericLinkType insertNewLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericLinkType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().insert_element_user(LINK$32, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Link" element
         */
        public eu.openaire.cerifProfile.x11.CfGenericLinkType addNewLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.openaire.cerifProfile.x11.CfGenericLinkType target = null;
                target = (eu.openaire.cerifProfile.x11.CfGenericLinkType)get_store().add_element_user(LINK$32);
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
                get_store().remove_element(LINK$32, i);
            }
        }
        /**
         * An XML Consortium(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class ConsortiumImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium
        {
            private static final long serialVersionUID = 1L;
            
            public ConsortiumImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName COORDINATOR$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Coordinator");
            private static final javax.xml.namespace.QName PARTNER$2 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Partner");
            private static final javax.xml.namespace.QName CONTRACTOR$4 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Contractor");
            private static final javax.xml.namespace.QName INKINDCONTRIBUTOR$6 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "InkindContributor");
            private static final javax.xml.namespace.QName MEMBER$8 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Member");
            
            
            /**
             * Gets array of all "Coordinator" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getCoordinatorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(COORDINATOR$0, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Coordinator" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getCoordinatorArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().find_element_user(COORDINATOR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Coordinator" element
             */
            public int sizeOfCoordinatorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(COORDINATOR$0);
                }
            }
            
            /**
             * Sets array of all "Coordinator" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setCoordinatorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] coordinatorArray)
            {
                check_orphaned();
                arraySetterHelper(coordinatorArray, COORDINATOR$0);
            }
            
            /**
             * Sets ith "Coordinator" element
             */
            public void setCoordinatorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType coordinator)
            {
                generatedSetterHelperImpl(coordinator, COORDINATOR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Coordinator" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewCoordinator(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().insert_element_user(COORDINATOR$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Coordinator" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewCoordinator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().add_element_user(COORDINATOR$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Coordinator" element
             */
            public void removeCoordinator(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(COORDINATOR$0, i);
                }
            }
            
            /**
             * Gets array of all "Partner" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getPartnerArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PARTNER$2, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Partner" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getPartnerArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().find_element_user(PARTNER$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Partner" element
             */
            public int sizeOfPartnerArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PARTNER$2);
                }
            }
            
            /**
             * Sets array of all "Partner" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setPartnerArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] partnerArray)
            {
                check_orphaned();
                arraySetterHelper(partnerArray, PARTNER$2);
            }
            
            /**
             * Sets ith "Partner" element
             */
            public void setPartnerArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType partner)
            {
                generatedSetterHelperImpl(partner, PARTNER$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Partner" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewPartner(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().insert_element_user(PARTNER$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Partner" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewPartner()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().add_element_user(PARTNER$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Partner" element
             */
            public void removePartner(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PARTNER$2, i);
                }
            }
            
            /**
             * Gets array of all "Contractor" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getContractorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CONTRACTOR$4, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Contractor" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getContractorArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().find_element_user(CONTRACTOR$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Contractor" element
             */
            public int sizeOfContractorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CONTRACTOR$4);
                }
            }
            
            /**
             * Sets array of all "Contractor" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setContractorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] contractorArray)
            {
                check_orphaned();
                arraySetterHelper(contractorArray, CONTRACTOR$4);
            }
            
            /**
             * Sets ith "Contractor" element
             */
            public void setContractorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType contractor)
            {
                generatedSetterHelperImpl(contractor, CONTRACTOR$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Contractor" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewContractor(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().insert_element_user(CONTRACTOR$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Contractor" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewContractor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().add_element_user(CONTRACTOR$4);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Contractor" element
             */
            public void removeContractor(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CONTRACTOR$4, i);
                }
            }
            
            /**
             * Gets array of all "InkindContributor" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getInkindContributorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INKINDCONTRIBUTOR$6, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "InkindContributor" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getInkindContributorArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().find_element_user(INKINDCONTRIBUTOR$6, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "InkindContributor" element
             */
            public int sizeOfInkindContributorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INKINDCONTRIBUTOR$6);
                }
            }
            
            /**
             * Sets array of all "InkindContributor" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setInkindContributorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] inkindContributorArray)
            {
                check_orphaned();
                arraySetterHelper(inkindContributorArray, INKINDCONTRIBUTOR$6);
            }
            
            /**
             * Sets ith "InkindContributor" element
             */
            public void setInkindContributorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType inkindContributor)
            {
                generatedSetterHelperImpl(inkindContributor, INKINDCONTRIBUTOR$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "InkindContributor" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewInkindContributor(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().insert_element_user(INKINDCONTRIBUTOR$6, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "InkindContributor" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewInkindContributor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().add_element_user(INKINDCONTRIBUTOR$6);
                    return target;
                }
            }
            
            /**
             * Removes the ith "InkindContributor" element
             */
            public void removeInkindContributor(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INKINDCONTRIBUTOR$6, i);
                }
            }
            
            /**
             * Gets array of all "Member" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getMemberArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MEMBER$8, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Member" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getMemberArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().find_element_user(MEMBER$8, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Member" element
             */
            public int sizeOfMemberArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MEMBER$8);
                }
            }
            
            /**
             * Sets array of all "Member" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setMemberArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] memberArray)
            {
                check_orphaned();
                arraySetterHelper(memberArray, MEMBER$8);
            }
            
            /**
             * Sets ith "Member" element
             */
            public void setMemberArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType member)
            {
                generatedSetterHelperImpl(member, MEMBER$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Member" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewMember(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().insert_element_user(MEMBER$8, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Member" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewMember()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().add_element_user(MEMBER$8);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Member" element
             */
            public void removeMember(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MEMBER$8, i);
                }
            }
        }
        /**
         * An XML Team(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class TeamImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team
        {
            private static final long serialVersionUID = 1L;
            
            public TeamImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PRINCIPALINVESTIGATOR$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "PrincipalInvestigator");
            private static final javax.xml.namespace.QName CONTACT$2 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Contact");
            private static final javax.xml.namespace.QName MEMBER$4 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Member");
            
            
            /**
             * Gets array of all "PrincipalInvestigator" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] getPrincipalInvestigatorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PRINCIPALINVESTIGATOR$0, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "PrincipalInvestigator" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType getPrincipalInvestigatorArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType)get_store().find_element_user(PRINCIPALINVESTIGATOR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "PrincipalInvestigator" element
             */
            public int sizeOfPrincipalInvestigatorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PRINCIPALINVESTIGATOR$0);
                }
            }
            
            /**
             * Sets array of all "PrincipalInvestigator" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setPrincipalInvestigatorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] principalInvestigatorArray)
            {
                check_orphaned();
                arraySetterHelper(principalInvestigatorArray, PRINCIPALINVESTIGATOR$0);
            }
            
            /**
             * Sets ith "PrincipalInvestigator" element
             */
            public void setPrincipalInvestigatorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType principalInvestigator)
            {
                generatedSetterHelperImpl(principalInvestigator, PRINCIPALINVESTIGATOR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "PrincipalInvestigator" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType insertNewPrincipalInvestigator(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType)get_store().insert_element_user(PRINCIPALINVESTIGATOR$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "PrincipalInvestigator" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType addNewPrincipalInvestigator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType)get_store().add_element_user(PRINCIPALINVESTIGATOR$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "PrincipalInvestigator" element
             */
            public void removePrincipalInvestigator(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PRINCIPALINVESTIGATOR$0, i);
                }
            }
            
            /**
             * Gets array of all "Contact" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] getContactArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CONTACT$2, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Contact" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType getContactArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType)get_store().find_element_user(CONTACT$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Contact" element
             */
            public int sizeOfContactArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CONTACT$2);
                }
            }
            
            /**
             * Sets array of all "Contact" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setContactArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] contactArray)
            {
                check_orphaned();
                arraySetterHelper(contactArray, CONTACT$2);
            }
            
            /**
             * Sets ith "Contact" element
             */
            public void setContactArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType contact)
            {
                generatedSetterHelperImpl(contact, CONTACT$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Contact" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType insertNewContact(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType)get_store().insert_element_user(CONTACT$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Contact" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType addNewContact()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType)get_store().add_element_user(CONTACT$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Contact" element
             */
            public void removeContact(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CONTACT$2, i);
                }
            }
            
            /**
             * Gets array of all "Member" elements
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] getMemberArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MEMBER$4, targetList);
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] result = new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Member" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType getMemberArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType)get_store().find_element_user(MEMBER$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Member" element
             */
            public int sizeOfMemberArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MEMBER$4);
                }
            }
            
            /**
             * Sets array of all "Member" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setMemberArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] memberArray)
            {
                check_orphaned();
                arraySetterHelper(memberArray, MEMBER$4);
            }
            
            /**
             * Sets ith "Member" element
             */
            public void setMemberArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType member)
            {
                generatedSetterHelperImpl(member, MEMBER$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Member" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType insertNewMember(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType)get_store().insert_element_user(MEMBER$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Member" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType addNewMember()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType)get_store().add_element_user(MEMBER$4);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Member" element
             */
            public void removeMember(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MEMBER$4, i);
                }
            }
        }
        /**
         * An XML Funded(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class FundedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded
        {
            private static final long serialVersionUID = 1L;
            
            public FundedImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BY$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "By");
            private static final javax.xml.namespace.QName AS$2 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "As");
            
            
            /**
             * Gets the "By" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getBy()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().find_element_user(BY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "By" element
             */
            public boolean isSetBy()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BY$0) != 0;
                }
            }
            
            /**
             * Sets the "By" element
             */
            public void setBy(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType by)
            {
                generatedSetterHelperImpl(by, BY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "By" element
             */
            public eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewBy()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType)get_store().add_element_user(BY$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "By" element
             */
            public void unsetBy()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BY$0, 0);
                }
            }
            
            /**
             * Gets the "As" element
             */
            public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As getAs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As target = null;
                    target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As)get_store().find_element_user(AS$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "As" element
             */
            public boolean isSetAs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AS$2) != 0;
                }
            }
            
            /**
             * Sets the "As" element
             */
            public void setAs(eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As as)
            {
                generatedSetterHelperImpl(as, AS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "As" element
             */
            public eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As addNewAs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As target = null;
                    target = (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As)get_store().add_element_user(AS$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "As" element
             */
            public void unsetAs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AS$2, 0);
                }
            }
            /**
             * An XML As(@https://www.openaire.eu/cerif-profile/1.1/).
             *
             * This is a complex type.
             */
            public static class AsImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As
            {
                private static final long serialVersionUID = 1L;
                
                public AsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName FUNDING$0 = 
                    new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Funding");
                
                
                /**
                 * Gets the "Funding" element
                 */
                public eu.openaire.cerifProfile.x11.FundingDocument.Funding getFunding()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      eu.openaire.cerifProfile.x11.FundingDocument.Funding target = null;
                      target = (eu.openaire.cerifProfile.x11.FundingDocument.Funding)get_store().find_element_user(FUNDING$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Funding" element
                 */
                public void setFunding(eu.openaire.cerifProfile.x11.FundingDocument.Funding funding)
                {
                    generatedSetterHelperImpl(funding, FUNDING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "Funding" element
                 */
                public eu.openaire.cerifProfile.x11.FundingDocument.Funding addNewFunding()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      eu.openaire.cerifProfile.x11.FundingDocument.Funding target = null;
                      target = (eu.openaire.cerifProfile.x11.FundingDocument.Funding)get_store().add_element_user(FUNDING$0);
                      return target;
                    }
                }
            }
        }
        /**
         * An XML Uses(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class UsesImpl extends eu.openaire.cerifProfile.x11.impl.CfLinkBaseTypeImpl implements eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses
        {
            private static final long serialVersionUID = 1L;
            
            public UsesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EQUIPMENT$0 = 
                new javax.xml.namespace.QName("https://www.openaire.eu/cerif-profile/1.1/", "Equipment");
            
            
            /**
             * Gets the "Equipment" element
             */
            public eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment getEquipment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment target = null;
                    target = (eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment)get_store().find_element_user(EQUIPMENT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Equipment" element
             */
            public void setEquipment(eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment equipment)
            {
                generatedSetterHelperImpl(equipment, EQUIPMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Equipment" element
             */
            public eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment addNewEquipment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment target = null;
                    target = (eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment)get_store().add_element_user(EQUIPMENT$0);
                    return target;
                }
            }
        }
        /**
         * An XML OAMandate(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public static class OAMandateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate
        {
            private static final long serialVersionUID = 1L;
            
            public OAMandateImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MANDATED$0 = 
                new javax.xml.namespace.QName("", "mandated");
            private static final javax.xml.namespace.QName URI$2 = 
                new javax.xml.namespace.QName("", "uri");
            private static final javax.xml.namespace.QName STARTDATE$4 = 
                new javax.xml.namespace.QName("", "startDate");
            private static final javax.xml.namespace.QName ENDDATE$6 = 
                new javax.xml.namespace.QName("", "endDate");
            
            
            /**
             * Gets the "mandated" attribute
             */
            public boolean getMandated()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANDATED$0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "mandated" attribute
             */
            public org.apache.xmlbeans.XmlBoolean xgetMandated()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MANDATED$0);
                    return target;
                }
            }
            
            /**
             * Sets the "mandated" attribute
             */
            public void setMandated(boolean mandated)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANDATED$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MANDATED$0);
                    }
                    target.setBooleanValue(mandated);
                }
            }
            
            /**
             * Sets (as xml) the "mandated" attribute
             */
            public void xsetMandated(org.apache.xmlbeans.XmlBoolean mandated)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MANDATED$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MANDATED$0);
                    }
                    target.set(mandated);
                }
            }
            
            /**
             * Gets the "uri" attribute
             */
            public java.lang.String getUri()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "uri" attribute
             */
            public org.apache.xmlbeans.XmlAnyURI xgetUri()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$2);
                    return target;
                }
            }
            
            /**
             * True if has "uri" attribute
             */
            public boolean isSetUri()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(URI$2) != null;
                }
            }
            
            /**
             * Sets the "uri" attribute
             */
            public void setUri(java.lang.String uri)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$2);
                    }
                    target.setStringValue(uri);
                }
            }
            
            /**
             * Sets (as xml) the "uri" attribute
             */
            public void xsetUri(org.apache.xmlbeans.XmlAnyURI uri)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(URI$2);
                    }
                    target.set(uri);
                }
            }
            
            /**
             * Unsets the "uri" attribute
             */
            public void unsetUri()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(URI$2);
                }
            }
            
            /**
             * Gets the "startDate" attribute
             */
            public java.util.Calendar getStartDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$4);
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
            public eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType xgetStartDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType)get_store().find_attribute_user(STARTDATE$4);
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
                    return get_store().find_attribute_user(STARTDATE$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTDATE$4);
                    }
                    target.setCalendarValue(startDate);
                }
            }
            
            /**
             * Sets (as xml) the "startDate" attribute
             */
            public void xsetStartDate(eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType startDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType)get_store().find_attribute_user(STARTDATE$4);
                    if (target == null)
                    {
                      target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType)get_store().add_attribute_user(STARTDATE$4);
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
                    get_store().remove_attribute(STARTDATE$4);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$6);
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
            public eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType xgetEndDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType)get_store().find_attribute_user(ENDDATE$6);
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
                    return get_store().find_attribute_user(ENDDATE$6) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDDATE$6);
                    }
                    target.setCalendarValue(endDate);
                }
            }
            
            /**
             * Sets (as xml) the "endDate" attribute
             */
            public void xsetEndDate(eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType endDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType target = null;
                    target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType)get_store().find_attribute_user(ENDDATE$6);
                    if (target == null)
                    {
                      target = (eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType)get_store().add_attribute_user(ENDDATE$6);
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
                    get_store().remove_attribute(ENDDATE$6);
                }
            }
        }
    }
}
