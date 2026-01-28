package org.Fabian648;

public class Kata
{
    /**
     * Erzeugt einen Turm mit einer angegebenen Anzahl von Etagen.
     * Jede Etage besteht aus zentrierten Sternen (*) und passenden Leerzeichen.
     *
     * Beispiel für nFloors = 3:
     * <pre>
     *   *
     *  ***
     * *****
     * </pre>
     *
     * @param nFloors die Anzahl der Etagen des Turms
     * @return ein String-Array, in dem jede Position eine Etage des Turms darstellt
     * @author fabia
     *
     * Link-Aufgabe: https://www.codewars.com/kata/576757b1df89ecf5bd00073b
     * Ersteller: https://www.codewars.com/users/8fdafs2
     */
    public static String[] towerBuilder(int nFloors)
    {
        int n = nFloors-1;
        int numStar = 1;
        String[] result = new String[nFloors];

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < nFloors; i++){
            sb.append(" ".repeat(n));
            sb.append("*".repeat(numStar));
            sb.append(" ".repeat(n));
            result[i] = sb.toString();
            sb.setLength(0);
            numStar += 2;
            n--;
        }
        return result;
    }
}