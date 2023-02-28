package Test;
import org.junit.Test;

import Model.Calculator;

import static org.junit.Assert.*;
/**
 * CalculatorTest
 */
public class CalculatorTest {
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        float result = calculator.sum(1, 2);
        assertEquals(3, result, 0);
    }

    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        float result = calculator.sub(1, 2);
        assertEquals(-1, result, 0);
    }
    
    @Test
    public void testMul(){
        Calculator calculator = new Calculator();
        float result = calculator.mul(3, -3);
        assertEquals(-9, result, 0);
    }

    @Test
    public void testDiv(){
        Calculator calculator = new Calculator();
        float result = calculator.div(9, 3);
        assertEquals(3, result, 0);
    }
}