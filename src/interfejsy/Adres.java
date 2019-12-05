package interfejsy;

class Adres
{
    String ulica;
    int nrDomu;
    int kodPocztowyPierwszaCzesc;
    int kodPocztowyDrugaCzesc;
    String miasto;
    String panstwo;
    String wojewodztwo;

    public Adres(String ulica, int nrDomu, int kodPocztowyPierwszaCzesc, int kodPocztowyDrugaCzesc, String miasto, String wojewodztwo, String panstwo)
    {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.kodPocztowyPierwszaCzesc = kodPocztowyPierwszaCzesc;
        this.kodPocztowyDrugaCzesc = kodPocztowyDrugaCzesc;
        this.miasto = miasto;
        this.panstwo = panstwo;
        this.wojewodztwo = wojewodztwo;
    }
}
