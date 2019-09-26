package org.examples;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author raasanch
 */
public class SumEvenNumbersAfterQueriesTest {

  @Test
  public void shouldReturnAUniqueItemArrayWhenOneQueryIsExecuted() {
    int[] arreglo = new int[]{1};
    int[][] queries = new int[][]{{1, 0}};
    int[] resultArray = SumEvenNumbers.sumEvenAfterQueries(arreglo, queries);
    int[] expectedResult = new int[]{2};
    Assert.assertArrayEquals(expectedResult, resultArray);
  }

  @Test
  public void shouldReturnAnArrayOfTwoItemsWhenTwoQueriesAreExecuted() {
    int[] arreglo = new int[]{1, 2};
    int[][] queries = new int[][]{{1, 0}, {2, 1}};
    int[] resultArray = SumEvenNumbers.sumEvenAfterQueries(arreglo, queries);
    int[] expectedResult = new int[]{4, 6};
    Assert.assertArrayEquals(expectedResult, resultArray);
  }
}
