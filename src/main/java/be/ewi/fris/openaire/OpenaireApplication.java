package be.ewi.fris.openaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import eu.openaire.cerifProfile.x11.*;

@SpringBootApplication
public class OpenaireApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenaireApplication.class, args);
    }


   /* private void testCaseForCreators() {
        ProductDocument.Product.Creators creators = ProductDocument.Product.Creators.Factory.newInstance();
        CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType participantName = CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Factory.newInstance();
        PersonDocument.Person person = PersonDocument.Person.Factory.newInstance();
        PersonDocument.Person.PersonName personName = PersonDocument.Person.PersonName.Factory.newInstance();
        CfStringType lastNames = CfStringType.Factory.newInstance();
        lastNames.setStringValue("lastname");
        personName.setFamilyNames(lastNames);
        CfStringType firstNames = CfStringType.Factory.newInstance();
        firstNames.setStringValue("firstname");
        personName.setFirstNames(firstNames);
        person.setPersonName(personName);
        participantName.setPersonSubstitutionGroupHead(person);
        creators.setCreatorArray(new eu.openaire.cerifProfile.x11.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType[]{participantName});

    }*/
}
