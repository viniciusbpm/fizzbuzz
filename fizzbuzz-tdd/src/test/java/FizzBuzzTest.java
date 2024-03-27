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
}
