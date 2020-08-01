package tddbc;

import java.util.function.Consumer;

import tddbc.fizzbuzz.Checker;
import tddbc.fizzbuzz.Runner;

public class Sample {

    public static void main(String[] args) {
        Checker checker = new Checker();
        System.out.println(checker.checkFizzBuzz(15));

        Consumer<String> output = (result) -> { System.out.println(result); };

        Runner runner = new Runner(checker);
        runner.runFizzBuzz(output, 100);
    }

    public String say() {
        return "Hello TDD BootCamp!";
    }
}