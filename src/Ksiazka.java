import java.util.Date;

public class Ksiazka {
    private String tytul;
    private Osoba autor;
    private boolean czyWypozyczona;

    public Ksiazka(String tytul, String imie, String nazwisko, Date dataUr) {
        this.tytul = tytul;
        this.czyWypozyczona = false;
        autor = new Osoba(imie,nazwisko,dataUr);
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public boolean isCzyWypozyczona() {
        return czyWypozyczona;
    }

    public void setCzyWypozyczona(boolean czyWypozyczona) {
        this.czyWypozyczona = czyWypozyczona;
    }
}
