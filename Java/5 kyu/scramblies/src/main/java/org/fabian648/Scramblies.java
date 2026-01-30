package org.fabian648;

public class Scramblies {

//    O(n²)
//    public static boolean scramble(String str1, String str2) {
//        for(char c : str2.toCharArray()) {
//            if(str1.chars().filter(ch -> ch == c).count() < str2.chars().filter(ch -> ch == c).count()) {
//                return false;
//            }
//        }
//        return true;
//    }


    /**
     * Prüft, ob der String {@code str2} aus den Buchstaben von {@code str1}
     * gebildet werden kann.
     * <p>
     * Jeder Buchstabe aus {@code str1} darf dabei nur so oft verwendet werden,
     * wie er dort vorkommt. Die Reihenfolge der Buchstaben spielt keine Rolle.
     * Die Methode arbeitet effizient in linearer Zeit O(n).
     *
     * @param str1 der Quellstring, aus dem Buchstaben entnommen werden dürfen
     * @param str2 der Zielstring, der gebildet werden soll
     * @return {@code true}, wenn {@code str2} aus {@code str1} gebildet werden kann,
     *         sonst {@code false}
     *
     * Link-Aufgabe: https://www.codewars.com/kata/55c04b4cc56a697bb0000048
     * Link-Aufgaben Ersteller: https://www.codewars.com/users/joh_pot
     * */
    
    public static boolean scramble(String str1, String str2) {
        int[] counts = new int[26];

        // Zähle Buchstaben in str1
        for (char c : str1.toCharArray()) {
            counts[c - 'a']++;
        }

        // Ziehe Buchstaben für str2 ab
        for (char c : str2.toCharArray()) {
            if (--counts[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

}