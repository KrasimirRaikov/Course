package com.clouway.exceptions.sumator;


/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
class Sumator {

  /**
   * Adds two Strings together
   *
   * @param a String one
   * @param b String two
   * @return returns the int that is the result of the two Strings
   */
  public int sum(String a, String b) {
    try {
      int c = Integer.parseInt(a);
      int d = Integer.parseInt(b);
      return c + d;
    } catch (NumberFormatException e) {
      return 404101;
    }
  }
}
