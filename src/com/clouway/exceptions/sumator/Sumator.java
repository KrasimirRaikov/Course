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
  public float sum(String a, String b) {
    try {
      float s = Float.parseFloat(a);
      float t = Float.parseFloat(b);
      return s + t;
    } catch (java.lang.NumberFormatException e) {
      printFalse();
      return 0.030003f;
    }

  }

  public void printFalse() {

    System.out.print("incorrect input, error №: ");

  }


}
