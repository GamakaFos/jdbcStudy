import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    SimpleCalculator simpleCalculator;
    @BeforeEach
    void init(){
        simpleCalculator = new SimpleCalculator();
    }

    @Test
    void twoPlusTwoShouldEqualFour(){
        int expected = 4;
        int actual = simpleCalculator.add(2,2);
        assertEquals(expected, actual, "Testing .add() method with arguments 2, 2");
    }

    @Test
    void threePlusTenEqualThirteen(){
        int expected = 13;
        int actual = simpleCalculator.add(3,10);
        assertEquals(expected, actual, "Testing .add() method with arguments 3, 10");
    }

    @Test
    void divideByZeroExceptionTest(){
        assertThrows(ArithmeticException.class, () -> simpleCalculator.divide(1, 0), "Divide by zero exception");
    }
    //ArithmeticException.class

    @Test
    void test(){
        System.out.println("This test runs");
    }

}