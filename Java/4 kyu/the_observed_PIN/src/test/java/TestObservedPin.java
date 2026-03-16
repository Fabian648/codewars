

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import de.fabian648.ObservedPin;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestObservedPin {

    /**
     * Datenquelle für den parametrisierten Test.
     * Ersetzt die alte HashMap-Struktur durch einen Stream von Argumenten.
     */
    private static Stream<Arguments> pinProvider() {
        return Stream.of(
                Arguments.of("8", Arrays.asList("5", "7", "8", "9", "0")),
                Arguments.of("11", Arrays.asList("11", "21", "41", "12", "22", "42", "14", "24", "44")),
                Arguments.of("369", Arrays.asList("236", "238", "239", "256", "258", "259", "266", "268", "269", "296", "298", "299", "336", "338", "339", "356", "358", "359", "366", "368", "369", "396", "398", "399", "636", "638", "639", "656", "658", "659", "666", "668", "669", "696", "698", "699"))
        );
    }

    @ParameterizedTest(name = "Test für beobachteten PIN: {0}")
    @MethodSource("pinProvider")
    void testPins(String entered, List<String> expected) {
        List<String> result = ObservedPin.getPINs(entered);

        // Sortieren für den Vergleich
        Collections.sort(result);
        Collections.sort(expected);

        assertEquals(expected, result, () -> "Fehler bei beobachtetem PIN: " + entered);
    }
}