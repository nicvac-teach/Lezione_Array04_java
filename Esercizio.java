//LEGGERE LE ISTRUZIONI NEL FILE README.md

import java.util.Scanner;
import java.util.Random;

// Classe principale, con metodo main
class Esercizio {

    public static Scanner in = new Scanner( System.in );
    public static Random random = new Random();

    //Valori multipli di ritorno per il metodo calcolaMassimo
    public static record Max(int massimo, int rIdx, int cIdx) { }

    // Metodo per calcolare il massimo nella matrice
    public static Max calcolaMassimo( /*scrivere qui i parametri richiesti dall'esercizio*/ ) {
        //SCRIVERE QUI IL CODICE RICHIESTO DALL'ESERCIZIO
    }

    // Metodo per calcolare la media di una colonna
    public static float calcolaMedia( /*scrivere qui i parametri richiesti dall'esercizio*/ ) {
        //SCRIVERE QUI IL CODICE RICHIESTO DALL'ESERCIZIO        
    }

    // Metodo per riempire la matrice con valori casuali
    // Già risolto nell'esercizio precedente
    public static void riempiCasuale( int[][] M, int RIGHE, int COLONNE, int valMin, int valMax) {
        Random rand = new Random();
        for (int i=0; i <= RIGHE-1; i=i+1 ) {
            for (int j=0; j <= COLONNE-1; j=j+1) {
                M[i][j] = valMin + rand.nextInt((valMax+1)-valMin);
            }
        }
    }

    public static void main(String args[]) {
        //SCRIVERE QUI IL CODICE RICHIESTO DALL'ESERCIZIO
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md