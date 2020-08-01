package tddbc.fizzbuzz;

import java.util.function.Consumer;

public class Runner {

  private IChecker checker;

  public Runner(IChecker _checker) {
    checker = _checker;
  }

  public void runFizzBuzz(Consumer<String> output, int limit) {
    for(int i=1; i <= limit; i++) {
      output.accept(checker.checkFizzBuzz(i));
    }
  }
}