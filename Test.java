package com.company.Webshop;

public class Test {

    public static void main(String[] args) {
        //10 Artikel anlegen
        Artikel artikel1 = new Artikel("Der Heimweg", 2628, 22.99);
        Artikel artikel2 = new Artikel("Anette, ein Heldinnenepos",5757,22.00);
        Artikel artikel3 = new Artikel("Funkenmord",5008,22.00);
        Artikel artikel4 = new Artikel("Kingsbridge. Der Morgen einer neuen Zeit.",8572,36.00);
        Artikel artikel5 = new Artikel("Männer in Kamelhaarmänteln",4629,22.00);
        Artikel artikel6 = new Artikel("Hamster im hinteren Stromgebiet",6200,24.00);
        Artikel artikel7 = new Artikel("QualityLand 2.0",5021,19.00);
        Artikel artikel8 = new Artikel("Der Gesang der Flusskrebse",4626,19.00);
        Artikel artikel9 = new Artikel("Und die Welt war jung",6340,22.00);
        Artikel artikel10 = new Artikel("Ada",5020,24.00);


        Kunde kunde1 = new Kunde(567983, "Erich", "Kästner",
                "Appellhofplatz 1, 50667 Köln", "Appellhofplatz 1, 50667 Köln");

        Kunde kunde2 = new Kunde(432876,"Heinz","Erhardt",
                "An Fürthenrode 9, 52511 Geilenkirchen","An Fürthenrode 9, 52511 Geilenkirchen");


        //Kunde 1

        kunde1.artikelHinzufuegen(2628,5);
        kunde1.artikelHinzufuegen(5757,9);
        kunde1.artikelHinzufuegen(5020,1);
        kunde1.artikelHinzufuegen(6340,2);




        kunde1.artikelAendern(5757,5);
        kunde1.artikelEntfernen(2628);
        //kunde1.zeigeWarenkorb();



        //Kunde 2
        kunde2.artikelHinzufuegen(5021,8);
        kunde2.artikelHinzufuegen(6340,1);

        kunde2.setVersandAdresse("Neue Straße 3, 52511 Geilenkrichen");
        //kunde2.zeigeWarenkorb();
        //kunde2.getVersandAdresse();




    }
}
