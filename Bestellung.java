package com.company.Webshop;

public class Bestellung {

    //Attribute

    private double preisDerBestellung;
    private double versandKosten;



    //Konstruktor

   public Bestellung(){
    }



    //Methoden

    public void berechnungVersandkosten(){
        if (preisDerBestellung <= 20 )
            versandKosten = 5.95;

        else if ( preisDerBestellung>20 & preisDerBestellung<=50 )
            versandKosten = 2.95;

        else if (preisDerBestellung > 50)
            versandKosten = 0;

        else System.out.println("Fehler");
    }

    public void sendeBestellbest�tigung(){
        System.out.println("Ihre Bestellung war erfolgreich. Ihre Rechnungssumme betr�gt " + (versandKosten+preisDerBestellung) + "�.");

    }


    //getter
    public double getVersandKosten() {
        return versandKosten;
    }
    //

    //setter
    public void setPreisDerBestellung(double preisDerBestellung) {
        this.preisDerBestellung = preisDerBestellung;
    }
}   //

