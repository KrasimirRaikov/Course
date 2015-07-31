package com.clouway.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
class Sumator {
  /**
   * Calculates the sum of two integers
   * @param a int one
   * @param b int two
   * @return return's the value of the sum of both integers
   */
  public int sum(int a,int b){
    return a+b;
  }

  /**
   * Calculates the sum of two doubles
   * @param a double one
   * @param b double two
   * @return return's the value of the sum of the two doubles
   */
  public double sum(double a, double b){
    return a+b;
  }

  /**
   * Adds two Strings together
   * @param a String one
   * @param b String two
   * @return returns the String that is the result of the two Strings
   */
  public String sum(String a, String b){
    return a+b;
  }

  /**
   * Calculates the sum of two BigIntegers
   * @param a BigInteger one
   * @param b BigInteger two
   * @return returns the sum of the two BigIntegers
   */
  public BigInteger sum(BigInteger a, BigInteger b){
    BigInteger c;
    c= a.add(b);
    return c;
  }

  /**
   * Calculates the sum of two BigDecimals
   * @param a BigDecimal one
   * @param b BigDecimal two
   * @return returns the sum of the two BigDecimals
   */
  public BigDecimal sum(BigDecimal a, BigDecimal b){
    BigDecimal c;
    c= a.add(b);
    return c;
  }


}
