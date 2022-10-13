package hu.petrik.banki_szolgaltatasok;

public abstract class HitelSzamla  extends BankiSzolgaltatas{
    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }
    public abstract boolean  kivesz(int osszeg);
}
