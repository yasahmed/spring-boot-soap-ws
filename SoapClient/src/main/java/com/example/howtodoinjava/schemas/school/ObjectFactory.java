//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.05.28 à 05:15:40 PM WET 
//


package com.example.howtodoinjava.schemas.school;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.howtodoinjava.schemas.school package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.howtodoinjava.schemas.school
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudentDetailsRequest }
     * 
     */
    public GetStudentDetailsRequest createGetStudentDetailsRequest() {
        return new GetStudentDetailsRequest();
    }

    /**
     * Create an instance of {@link GetStudentDetailsResponse }
     * 
     */
    public GetStudentDetailsResponse createGetStudentDetailsResponse() {
        return new GetStudentDetailsResponse();
    }

    /**
     * Create an instance of {@link StudentDetails }
     * 
     */
    public StudentDetails createStudentDetails() {
        return new StudentDetails();
    }

}
