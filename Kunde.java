package com.company.Webshop;

public class Kunde
{
    //Attrribute

    private int kundenNummer;
    private String kundenName;
    private String kundenNachname;
    private String versandAdresse;
    private String rechnungsAdresse;
    Warenkorb warenkorb = new Warenkorb();




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
   public void artikelHinzufuegen(int artikelNummer, int artikelMenge)
   {
       warenkorb.setInhaltWarenkorb(artikelNummer,artikelMenge);
   }


   //Artikel aus dem Warenkorb entfernen
   public void artikelEntfernen(int ariktelNummer)
   {
       warenkorb.löscheArtikel(ariktelNummer);
   }


    //Ändere Anzahl Artikel im Warenkorb
    public void artikelAendern(int ariktelNummer, int artikelMenge)
    {
        warenkorb.ändereAnzahl(ariktelNummer,artikelMenge);
    }


    //Warenkorb ausgeben
    public void zeigeWarenkorb()
    {
        warenkorb.printArray();
    }


   //Bestellung auslösen
   public void bestellungAusloesen()
    {

        new Bestellung().berechnungVersandkosten();
        new Bestellung().sendeBestellbestätigung();
    }


    //Versandadresse ändern
    public void setVersandAdresse(String versandAdresse)
    {
        this.versandAdresse = versandAdresse;
    }


    //Versanadresse weitergeben
    public String getVersandAdresse()
    {
        return versandAdresse;
    }



}
