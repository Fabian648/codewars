package org.fabian648;

public class Kata {
    /**
     * Verschlüsselt einen String mit dem ROT13-Verfahren.
     * <p>
     * ROT13 ist eine einfache Buchstabenverschiebung, bei der jeder Buchstabe
     * durch den Buchstaben ersetzt wird, der 13 Stellen weiter im Alphabet liegt.
     * Groß- und Kleinbuchstaben werden jeweils separat behandelt.
     * Alle anderen Zeichen (Zahlen, Leerzeichen, Sonderzeichen) bleiben unverändert.
     *
     * @param str der zu verschlüsselnde Eingabestring
     * @return der mit ROT13 verschlüsselte String
     */
    
    public static String rot13(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if(c >= 'A' && c <= 'Z') {
                result.append( (char) ((c-'A'+13)%26+'A'));
            }else if(c >= 'a' && c <= 'z') {
                result.append( (char) ((c-'a'+13)%26+'a'));
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
}