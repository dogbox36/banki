package hu.petrik.banki_szolgaltatasok;

public class Tulajdonos {
    private String nev;

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public Tulajdonos(String nev) {
        this.nev = nev;
    }
}
