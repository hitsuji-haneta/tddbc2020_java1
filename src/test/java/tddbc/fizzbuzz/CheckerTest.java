package tddbc.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class CheckerTest {
  private Checker checker;

  @BeforeEach
  void setup() {
    checker = new Checker();
  }

  @Test
  @DisplayName("should return \"1\" when the arg is 1")
  void shouldReturn1() {
    assertEquals("1", checker.checkFizzBuzz(1));
  }

  @Test
  @DisplayName("should return \"2\" when the arg is 2")
  void shouldReturn2() {
    assertEquals("2", checker.checkFizzBuzz(2));
  }

  @Test
  @DisplayName("should return \"Fizz\" when the arg is a multiple of 3")
  void shouldReturnFizzOnMulti3() {
    assertAll("Fizz",
      () -> assertEquals("Fizz", checker.checkFizzBuzz(33)),
      () -> assertEquals("Fizz", checker.checkFizzBuzz(333))
    );
  }


  @Test
  @DisplayName("should return \"Buzz\" when the arg is a multiple of 5")
  void shouldReturnFizzOnMulti5() {
    assertAll("Buzz",
      () -> assertEquals("Buzz", checker.checkFizzBuzz(5)),
      () -> assertEquals("Buzz", checker.checkFizzBuzz(550))
    );
  }

  @Test
  @DisplayName("should return \"FizzBuzz\" when the arg is a multiple of 3 and 5")
  void shouldReturnFizzBuzzOnMulti3and5() {
    assertAll("FizzBuzz",
      () -> assertEquals("FizzBuzz", checker.checkFizzBuzz(15)),
      () -> assertEquals("FizzBuzz", checker.checkFizzBuzz(45))
    );
  }
}