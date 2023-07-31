package org.lessons.java.veichles;

public class Veicolo {

    protected int immatricolazione;
    protected int targa;

    public Veicolo(int immatricolazione, int targa) {
        this.immatricolazione = immatricolazione;
        this.targa = targa;
    }

    public int getTarga() {
        return targa;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
