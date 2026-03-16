package Ex2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ex2 esercizio = new Ex2();

        while (true) {
            try {
                System.out.println("Scrivi quanti km hai percorso");
                double km = Double.parseDouble(scanner.nextLine());

                esercizio.setKmPercorsi(km);

                System.out.println("Scrivi quanti litri di carburante hai messo nella tua auto");
                double litri = Double.parseDouble(scanner.nextLine());

                esercizio.setLitri(litri);

                double risultato = esercizio.calcolaQuantiLitri(km, litri);
                if (Double.isInfinite(risultato)) throw new ArithmeticException("Non si può dividere per 0");
                System.out.println(risultato);


            } catch (ArithmeticException e) {
                System.out.println("Errore: Non puoi dividere per zero litri!");
            }
        }
    }
}

//        while (true) {
//            try {
//                System.out.println("Scrivi quanti km hai percorso");
//                int km = Integer.parseInt(scanner.nextLine());
//
//                esercizio.setKmPercorsi(km);
//
//                System.out.println("Scrivi quanti litri di carburante hai messo nella tua auto");
//                int litri = Integer.parseInt(scanner.nextLine());
//
//                esercizio.setLitri(litri);
//
//                int risultato = esercizio.calcolaQuantiLitri(km, litri);
//                System.out.println(risultato);
//
//            } catch (NumberFormatException e) {
//                System.out.println("Errore: Inserisci solo numeri!");
//            } catch (ArithmeticException e) {
//                System.out.println("Errore: Non puoi dividere per zero litri!");
//            }
//        }
//    }
//}


