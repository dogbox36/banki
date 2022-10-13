package hu.petrik.banki_szolgaltatasok;

public abstract class MegtakaritasiSzamla  extends BankiSzolgaltatas{
    private double kamat;
    public double alapKamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }
    public abstract boolean  kivesz(int osszeg);
    public  void kamatJovairas(){

    };
}
