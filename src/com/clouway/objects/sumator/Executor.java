package com.clouway.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Executor {
  public static void main(String[] args){
    int aI= 3;
    int bI= 4;
    Sumator sumator= new Sumator();
    System.out.println(sumator.sum(aI, bI));

    double aD= 3d;
    double bD= 4d;

    System.out.println(sumator.sum(aD, bD));

    String aS= "What's ";
    String bS= "up?";
    System.out.println(sumator.sum(aS, bS));

    BigInteger aBI= BigInteger.valueOf(3);
    BigInteger bBI= BigInteger.valueOf(9);

    System.out.println(sumator.sum(aBI, bBI));

    BigDecimal aBD= BigDecimal.valueOf(3);
    BigDecimal bBD= BigDecimal.valueOf(9);

    System.out.println(sumator.sum(aBD, bBD));

    System.out.println("Sum of 56 and 4 is: " + sumator.sum("56.7", "4"));


  }

}
