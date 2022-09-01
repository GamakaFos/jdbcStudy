import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    Grader grader;

    @BeforeEach
    void init(){
        grader = new Grader();
    }

    @Test
    void zeroShouldReturnF(){
        assertEquals('F', grader.determineLetterGrade(0), "Testing .determineLetterGrade() method. Test case: if student's points are 0, grade is have to be 'F'");
    }

    @Test
    void fiftyNineShouldReturnF(){
        assertEquals('F', grader.determineLetterGrade(59), "Testing .determineLetterGrade() method.Test case: if student's points are 59, grade is have to be 'F'");
    }

    @Test
    void sixtyShouldReturnD(){
        assertEquals('D', grader.determineLetterGrade(60), "Testing .determineLetterGrade() method.Test case: if student's points are 60, grade is have to be 'D'");
    }

    @Test
    void sixtyNineShouldReturnD(){
        assertEquals('D', grader.determineLetterGrade(69), "Testing .determineLetterGrade() method.Test case: if student's points are 69, grade is have to be 'D'");
    }

    @Test
    void seventyShouldReturnC(){
        assertEquals('C', grader.determineLetterGrade(70), "Testing .determineLetterGrade() method.Test case: if student's points are 70, grade is have to be 'C'");
    }

    @Test
    void seventyNineShouldReturnC(){
        assertEquals('C', grader.determineLetterGrade(79), "Testing .determineLetterGrade() method.Test case: if student's points are 79, grade is have to be 'C'");
    }

    @Test
    void eightyShouldReturnB(){
        assertEquals('B', grader.determineLetterGrade(80), "Testing .determineLetterGrade() method.Test case: if student's points are 80, grade is have to be 'B'");
    }

    @Test
    void eightyNineShouldReturnB(){
        assertEquals('B', grader.determineLetterGrade(89), "Testing .determineLetterGrade() method.Test case: if student's points are 89, grade is have to be 'B'");
    }

    @Test
    void ninetyShouldReturnA(){
        assertEquals('A', grader.determineLetterGrade(90), "Testing .determineLetterGrade() method.Test case: if student's points are 90, grade is have to be 'A'");
    }

    @Test
    void ninetyNineShouldReturnA(){
        assertEquals('A', grader.determineLetterGrade(99), "Testing .determineLetterGrade() method.Test case: if student's points are 99, grade is have to be 'A'");
    }

    @Test
    void negativeOneShouldReturnIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> {
            grader.determineLetterGrade(-1);
        }, "Testing IllegalArgumentException throw. Test case: if student's points are -1, throws exception");
    }
}