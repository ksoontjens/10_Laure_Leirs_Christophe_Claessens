import java.lang.*;

public class EersteProg{ /** 
*naam moet hetzelfde zijn als documentnaam



*roept methode op
*/
public static void main( String args[]){

	oef6();
}

private static void drukaf (int m)
{
int a;
for (a=0; a<m; a++){
System.out.println(a);
}
}


private static void oef1()
{
for(int tafel1 = 1; tafel1 < 10; tafel1++){
for(int tafel2 = 1; tafel2 < 10; tafel2++){
System.out.println(tafel1 +  "x" + tafel2 + "=" + tafel1*tafel2);
}
}
}

private static void oef2()
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



private static void oef3(){
double pi= 0.0;

	        for (int i =1; i<=100000;i++)
		{
			double num = (Math.pow(-1.0,i+1.0) / ((i * 2.0) - 1.0));
			pi= pi+ num;
	        }
		System.out.println(4*pi);
}
private static void oef4(){
        int number = 4302;
        number = ~number + 00000001;
       System.out.println(number);
    }

private static void oef5(){
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
    
    private static void oef6(){
    
    
    
    
    
    
    
    
    
    
    
    
    
}
