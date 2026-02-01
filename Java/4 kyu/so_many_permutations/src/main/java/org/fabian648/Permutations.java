package org.fabian648;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {

    /**
     * Erzeugt alle möglichen Permutationen eines nicht-leeren Strings
     * und entfernt dabei automatisch doppelte Einträge.
     * <p>
     * Die Methode arbeitet rekursiv: Für jedes Zeichen im String wird dieses
     * fixiert und mit allen Permutationen des verbleibenden Reststrings kombiniert.
     * Ein {@link Set} wird verwendet, um doppelte Permutationen zu vermeiden.
     *
     * @param s der Eingabestring, dessen Permutationen erzeugt werden sollen
     * @return eine Liste aller eindeutigen Permutationen des Strings
     *
     * Link-Aufgabe: https://www.codewars.com/kata/5254ca2719453dcc0b00027d
     * Link-Aufgaben-Ersteller: https://www.codewars.com/users/BattleRattle
     * */
    public static List<String> singlePermutations(String s) {

        Set<String> result = new HashSet<>();

        if(s.length()==1){
            result.add(s);
            return new ArrayList<>(result);
        }

        for(int i = 0; i<s.length(); i++){
            char current = s.charAt(i);

            String sub = s.substring(0,i) + s.substring(i+1);

            for(String perm : singlePermutations(sub)){
                result.add(current + perm);
            }

        }

        return new ArrayList<>(result);

    }
}