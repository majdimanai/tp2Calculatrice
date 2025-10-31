package org.example.client;

import org.example.service.ICalculatrice;
import jakarta.xml.ws.Service;
import javax.xml.namespace.QName;
import java.net.URL;

public class CalculatriceClient {
    public static void main(String[] args) throws Exception {
        URL urlwsdl = new URL("http://localhost:8084/?wsdl");


        QName serviceQName = new QName("http://service.example.org/", "CalculatriceService");


        Service service = Service.create(urlwsdl, serviceQName);


        QName portQName = new QName("http://service.example.org/", "CalculatricePort");

        ICalculatrice proxy = service.getPort(portQName, ICalculatrice.class);


        System.out.println("somme : " + proxy.somme(2, 5));
        System.out.println("multiplication : " + proxy.multiplication(3, 4));
        System.out.println("division : " + proxy.division(10, 2));
        System.out.println("soustraction : " + proxy.soustraction(9, 2));
    }
}
