package hu.petrik.banki_szolgaltatasok;

public class Szamla extends BankiSzolgaltatas {
    protected int aktualisEgyenleg;

    Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg) {
        aktualisEgyenleg += osszeg;
    }

    public boolean kivesz(int osszeg) {
        throw new UnsupportedOperationException();
    }

    public Kartya ujKartya(String kartyaSzam) {
        return new Kartya(getTulajdonos(), this, kartyaSzam);
    }
}