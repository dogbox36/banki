package hu.petrik.banki_szolgaltatasok;

import java.util.LinkedList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;

    public Bank() {
        this.szamlaLista = new LinkedList<>();
    }
}
