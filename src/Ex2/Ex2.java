//Esercizio #1
//
//Scrivere un programma che istanzi un array di 5 interi con valori casuali tra 1 e 10 e
// lo stampi in console, chieda poi all'utente di inserire un numero in una posizione specificata
// e stampi il nuovo stato dell'array, ripetere l'operazione fino a che l'utente non inserisce il valore 0.
// Gestire eventuali errori dovuti alla violazione dei limiti dell'array.
// (Extra: Provare ad usare LogBack per stampare i messaggi di errore)

package Ex2;

import java.util.Random;

public class Ex2 {
    private int[] array;

    public Ex2() {
        this.array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            this.array[i] = random.nextInt(1, 11);
        }

    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
