import Helpers.Actions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionalTests {

    @Test
    public void additionalMinTest() {
        assertEquals((Actions.calculator(-2147483648, -2147483648, '+')), "-4294967296");
    }

    @Test
    public void additionalWithAllPositiveNumbersTest() {
        assertEquals((Actions.calculator(2, 7, '+')), "9");
    }

    @Test
    public void additionalWithFirstNegativeNumberTest() {
        assertEquals((Actions.calculator(-6, 4, '+')), "-2");
    }

    @Test
    public void additionalWithSecondNegativeNumberTest() {
        assertEquals((Actions.calculator(8, -3, '+')), "5");
    }

    @Test
    public void additionalWithAllNegativeNumbersTest() {
        assertEquals((Actions.calculator(-5, -8, '+')), "-13");
    }

    @Test
    public void additionalWithNegativeResultTest() {
        assertEquals((Actions.calculator(-20, 4, '+')), "-16");
    }

    @Test
    public void additionalMaxTest() {
        assertEquals((Actions.calculator(2147483647, 2147483647, '+')), "4294967294");
    }
}
