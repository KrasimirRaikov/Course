package com.clouway.exceptions.list;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class MaxLengthReachedException extends RuntimeException {
  public MaxLengthReachedException(String message) {
    super(message);
  }
}
