package com.company.Webshop;

public class Bestellung {

    //Attribute

    private double preisDerBestellung;
    private double versandKosten;
    public int artikelnummer;
    public int artikelmenge;

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

    public void sendeBestellbestätigung(){
        System.out.println("Ihre Bestellung war erfolgreich. Ihre Rechnungssumme beträgt " + (versandKosten+preisDerBestellung) + "€.");

    }


    //getter
    public double getVersanddKosten() {
        return versandKosten;
    }
    
     public int getArtikelnummer() {
        return artikelnummer;
    }
    
     public int getArtikelmenge() {
        return artikelmenge;
    }
    //

    //setter
    public void setPreisDerBestellung(double preisDerBestellung) {
        this.preisDerBestellung = preisDerBestellung;
    }
}   //

