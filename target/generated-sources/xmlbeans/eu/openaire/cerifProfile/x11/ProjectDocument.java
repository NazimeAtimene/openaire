/*
 * An XML document type.
 * Localname: Project
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.ProjectDocument
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11;


/**
 * A document containing one Project(@https://www.openaire.eu/cerif-profile/1.1/) element.
 *
 * This is a complex type.
 */
public interface ProjectDocument extends eu.openaire.cerifProfile.x11.ProjectFundingSubstitutionGroupHeadDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProjectDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("projectd45ddoctype");
    
    /**
     * Gets the "Project" element
     */
    eu.openaire.cerifProfile.x11.ProjectDocument.Project getProject();
    
    /**
     * Sets the "Project" element
     */
    void setProject(eu.openaire.cerifProfile.x11.ProjectDocument.Project project);
    
    /**
     * Appends and returns a new empty "Project" element
     */
    eu.openaire.cerifProfile.x11.ProjectDocument.Project addNewProject();
    
    /**
     * An XML Project(@https://www.openaire.eu/cerif-profile/1.1/).
     *
     * This is a complex type.
     */
    public interface Project extends eu.openaire.cerifProfile.x11.ProjectFundingBaseType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Project.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("projectaa18elemtype");
        
        /**
         * Gets array of all "Type" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getTypeArray();
        
        /**
         * Gets ith "Type" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getTypeArray(int i);
        
        /**
         * Returns number of "Type" element
         */
        int sizeOfTypeArray();
        
        /**
         * Sets array of all "Type" element
         */
        void setTypeArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] typeArray);
        
        /**
         * Sets ith "Type" element
         */
        void setTypeArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType type);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Type" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Type" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewType();
        
        /**
         * Removes the ith "Type" element
         */
        void removeType(int i);
        
        /**
         * Gets the "Acronym" element
         */
        eu.openaire.cerifProfile.x11.CfStringType getAcronym();
        
        /**
         * True if has "Acronym" element
         */
        boolean isSetAcronym();
        
        /**
         * Sets the "Acronym" element
         */
        void setAcronym(eu.openaire.cerifProfile.x11.CfStringType acronym);
        
        /**
         * Appends and returns a new empty "Acronym" element
         */
        eu.openaire.cerifProfile.x11.CfStringType addNewAcronym();
        
        /**
         * Unsets the "Acronym" element
         */
        void unsetAcronym();
        
        /**
         * Gets array of all "Title" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getTitleArray();
        
        /**
         * Gets ith "Title" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getTitleArray(int i);
        
        /**
         * Returns number of "Title" element
         */
        int sizeOfTitleArray();
        
        /**
         * Sets array of all "Title" element
         */
        void setTitleArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] titleArray);
        
        /**
         * Sets ith "Title" element
         */
        void setTitleArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType title);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Title" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewTitle(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Title" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewTitle();
        
        /**
         * Removes the ith "Title" element
         */
        void removeTitle(int i);
        
        /**
         * Gets array of all "Identifier" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] getIdentifierArray();
        
        /**
         * Gets ith "Identifier" element
         */
        eu.openaire.cerifProfile.x11.CfGenericIdentifierType getIdentifierArray(int i);
        
        /**
         * Returns number of "Identifier" element
         */
        int sizeOfIdentifierArray();
        
        /**
         * Sets array of all "Identifier" element
         */
        void setIdentifierArray(eu.openaire.cerifProfile.x11.CfGenericIdentifierType[] identifierArray);
        
        /**
         * Sets ith "Identifier" element
         */
        void setIdentifierArray(int i, eu.openaire.cerifProfile.x11.CfGenericIdentifierType identifier);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        eu.openaire.cerifProfile.x11.CfGenericIdentifierType insertNewIdentifier(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        eu.openaire.cerifProfile.x11.CfGenericIdentifierType addNewIdentifier();
        
        /**
         * Removes the ith "Identifier" element
         */
        void removeIdentifier(int i);
        
        /**
         * Gets the "StartDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType getStartDate();
        
        /**
         * True if has "StartDate" element
         */
        boolean isSetStartDate();
        
        /**
         * Sets the "StartDate" element
         */
        void setStartDate(eu.openaire.cerifProfile.x11.CfDateType startDate);
        
        /**
         * Appends and returns a new empty "StartDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType addNewStartDate();
        
        /**
         * Unsets the "StartDate" element
         */
        void unsetStartDate();
        
        /**
         * Gets the "EndDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType getEndDate();
        
        /**
         * True if has "EndDate" element
         */
        boolean isSetEndDate();
        
        /**
         * Sets the "EndDate" element
         */
        void setEndDate(eu.openaire.cerifProfile.x11.CfDateType endDate);
        
        /**
         * Appends and returns a new empty "EndDate" element
         */
        eu.openaire.cerifProfile.x11.CfDateType addNewEndDate();
        
        /**
         * Unsets the "EndDate" element
         */
        void unsetEndDate();
        
        /**
         * Gets the "Consortium" element
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium getConsortium();
        
        /**
         * True if has "Consortium" element
         */
        boolean isSetConsortium();
        
        /**
         * Sets the "Consortium" element
         */
        void setConsortium(eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium consortium);
        
        /**
         * Appends and returns a new empty "Consortium" element
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium addNewConsortium();
        
        /**
         * Unsets the "Consortium" element
         */
        void unsetConsortium();
        
        /**
         * Gets the "Team" element
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team getTeam();
        
        /**
         * True if has "Team" element
         */
        boolean isSetTeam();
        
        /**
         * Sets the "Team" element
         */
        void setTeam(eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team team);
        
        /**
         * Appends and returns a new empty "Team" element
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team addNewTeam();
        
        /**
         * Unsets the "Team" element
         */
        void unsetTeam();
        
        /**
         * Gets array of all "Funded" elements
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded[] getFundedArray();
        
        /**
         * Gets ith "Funded" element
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded getFundedArray(int i);
        
        /**
         * Returns number of "Funded" element
         */
        int sizeOfFundedArray();
        
        /**
         * Sets array of all "Funded" element
         */
        void setFundedArray(eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded[] fundedArray);
        
        /**
         * Sets ith "Funded" element
         */
        void setFundedArray(int i, eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded funded);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Funded" element
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded insertNewFunded(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Funded" element
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded addNewFunded();
        
        /**
         * Removes the ith "Funded" element
         */
        void removeFunded(int i);
        
        /**
         * Gets array of all "Subject" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getSubjectArray();
        
        /**
         * Gets ith "Subject" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getSubjectArray(int i);
        
        /**
         * Returns number of "Subject" element
         */
        int sizeOfSubjectArray();
        
        /**
         * Sets array of all "Subject" element
         */
        void setSubjectArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] subjectArray);
        
        /**
         * Sets ith "Subject" element
         */
        void setSubjectArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType subject);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Subject" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewSubject(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Subject" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewSubject();
        
        /**
         * Removes the ith "Subject" element
         */
        void removeSubject(int i);
        
        /**
         * Gets array of all "Keyword" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType[] getKeywordArray();
        
        /**
         * Gets ith "Keyword" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType getKeywordArray(int i);
        
        /**
         * Returns number of "Keyword" element
         */
        int sizeOfKeywordArray();
        
        /**
         * Sets array of all "Keyword" element
         */
        void setKeywordArray(eu.openaire.cerifProfile.x11.CfMLangStringType[] keywordArray);
        
        /**
         * Sets ith "Keyword" element
         */
        void setKeywordArray(int i, eu.openaire.cerifProfile.x11.CfMLangStringType keyword);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Keyword" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType insertNewKeyword(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Keyword" element
         */
        eu.openaire.cerifProfile.x11.CfMLangStringType addNewKeyword();
        
        /**
         * Removes the ith "Keyword" element
         */
        void removeKeyword(int i);
        
        /**
         * Gets array of all "Abstract" elements
         */
        eu.openaire.cerifProfile.x11.CfMLangAnyMixedType[] getAbstractArray();
        
        /**
         * Gets ith "Abstract" element
         */
        eu.openaire.cerifProfile.x11.CfMLangAnyMixedType getAbstractArray(int i);
        
        /**
         * Returns number of "Abstract" element
         */
        int sizeOfAbstractArray();
        
        /**
         * Sets array of all "Abstract" element
         */
        void setAbstractArray(eu.openaire.cerifProfile.x11.CfMLangAnyMixedType[] xabstractArray);
        
        /**
         * Sets ith "Abstract" element
         */
        void setAbstractArray(int i, eu.openaire.cerifProfile.x11.CfMLangAnyMixedType xabstract);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Abstract" element
         */
        eu.openaire.cerifProfile.x11.CfMLangAnyMixedType insertNewAbstract(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Abstract" element
         */
        eu.openaire.cerifProfile.x11.CfMLangAnyMixedType addNewAbstract();
        
        /**
         * Removes the ith "Abstract" element
         */
        void removeAbstract(int i);
        
        /**
         * Gets array of all "Status" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getStatusArray();
        
        /**
         * Gets ith "Status" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getStatusArray(int i);
        
        /**
         * Returns number of "Status" element
         */
        int sizeOfStatusArray();
        
        /**
         * Sets array of all "Status" element
         */
        void setStatusArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] statusArray);
        
        /**
         * Sets ith "Status" element
         */
        void setStatusArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType status);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Status" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewStatus(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Status" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewStatus();
        
        /**
         * Removes the ith "Status" element
         */
        void removeStatus(int i);
        
        /**
         * Gets array of all "Uses" elements
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses[] getUsesArray();
        
        /**
         * Gets ith "Uses" element
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses getUsesArray(int i);
        
        /**
         * Returns number of "Uses" element
         */
        int sizeOfUsesArray();
        
        /**
         * Sets array of all "Uses" element
         */
        void setUsesArray(eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses[] usesArray);
        
        /**
         * Sets ith "Uses" element
         */
        void setUsesArray(int i, eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses uses);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Uses" element
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses insertNewUses(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Uses" element
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses addNewUses();
        
        /**
         * Removes the ith "Uses" element
         */
        void removeUses(int i);
        
        /**
         * Gets array of all "OAMandate" elements
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate[] getOAMandateArray();
        
        /**
         * Gets ith "OAMandate" element
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate getOAMandateArray(int i);
        
        /**
         * Returns number of "OAMandate" element
         */
        int sizeOfOAMandateArray();
        
        /**
         * Sets array of all "OAMandate" element
         */
        void setOAMandateArray(eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate[] oaMandateArray);
        
        /**
         * Sets ith "OAMandate" element
         */
        void setOAMandateArray(int i, eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate oaMandate);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OAMandate" element
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate insertNewOAMandate(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OAMandate" element
         */
        eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate addNewOAMandate();
        
        /**
         * Removes the ith "OAMandate" element
         */
        void removeOAMandate(int i);
        
        /**
         * Gets array of all "Classification" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] getClassificationArray();
        
        /**
         * Gets ith "Classification" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType getClassificationArray(int i);
        
        /**
         * Returns number of "Classification" element
         */
        int sizeOfClassificationArray();
        
        /**
         * Sets array of all "Classification" element
         */
        void setClassificationArray(eu.openaire.cerifProfile.x11.CfGenericURIClassificationType[] classificationArray);
        
        /**
         * Sets ith "Classification" element
         */
        void setClassificationArray(int i, eu.openaire.cerifProfile.x11.CfGenericURIClassificationType classification);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Classification" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType insertNewClassification(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Classification" element
         */
        eu.openaire.cerifProfile.x11.CfGenericURIClassificationType addNewClassification();
        
        /**
         * Removes the ith "Classification" element
         */
        void removeClassification(int i);
        
        /**
         * Gets array of all "Link" elements
         */
        eu.openaire.cerifProfile.x11.CfGenericLinkType[] getLinkArray();
        
        /**
         * Gets ith "Link" element
         */
        eu.openaire.cerifProfile.x11.CfGenericLinkType getLinkArray(int i);
        
        /**
         * Returns number of "Link" element
         */
        int sizeOfLinkArray();
        
        /**
         * Sets array of all "Link" element
         */
        void setLinkArray(eu.openaire.cerifProfile.x11.CfGenericLinkType[] linkArray);
        
        /**
         * Sets ith "Link" element
         */
        void setLinkArray(int i, eu.openaire.cerifProfile.x11.CfGenericLinkType link);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Link" element
         */
        eu.openaire.cerifProfile.x11.CfGenericLinkType insertNewLink(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Link" element
         */
        eu.openaire.cerifProfile.x11.CfGenericLinkType addNewLink();
        
        /**
         * Removes the ith "Link" element
         */
        void removeLink(int i);
        
        /**
         * An XML Consortium(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Consortium extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Consortium.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("consortiumed1belemtype");
            
            /**
             * Gets array of all "Coordinator" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getCoordinatorArray();
            
            /**
             * Gets ith "Coordinator" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getCoordinatorArray(int i);
            
            /**
             * Returns number of "Coordinator" element
             */
            int sizeOfCoordinatorArray();
            
            /**
             * Sets array of all "Coordinator" element
             */
            void setCoordinatorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] coordinatorArray);
            
            /**
             * Sets ith "Coordinator" element
             */
            void setCoordinatorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType coordinator);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Coordinator" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewCoordinator(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Coordinator" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewCoordinator();
            
            /**
             * Removes the ith "Coordinator" element
             */
            void removeCoordinator(int i);
            
            /**
             * Gets array of all "Partner" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getPartnerArray();
            
            /**
             * Gets ith "Partner" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getPartnerArray(int i);
            
            /**
             * Returns number of "Partner" element
             */
            int sizeOfPartnerArray();
            
            /**
             * Sets array of all "Partner" element
             */
            void setPartnerArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] partnerArray);
            
            /**
             * Sets ith "Partner" element
             */
            void setPartnerArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType partner);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Partner" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewPartner(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Partner" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewPartner();
            
            /**
             * Removes the ith "Partner" element
             */
            void removePartner(int i);
            
            /**
             * Gets array of all "Contractor" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getContractorArray();
            
            /**
             * Gets ith "Contractor" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getContractorArray(int i);
            
            /**
             * Returns number of "Contractor" element
             */
            int sizeOfContractorArray();
            
            /**
             * Sets array of all "Contractor" element
             */
            void setContractorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] contractorArray);
            
            /**
             * Sets ith "Contractor" element
             */
            void setContractorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType contractor);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Contractor" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewContractor(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Contractor" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewContractor();
            
            /**
             * Removes the ith "Contractor" element
             */
            void removeContractor(int i);
            
            /**
             * Gets array of all "InkindContributor" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getInkindContributorArray();
            
            /**
             * Gets ith "InkindContributor" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getInkindContributorArray(int i);
            
            /**
             * Returns number of "InkindContributor" element
             */
            int sizeOfInkindContributorArray();
            
            /**
             * Sets array of all "InkindContributor" element
             */
            void setInkindContributorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] inkindContributorArray);
            
            /**
             * Sets ith "InkindContributor" element
             */
            void setInkindContributorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType inkindContributor);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "InkindContributor" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewInkindContributor(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "InkindContributor" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewInkindContributor();
            
            /**
             * Removes the ith "InkindContributor" element
             */
            void removeInkindContributor(int i);
            
            /**
             * Gets array of all "Member" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] getMemberArray();
            
            /**
             * Gets ith "Member" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getMemberArray(int i);
            
            /**
             * Returns number of "Member" element
             */
            int sizeOfMemberArray();
            
            /**
             * Sets array of all "Member" element
             */
            void setMemberArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType[] memberArray);
            
            /**
             * Sets ith "Member" element
             */
            void setMemberArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType member);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Member" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType insertNewMember(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Member" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewMember();
            
            /**
             * Removes the ith "Member" element
             */
            void removeMember(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Consortium) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Team(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Team extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Team.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("teamf7dfelemtype");
            
            /**
             * Gets array of all "PrincipalInvestigator" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] getPrincipalInvestigatorArray();
            
            /**
             * Gets ith "PrincipalInvestigator" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType getPrincipalInvestigatorArray(int i);
            
            /**
             * Returns number of "PrincipalInvestigator" element
             */
            int sizeOfPrincipalInvestigatorArray();
            
            /**
             * Sets array of all "PrincipalInvestigator" element
             */
            void setPrincipalInvestigatorArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] principalInvestigatorArray);
            
            /**
             * Sets ith "PrincipalInvestigator" element
             */
            void setPrincipalInvestigatorArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType principalInvestigator);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "PrincipalInvestigator" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType insertNewPrincipalInvestigator(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "PrincipalInvestigator" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType addNewPrincipalInvestigator();
            
            /**
             * Removes the ith "PrincipalInvestigator" element
             */
            void removePrincipalInvestigator(int i);
            
            /**
             * Gets array of all "Contact" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] getContactArray();
            
            /**
             * Gets ith "Contact" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType getContactArray(int i);
            
            /**
             * Returns number of "Contact" element
             */
            int sizeOfContactArray();
            
            /**
             * Sets array of all "Contact" element
             */
            void setContactArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] contactArray);
            
            /**
             * Sets ith "Contact" element
             */
            void setContactArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType contact);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Contact" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType insertNewContact(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Contact" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType addNewContact();
            
            /**
             * Removes the ith "Contact" element
             */
            void removeContact(int i);
            
            /**
             * Gets array of all "Member" elements
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] getMemberArray();
            
            /**
             * Gets ith "Member" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType getMemberArray(int i);
            
            /**
             * Returns number of "Member" element
             */
            int sizeOfMemberArray();
            
            /**
             * Sets array of all "Member" element
             */
            void setMemberArray(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType[] memberArray);
            
            /**
             * Sets ith "Member" element
             */
            void setMemberArray(int i, eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType member);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Member" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType insertNewMember(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Member" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsType addNewMember();
            
            /**
             * Removes the ith "Member" element
             */
            void removeMember(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Team) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Funded(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Funded extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Funded.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("fundedd938elemtype");
            
            /**
             * Gets the "By" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType getBy();
            
            /**
             * True if has "By" element
             */
            boolean isSetBy();
            
            /**
             * Sets the "By" element
             */
            void setBy(eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType by);
            
            /**
             * Appends and returns a new empty "By" element
             */
            eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonOrOrgUnitType addNewBy();
            
            /**
             * Unsets the "By" element
             */
            void unsetBy();
            
            /**
             * Gets the "As" element
             */
            eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As getAs();
            
            /**
             * True if has "As" element
             */
            boolean isSetAs();
            
            /**
             * Sets the "As" element
             */
            void setAs(eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As as);
            
            /**
             * Appends and returns a new empty "As" element
             */
            eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As addNewAs();
            
            /**
             * Unsets the "As" element
             */
            void unsetAs();
            
            /**
             * An XML As(@https://www.openaire.eu/cerif-profile/1.1/).
             *
             * This is a complex type.
             */
            public interface As extends eu.openaire.cerifProfile.x11.CfLinkBaseType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(As.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("ase626elemtype");
                
                /**
                 * Gets the "Funding" element
                 */
                eu.openaire.cerifProfile.x11.FundingDocument.Funding getFunding();
                
                /**
                 * Sets the "Funding" element
                 */
                void setFunding(eu.openaire.cerifProfile.x11.FundingDocument.Funding funding);
                
                /**
                 * Appends and returns a new empty "Funding" element
                 */
                eu.openaire.cerifProfile.x11.FundingDocument.Funding addNewFunding();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As newInstance() {
                      return (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded.As) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Funded) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Uses(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface Uses extends eu.openaire.cerifProfile.x11.CfLinkBaseType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Uses.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("usesdc90elemtype");
            
            /**
             * Gets the "Equipment" element
             */
            eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment getEquipment();
            
            /**
             * Sets the "Equipment" element
             */
            void setEquipment(eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment equipment);
            
            /**
             * Appends and returns a new empty "Equipment" element
             */
            eu.openaire.cerifProfile.x11.EquipmentDocument.Equipment addNewEquipment();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProjectDocument.Project.Uses) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML OAMandate(@https://www.openaire.eu/cerif-profile/1.1/).
         *
         * This is a complex type.
         */
        public interface OAMandate extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OAMandate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0534E721092E67DBFFAE85F185245631").resolveHandle("oamandatef196elemtype");
            
            /**
             * Gets the "mandated" attribute
             */
            boolean getMandated();
            
            /**
             * Gets (as xml) the "mandated" attribute
             */
            org.apache.xmlbeans.XmlBoolean xgetMandated();
            
            /**
             * Sets the "mandated" attribute
             */
            void setMandated(boolean mandated);
            
            /**
             * Sets (as xml) the "mandated" attribute
             */
            void xsetMandated(org.apache.xmlbeans.XmlBoolean mandated);
            
            /**
             * Gets the "uri" attribute
             */
            java.lang.String getUri();
            
            /**
             * Gets (as xml) the "uri" attribute
             */
            org.apache.xmlbeans.XmlAnyURI xgetUri();
            
            /**
             * True if has "uri" attribute
             */
            boolean isSetUri();
            
            /**
             * Sets the "uri" attribute
             */
            void setUri(java.lang.String uri);
            
            /**
             * Sets (as xml) the "uri" attribute
             */
            void xsetUri(org.apache.xmlbeans.XmlAnyURI uri);
            
            /**
             * Unsets the "uri" attribute
             */
            void unsetUri();
            
            /**
             * Gets the "startDate" attribute
             */
            java.util.Calendar getStartDate();
            
            /**
             * Gets (as xml) the "startDate" attribute
             */
            eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType xgetStartDate();
            
            /**
             * True if has "startDate" attribute
             */
            boolean isSetStartDate();
            
            /**
             * Sets the "startDate" attribute
             */
            void setStartDate(java.util.Calendar startDate);
            
            /**
             * Sets (as xml) the "startDate" attribute
             */
            void xsetStartDate(eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType startDate);
            
            /**
             * Unsets the "startDate" attribute
             */
            void unsetStartDate();
            
            /**
             * Gets the "endDate" attribute
             */
            java.util.Calendar getEndDate();
            
            /**
             * Gets (as xml) the "endDate" attribute
             */
            eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType xgetEndDate();
            
            /**
             * True if has "endDate" attribute
             */
            boolean isSetEndDate();
            
            /**
             * Sets the "endDate" attribute
             */
            void setEndDate(java.util.Calendar endDate);
            
            /**
             * Sets (as xml) the "endDate" attribute
             */
            void xsetEndDate(eu.openaire.cerifProfile.x11.CfGenericDateTimeSimpleType endDate);
            
            /**
             * Unsets the "endDate" attribute
             */
            void unsetEndDate();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate newInstance() {
                  return (eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (eu.openaire.cerifProfile.x11.ProjectDocument.Project.OAMandate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.openaire.cerifProfile.x11.ProjectDocument.Project newInstance() {
              return (eu.openaire.cerifProfile.x11.ProjectDocument.Project) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.openaire.cerifProfile.x11.ProjectDocument.Project newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.openaire.cerifProfile.x11.ProjectDocument.Project) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.openaire.cerifProfile.x11.ProjectDocument newInstance() {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProjectDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.openaire.cerifProfile.x11.ProjectDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.openaire.cerifProfile.x11.ProjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
