import java.util.ArrayList;
import java.util.Date;

public class Czytelnik extends Osoba{
    private int nrCzytelnika;
    private static int liczbaCzytelnikow;
    private ArrayList<Ksiazka> wypozyczoneKsiazki = new ArrayList<>();

    public Czytelnik(String imie, String nazwisko, Date dataUrodzenia) {
        super(imie, nazwisko, dataUrodzenia);
        liczbaCzytelnikow++;
        this.nrCzytelnika = liczbaCzytelnikow;
    }

    public int getNrCzytelnika() {
        return nrCzytelnika;
    }

    public void setNrCzytelnika(int nrCzytelnika) {
        this.nrCzytelnika = nrCzytelnika;
    }

    public static int getLiczbaCzytelnikow() {
        return liczbaCzytelnikow;
    }

    public static void setLiczbaCzytelnikow(int liczbaCzytelnikow) {
        Czytelnik.liczbaCzytelnikow = liczbaCzytelnikow;
    }

    public ArrayList<Ksiazka> getWypozyczoneKsiazki() {
        return wypozyczoneKsiazki;
    }

    public void setWypozyczoneKsiazki(ArrayList<Ksiazka> wypozyczoneKsiazki) {
        this.wypozyczoneKsiazki = wypozyczoneKsiazki;
    }
    public void dodajKsiazke(Ksiazka ksiazka){
        wypozyczoneKsiazki.add(ksiazka);
    }
    public int ileKsiazekWypozyczyl(){
        return wypozyczoneKsiazki.size();
    }
}
