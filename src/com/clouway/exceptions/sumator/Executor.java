package com.clouway.exceptions.sumator;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Executor {
  public static void main(String[] args) {
    Sumator sumator = new Sumator();

    String aS = "What's ";
    String bS = "up?";
    System.out.println(sumator.sum(aS, bS));

    System.out.println(sumator.sum("532", "321"));
    System.out.println(sumator.sum("23.53", "17.21"));


  }

}
