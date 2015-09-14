package com.clouway.io.console;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Console {
  private Scanner scan = new Scanner(System.in);

  /*
  Reads string from the console
   */
  public String readString() {
    return scan.nextLine();
  }

  /*
  reads int from the console
   */
  public int readInt() throws InputMismatchException {
    return scan.nextInt();
  }

  /*
  reads char from the console
   */
  public char readChar() {
    char[] chArr;
    chArr = scan.next().toCharArray();
    return chArr.length > 0 ? chArr[0] : 'a';
  }

  /*
  reads float from the console
   */
  public float readFloat() {
    return scan.nextFloat();
  }

}
