package org.fabian648;

public class Kata {

    /**
     * Addiert zwei nicht-negative Ganzzahlen, die als Strings gegeben sind,
     * und gibt die Summe ebenfalls als String zurück.
     * <p>
     * Diese Methode funktioniert auch für sehr große Zahlen, die nicht mehr
     * in die primitiven Zahlentypen von Java passen.
     *
     * @param a die erste Zahl als String
     * @param b die zweite Zahl als String
     * @return die Summe von {@code a} und {@code b} als String
     *
     * Link-Aufgabe: https://www.codewars.com/kata/525f4206b73515bffb000b21
     * Link-Ersteller-Aufgabe: https://www.codewars.com/users/Becojo
     */
    public static String add(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }
        String res = result.reverse().toString();
        return res.replaceFirst("^0+(?!$)", "");
    }
}
