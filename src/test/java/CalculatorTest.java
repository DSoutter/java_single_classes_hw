import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator();}

    @Test
    public void canAdd() {
        assertEquals(25, calculator.addNumbers(15, 10));
    }

    @Test
    public void canSubtract() {
        assertEquals(50, calculator.subtractNumber(80,30));
    }

    @Test
    public void canDivide() {
        assertEquals(4.50, calculator.divideNumber(9.00, 2.00), 0.01);
    }

    @Test
    public void canMultiply() {
        assertEquals(300, calculator.multiplyNumbers(50,6));
    }
}


