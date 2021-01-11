package com.company.Webshop;

public class Warenkorb {

    //Attribute
    private int postenZaehler = 0;
    //private int artikelmenge;
    private int[][] inhaltWarenkorb;


    //Konstruktor
    public Warenkorb() {
        inhaltWarenkorb = new int[100][2];

    }


    //Methoden
    public int setInhaltWarenkorb(int artikelnummer, int menge) {
        //postenZaehler = this.postenZaehler;
        for (int i = 0; i < inhaltWarenkorb.length; i++) {
            for (int j = 0; j < inhaltWarenkorb[i].length; j++)

                if (inhaltWarenkorb[i][j] == 0) {
                    inhaltWarenkorb[i][j] = artikelnummer;
                    inhaltWarenkorb[i][j + 1] = menge;
                    break;
                } else {
                    postenZaehler++;
                    inhaltWarenkorb[i + postenZaehler][j] = artikelnummer;
                    inhaltWarenkorb[i + postenZaehler][j + 1] = menge;
                    break;
                }
            break;
        }
        return postenZaehler;
    }


    //Artikel aus Array löschen
    public void loescheArtikel(int artikelNummer) {

        for (int i = 0; i < inhaltWarenkorb.length; i++) {
            for (int j = 0; j < inhaltWarenkorb[i].length; j++)
                if (inhaltWarenkorb[i][j] == artikelNummer) {
                    inhaltWarenkorb[i][j] = 0;
                    inhaltWarenkorb[i][j + 1] = 0;
                    break;
                }
        }
    }


    //Anzahl eines Artikels im Array ändern
    public void aendereAnzahl(int artikelNummer, int menge) {

        for (int i = 0; i < inhaltWarenkorb.length; i++) {
            for (int j = 0; j < inhaltWarenkorb[i].length; j++)

                if (inhaltWarenkorb[i][j] == artikelNummer) {
                    inhaltWarenkorb[i][j + 1] = menge;
                    break;
                }
        }
    }



        //Arrayinhalt anzeigen lassen
        public void printArray () {
            for (int i = 0; i < inhaltWarenkorb.length; i++) {
                for (int j = 0; j < inhaltWarenkorb[i].length; j++)
                    System.out.print(inhaltWarenkorb[i][j] + " ");
                System.out.println();

            }
        }



}
