package org.fabian648;

/**
 * Die Klasse {@code Conversion} stellt eine Methode zur Verfügung,
 * um eine positive Ganzzahl in ihre römische Zahlendarstellung umzuwandeln.
 * <p>
 * Unterstützt werden Werte von 1 bis einschließlich 3999.
 * </p>
 * @author fabia
 *
 * Link-Aufgabe: https://www.codewars.com/kata/51b62bf6a9c58071c600001b
 * Ersteller der Aufgabe: https://www.codewars.com/users/jhoffner
 */
public class Conversion {

    /**
     * Wandelt eine positive Ganzzahl in eine römische Zahl um.
     *
     * <p>Die Zahl wird in Tausender-, Hunderter-, Zehner- und Einerstellen
     * zerlegt und jede Stelle gemäß den Regeln der römischen Zahlschrift
     * umgewandelt.</p>
     *
     * @param n die umzuwandelnde Zahl (1 ≤ n ≤ 3999)
     * @return die römische Zahlendarstellung der übergebenen Zahl,
     *         oder ein leerer String, falls die Zahl außerhalb des gültigen Bereichs liegt
     */
    public String solution(int n) {
        if(n < 1 || n > 3999){
            return "";
        }

        StringBuilder sb = new StringBuilder();

        int thousands = n / 1000;
        int hundreds  = (n % 1000) / 100;
        int tens      = (n % 100) / 10;
        int ones      = n % 10;

        switch (thousands) {
            case 1 -> sb.append("M");
            case 2 -> sb.append("MM");
            case 3 -> sb.append("MMM");
        }

        switch (hundreds) {
            case 1 -> sb.append("C");
            case 2 -> sb.append("CC");
            case 3 -> sb.append("CCC");
            case 4 -> sb.append("CD");
            case 5 -> sb.append("D");
            case 6 -> sb.append("DC");
            case 7 -> sb.append("DCC");
            case 8 -> sb.append("DCCC");
            case 9 -> sb.append("CM");
        }

        switch (tens) {
            case 1 -> sb.append("X");
            case 2 -> sb.append("XX");
            case 3 -> sb.append("XXX");
            case 4 -> sb.append("XL");
            case 5 -> sb.append("L");
            case 6 -> sb.append("LX");
            case 7 -> sb.append("LXX");
            case 8 -> sb.append("LXXX");
            case 9 -> sb.append("XC");
        }

        switch (ones) {
            case 1 -> sb.append("I");
            case 2 -> sb.append("II");
            case 3 -> sb.append("III");
            case 4 -> sb.append("IV");
            case 5 -> sb.append("V");
            case 6 -> sb.append("VI");
            case 7 -> sb.append("VII");
            case 8 -> sb.append("VIII");
            case 9 -> sb.append("IX");
        }

        return sb.toString();
    }
}