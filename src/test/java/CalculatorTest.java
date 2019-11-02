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

    @Test
    public void divideTest() {
        double quotient = calc.divide(1,2);
        double expectedQuotient = 0.5;
        assertEquals(expectedQuotient, quotient, 0.01);
    }
}