public class StudentWerknemer extends PartTimeWerknemer
{   
    public StudentWerknemer(String iVoornaam, String iAchternaam, int iWerknemerNummer, float iSalaris, int iAantalUren)
    {
        super(iVoornaam, iAchternaam, iWerknemerNummer, iSalaris, iAantalUren);
        setRSZ(5.0f);
    }
}