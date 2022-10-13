package hu.petrik.JavaBeadando;

public abstract class HitelSzamla extends Szamla{
    private int hitelKeret;

    public HitelSzamla (Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);

    }

    public int getHitelKeret() {
        return hitelKeret;
    }
    public boolean kivesz(int osszeg) {
        return hitelKeret >= osszeg;
    }
}
