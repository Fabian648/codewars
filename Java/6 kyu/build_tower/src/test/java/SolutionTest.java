import org.Fabian648.Kata;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(String.join(",", "*"), String.join(",", Kata.towerBuilder(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", Kata.towerBuilder(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", Kata.towerBuilder(3)));
    }
}