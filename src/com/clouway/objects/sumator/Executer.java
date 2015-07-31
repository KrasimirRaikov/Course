package com.clouway.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Executer {
  public static void main(String[] args){
    int aI= 3;
    int bI= 4;
    Sumator sumI= new Sumator();
    System.out.println(sumI.sum(aI, bI));

    double aD= 3d;
    double bD= 4d;
    Sumator sumD= new Sumator();
    System.out.println(sumD.sum(aD, bD));

    String aS= "What's ";
    String bS= "up?";
    Sumator sumS= new Sumator();
    System.out.println(sumS.sum(aS, bS));

    BigInteger aBI= BigInteger.valueOf(3);
    BigInteger bBI= BigInteger.valueOf(9);
    Sumator sumBI = new Sumator();
    System.out.println(sumBI.sum(aBI, bBI));

    BigDecimal aBD= BigDecimal.valueOf(3);
    BigDecimal bBD= BigDecimal.valueOf(9);
    Sumator sumBD = new Sumator();
    System.out.println(sumBD.sum(aBD, bBD));
  }
}
