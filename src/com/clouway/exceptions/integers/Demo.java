package com.clouway.exceptions.integers;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Demo {
  public static void main(String[] args) {

    Int checker = new Int();
    System.out.println("Enter an integer between 0 and 100");
    int check = checker.check();
    if (check==1) {
      System.out.println("Your integer is acceptable");
    }else if(check==101){
      System.out.println("IntegerOutOfIntervalException");
    }else if(check==102){
      System.out.println("InputMismatchException");
    } else {
      System.out.println("Sorry, your integer is not acceptable");
    }


  }
}
