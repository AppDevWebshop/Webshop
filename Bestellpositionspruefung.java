package com.company.Webshop;

public class Bestellpositionspruefung extends Warenkorb{
	
	public static void main(String[] args) {
	}
		public void leererwarenkorb(String[] args){
		
		for (int i = 0; i < inhaltWarenkorb.length; i++) 
		{							
			for (int j = 0; j < inhaltWarenkorb.length; j++) 
				if(inhaltWarenkorb[i][j] == 0) {														//Abbruch Prüfung für leeren Warenkorb (muss noch mit Array angepasst werden)
					System.out.println("Der Warenkorb enthält eine leere Artikelmenge. Prüfen Sie den Warenkorb!");	
				}
		}
		}
		
		public void pruefungverschiedeneartikel(String[] args) {
		
		//Es dürfen nur 100 Artikel im Warenkorb sein, Menge ist dabei egal
		
		if(inhaltWarenkorb.length > 100)																//Länge des Arrays wird geprüft
			System.out.println("Es wurden zu viele Artikel bestellt. Passen Sie den Warenkorb an!");
	}
	
}


