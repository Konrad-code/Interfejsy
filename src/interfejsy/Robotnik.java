package interfejsy;

class Robotnik
{
    String imie;
    String nazwisko;
    Adres adres;            // Przyklad agregacji

    public Robotnik(String imie, String nazwisko, Adres adres)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;        
        this.adres = adres;
    }

    @Override
    public String toString()
    {
        return "Imię: " + this.imie + " ||| Nazwisko: " + this.nazwisko + " ||| Adres: " + adres.ulica + " " + adres.nrDomu + ", " + adres.kodPocztowyPierwszaCzesc + "-" + adres.kodPocztowyDrugaCzesc + " " + adres.miasto + " ||| " + adres.wojewodztwo + ", " + adres.panstwo;
    }
}
