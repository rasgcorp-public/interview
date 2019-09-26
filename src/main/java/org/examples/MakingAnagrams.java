package org.examples;

import java.util.Arrays;

/**
 * @author raasanch
 */
public class MakingAnagrams {

  public static int makeAnagram(String word1, String word2) {
    char[] charsWord1 = getSortedArray(word1);
    char[] charsWord2 = getSortedArray(word2);
    return compare(charsWord1, charsWord2, 0);
  }

  private static int compare(char[] charsWord1, char[] charsWord2, int count) {
    if (charsWord1.length == 0 || charsWord2.length == 0) {
      return count + charsWord1.length + charsWord2.length;
    }
    char letter1 = charsWord1[0];
    char letter2 = charsWord2[0];
    if (letter1 == letter2) {
      return compare(removeFirstItem(charsWord1), removeFirstItem(charsWord2), count);
    } else {
      count++;
      if (isPresent(letter1, charsWord2)) {
        return compare(charsWord1, removeFirstItem(charsWord2), count);
      }
      return compare(removeFirstItem(charsWord1), charsWord2, count);
    }
  }

  private static boolean isPresent(char searchedLetter, char[] charsWord2) {
    for (char letter :
        charsWord2) {
      if (letter == searchedLetter) {
        return true;
      }
    }
    return false;
  }

  private static char[] removeFirstItem(char[] charsWord1) {
    char[] newArray = new char[charsWord1.length - 1];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = charsWord1[i + 1];
    }
    return newArray;
  }

  private static char[] getSortedArray(String word) {
    char[] sortedArray = word.toCharArray();
    Arrays.sort(sortedArray);
    return sortedArray;
  }
}
