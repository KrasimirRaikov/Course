package com.clouway.exceptions.integers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Demo {
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter an integer between 0 and 100");
      int s = scan.nextInt();
      if(s<0 || s>100){
        throw new IntegerOutOfIntervalException();
      }
      System.out.println("Good one");
    } catch (InputMismatchException e) {
      System.out.println("This is not an integer");
    }catch (IntegerOutOfIntervalException s){
      System.out.println("int out of interval");
    }

  }
}
