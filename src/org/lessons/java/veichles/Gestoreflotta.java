package org.lessons.java.veichles;

import java.util.ArrayList;

public class Gestoreflotta{
    static ArrayList<Veicolo> veicoli = new ArrayList<>();

    public Gestoreflotta() {
    }

    public static void addAutomobile(int immatricolazione, int targa, int porte) {
        Veicolo veicolo = new Automobile(immatricolazione,targa,porte);
        veicoli.add(veicolo);
    }

    public static void addMotocicletta(int immatricolazione, int targa, String cavalletto) {
        Veicolo veicolo = new Motocicletta(immatricolazione,targa,cavalletto);
        veicoli.add(veicolo);
    }

    public int numeroAuto(){

        int numeroAuto =0;
        for (Veicolo veicolo : veicoli) {
            if (veicolo instanceof Automobile) {
                numeroAuto = numeroAuto + 1;
            }
        }
        return numeroAuto;
    }

    public int numeroMoto(){

        int numeroMoto =0;
        for (Veicolo veicolo : veicoli) {
            if (veicolo instanceof Motocicletta) {
                numeroMoto = numeroMoto + 1;
            }
        }
        return numeroMoto;
    }

    public String trovaTarga(int targa){
        String response= null;
        for (Veicolo veicolo : veicoli) {
            if (veicolo.getTarga()==targa) {
                response="Il veicolo è presente nella flotta";
                break;
            } else {
                response="Il veicolo non è presente nella flotta";
            }
        }
        return response;
    }

    @Override
    public String toString() {
        return veicoli.toString();
    }
}
