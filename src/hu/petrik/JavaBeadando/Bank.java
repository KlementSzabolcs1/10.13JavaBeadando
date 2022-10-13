package hu.petrik.JavaBeadando;

import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;

    public Bank() {

    }
    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret) {
        return new MegtakaritasiSzamla(tulajdonos);
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos) {
        int ossz = 0;
        for (int i = 0; i < szamlaLista.size(); i++) {
            if (szamlaLista.get(i).getTulajdonos() == tulajdonos) {
                ossz += szamlaLista.get(i).getAktualisEgyenleg();
            }
        }
        return ossz;

    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {
        int legnagyobb = szamlaLista.get(0).getAktualisEgyenleg();
        int hol = 0;
        for (int i = 1; i < szamlaLista.size(); i++) {
            if (szamlaLista.get(i).getTulajdonos() == tulajdonos) {
                if (legnagyobb < szamlaLista.get(i).getAktualisEgyenleg()) {
                    legnagyobb = szamlaLista.get(i).getAktualisEgyenleg();
                    hol = i;
                }

            }
        }
        return szamlaLista.get(hol);
    }

    public long getOsszhitelKeret() {
        int ossz = 0;
        for (Szamla szamla : szamlaLista) {
            if (szamla instanceof HitelSzamla) {
                ossz += ((HitelSzamla) szamla).getHitelKeret();
            }
        }
        return ossz;
    }
}
