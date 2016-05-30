public class PartTimeWerknemer extends Werknemer
{
    int aantalUrenGewerkt;
    
    public PartTimeWerknemer(String iVoornaam, String iAchternaam, int iwerknemerNummer, float iSalaris, int aantalUren)
    {
        super(iVoornaam, iAchternaam, iwerknemerNummer, iSalaris);
        //zelfde args als CTR hierboven
        aantalUrenGewerkt = aantalUren;            
    }
    
    
    public float getWeekLoon()
    {
        return aantalUrenGewerkt*salaris;
    }
    
    public void SalarisVerhogen(int perc)
    {
        if(perc >5)
        {
            perc=0;
            System.out.println("Fout: slechts 5% opslag toegestaan");
        }
        else
        {
            super.SalarisVerhogen(perc); //superklasse methode oproepen 
        }
            
        
    }
    
    
}