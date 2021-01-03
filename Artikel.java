package com.company.Webshop;

public class Artikel {

    //Attribute

    private String artikelbezeichnung;
    public int artikelnummer;
    private double preis;

    //Konstruktor

    public Artikel(String artikelbezeichnung, int artikelnummer, double preis) {
        this.artikelbezeichnung = artikelbezeichnung;
        this.artikelnummer = artikelnummer;
        this.preis = preis;
    }


    //Methoden






    //getter
    public String getArtikelbezeichnung(){
        return artikelbezeichnung;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public double getPreis() {
        return preis;
    }
    //

    //setter
}
