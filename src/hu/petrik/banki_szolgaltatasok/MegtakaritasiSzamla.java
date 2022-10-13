package hu.petrik.banki_szolgaltatasok;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    public static double alapKamat = 1.01;

    MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        kamat = alapKamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (aktualisEgyenleg - osszeg < 0)
            return false;

        aktualisEgyenleg -= osszeg;
        return true;
    }

    public void kamatJovairas() {
        aktualisEgyenleg *= kamat;
    }
}