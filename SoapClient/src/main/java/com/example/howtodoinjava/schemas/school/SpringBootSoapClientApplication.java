package com.example.howtodoinjava.schemas.school;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootSoapClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SOAPConnector soapConnector = context.getBean(SOAPConnector.class);

        GetStudentDetailsRequest request = new GetStudentDetailsRequest();
        request.setId(1);
        GetStudentDetailsResponse response =(GetStudentDetailsResponse) soapConnector.callWebService("http://localhost:8080/ws/studentsx.wsdl", request);
        System.out.println("Got Response As below ========= : ");
        System.out.println("Address : "+response.getStudentDetails().getPassportNumber());

        SpringApplication.run(SpringBootSoapClientApplication.class, args);
    }

}