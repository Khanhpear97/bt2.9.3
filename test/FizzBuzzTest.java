import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void test1FizzTranslateBiggerThanMax() {
        int number = 105;
        String expected = "Data number not exactly";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void test1FizzBuzzDivisibleBy3() {
        int number = 6;
        String expected = "Fizz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void test2FizzBuzzDivisibleBy3() {
        int number = 9;
        String expected = "Fizz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void test1FizzBuzzDivisibleBy5() {
        int number = 10;
        String expected = "Buzz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void test2FizzBuzzDivisibleBy5() {
        int number = 20;
        String expected = "Buzz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void test1FizzBuzzDivisibleBy3And5() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void test2FizzBuzzDivisibleBy3And5() {
        int number = 30;
        String expected = "FizzBuzz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void test1FizzBuzzNotDivisibleBy3And5() {
        int number = 4;
        String expected = "Bon";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void test2FizzBuzzNotDivisibleBy3And5() {
        int number = 8;
        String expected = "Tam";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void test1FizzTranslate1DigitNumber() {
        int number = 4;
        String expected = "Bon";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void test1FizzTranslate2DigitNumber() {
        int number = 26;
        String expected = "Hai muoi Sau";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzzHaveNumber3() {
        int number = 23;
        String expected = "Fizz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzzHaveNumber5() {
        int number = 52;
        String expected = "Buzz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzzHaveNumber3And5() {
        int number = 53;
        String expected = "FizzBuzz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
}