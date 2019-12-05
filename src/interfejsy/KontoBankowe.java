package interfejsy;

public class KontoBankowe
{
    private double stanKonta;

    public KontoBankowe(double stanKonta)
    {
        this.stanKonta = stanKonta;
    }
    
    double getStanKonta()
    {
        return this.stanKonta;
    }
    
    void stworzKonto(double stopa)                      // Modyfikacja przesyłanego argumentu "stopa" do statusu final pozwoliloby lokalnej klasie poslugiwac sie nim. Nie trzeba przesylac jej do metody "zmienStanKonta".
    {
        class Odsetki                                   // Lokalna klasa metody.
        {
            private double stopaProcentowa;        

            public Odsetki(double stopaProcentowa)
            {
                this.stopaProcentowa = stopaProcentowa;
                //if(minal miesiac/rok)
                this.zmienStanKonta(stopaProcentowa);
            }

            void zmienStanKonta(double stopa)
            {
                double odsetki = (stanKonta * stopa) / 100;
                stanKonta += odsetki;
            }
        }
        
        Odsetki odsetki = new Odsetki(stopa);
    }
    
    
}
