import java.util.ArrayList;

public class Biblioteka {
    public ArrayList<Czytelnik> czytelnicy;
    public ArrayList<Ksiazka> ksiazki;
    public ArrayList<Bibliotekarz> bibliotekarze;

    public Biblioteka() {
        czytelnicy = new ArrayList<>();
        ksiazki= new ArrayList<>();
        bibliotekarze= new ArrayList<>();
    }
    public void wyporzyczKsiazke(Ksiazka ksiazka, Czytelnik czytelnik){
        if(ksiazka.isCzyWypozyczona()){
            System.out.println("nie można wyporzyczyć ksiazki");
        }
        else{
            czytelnik.dodajKsiazke(ksiazka);
            ksiazka.setCzyWypozyczona(true);
            //nie mogę zmienić parametru ksiazki

        }
    }
    public int ileKsiazekWyporzyczyl(Czytelnik czytelnik){
        return czytelnik.ileKsiazekWypozyczyl();
    }

}
