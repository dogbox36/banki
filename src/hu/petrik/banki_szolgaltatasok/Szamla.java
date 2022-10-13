package hu.petrik.banki_szolgaltatasok;

public abstract class Szamla extends BankiSzolgaltatas{
    protected int aktualisegyenleg;
    Szamla (Tulajdonos tulajdonos){
        super (tulajdonos);
    }

    public int getAktualisegyenleg() {
        return aktualisegyenleg;
    }

    public void befizet(int osszeg){
        aktualisegyenleg+=osszeg;
    }
    public abstract boolean  kivesz(int osszeg);

    public abstract Kartya ujKartya(String kartyaszam);
}
