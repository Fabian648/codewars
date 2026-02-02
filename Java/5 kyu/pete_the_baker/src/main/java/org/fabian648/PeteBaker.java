package org.fabian648;

import java.util.Map;

public class PeteBaker {

    /**
     * Berechnet die maximale Anzahl an Kuchen, die gebacken werden können,
     * basierend auf einem Rezept und den verfügbaren Zutaten.
     * <p>
     * Für jede Zutat im Rezept wird geprüft, wie oft sie aus den verfügbaren
     * Mengen verwendet werden kann. Die kleinste dieser Zahlen bestimmt,
     * wie viele Kuchen insgesamt gebacken werden können.
     * <p>
     * Fehlt eine Zutat in den verfügbaren Zutaten, wird automatisch {@code 0} zurückgegeben.
     *
     * @param recipe    eine Map mit den benötigten Zutaten und deren Mengen pro Kuchen
     * @param available eine Map mit den verfügbaren Zutaten und deren Gesamtmengen
     * @return die maximale Anzahl an Kuchen, die gebacken werden können
     *
     * Link-Aufgabe: https://www.codewars.com/kata/525c65e51bf619685c000059
     * Link-Ersteller-Aufgabe: https://www.codewars.com/users/BattleRattle
     */

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {

        int min = Integer.MAX_VALUE;
        for (String s : recipe.keySet()) {
            try {
                if (min > (available.get(s) / recipe.get(s))) {
                    min = available.get(s) / recipe.get(s);
                }
            }catch (NullPointerException e){
                return 0;
            }
        }

        return min;
    }
}