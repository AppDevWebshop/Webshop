package com.company.Webshop;

public class Kunde
{
    //Attrribute
    private int kundenNummer;
    private String kundenName;
    private String kundenNachname;
    private String versandAdresse;
    private String rechnungsAdresse;
    private Warenkorb warenkorb = new Warenkorb();
    private int artikelMenge;



    //Konstruktor
    public Kunde (int kundenNummer, String kundenName, String kundenNachname, String versandAdresse, String rechnungsAdresse)
    {
        this.kundenNummer = kundenNummer;
        this.kundenName = kundenName;
        this.kundenNachname = kundenNachname;
        this.versandAdresse = versandAdresse;
        this.rechnungsAdresse = rechnungsAdresse;
    }


    //Methoden


   //Artikel zum Warenkorb hinzufügen
   public int artikelHinzufuegen(int artikelNummer, int artikelMenge)
   {
       warenkorb.setInhaltWarenkorb(artikelNummer,artikelMenge);
       this.artikelMenge = this.artikelMenge + artikelMenge;
       //System.out.println(this.artikelMenge);
       return this.artikelMenge;
   }


   //Artikel aus dem Warenkorb entfernen
   public void artikelEntfernen(int ariktelNummer)
   {
       warenkorb.loescheArtikel(ariktelNummer);
   }


    //Ändere Anzahl Artikel im Warenkorb
    public void artikelAendern(int ariktelNummer, int artikelMenge)
    {
        warenkorb.aendereAnzahl(ariktelNummer,artikelMenge);
    }


    //Warenkorb ausgeben
    public void zeigeWarenkorb()
    {
        warenkorb.printArray();
    }


   //Bestellung auslösen
   public void bestellungAusloesen()
    {
        int preisBestellung = artikelMenge * 10;
        new Bestellung().sendeBestellbestaetigung(preisBestellung);
        System.out.println(versandAdresse);
        System.out.println("Vielen Dank für Ihren Einkauf!");
        System.out.println();
    }


    //Versandadresse ändern
    public void setVersandAdresse(String versandAdresse)
    {
        this.versandAdresse = versandAdresse;
    }


    //Versanadresse weitergeben
    public String getVersandAdresse()
    {
        System.out.println(versandAdresse);
        return versandAdresse;
    }



}
