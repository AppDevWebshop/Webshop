package com.company.Webshop;

public class Artikel {

    //Attribute

    private String artikelBezeichnung;
    public int artikelNummer;
    private double preis;

    //Konstruktor

    public Artikel(String artikelBezeichnung, int artikelNummer, double preis) {
        this.artikelBezeichnung = artikelBezeichnung;
        this.artikelNummer = artikelNummer;
        this.preis = preis;
    }


    //Methoden






    //getter
    public String getArtikelBezeichnung(){
        return artikelBezeichnung;
    }

    public int getArtikelNummer() {
        return artikelNummer;
    }

    public double getPreis() {
        return preis;
    }
    //

    //setter
}
