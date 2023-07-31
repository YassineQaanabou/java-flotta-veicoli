package org.lessons.java.veichles;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Gestoreflotta gestoreflotta = new Gestoreflotta();

        boolean flag = false;

        while (!flag) {
            System.out.println("Vuoi aggiungere un veicolo alla flotta? y/n");
            String choice = scan.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Che tipo di veicolo vuoi aggiungere? Automobile/Motocicletta");
                String type = scan.nextLine();

                if (type.equalsIgnoreCase("Automobile")) {
                    System.out.println("numero di immatricolazione?");
                    int immatricolazione = parseInt(scan.nextLine());

                    System.out.println("numero di targa?");
                    int targa = parseInt(scan.nextLine());

                    System.out.println("numero di porte?");
                    int porte = parseInt(scan.nextLine());

                    Gestoreflotta.addAutomobile(immatricolazione, targa, porte);
                } else if (type.equalsIgnoreCase("Motocicletta")) {
                    System.out.println("numero di immatricolazione?");
                    int immatricolazione = parseInt(scan.nextLine());

                    System.out.println("numero di targa?");
                    int targa = parseInt(scan.nextLine());

                    System.out.println("ha il cavalletto?");
                    String cavalletto = scan.nextLine();

                    Gestoreflotta.addMotocicletta(immatricolazione, targa, cavalletto);
                } else {
                    System.out.println("Tipo veicolo non riconosciuto");
                }
            } else if (choice.equalsIgnoreCase("n")) {
                flag = true;
            } else {
                System.out.println("input non riconosciuto");
            }
        }

        System.out.println(gestoreflotta);
        System.out.println("Vuoi conoscere il numero di motociclette o automobili? 1-motociclette 2-automobili");
        String searchType = scan.nextLine();

        if (searchType.equals("1")) {
            System.out.println("il numerodi motociclette è " + gestoreflotta.numeroMoto());

        } else if (searchType.equals("2")) {
            System.out.println("il numero di automobili è " + gestoreflotta.numeroAuto());

        }

        System.out.println("Quale targa vuoi cercare?");
        int searchTarga = parseInt(scan.nextLine());

        System.out.println(gestoreflotta.trovaTarga(searchTarga));
    }
}
