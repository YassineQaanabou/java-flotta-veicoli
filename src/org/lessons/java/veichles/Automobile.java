package org.lessons.java.veichles;

public class Automobile extends Veicolo{
    private int porte;


    public Automobile(int immatricolazione, int targa, int porte) {
        super(immatricolazione, targa);
        this.porte=porte;
    }



    @Override
    public String toString() {
        return "targa:"+ targa + " immmatricolazione:" + immatricolazione + " porte:" +porte;
    }
}
