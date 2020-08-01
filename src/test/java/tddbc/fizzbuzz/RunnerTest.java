package tddbc.fizzbuzz;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.function.Consumer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class RunnerTest {

  private Checker mockChecker;
  private Runner runner;

  @BeforeEach
  void setup() {
    mockChecker = mock(Checker.class);
    runner = new Runner(mockChecker);
    when(mockChecker.checkFizzBuzz(anyInt())).thenReturn("mock value");
  }

  @Test
  @DisplayName("should call checkFizzBuzz N times")
  void shouldCallCheckFizzBuzz(){
    // Arrange
    Consumer<String> output = (result) -> {};
    int n = 100;

    // Action
    runner.runFizzBuzz(output, n);

    // Assert
    verify(mockChecker, times(n)).checkFizzBuzz(anyInt());
  }

  @Test
  @DisplayName("should call output 100times")
  void shouldCallOUtput(){
    // Arrange
    Consumer<String> mockOutput = (Consumer<String>) mock(Consumer.class);
    int n = 100;

    // Action
    runner.runFizzBuzz(mockOutput, n);

    // Assert
    verify(mockOutput, times(n)).accept(anyString());
  }

}