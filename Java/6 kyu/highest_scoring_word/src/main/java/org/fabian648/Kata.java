package org.fabian648;

import java.util.Arrays;

public class Kata {

    /**
     * Die Klasse {@code Kata} enthält eine Methode, um aus einem Satz
     * das Wort mit dem höchsten "Buchstabenwert" zu ermitteln.
     *
     * <p>Der "Buchstabenwert" eines Wortes wird berechnet, indem jeder
     * Buchstabe a=1, b=2, ..., z=26 zugeordnet wird und die Werte summiert werden.
     *
     * <p>Beispiel:
     * <pre>
     * high("man i need a taxi up to ubud") =&gt; "taxi"
     * high("what time are we climbing up to the volcano") =&gt; "volcano"
     * </pre>
     *
     * <p>Hinweis: Es wird davon ausgegangen, dass alle Buchstaben in Kleinbuchstaben vorliegen.
     * Sonderzeichen oder Großbuchstaben werden nicht berücksichtigt.
     *
     * @author fabia
     *
     * Link-Aufgabe: https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
     * Ersteller: https://www.codewars.com/users/PG1
     **/

    public static String high(String s) {
        String[] words = s.split(" ");
        int[] sum = new int[words.length];

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                sum[i] += words[i].charAt(j)-96;
            }
        }

        int place = 0;
        for(int j = 1; j < sum.length; j++){
            if(sum[j] > sum[place]){
                place = j;
            }
        }
        return words[place];
    }

}