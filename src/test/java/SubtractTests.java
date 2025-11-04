import Helpers.Actions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SubtractTests {

    @Test
    public void subtractMinTest() {
        assertEquals((Actions.calculator(-2147483648, -2147483648, '-')), "0");
    }

    @Test
    public void subtractWithPositiveResultTest() {
        assertEquals((Actions.calculator(12, 6, '-')), "6");
    }

    @Test
    public void subtractWithFirstPositiveNumberTest() {
        assertEquals((Actions.calculator(7, -10, '-')), "17");
    }

    @Test
    public void subtractWithSecondPositiveNumberTest() {
        assertEquals((Actions.calculator(-7, 10, '-')), "-17");
    }

    @Test
    public void subtractWithNegativeResultTest() {
        assertEquals((Actions.calculator(10, 14, '-')), "-4");
    }

    @Test
    public void subtractBoundaryValueTest() {
        assertEquals((Actions.calculator(2147483647, -2147483648, '-')), "4294967295");
    }

    @Test
    public void subtractMaxTest() {
        assertEquals((Actions.calculator(2147483647, 2147483647, '-')), "0");
    }
}