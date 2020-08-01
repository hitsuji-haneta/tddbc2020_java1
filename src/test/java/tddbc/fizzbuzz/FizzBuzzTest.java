package tddbc.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class FizzBuzzTest {
  @Test
  @DisplayName("should return \"1\" when the arg is 1")
  void shouldReturn1() {
    FizzBuzz fz = new FizzBuzz();
    Assertions.assertEquals(fz.checkFizzBuzz(1), "1");
  }

  @Test
  @DisplayName("should return \"2\" when the arg is 2")
  void shouldReturn2() {
    FizzBuzz fz = new FizzBuzz();
    Assertions.assertEquals(fz.checkFizzBuzz(2), "2");
  }

  @Test
  @DisplayName("should return \"Fizz\" when the arg is a multiple of 3")
  void shouldReturnFizzOnMulti3() {
    FizzBuzz fz = new FizzBuzz();
    Assertions.assertEquals(fz.checkFizzBuzz(3), "Fizz");
    Assertions.assertEquals(fz.checkFizzBuzz(6), "Fizz");
    Assertions.assertEquals(fz.checkFizzBuzz(12), "Fizz");
    Assertions.assertEquals(fz.checkFizzBuzz(333), "Fizz");
  }


  @Test
  @DisplayName("should return \"Buzz\" when the arg is a multiple of 5")
  void shouldReturnFizzOnMulti5() {
    FizzBuzz fz = new FizzBuzz();
    Assertions.assertEquals(fz.checkFizzBuzz(5), "Buzz");
    Assertions.assertEquals(fz.checkFizzBuzz(25), "Buzz");
    Assertions.assertEquals(fz.checkFizzBuzz(500), "Buzz");
  }

  @Test
  @DisplayName("should return \"FizzBuzz\" when the arg is a multiple of 3 and 5")
  void shouldReturnFizzBuzzOnMulti3and5() {
    FizzBuzz fz = new FizzBuzz();
    Assertions.assertEquals(fz.checkFizzBuzz(15), "FizzBuzz");
    Assertions.assertEquals(fz.checkFizzBuzz(300), "FizzBuzz");
  }
}