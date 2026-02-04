package org.fabian648;

import java.util.ArrayList;
import java.util.List;

public class Josephus {
    /**
     * Führt das Josephus-Problem auf einer Liste von Elementen aus und gibt die
     * Reihenfolge zurück, in der die Elemente entfernt werden.
     *
     * <p>
     * Das Josephus-Problem funktioniert folgendermaßen:
     * Gegeben ist eine Liste von Elementen und eine Schrittgröße {@code k}.
     * Beginnend beim ersten Element wird jedes {@code k}-te Element aus der Liste
     * entfernt, bis keine Elemente mehr übrig sind. Die Methode gibt die
     * Elemente in der Reihenfolge zurück, in der sie entfernt wurden.
     * </p>
     *
     * @param items die ursprüngliche Liste von Elementen, die im Josephus-Problem verarbeitet werden
     * @param k     die Schrittgröße, d.h. jedes {@code k}-te Element wird entfernt; muss größer als 0 sein
     * @param <T>   der Typ der Elemente in der Liste
     * @return eine neue Liste mit den Elementen in der Reihenfolge, in der sie entfernt wurden;
     *         liefert eine leere Liste zurück, wenn die Eingabeliste leer ist oder {@code k <= 0}
     *
     * Link-Aufgabe: https://www.codewars.com/kata/5550d638a99ddb113e0000a2
     * Link-Ersteller-Aufgabe: https://www.codewars.com/users/GiacomoSorbi
     */
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> copy = new ArrayList<>(items);
        List<T> result = new ArrayList<>();

        if (copy.isEmpty() || k <= 0) return result;

        for (int i = k -1; !copy.isEmpty(); ) {
            i = i % copy.size();
            result.add(copy.remove(i));
            i += k - 1;
        }

        return result;
    }
}
