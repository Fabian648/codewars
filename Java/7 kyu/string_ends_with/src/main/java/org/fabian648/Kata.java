package org.fabian648;

public class Kata {

    /**
     * Prüft, ob ein gegebener String {@code str} mit dem String {@code ending} endet.
     *
     * <p>Die Methode gibt {@code true} zurück, wenn {@code str} die Zeichenfolge
     * {@code ending} am Ende enthält, andernfalls {@code false}.
     *
     * Beispiele:
     * <pre>
     * solution("samurai", "ai")   =&gt; true
     * solution("sumo", "omo")     =&gt; false
     * solution("abc", "")          =&gt; true
     * </pre>
     *
     * @param str    der String, der überprüft werden soll
     * @param ending der String, auf den geprüft werden soll
     * @return {@code true}, falls {@code str} mit {@code ending} endet, sonst {@code false}
     * @author fabia
     *
     * Link-Aufgabe: https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d
     * Ersteller: https://www.codewars.com/users/jhoffner
     */
    public static boolean solution(String str, String ending) {
        int len_ending = ending.length();
        int len_str = str.length();

        if (ending.length() > str.length()) {
            return false;
        }

        return str.endsWith(ending);
    }
}