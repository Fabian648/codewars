import org.fabian648.Conversion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionTest {

    private Conversion conversion = new Conversion();

    @Test
    void shouldConvertToRoman() {
        assertEquals("I", conversion.solution(1), "solution(1) should equal to I");
        assertEquals("IV", conversion.solution(4), "solution(4) should equal to IV");
        assertEquals("VI", conversion.solution(6), "solution(6) should equal to VI");
    }
}
