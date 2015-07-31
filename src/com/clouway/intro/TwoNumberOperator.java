package com.clouway.intro;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class TwoNumberOperator {
  /**
   * searches for the biggest common divider of two number
   *
   * @param a first number from which searches the biggest common divider
   * @param b second number from which searches the biggest common divider
   * @return the biggest common divider
   */
  public int getBigCD(int a, int b) {
    int c = a > b ? a : b;
    int g = a < b ? a : b;
    int red = 1;
    int bcd = 13;
    while (red != 0) {
      bcd = g;
      red = c % g;
      c = g;
      g = red;
    }
    return bcd;
  }


  /**
   * searches for the smallest dividable number from two numbers
   *
   * @param a first number from which searches the smallest number to be divided by
   * @param b second number from which searches the smallest number to be divided by
   * @return the smallest dividable number
   */
  public int getSD(int a, int b) {
    int smallD;
    if (getBigCD(a, b) == 1) {
      smallD = a * b;
    } else {
      smallD = (a * b) / getBigCD(a, b);
    }
    return smallD;
  }


}
