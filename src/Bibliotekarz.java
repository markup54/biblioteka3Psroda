import java.util.Date;

public class Bibliotekarz extends Osoba{
    private Date dataZatrudnienia;

    public Bibliotekarz(String imie, String nazwisko, Date dataUrodzenia) {
        super(imie, nazwisko, dataUrodzenia);
        dataZatrudnienia = new Date();
    }
}
