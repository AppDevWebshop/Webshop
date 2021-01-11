package com.company.Webshop;
import com.company.Warenkorb;

public class Bestellung {


    //Attribute
    private double preisDerBestellung;
    private double versandKosten;


    //Konstruktor
    public Bestellung() {
    }


    //Methoden
    public void sendeBestellbestaetigung(int preisDerBestellung) {
        if (preisDerBestellung <= 20)
            versandKosten = 5.95;

        else if (preisDerBestellung > 20 & preisDerBestellung <= 50)
            versandKosten = 2.95;

        else if (preisDerBestellung > 50)
            versandKosten = 0;

        else System.out.println("Fehler");

        System.out.println("Ihre Bestellung war erfolgreich. Ihre Rechnungsumme beträgt " + (versandKosten + preisDerBestellung) + "€");
        System.out.println("Ihre Lieferadresse lautet:");

    }

}
