package interfejsy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main
{

    public static void main(String[] args) 
    {
        System.out.println(testInterface.PI);
        
        testInterface pierwszy = new Pracownik();
        System.out.println(((Pracownik)pierwszy).getWynagrodzenie());   // Late binding (zrzutowanej w dół instancji "pierwszy" interfejsu "testInterface" do klasy Pracownik) za pomocą metody "getWynagrodzenie".
        ((Pracownik)pierwszy).setWynagrodzenie(2350);
        System.out.println(((Pracownik)pierwszy).getWynagrodzenie());
        
        int[] tab = new int[4];                     // Implementacja testowej tablicy.
        tab[0] = 13;
        tab[1] = 1;
        tab[2] = -5;
        tab[3] = 155;
        
        Arrays.sort(tab);                           // Sortowanie tablicy.
        for(int licznik: tab)
        {
            System.out.println(licznik);
        }
        //System.out.println(tab[0]);
        
        Pracownik[] pracownik = new Pracownik[3];   // Implementacja tablicy składającej się z instancji klasy Pracownik.
        System.out.println("Kolejność wysokości pensji przed sortowaniem: ");        
        for(int i = 0; pracownik.length > i; i++)   // Pętla wywołująca konstruktor domyślny kolejnych instancji klasy Pracownik.
        {
            pracownik[i] = new Pracownik();
            pracownik[i].setWynagrodzenie((i + 1) * 3500 / (3 * i + 2));    // Ustawienie zgodnie z wzorem atrybutu "wynagrodzenie" danej instancji.
            System.out.println(pracownik[i].getWynagrodzenie());
        }
        
        System.out.println("Korelacja porównania pensji 2 pierwszych pracowników przed sortowaniem: ");
        System.out.println(pracownik[0].compareTo(pracownik[1]));
        System.out.println(pracownik[1].compareTo(pracownik[0]));
        
        Arrays.sort(pracownik);                     // Sortowanie tablicy instancji klasy Pracownik zgodnie z implementacją metody "compareTo" wbudowanego interfejsu Comparable.
        
        System.out.println("Korelacja porównania pensji 2 pierwszych pracowników po sortowaniu: ");        
        System.out.println(pracownik[0].compareTo(pracownik[1]));
        System.out.println(pracownik[1].compareTo(pracownik[0]));
        System.out.println("Kolejność wysokości pensji po sortowaniu: ");
        
        for(Pracownik licznik: pracownik)
        {
            System.out.println(licznik.getWynagrodzenie());
        }
        
        Arrays.sort(pracownik, Collections.reverseOrder());     // Sortowanie odwrotne
        System.out.println("Kolejność wysokości pensji po sortowaniu odwrotnym: ");
        for(Pracownik licznik: pracownik)
        {
            System.out.println(licznik.getWynagrodzenie());
        }
        
        TeoretycznaKlasaZagniezdzona zewnetrzny = new TeoretycznaKlasaZagniezdzona();                                               // Inicjalizacja instancji klasy A.
        TeoretycznaKlasaZagniezdzona.KlasaZagniezdzona zagniezdzony = zewnetrzny.new KlasaZagniezdzona();                           // Inicjalizacja instancji zagniezdzonej klasy B w klasie A.
        TeoretycznaKlasaZagniezdzona.DrugaZagniezdzona drugiZagniezdzony = new TeoretycznaKlasaZagniezdzona.DrugaZagniezdzona();    // Inicjalizacja bezposrednia samodzielnej (statycznej) zagniezdzonej klasy C w klasie A.
    
        KontoBankowe kontoBankowe = new KontoBankowe(1000);
        
        System.out.println(kontoBankowe.getStanKonta());
        
        kontoBankowe.stworzKonto(4);
        
        System.out.println(kontoBankowe.getStanKonta());
        
        Przycisk p = new Przycisk();
        
        p.dodajAkcje(new ZachowaniePoWcisnieciu() {
                    
                    @Override
                    public void akcja()
                    {
                        System.out.println("Jestem z klasy anonimowej.");
                    }
                    
                });
        Robotnik[] robotnik = new Robotnik[6];
        robotnik[0] = new Robotnik("Arek", "Wilczynski", new Adres("Afrykanska", 0, 11, 666, "Slupsk", "kaszubskie", "Polska"));
        robotnik[1] = new Robotnik("Michal", "Chwast", new Adres("Pomorska", 9, 22, 123, "Szczecin", "zachodniopomorskie", "Polska"));
        robotnik[2] = new Robotnik("Robert", "Rauch", new Adres("Nieruchalska", 23, 71, 151, "Wroclaw", "dolnoslaskie", "Niemcownia"));
        robotnik[3] = new Robotnik("Adam", "Malysz", new Adres("Szczytna", 3, 41, 123, "Szczyrk", "slaskie", "Polska"));
        robotnik[5] = new Robotnik("Kamil", "Chabierski", new Adres("Kapusciana", 13, 69, 666, "Ogorkow", "ksiestwo kapusty i rozpusty", "Polska"));
        
        for(Robotnik licznik: robotnik)
        {
            if(licznik instanceof Robotnik)
            System.out.println(licznik);
        }
    }    
}
