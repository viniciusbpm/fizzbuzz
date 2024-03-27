import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void testNumberNotDivisibleAndDontContainsThreeOrFive(){
        assertEquals("1", fizzBuzz.getOutputFor(1));
    }

    @Test
    void testNumberDivisibleByThree(){
        assertEquals("Fizz", fizzBuzz.getOutputFor(6));
    }

    @Test
    void testNumberDivisibleByFive(){
        assertEquals("Buzz", fizzBuzz.getOutputFor(10));
    }

    @Test
    void testNumberContainsThree(){
        assertEquals("Fizz", fizzBuzz.getOutputFor(23));
    }

    @Test
    void testNumberContainsFive(){
        assertEquals("Buzz", fizzBuzz.getOutputFor(52));
    }

    @Test
    void testNumberContainsThreeAndFive(){
        assertEquals("FizzBuzz", fizzBuzz.getOutputFor(53));
    }
}
