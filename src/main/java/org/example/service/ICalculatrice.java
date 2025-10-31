package org.example.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface ICalculatrice {
@WebMethod
    public double somme(@WebParam double a ,@WebParam double b);
    @WebMethod
    double multiplication(@WebParam double a,@WebParam double b);

    @WebMethod
    double soustraction(@WebParam double a,@WebParam double b);

    @WebMethod
    double division(@WebParam double a,@WebParam double b);

}
