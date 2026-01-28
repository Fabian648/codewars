package org.fabian648;

public class Kata {

    /**
     * Diese Methode kehrt jedes einzelne Wort in einem String um,
     * wobei alle Leerzeichen exakt an ihrer ursprünglichen Position
     * erhalten bleiben.
     *
     * @param original der Eingabestring, dessen Wörter umgekehrt werden sollen
     * @return ein neuer String, in dem jedes Wort rückwärts geschrieben ist,
     *         alle Leerzeichen bleiben unverändert
     * @author fabia
     *
     * Link-Aufgabe: https://www.codewars.com/kata/5259b20d6021e9e14c0010d4
     * Ersteller: https://www.codewars.com/users/jnicol
     */
    public static String reverseWords(final String original) {
        StringBuilder sb = new StringBuilder();
        int wordStart = 0;

        while (wordStart < original.length()) {
            if(original.charAt(wordStart) == ' ') {
                sb.append(' ');
                wordStart++;
            }else{
                int wordEnd = wordStart;
                while(wordEnd < original.length() && original.charAt(wordEnd) != ' ') {
                    wordEnd++;
                }

                for(int i = wordEnd - 1; i >= wordStart; i--) {
                    sb.append(original.charAt(i));
                }
                wordStart = wordEnd;
            }
        }

        return  sb.toString();
    }
}