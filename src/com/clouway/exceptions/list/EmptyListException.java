package com.clouway.exceptions.list;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class EmptyListException extends RuntimeException {
  public EmptyListException(String message) {

    super(message);
  }
}
