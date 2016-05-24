import java.lang.*;

public class Werknemer{
 
    public String voornaam;
    public String achternaam;
    public int werknemerNummer;
    protected float salaris;
    private float RSZpercentage = 33f;
        
    public Werknemer(String voornaam, String achternaam, int wNummer, float salaris){
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        werknemerNummer = wNummer;
        this.salaris = salaris;
    }
    
    public void salarisVerhogen(int perc){
        salaris += salaris*(perc/100.0);
    }
    
    public float getSalaris(){
     return salaris;   
    }
    
    public void setRSZ(float RSZ){
       if(RSZ<100){
           RSZpercentage = RSZ;
    }
    }
    
    public float getRSZ(){
     return RSZpercentage;   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}