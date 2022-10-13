package hu.petrik.banki_szolgaltatasok;

public abstract class Kartya extends BankiSzolgaltatas{
    private Szamla szamla;
    private String Kartyaszam;

    public Kartya(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public Kartya(Tulajdonos tulajdonos, Szamla szamla) {
        super(tulajdonos);
        this.szamla = szamla;
    }

    public Kartya(Tulajdonos tulajdonos, String kartyaszam) {
        super(tulajdonos);
        Kartyaszam = kartyaszam;
    }

    public String getKartyaszam() {
        return Kartyaszam;
    }

    public abstract boolean  vasarlas(int osszeg);
}
