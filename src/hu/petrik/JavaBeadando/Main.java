package hu.petrik.JavaBeadando;

public class Main {
    public static void main(String[] args) {
        Tulajdonos en = new Tulajdonos("Klement Szabolcs");
        Bank enbankom = new Bank();
        Szamla enszamlam = new MegtakaritasiSzamla(en);
        Kartya enkartyam = new Kartya(en, enszamlam,"4565663");
        System.out.println(enkartyam);
    }
}
