package com.clouway.exceptions.integers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Int {
  /**
   * Checks a number if it is between 0 and 100
   *
   * @return 1 if the number is between 0 and 100, and 101 if it is not
   * 102 if the input is something else then a number
   */
  public int check() {
      try {
      Scanner scan = new Scanner(System.in);
      int s = scan.nextInt();
      //assert s<100:"Integer out of interval";
      if (s < 0 || s > 100) {
        throw new IntegerOutOfIntervalException();
      }
      scan.close();
      return 1;
    } catch (IntegerOutOfIntervalException m) {
      return 101;
    }
      catch(InputMismatchException i){
      return 102;
    }
  }
}
