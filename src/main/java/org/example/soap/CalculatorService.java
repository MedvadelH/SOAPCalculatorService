package org.example.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class CalculatorService {

    @WebMethod
    public double addition(double a, double b) {
        return a + b;
    }

    @WebMethod
    public double soustraction(double a, double b) {
        return a - b;
    }

    @WebMethod
    public double multiplication(double a, double b) {
        return a * b;
    }

    @WebMethod
    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : Division par zéro non permise.");
            return Double.NaN; // Renvoie "Not a Number" pour indiquer une erreur.
        }
        return a / b;
    }

}
