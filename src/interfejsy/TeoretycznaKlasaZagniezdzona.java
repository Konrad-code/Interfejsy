package interfejsy;

public class TeoretycznaKlasaZagniezdzona 
{
    private static int test;                // Mozliwosc utworzenia zmiennej statycznej.

    TeoretycznaKlasaZagniezdzona()
    {
        System.out.println("Jestem z klasy zewnetrznej!");
    }   
    
    class KlasaZagniezdzona
    {
        private int tmp;
        
        KlasaZagniezdzona() 
        {
            System.out.println("Jestem z klasy zagniezdzonej!");
        }
        
        void metodaPenetrujaca()        // Metoda penetrujaca zewnetrzna klase
        {
            test = 5;
        }
    }
    
    static class DrugaZagniezdzona
    {
        public static int atrybut;      // Mozliwosc utworzenia zmiennej statycznej wewnatrz klasy zagniezdzonej, ale tylko dlatego ze jest ona statyczna.
        
        DrugaZagniezdzona()
        {
            System.out.println("Jestem z drugiej klasy zagniezdzonej!");
        }
    }
    void stworzKlaseZagniezdzona()
    {
        KlasaZagniezdzona obj = new KlasaZagniezdzona();
    }
}
