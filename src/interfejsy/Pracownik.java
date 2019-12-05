package interfejsy;

public class Pracownik implements testInterface, Comparable     // Implementacja 2 interfejsow do klasy Pracownik.
{
    private double wynagrodzenie = 1500;
    
    Pracownik()
    {
        
    } 
    
    @Override
    public void cos() {
       // Implementacja metody narzucona przez zaimplementowanie interfejsu "testInterface" do klasy Pracownik.
    }
    
    public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }
    
    public void setWynagrodzenie(double nowaPensja)
    {
        this.wynagrodzenie = nowaPensja;
    }

    @Override                                   // Implementacja metody narzucona przez zaimplementowanie interfejsu "Comparable" do klasy Pracownik.
    public int compareTo(Object o)              // Metoda porównuje atrybut "wynagrodzenie" między instancjami poprzez getter "getWynagrodzenie" i zwraca wartość analogicznie do implementacji zaleconej w dokumentacji.
    {
        Pracownik przyslany = (Pracownik)o;     // Downcasting instancji klasy Object do klasy Pracownik.
        if(this.getWynagrodzenie() > ((Pracownik)przyslany).getWynagrodzenie())     // Late binding (zrzutowanej w dół instancji "przyslany" interfejsu "testInterface" do klasy Pracownik) za pomocą gettera "getWynagrodzenie".     
            return 1;
        else if(this.getWynagrodzenie() < ((Pracownik)przyslany).getWynagrodzenie())
            return -1;
        else
            return 0;
    }
    
}
