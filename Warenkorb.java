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



    //setter
    public void setArtikelmenge(int artikelmenge) {
        this.artikelmenge = artikelmenge;
    }

}
