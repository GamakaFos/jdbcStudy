import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(4, simpleCalculator.add(2,2));
    }

    @Test
    void threePlusTenEqualTherteen(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(13, simpleCalculator.add(3,10));
    }

    @Test
    void divideByZeroExceptionTest(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertThrows(ArithmeticException.class, () -> simpleCalculator.divide(1, 0), "Divide by zero exception");
    }
    //ArithmeticException.class

    @Test
    void test(){
        System.out.println("This test runs");
    }

}