package be.ewi.fris.openaire;

import https.www_openaire_eu.cerif_profile._1.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType;
import https.www_openaire_eu.cerif_profile._1.CfStringType;
import https.www_openaire_eu.cerif_profile._1.Person;
import https.www_openaire_eu.cerif_profile._1.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.namespace.QName;


@SpringBootApplication
public class OpenaireApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenaireApplication.class, args);
    }


    private static void populateCreatorsForProduct() {
        Product product = new Product();
        Product.Creators creators = new Product.Creators();
        CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType participantName = new CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType();
        Person person = new Person();
        Person.PersonName personName = new Person.PersonName();
        CfStringType lastNames = new CfStringType();
        lastNames.setValue("lastname");
        personName.setFamilyNames(lastNames);
        CfStringType firstNames = new CfStringType();
        firstNames.setValue("firstName");
        personName.setFirstNames(firstNames);
        person.setPersonName(personName);
        QName qname = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Person");
        participantName.setPersonSubstitutionGroupHead(new javax.xml.bind.JAXBElement<Person>(qname, Person.class, person));
        creators.getCreator().add(participantName);
        product.setCreators(creators);
    }
}
