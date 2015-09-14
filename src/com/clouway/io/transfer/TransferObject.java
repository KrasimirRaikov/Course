package com.clouway.io.transfer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class TransferObject {
  /*
  transfers data from InputStream to OutputStream
   */
  public void transfer(InputStream in, OutputStream out) throws IOException {
    int byteIn;
    while ((byteIn = in.read()) != -1) {
      out.write(byteIn);
    }
    out.flush();
  }

  /*
  transfers data from FileReader to FileWriter
   */
  public void transfer(FileReader in, FileWriter out) throws IOException {
    int ch;
    while ((ch = in.read()) != -1) {
      out.write(ch);
    }
    out.flush();
  }

  /*
  transfers data from BufferedReader to BufferedWriter
   */
  public void transfer(BufferedReader in, BufferedWriter out) throws IOException {
    String str;
    while ((str = in.readLine()) != null) {
      out.write(str);
      out.newLine();
    }
    out.flush();
  }

  /*
  transfers given number of bytes from one stream to another
   */
  public void transfer(InputStream in, OutputStream out, int size) throws IOException {
    for (int i = 0; i < size; i++) {
      out.write(in.read());
    }
    out.flush();
  }

  /*
  transfers given number of characters from one stream to another
   */
  public void transfer(FileReader in, FileWriter out, int size) throws IOException {
    for (int i = 0; i < size; i++) {
      out.write(in.read());
    }
    out.flush();
  }

  /*
  transfers given number of lines from one stream to another
   */
  public void transfer(BufferedReader in, BufferedWriter out, int lines) throws IOException {
    String str;
    for (int i = 0; i < lines; i++) {
      str = in.readLine();
      out.write(str);
      out.newLine();
    }
    out.flush();
  }


}
