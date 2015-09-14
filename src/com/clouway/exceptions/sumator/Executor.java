package com.clouway.exceptions.sumator;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Executor {
  public static void main(String[] args) {
    StringSumator sumator = new StringSumator();

      int sum=sumator.sum("404","2");
    if (sum==404101) {
      System.out.println("Sorry NumberFormatException");
    } else {
      System.out.println(sum);
    }


  }

}
