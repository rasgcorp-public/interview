package org.examples;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LeftRotationTest {

  private static int[] array;

  @BeforeClass
  public static void init() {
    array = new int[]{1, 2, 3, 4, 5};
  }

  @Test
  public void validateMethodSight() {
    int[] array = new int[1];
    int rotationsNumber = 1;
    int[] rotatedArray = LeftRotation.rotateLeft(array, rotationsNumber);
    Assert.assertEquals(array.length, rotatedArray.length);
  }

  @Test
  public void validateRotateOne() {
    int rotationsNumber = 1;
    int[] expectedRotatedArray = new int[]{2, 3, 4, 5, 1};
    int[] rotatedArray = LeftRotation.rotateLeft(array.clone(), rotationsNumber);
    Assert.assertArrayEquals(expectedRotatedArray, rotatedArray);
  }

  @Test
  public void validateRotateTwo() {
    int rotationsNumber = 2;
    int[] expectedRotatedArray = new int[]{3, 4, 5, 1, 2};
    int[] rotatedArray = LeftRotation.rotateLeft(array.clone(), rotationsNumber);
    Assert.assertArrayEquals(expectedRotatedArray, rotatedArray);
  }


}
