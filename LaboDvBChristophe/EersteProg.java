import java.lang.*;

public class EersteProg
{
	/**
	* COMMENT
	*/

	
	public static void main (String args[])
	{
        
        Werknemer Sleepy = new Werknemer("Sleepy", "Dwarf", 1, 1000.0f);
        Werknemer Grumpy = new Werknemer("Grumpy", "Dwarf", 2, 1002.0f);
        Werknemer Doc = new Werknemer("Doc", "Dwarf", 3, 1003.0f);
        Werknemer Happy = new Werknemer("Happy", "Dwarf", 4, 1004.0f);
        
        Sleepy.SalarisVerhogen(5); 
        Grumpy.SalarisVerhogen(5);
        
        Sleepy.setRSZ(10.0f);
        float sleepyRSZ = Sleepy.getRSZ();
        
        
        System.out.println("Sleepy salaris = " + Sleepy.salaris + " \n" 
            + "Grumpy salaris = " + Grumpy.salaris + " \n" 
            + "Doc salaris = " + Doc.salaris + " \n" 
            + "Happy salaris = " + Happy.salaris);
        
        System.out.println("Sleepy betaald " + sleepyRSZ + " RSZ");
        
        PartTimeWerknemer Stitch = new PartTimeWerknemer("Stitch", "Experiment", 626, 626.0f, 62);
        PartTimeWerknemer Lilo = new PartTimeWerknemer("Lilo", "Ohana", 1, 1000.0f, 10);
        
        Stitch.SalarisVerhogen(5);
        
        System.out.println("\nStitch voornaam = " + Stitch.voornaam + " \n" 
            + "Stitch achternaam = " + Stitch.achternaam + " \n" 
            + "Stitch werknemerNummer = " + Stitch.werknemerNummer + " \n" 
            + "Stitch salaris = " + Stitch.salaris 
            +  " \n" + "Stitch aantal uren gewerkt = " + Stitch.aantalUrenGewerkt);
        
        System.out.println("\nLilo voornaam = " + Lilo.voornaam + " \n" 
            + "Lilo achternaam = " + Lilo.achternaam + " \n" 
            + "Lilo werknemerNummer = " + Lilo.werknemerNummer + " \n" 
            + "Lilo salaris = " + Lilo.salaris 
            +  " \n" + "Lilo aantal uren gewerkt = " + Lilo.aantalUrenGewerkt);
        
        
        StudentWerknemer Tinyck = new StudentWerknemer("Tinyck", "Da Costa", 11, 1000.0f, 11);
        float tinyckRSZ = Tinyck.getRSZ();
        
        System.out.println("\nTinyck betaald " + tinyckRSZ + " RSZ");
        
        Betaalbaar betDingen[] = new Betaalbaar[3];
        betDingen[0] = Sleepy;
        betDingen[1] = Stitch;
        betDingen[2] = Tinyck;
        
        //betDingen[1] = new Factuur(); //nieuwe klasse
        
        for(int k = 0; k<betDingen.length; k++)
        {
            betDingen[k].Betaal();
        }
        
		//int a; 
		//System.out.println("Hello World");
		//drukaf(100);
		//Oef1();
		//Oef2();
		//Oef3(10000);
        //Oef3Manier2();
        //Oef4();
        Oef5();
        //Oef6();
	}

	private static void drukaf(int m)
	{
		int a;
		for (a=0; a<m; a++)
		{
			System.out.println(a);
		}
	}

	private static void Oef1()
	{
		for( int x=0; x<=9; x++)
		{
			for(int z=0; z<=9; z++)
			{
				System.out.println(x + "X" + z + "=" + x*z);
			}	
		
		}		
	}

	private static void Oef2()
	{
		int weekdag =0;
		for( int dag =1; dag <29; dag++)
		{
			if(weekdag==0) System.out.print("zon");
			if(weekdag==1) System.out.print("maan");
			if(weekdag==2) System.out.print("dins");
			if(weekdag==3) System.out.print("woens");
			if(weekdag==4) System.out.print("donder");
			if(weekdag==5) System.out.print("vrij");
			if(weekdag==6) System.out.print("zater");
			weekdag++;
			if(weekdag>6) weekdag = 0;
			System.out.println("dag "+dag+" februari 2009");
		}
	}

	private static void Oef3(int n)
	{	
		double sequenceFormula = 0;
	
        for(int counter = 1; counter < n; counter += 2) {

		sequenceFormula = sequenceFormula + 
            ((1.0 / (2.0 * counter - 1)) - (1.0 / (2.0 * counter + 1)));
	}
        
	double pi = 4 * sequenceFormula;
	System.out.println( pi);
	}
    
    private static void Oef3Manier2()
    {
        double pi= 0.0;

	        for (int i =1; i<=100000;i++)
		{
			double num = (Math.pow(-1.0,i+1.0) / ((i * 2.0) - 1.0));
			pi= pi+ num;
	        }
		System.out.println(4*pi);
    }
    
    private static void Oef4()
    {
        int number = 4302;
        System.out.println(~number + 00000001);
    }
    
    private static void Oef5()
    {
        boolean notPrime = false;
        for(int i=3;i<100;i++){
         notPrime = false;
        for(int deler = 2; deler < i;deler++){
        if(i%deler == 0){
            notPrime = true;
        }
           }
        if(notPrime == true){
          System.out.println(i + " is NOT a prime number");  
    }
        else if(notPrime == false){
            System.out.println(i + " is a prime number"); 
        }
    }
        
    }
    
    private static void Oef6()
    {
        
    }

	

	


}