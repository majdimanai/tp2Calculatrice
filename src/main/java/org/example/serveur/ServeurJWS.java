package org.example.serveur;

import jakarta.xml.ws.Endpoint;
import org.example.service.Calculatrice;

public class ServeurJWS {
    public static void main(String[] args) {
        String url="http://localhost:8084/";
        Endpoint.publish(url, new Calculatrice());
        System.out.println(url);

    }
}
