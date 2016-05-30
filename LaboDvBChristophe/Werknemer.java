public class Werknemer implements Betaalbaar
{
    public String voornaam;
    public String achternaam;
    public int werknemerNummer;
    protected float salaris;
    private float RSZPercentage = 33.0f;
    
    public Werknemer(String initVoornaam, String initAchternaam, int werknemerNummer, float initSalaris)
    {
        voornaam = initVoornaam;
        achternaam = initAchternaam;
        this.werknemerNummer = werknemerNummer; //this verwijst naar klasse, dit doen omdat argument van CTR hetzelfde geschreven is.
        salaris = initSalaris;
    }
    
    public void SalarisVerhogen(int perc)
    {
        salaris+=salaris*(perc/100.0);
    }
    
    public float GetSalaris() //soort van readOnly
    {
        return salaris;
    }
    
    public void setRSZ(float RSZ)
    {
        if(RSZ>100)
        {
            System.out.println("Fout!");
        }
        RSZPercentage = RSZ;
    }
    
    public float getRSZ()
    {
        return RSZPercentage;
    }
    
    public void Betaal()
    {
        System.out.println("Betaal " + salaris + " aan " + voornaam);
    }
    
    
}