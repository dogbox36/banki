package hu.petrik.banki_szolgaltatasok;

import java.util.LinkedList;
import java.util.List;

public abstract class Bank {
    private List<Szamla> szamlaLista;

    public Bank() {
        this.szamlaLista = new LinkedList<>();
    }
    public abstract Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret);

    public abstract int getOsszegyenleg(Tulajdonos tulajdonos);
    public abstract Szamla getLegnagyobbEgyenleguSzamala(Tulajdonos tulajdonos);

    public long getOsszhitelkeret() {
        return 0;
    }
}
