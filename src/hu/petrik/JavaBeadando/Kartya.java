package hu.petrik.JavaBeadando;

public class Kartya extends BankiSzolgaltatas{
    private Szamla szamla;
    protected String kartyaszam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaszam) {
        super(tulajdonos);

    }

    public String getKartyaSzam() {
        return kartyaszam;
    }
    public boolean vasarlas(int osszeg) {
        return szamla.getAktualisEgyenleg() >= osszeg;
    }
}
