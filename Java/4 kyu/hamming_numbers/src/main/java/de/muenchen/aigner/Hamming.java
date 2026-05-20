package de.muenchen.aigner;


import java.util.Set;

/**
 * Berechnet die n-te Hamming-Zahl (auch 5-glatte Zahl genannt) in aufsteigender Reihenfolge.
 * <p>
 * Eine Hamming-Zahl ist eine positive ganze Zahl, deren Primfaktoren ausschließlich
 * 2, 3 und 5 sind. Die Reihe beginnt mit 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15...
 * <p>
 * Der Algorithmus arbeitet hocheffizient in O(n) Laufzeit mit einem Drei-Zeiger-Ansatz
 * (Three-Pointer-Approach). Er generiert die Zahlen sequenziell in einem Array, indem
 * er jeweils das Minimum der nächsten Multiplikations-Kandidaten für die Faktoren
 * 2, 3 und 5 ermittelt und Duplikate durch paralleles Hochzählen der Indizes eliminiert.
 *
 * @param n die Position der gewünschten Hamming-Zahl (1-basiert)
 * @return die n-te Hamming-Zahl als {@code long}
 *
 * Link-Aufgabe: https://www.codewars.com/kata/526d84b98f428f14a60008da
 * Link-Aufgaben-Ersteller: https://www.codewars.com/users/xcthulhu
 */

public class Hamming {
    public static long hamming(int n) {
        long[] hamming = new long[n];

        int n_2 = 0;
        int n_3 = 0;
        int n_5 = 0;

        hamming[0] = 1;

        for(int i = 1; i < n; i++){
            long a = hamming[n_2] * 2;
            long b = hamming[n_3] * 3;
            long c = hamming[n_5] * 5;

            long nextHamming = Math.min(a, Math.min(b, c));
            hamming[i] = nextHamming;
            if (nextHamming == a) {
                n_2++;
            }
            if (nextHamming == b) {
                n_3++;
            }
            if (nextHamming == c) {
                n_5++;
            }

        }

        return hamming[n-1];
    }
}
