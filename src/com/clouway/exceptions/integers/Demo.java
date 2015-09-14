package com.clouway.exceptions.integers;

import java.util.Scanner;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Demo {
  public static void main(String[] args) {
    Interval oneToOnehundred = new Interval(0, 100);
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer between 0 and 100");
    int s = scan.nextInt();
    boolean check = oneToOnehundred.contains(s);
    System.out.println(check);
  }
}
