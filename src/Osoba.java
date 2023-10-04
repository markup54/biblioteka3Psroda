import java.util.Date;

 public class Osoba {
    private String imie;
    private String nazwisko;

    private Date dataUrodzenia;

    public Osoba(String imie, String nazwisko,int rok,int m,int d) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        dataUrodzenia = new Date(rok,m,d);
    }

     public Osoba(String imie, String nazwisko, Date dataUrodzenia) {
         this.imie = imie;
         this.nazwisko = nazwisko;
         this.dataUrodzenia = dataUrodzenia;
     }

     public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
}
