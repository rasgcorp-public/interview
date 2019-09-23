package org.examples;

public class LeftRotation {

  public static int[] rotateLeft(int[] array, int rotationsNumber) {
    int[] rotatedArray = array;
    for (int i = 0; i < rotationsNumber; i++) {
      int firstValue = rotatedArray[0];
      for (int j = 0; j < array.length - 1; j++) {
        rotatedArray[j] = rotatedArray[j + 1];
      }
      rotatedArray[array.length - 1] = firstValue;
    }
    return rotatedArray;
  }
}
