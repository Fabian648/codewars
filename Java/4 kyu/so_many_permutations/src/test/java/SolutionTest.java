import org.fabian648.Permutations;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void example1() {
        assertEquals(
                new ArrayList<>(Arrays.asList("a")),
                Permutations.singlePermutations("a").stream().sorted().collect(Collectors.toList())
        );
    }

    @Test
    void example2() {
        assertEquals(
                new ArrayList<>(Arrays.asList("ab", "ba")),
                Permutations.singlePermutations("ab").stream().sorted().collect(Collectors.toList())
        );
    }

    @Test
    void example3() {
        assertEquals(
                new ArrayList<>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                Permutations.singlePermutations("aabb").stream().sorted().collect(Collectors.toList())
        );
    }
}
