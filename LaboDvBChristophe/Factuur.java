public class Factuur implements Betaalbaar
{
    int factuurNummer;
    int factuurBedrag;
    
    public void Betaal()
    {
        System.out.println("Betaal het factuur " + factuurNummer + " voor het bedrag van " + salaris);
    }
    
}