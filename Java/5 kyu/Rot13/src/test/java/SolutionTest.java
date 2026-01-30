import org.fabian648.Kata;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

class SolutionTest {
    @Test
    void testRot13() {
        // assertEquals("expected", "actual");
        assertEquals("grfg", Kata.rot13("test"), "Input: \"test\"");
        assertEquals("Grfg", Kata.rot13("Test"), "Input: \"Test\"");
    }
}