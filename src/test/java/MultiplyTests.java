import Helpers.Actions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTests {

    @Test
    public void multiplicationMinTest() {
        assertEquals((Actions.calculator(-2147483648, -2147483648, '*')), "4611686018427387904");
    }

    @Test
    public void multiplicationWithAllPositiveNumbersTest() {
        assertEquals((Actions.calculator(6, 6, '*')), "36");
    }

    @Test
    public void multiplicationWithFirstPositiveNumberTest() {
        assertEquals((Actions.calculator(7, -7, '*')), "-49");
    }

    @Test
    public void multiplicationWithSecondPositiveNumberTest() {
        assertEquals((Actions.calculator(-7, 7, '*')), "-49");
    }

    @Test
    public void multiplicationWithAllNegativeNumbersTest() {
        assertEquals((Actions.calculator(-7, -7, '*')), "49");
    }

    @Test
    public void multiplicationMaxTest() {
        assertEquals((Actions.calculator(2147483647, 2147483647, '*')), "4611686014132420609");
    }

}
