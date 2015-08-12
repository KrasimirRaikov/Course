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

    System.out.println(sumator.sum("-43", "7545823"));


  }

}
