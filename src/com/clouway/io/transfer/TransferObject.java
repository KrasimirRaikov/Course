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
  /**
   *Transfers the bytes from Input stream to OutputStream
   * @param in InputStream to be read
   * @param out OutputStream to be written to
   * @throws IOException
   */
  public void transfer(InputStream in, OutputStream out) throws IOException {
    int byteIn;
    while ((byteIn = in.read()) != -1) {
      out.write(byteIn);
    }
    out.flush();
  }

  /**
   * Takes bytes from InputStream from the start int including
   * until the end int not included and trasfers them to the OutputStream
   * @param in InputStream to be read
   * @param out OutputStream to be written to
   * @param start the number of the byte from which to start the transfer
   * @param end the number which ends the transfer
   * @throws IOException
   */
  public void  transfer(InputStream in, OutputStream out, int start, int end) throws IOException {
    for (int i = 1; i < start; i++) {
      in.read();
    }
    for(;start<end;start++){
      out.write(in.read());
    }
    out.flush();
  }




}
