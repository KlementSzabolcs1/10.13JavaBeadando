package hu.petrik.JavaBeadando;

public class MegtakaritasiSzamla extends Szamla{
    public double kamat;
    public double alapKamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);

    }

    public Double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }
    public boolean kivesz(int osszeg) {
        return getAktualisEgyenleg() >= osszeg;
    }
    public void kamatJovairas() {

    }
}
