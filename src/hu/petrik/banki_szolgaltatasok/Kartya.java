package hu.petrik.banki_szolgaltatasok;

public class Kartya extends BankiSzolgaltatas {
    private Szamla szamla;
    private String kartyaSzam;

    Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean vasarlas(int osszeg) {
        return szamla.kivesz(osszeg);
    }
}
