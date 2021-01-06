package com.company.Webshop;

public class Bestellpositionspruefung extends Warenkorb{
		
		//Abbruch Prüfung für leeren Warenkorb 	
			
		public boolean leererwarenkorb(){   						//Prüfung ob ein Feld (Artikelnummer, Artikelmenge) leer ist
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
		}
 
