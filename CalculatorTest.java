import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testCalculateAddition() {
        String result = Calculator.Run("4+5");
        assertEquals("9.0", result);
    }
}