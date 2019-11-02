import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc = new Calculator();

    @Test
    public void addTest() {
        int sum = calc.add(1, 2);
        int expectedSum = 3;
        assertEquals(expectedSum, sum);
    }

    @Test
    public void multiplyTest() {
        int product = calc.multiply(1, 2);
        int expectedProduct = 2;
        assertEquals(expectedProduct, product);
    }
}