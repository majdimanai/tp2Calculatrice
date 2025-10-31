package org.example.service;

import jakarta.jws.WebService;

@WebService
public class Calculatrice implements ICalculatrice{
    @Override
    public double somme(double a, double b) {
        return a+b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a*b;
    }

    @Override
    public double soustraction(double a, double b) {
        return a-b;
    }

    @Override
    public double division(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("pas diviser sur 0");
        return a / b;
    }
}
