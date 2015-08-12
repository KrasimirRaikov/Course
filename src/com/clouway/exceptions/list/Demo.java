package com.clouway.exceptions.list;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Demo {
  public static void main(String[] args) {
    ListOperations list = new ListOperations();
    list.setMaxLength(11);
    list.add("some string");
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.remove();
    list.printAll();
    System.out.println("-----------------------------------------------");
    list.remove();
    list.remove();
    list.remove();
    list.remove();
    list.printAll();
    System.out.println("-----------------------------------------------");
    list.remove();
    System.out.println("-----------------------------------------------");
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");
    list.add("6");
    list.add("7");
    list.add("8");
    list.add("9");
    list.add("10");
    list.add("11");
    list.add("12");
  }
}
