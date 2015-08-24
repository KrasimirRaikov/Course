package com.clouway.exceptions.sumator;


import java.math.BigDecimal;

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
  public BigDecimal sum(String a, String b) {
    try {
      BigDecimal k = new BigDecimal(a);
      BigDecimal m = new BigDecimal(b);
      k = k.add(m);
      return k;
    } catch (java.lang.NumberFormatException e) {
      falsePrint();
      return BigDecimal.valueOf(0);
    }
  }

  private void falsePrint() {

    System.out.print("incorrect input, error ");

  }


}
