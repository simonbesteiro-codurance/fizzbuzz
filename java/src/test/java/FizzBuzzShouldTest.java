import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzShouldTest {

    @ParameterizedTest
    @CsvSource({
      "1, 1",
      "2, 2",
      "4, 4"
    })
    public void return_the_number_when_not_divisible_by_three_or_five(int givenNumber, String expected) {
        assertEquals(expected, FizzBuzz.convert(givenNumber));
    }

    @ParameterizedTest
    @CsvSource({
      "3, fizz",
      "6, fizz",
      "9, fizz"
    })
    public void return_fizz_when_divisible_by_three(int givenNumber, String expected) {
      assertEquals(expected, FizzBuzz.convert(givenNumber));
    }

    @ParameterizedTest
    @CsvSource({
      "5, buzz",
      "10, buzz",
      "20, buzz"
    })
    public void return_buzz_when_number_is_divisible_by_five(int givenNumber, String expected) {
      assertEquals(expected, FizzBuzz.convert(givenNumber));
    }

    @ParameterizedTest
    @CsvSource({
      "15, fizzbuzz",
      "30, fizzbuzz",
      "90, fizzbuzz"
    })
      public void return_buzz_when_number_is_divisible_by_fifteen(int givenNumber, String expected) {
      assertEquals(expected, FizzBuzz.convert(givenNumber));
    }
}
