public class PartTimeWerknemer extends Werknemer{
 
    public int aantalUrenGewerkt;
    
    public PartTimeWerknemer(String voornaam, String achternaam, int wNum, float salaris, int aantalUren){
        super(voornaam, achternaam, wNum, salaris);
        this.aantalUrenGewerkt = aantalUren;
        setRSZ(5f);
        
    }
    
    public float getWeekLoon(){
     return aantalUrenGewerkt*salaris; 
    }
    
    public void salarisVerhogen (int percentage){
     if (percentage > 5){
         percentage = 0;
         System.out.println("Fout: slechts 5% opslag toegestaan");
     }
        else{
         super.salarisVerhogen(percentage);   
        }

      
         
     }
    }
    
    
    
    

