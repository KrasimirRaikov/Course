package com.clouway.exceptions.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class ListOperations {
  private List list = new ArrayList();
  private int listSize = 0;

  public void setMaxLength(int listMaxLength) {
    listSize = listMaxLength;
  }

  public void add(Object object) {
    try {
      if (list.size() < listSize) {
        list.add(object);
      } else {
        throw new MaxLengthReachedException();
      }
    } catch (MaxLengthReachedException e) {
      System.out.println("Sorry the limit of the list is reached");
    }
  }

  public void remove() {
    try {
      if (list.size() > 0) {
        list.remove(list.size() - 1);
      } else {
        throw new EmptyListException();
      }
    } catch (EmptyListException e) {
      System.out.println("You cannot remove elements from an empty list");
    }
  }

  public void printAll() {
    try {
      if (list.size() > 0) {
        for (Object object : list) {
          String element = (String) object;
          System.out.print("[" + element + "] ");
        }
        System.out.println("");
      } else {
        throw new EmptyListException();
      }
    } catch (EmptyListException e) {
      System.out.println("Sorry can't print empty list");
    }
  }

}
