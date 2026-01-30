package org.fabian648;

import java.util.Arrays;

public class Xbonacci {

    /**
     * Erzeugt eine Xbonacci-Folge basierend auf einer gegebenen Startsignatur.
     * Die nächste Zahl ist jeweils die Summe der letzten k Zahlen,
     * wobei k = signature.length.
     *
     * @param signature Startsignatur (beliebige Länge ≥ 1)
     * @param n Anzahl der gewünschten Elemente
     * @return Ein Array mit den ersten n Elementen der Folge
     *
     * Link-Aufgabe: https://www.codewars.com/kata/556deca17c58da83c00002db
     * Link-Ersteller: https://www.codewars.com/users/GiacomoSorbi
     */
    public double[] tribonacci(double[] signature, int n) {
        if (n == 0) return new double[0];
        if (n <= signature.length) return Arrays.copyOf(signature, n);

        int k = signature.length;
        double[] result = new double[n];

        // Startwerte kopieren
        for (int i = 0; i < k; i++) {
            result[i] = signature[i];
        }

        // Xbonacci berechnen
        for (int i = k; i < n; i++) {
            double sum = 0;
            for (int j = i - k; j < i; j++) {
                sum += result[j];
            }
            result[i] = sum;
        }

        return result;
    }
}
