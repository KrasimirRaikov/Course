package com.clouway.exceptions.integers;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Int {
  /**
   * Checks a number if it is between 0 and 100
   *
   * @return true if the number is between 0 and 100 and false if it is not
   */
  public int check() {
    try {
      Scanner scan = new Scanner(System.in);
      int s = scan.nextInt();
      if (s < 0 || s > 100) {
        throw new IntegerOutOfIntervalException();
      }
      return 1;
    } catch (IntegerOutOfIntervalException m) {
      return 101;
    }catch(InputMismatchException i){
      return 102;
    }
  }
}
