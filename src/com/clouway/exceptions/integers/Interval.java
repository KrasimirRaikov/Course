package com.clouway.exceptions.integers;

import java.util.InputMismatchException;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Interval {
  private int intervalBeginning;
  private int intervalEnd;

  public Interval(int intervalBeginning, int intervalEnd){
    this.intervalBeginning=intervalBeginning;
    this.intervalEnd=intervalEnd;
  }
  /**
   * Checks a number if it is between 0 and 100
   *
   * @return 1 if the number is between 0 and 100, and 101 if it is not
   * 102 if the input is something else then a number
   */
  public boolean contains(int number) {
      try {
      if (number < intervalBeginning || number > intervalEnd) {
        throw new IntegerOutOfIntervalException();
      }
      return true;
    } catch (IntegerOutOfIntervalException m) {
      return false;
    }
      catch(InputMismatchException i){
      return false;
    }
  }
}
