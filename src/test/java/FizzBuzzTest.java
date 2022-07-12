import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fizzBuzzStringStartsWithF() {
        String testString = "first";
        String testResult = fizzBuzz.fizzBuzzString(testString);
        assertEquals("Fizz", testResult );
    }

    @Test
    void fizzBuzzStringEndsWithB() {
        String testString = "cab";
        String testResult  = fizzBuzz.fizzBuzzString(testString);
        assertEquals("Buzz", testResult );
    }

    @Test
    void fizzBuzzStringBothCases() {
        String testString = "fab";
        String testResult  = fizzBuzz.fizzBuzzString(testString);
        assertEquals("FizzBuzz", testResult );
    }

    @Test
    void fizzBuzzNull() {
        String testString = null;
        String testResult = fizzBuzz.fizzBuzzString(testString);
        assertNull(testResult);
    }


}