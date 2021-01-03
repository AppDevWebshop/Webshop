package com.company.Webshop;

public class Bestellpositionspruefung extends Warenkorb{
	
		public void leererwarenkorb(String[] args){
		
		//Abbruch Prüfung für leeren Warenkorb 	
			
		for (int i = 0; i < inhaltWarenkorb.length; i++) 												//Prüfung ob ein Feld (Artikelnummer, Artikelmenge) leer ist
			{							
			for (int j = 0; j < inhaltWarenkorb.length; j++) 
				if(inhaltWarenkorb[i][j] == 0) {														
					System.out.println("Der Warenkorb enthält eine leere Felder. Prüfen Sie den Warenkorb!");	
				}
			}
		}
		
		public void pruefungverschiedeneartikel(String[] args) {
		
		//Es dürfen nur 100 Artikel im Warenkorb sein, Artikelmenge ist dabei egal
		
		if(inhaltWarenkorb.length > 100)																//Länge des Arrays wird geprüft
			System.out.println("Es wurden zu viele Artikel bestellt. Passen Sie den Warenkorb an!");
		}
	
}
 
