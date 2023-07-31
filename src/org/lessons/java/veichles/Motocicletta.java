package org.lessons.java.veichles;

public class Motocicletta extends Veicolo {
    private String cavalletto;

    public Motocicletta(int immatricolazione, int targa, String cavalletto) {
        super(immatricolazione, targa);
        this.cavalletto = cavalletto;
    }

    @Override
    public String toString() {
        return "targa:"+ targa + " immmatricolazione:" + immatricolazione + " cavalletto:" +cavalletto;
    }
}
