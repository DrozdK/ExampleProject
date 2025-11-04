import Helpers.Actions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTests {

    @Test
    public void divideMinTest() {
        assertEquals((Actions.calculator(-2147483648, -2147483648, '/')), "1");
    }

    @Test
    public void divideWithAllPositiveNumbersTest() {
        assertEquals((Actions.calculator(55, 5, '/')), "11");
    }

    @Test
    public void divideWithFirstPositiveNumberTest() {
        assertEquals((Actions.calculator(36, -6, '/')), "-6");
    }

    @Test
    public void divideWithSecondPositiveNumberTest() {
        assertEquals((Actions.calculator(-36, 6, '/')), "-6");
    }

    @Test
    public void divideWithAllNegativeNumbersTest() {
        assertEquals((Actions.calculator(-36, -6, '/')), "6");
    }

    @Test
    public void divideWithNotIntegerResultTest() {
        assertEquals((Actions.calculator(60, 33, '/')), "1.818181818181818181818181818181818");
    }

    @Test
    public void divideMaxTest() {
        assertEquals((Actions.calculator(2147483647, 2147483647, '/')), "1");
    }
}