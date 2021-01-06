package com.company.Webshop;

public class Bestellpositionspruefung extends Warenkorb{
	
		public void leererwarenkorb(String[] args){
		
		//Abbruch Prüfung für leeren Warenkorb 	
			
		public boolean leererwarenkorbb(){   // prueft ob die Menge leer ist

			   for(int i = 0; i< inhaltWarenkorb.length;i++)
			   	{
				   for (int j = 0; j < inhaltWarenkorb.length;j++) 
				   	{
					   if(inhaltWarenkorb[i][j] != 0){
						   return false;
					 }
				   }
			 	}
			   	return true;												
		}
		
		public void pruefungverschiedeneartikel(String[] args) {
		
		//Es dürfen nur 100 Artikel im Warenkorb sein, Artikelmenge ist dabei egal
		
		if(inhaltWarenkorb.length > 100)																//Länge des Arrays wird geprüft
			System.out.println("Es wurden zu viele Artikel bestellt. Passen Sie den Warenkorb an!");
		}
	
}
 
