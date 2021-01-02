package com.company.Webshop;

public class Warenkorb {

    //Attribute

    private  int artikelmenge;
    private int[][] inhaltWarenkorb;


    //Konstruktor
    public Warenkorb(){
        inhaltWarenkorb=new int[100][2];

    }

    //Methoden


    //Arrayinhalt anzeigen lassen
    public void printArray(){
        for(int i=0; i<inhaltWarenkorb.length; i++)
        {
            for(int j=0; j<inhaltWarenkorb[i].length; j++)
                System.out.print(inhaltWarenkorb[i][j]+ " ");
            System.out.println();
        }
    }

    //Arrayinhalt anpassen
    public void setInhaltWarenkorb(int artikelnummer, int menge) {
        for (int i = 0; i < inhaltWarenkorb.length; i++) {

            for (int j = 0; j < inhaltWarenkorb[i].length; j++) {
                if (inhaltWarenkorb[i] == null) {
                    inhaltWarenkorb[i][j] = artikelnummer;
                    inhaltWarenkorb[i][j + 1] = menge;
                    break;
                }
                else {
                    System.out.println("test");
                    break;
                }

            }
            //printArray();
            break;
        }
    }
    //setter
    public void setArtikelmenge(int artikelmenge) {
        this.artikelmenge = artikelmenge;
    }

}
