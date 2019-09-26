package org.examples;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author raasanch
 */
public class FibonacciTest {

  @Test
  public void validateZero() {
    int fibonacciSearchedNumber = 0;
    int fibonacci = Fibonacci.getNthFib(fibonacciSearchedNumber);
    int expected = 0;
    Assert.assertEquals(expected, fibonacci);
  }

  @Test
  public void validateOne() {
    int fibonacciSearchedNumber = 1;
    int fibonacci = Fibonacci.getNthFib(fibonacciSearchedNumber);
    int expected = 0;
    Assert.assertEquals(expected, fibonacci);
  }

  @Test
  public void validateTwo() {
    int fibonacciSearchedNumber = 2;
    int fibonacci = Fibonacci.getNthFib(fibonacciSearchedNumber);
    int expected = 1;
    Assert.assertEquals(expected, fibonacci);
  }

  @Test
  public void validateTree() {
    int fibonacciSearchedNumber = 3;
    int fibonacci = Fibonacci.getNthFib(fibonacciSearchedNumber);
    int expected = 1;
    Assert.assertEquals(expected, fibonacci);
  }

  @Test
  public void validateTen() {
    int fibonacciSearchedNumber = 10;
    int fibonacci = Fibonacci.getNthFib(fibonacciSearchedNumber);
    int expected = 34;
    Assert.assertEquals(expected, fibonacci);
  }
}
