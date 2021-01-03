package com.company.Webshop;

public class Kunde
{
    //Attrribute

    private int kundenNummer;
    private String kundenName;
    private String kundenNachname;
    private String versandAdresse;
    private String rechnungsAdresse;

    //Konstruktor

    public Kunde (int kundenNummer, String kundenName, String kundenNachname, String versandAdresse, String rechnungsAdresse)
    {
        this.kundenNummer = kundenNummer;
        this.kundenName = kundenName;
        this.kundenNachname = kundenNachname;
        this.versandAdresse = versandAdresse;
        this.rechnungsAdresse = rechnungsAdresse;

    }
    //Methoden

    public void BestellungErstellen()
    {
	    	            com.company.Webshop.Warenkorb warenkorb1 = new com.company.Webshop.Warenkorb();
    }


    public void BestellungAendern()
    {
        for (int i = 0; i < inhaltWarenkorb.length; i++) 												//Prüfung ob ein Feld (Artikelnummer, Artikelmenge) leer ist
			{							
			for (int j = 0; j < inhaltWarenkorb.length; j++) 
				if(inhaltWarenkorb[i][j] == 0) {														
					inhaltWarenkorb[i][j] = artikelnummer;
                   			inhaltWarenkorb[i][j + 1] = menge;	
				}
    }


    public void BestellungAusloesen()
    {
	           
    }


    public void KundendatenAendern()
    {
    }



    //getter
    public int getKundenNummer()
    {
        return kundenNummer;
    }

    public String getKundenName()
    {
        return kundenName;
    }

    public String getKundenNachname()
    {
        return kundenNachname;
    }

    public String getVersandAdresse()
    {
        return versandAdresse;
    }

    public String getRechnungsAdresse()
    {
        return rechnungsAdresse;
    }
    //

    //setter

    public void setKundenName(String kundenName)
    {
        this.kundenName = kundenName;
    }

    public void setKundenNachname(String kundenNachname)
    {
        this.kundenNachname = kundenNachname;
    }

    public void setRechnungsAdresse(String rechnungsAdresse)
    {
        this.rechnungsAdresse = rechnungsAdresse;
    }

    public void setVersandAdresse(String versandAdresse)
    {
        this.versandAdresse = versandAdresse;
    }
}
