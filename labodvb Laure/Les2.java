import java.lang.*;
    
public class Les2{
    public static void main( String args[]){
        Werknemer Stitch = new Werknemer ("Stitch", "Experiment", 626, 626000);
        Werknemer Angel = new Werknemer ("Angel", "Experiment", 624, 624000);
        Werknemer Ruben = new Werknemer ("Ruben", "Experiment", 625, 625000);
        Werknemer Leroy = new Werknemer ("Leroy", "Experiment", 627, 1);
        
        Angel.salarisVerhogen(10);
        Stitch.salarisVerhogen(10);
        
        System.out.println(Stitch.voornaam + " " + Stitch.achternaam + " " + Stitch.werknemerNummer + " " + Stitch.salaris);
        System.out.println(Angel.voornaam + " " + Angel.achternaam + " " + Angel.werknemerNummer + " " + Angel.salaris);
        System.out.println(Ruben.voornaam + " " + Ruben.achternaam + " " + Ruben.werknemerNummer + " " + Ruben.salaris);
        System.out.println(Leroy.voornaam + " " + Leroy.achternaam + " " + Leroy.werknemerNummer + " " + Leroy.salaris);
        
        
        PartTimeWerknemer Lilo = new PartTimeWerknemer ("Lilo", "Ohana", 1, 10000, 7);
        PartTimeWerknemer Nani = new PartTimeWerknemer ("Nani", "Ohana", 2, 12484, 21);
        
        Lilo.salarisVerhogen(10);
        
        System.out.println(Lilo.voornaam + " " + Lilo.achternaam + " " + Lilo.werknemerNummer + " " + Lilo.salaris + " " + Lilo.aantalUrenGewerkt);
        System.out.println(Nani.voornaam + " " + Nani.achternaam + " " + Nani.werknemerNummer + " " + Nani.salaris + " " + Nani.aantalUrenGewerkt);
        
       
         Stitch.setRSZ(10);
        float StitchRSZ = Stitch.getRSZ();
        float AngelRSZ = Angel.getRSZ();
        
        System.out.println("Stitch pays : " + StitchRSZ);
        System.out.println("Angel pays : " + AngelRSZ);
        
        StudentWerknemer Plieklie = new StudentWerknemer("Plieklie", "Alien", 3, 6485, 154);
	
    float PlieklieRSZ = Plieklie.getRSZ();
        
        System.out.println("Plieklie pays : " + PlieklieRSZ);
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}