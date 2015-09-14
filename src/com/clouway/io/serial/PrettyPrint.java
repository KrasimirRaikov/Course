package com.clouway.io.serial;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class PrettyPrint {
  private int numChars;

  public PrettyPrint(int numChars) {
    this.numChars = numChars;
  }

  public void pPrint(String type, String... info) {
    int breaksNeaded = 1;
    System.out.print("|");
    for (int i = type.length(); i < numChars; i++) {
      type += " ";
    }
    System.out.print(type + "|");

    for (String s : info) {
      for (int i = s.length(); i < numChars; i++) {
        s += " ";
      }
      System.out.print(s + "|");
      breaksNeaded++;

    }
    String breaker = "";
    for (int i = 0; i < breaksNeaded * numChars + (breaksNeaded + 1); i++) {
      breaker += "-";
    }
    System.out.println();
    System.out.println(breaker);

  }

  public void pPrint(String type, int... info) {
    int breaksNeaded = 1;
    System.out.print("|");
    for (int i = type.length(); i < numChars; i++) {
      type += " ";
    }
    System.out.print(type + "|");

    for (int k : info) {
      String s = Integer.toString(k);
      for (int i = s.length(); i < numChars; i++) {
        s += " ";
      }
      System.out.print(s + "|");
      breaksNeaded++;

    }
    String breaker = "";
    for (int i = 0; i < breaksNeaded * numChars + (breaksNeaded + 1); i++) {
      breaker += "-";
    }
    System.out.println();
    System.out.println(breaker);
  }
}
