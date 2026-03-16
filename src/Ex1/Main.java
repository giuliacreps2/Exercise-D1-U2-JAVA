package Ex1;


import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex1 esercizio = new Ex1();

        int[] array = esercizio.getArray();

        System.out.println(Arrays.toString(array));


        while (true) {
            try {
                System.out.println("Scrivi ora un numero da inserire nell'array. Clicca 0 se vuoi uscire");
                int num = Integer.parseInt(scanner.nextLine());

                if (num == 0) break;
                //if (num > 100 || num < 0) System.out.println("Inserisci un numero da 1 a 100");

                System.out.println("In quale posizione vuoi inserire il numero da 1 a 4?");
                int posizione = Integer.parseInt(scanner.nextLine());
                array[posizione] = num;

                System.out.println("Nuovo array= " + Arrays.toString(array));

            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Errore: Posizione non valida! Inserisci un indice tra 0 e " + (array.length - 1));
            } catch (NumberFormatException e) {
                System.err.println("Inserisci un numero da 1 a 100");
            }
        }
    }
}
