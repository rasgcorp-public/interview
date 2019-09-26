package org.examples;

/**
 * @author raasanch
 */
public class SumEvenNumbers {

  public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
    int[] resultArray = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
      A[queries[i][1]] += queries[i][0];
      resultArray[i] = sumEvenNumbers(A);
    }
    return resultArray;
  }

  private static int sumEvenNumbers(int[] arreglo) {
    int sum = 0;
    for (int item : arreglo) {
      if (item % 2 == 0) {
        sum += item;
      }
    }
    return sum;
  }
}
