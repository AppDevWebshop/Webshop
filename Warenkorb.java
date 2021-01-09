package com.company.Webshop;

public class Warenkorb {

    //Attribute

    private  int k = 0;
    private int artikelmenge;
    protected int[][] inhaltWarenkorb;


    //Konstruktor
    public Warenkorb() {
        inhaltWarenkorb = new int[5][2];

    }

    //Methoden

    public int setInhaltWarenkorb(int artikelnummer, int menge) {

        k= this.k;
        for (int i = 0; i < inhaltWarenkorb.length; i++) {
            for (int j = 0; j < inhaltWarenkorb[i].length; j++)

                if (inhaltWarenkorb[i][j] == 0) {
                    inhaltWarenkorb[i][j] = artikelnummer;
                    inhaltWarenkorb[i][j+1] = menge;
                    break;
                }

                else  {
                    k++;
                    //System.out.println("Test");
                    inhaltWarenkorb[i+k][j] = artikelnummer;
                    inhaltWarenkorb[i+k][j+1] = menge;
                    break;
                }

            break;

        }

        //printArray();
        //System.out.println(k);
        return k;
    }


    public void löscheArtikel(int artikelNummer) {


        for (int i = 0; i < inhaltWarenkorb.length; i++) {
            for (int j = 0; j < inhaltWarenkorb[i].length; j++)

                if (inhaltWarenkorb[i][j] == artikelNummer) {
                    inhaltWarenkorb[i][j] = 0;
                    inhaltWarenkorb[i][j + 1] = 0;
                    //printArray();
                    break;

                }

        }
    }


    public void ändereAnzahl(int artikelNummer, int menge){

        for (int i = 0; i < inhaltWarenkorb.length; i++) {
            for (int j = 0; j < inhaltWarenkorb[i].length; j++)

                if (inhaltWarenkorb[i][j] == artikelNummer) {
                    inhaltWarenkorb[i][j + 1] = menge;
                    //printArray();
                    break;

                }

        }
    }



        //Arrayinhalt anzeigen lassen
        public void printArray () {
            for(int i=0; i<inhaltWarenkorb.length; i++)
            {
                for(int j=0; j<inhaltWarenkorb[i].length; j++)
                    System.out.print(inhaltWarenkorb[i][j]+ " ");
                System.out.println();

            }
        }


        //setter
        public void setArtikelmenge ( int artikelmenge){
            this.artikelmenge = artikelmenge;
        }

    }

