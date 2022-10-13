package hu.petrik.banki_szolgaltatasok;

import java.util.LinkedList;
import java.util.stream.Stream;

public class Bank {
    private LinkedList<Szamla> szamlaLista;
    private int maxSzamlak;

    Bank(int maxSzamlak) {
        szamlaLista = new LinkedList<>();
        this.maxSzamlak = maxSzamlak;
    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret) {
        if (szamlaLista.size() >= maxSzamlak)
            throw new RuntimeException("nem lehet tobb szamlat nyitni");

        Szamla sz;

        if (hitelKeret == 0)
            sz = new MegtakaritasiSzamla(tulajdonos);
        else
            sz = new HitelSzamla(tulajdonos, hitelKeret);

        szamlaLista.add(sz);
        return sz;
    }

    public Stream<Szamla> getSzamlak(Tulajdonos tulajdonos) {
        return szamlaLista
                .stream()
                .filter(x -> x.getTulajdonos() == tulajdonos);
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos) {
        return getSzamlak(tulajdonos)
                .map(Szamla::getAktualisEgyenleg)
                .reduce(Integer::sum)
                .orElse(0);
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {
        return getSzamlak(tulajdonos)
                .reduce((a, x) -> a.getAktualisEgyenleg() > x.getAktualisEgyenleg() ? a : x)
                .orElse(null);
    }

    public long getOsszhitelkeret() {
        return szamlaLista
                .stream()
                .filter(x -> x instanceof HitelSzamla)
                .map(x -> ((HitelSzamla) x).getHitelKeret())
                .reduce(Integer::sum)
                .orElse(0);
    }
}
