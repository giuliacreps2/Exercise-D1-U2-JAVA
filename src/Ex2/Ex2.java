//Scrivere un programma che permetta di calcolare il numero di km/litro percorsi da un'auto.
// Il programma riceve dall'utente il numero di km percorsi ed i litri di carburante consumati
// e stampa i km/litro percorsi. Gestire per mezzo del try-catch l'eventualità che l'utente inserisca il valore 0
// per il numero di litri consumati e venga generata una eccezione di divisione per zero.
// Provare sia ad utilizzare interi sia double per capire come si comportino.
// (Extra: Provare ad usare LogBack per stampare i messaggi di errore)

package Ex2;

public class Ex2 {
    private double kmPercorsi;
    private double litri;

    public Ex2(double kmPercorsi, double litri) {
        this.kmPercorsi = kmPercorsi;
        this.litri = litri;
    }

    public Ex2() {
        this.kmPercorsi = kmPercorsi;
        this.litri = litri;
    }

    public double getKmPercorsi() {
        return kmPercorsi;
    }

    public void setKmPercorsi(double kmPercorsi) {
        this.kmPercorsi = kmPercorsi;
    }

    public double getLitri() {
        return litri;
    }

    public void setLitri(double litri) {
        this.litri = litri;
    }

    public double calcolaQuantiLitri(double kmPercorsi, double litri) {
        return ((kmPercorsi / litri) * 100);
    }
}


//    private int kmPercorsi;
//    private int litri;
//
//    public Ex2(int kmPercorsi, int litri) {
//        this.kmPercorsi = kmPercorsi;
//        this.litri = litri;
//    }
//
//    public Ex2() {
//        this.kmPercorsi = kmPercorsi;
//        this.litri = litri;
//    }
//
//    public int getKmPercorsi() {
//        return kmPercorsi;
//    }
//
//    public void setKmPercorsi(int kmPercorsi) {
//        this.kmPercorsi = kmPercorsi;
//    }
//
//    public int getLitri() {
//        return litri;
//    }
//
//    public void setLitri(int litri) {
//        this.litri = litri;
//    }
//
//    public int calcolaQuantiLitri(int kmPercorsi, int litri) {
//        return ((kmPercorsi / litri) * 100);
//    }
//}
