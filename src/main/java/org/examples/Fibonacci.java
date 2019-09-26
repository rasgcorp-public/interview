package org.examples;

/**
 * @author raasanch
 */
public class Fibonacci {

  public static int getNthFib(int number) {
    if (number == 0 || number == 1) {
      return 0;
    }
    if (number == 2 || number == 3) {
      return 1;
    }
    if (number == 4) {
      return 2;
    }

    return getFib(number, 4, 1, 2);
  }

  private static int getFib(int number, int index, int previousCount, int count) {
    if (number == index) {
      return count;
    }
    return getFib(number, ++index, count, previousCount + count);
  }
}
