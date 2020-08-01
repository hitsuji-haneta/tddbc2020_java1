package tddbc.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class CheckerTest {
  @Test
  @DisplayName("should return \"1\" when the arg is 1")
  void shouldReturn1() {
    Checker checker = new Checker();
    Assertions.assertEquals(checker.checkFizzBuzz(1), "1");
  }

  @Test
  @DisplayName("should return \"2\" when the arg is 2")
  void shouldReturn2() {
    Checker checker = new Checker();
    Assertions.assertEquals(checker.checkFizzBuzz(2), "2");
  }

  @Test
  @DisplayName("should return \"Fizz\" when the arg is a multiple of 3")
  void shouldReturnFizzOnMulti3() {
    Checker checker = new Checker();
    Assertions.assertEquals(checker.checkFizzBuzz(3), "Fizz");
    Assertions.assertEquals(checker.checkFizzBuzz(6), "Fizz");
    Assertions.assertEquals(checker.checkFizzBuzz(12), "Fizz");
    Assertions.assertEquals(checker.checkFizzBuzz(333), "Fizz");
  }


  @Test
  @DisplayName("should return \"Buzz\" when the arg is a multiple of 5")
  void shouldReturnFizzOnMulti5() {
    Checker checker = new Checker();
    Assertions.assertEquals(checker.checkFizzBuzz(5), "Buzz");
    Assertions.assertEquals(checker.checkFizzBuzz(25), "Buzz");
    Assertions.assertEquals(checker.checkFizzBuzz(500), "Buzz");
  }

  @Test
  @DisplayName("should return \"FizzBuzz\" when the arg is a multiple of 3 and 5")
  void shouldReturnFizzBuzzOnMulti3and5() {
    Checker checker = new Checker();
    Assertions.assertEquals(checker.checkFizzBuzz(15), "FizzBuzz");
    Assertions.assertEquals(checker.checkFizzBuzz(300), "FizzBuzz");
  }
}