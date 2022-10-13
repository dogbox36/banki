package hu.petrik.banki_szolgaltatasok;

public class HitelSzamla extends Szamla {
    private int hitelKeret;

    HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (aktualisEgyenleg - osszeg < hitelKeret)
            return false;

        aktualisEgyenleg -= osszeg;
        return true;
    }
}
