package org.example.soap;

import jakarta.xml.ws.Endpoint;

public class ServicePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/CalculatorService";
        Endpoint.publish(url, new CalculatorService());
        System.out.println("Service SOAP publié à : " + url);
    }
}
