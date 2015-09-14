package com.clouway.exceptions.list;

import java.util.ArrayList;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class ListOperations {
  private java.util.List<Object> list = new ArrayList<>();
  private final int listSize;

  public ListOperations(int maxElements) {
    this.listSize = maxElements;
  }
 /* public String message = "";*/



  /**
   * Adds object to the list
   *
   * @param object to be added to the list
   */
  public void add(Object object) {

      if (list.size() < listSize) {
        list.add(object);

      }
    else{
    throw new MaxLengthReachedException("Sorry the limit of the list is reached can't add " + object);
      }

  }

    /**
   * Removes the last element of the list
   */
  public void remove() {

      if (list.size() > 0) {
        list.remove(list.size() - 1);
      } else {
        throw new EmptyListException("You cannot remove elements from an empty list");
      }

  }

  /*
  returns the entire list
   */
  public java.util.List<Object> printAll() {
    if(list.isEmpty()){
      return null;
    }
   return list;
  }

}
