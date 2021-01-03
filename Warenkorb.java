package com.company.Webshop;

public class Warenkorb {

    //Attribute

    public  int artikelmenge;
    public int[][] inhaltWarenkorb;


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

    
    //setter
    public void setArtikelmenge(int artikelmenge) {
        this.artikelmenge = artikelmenge;
    }

}
