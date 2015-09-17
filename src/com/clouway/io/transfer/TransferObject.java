package com.clouway.io.transfer;

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
   * Transfer's given number of bytes from InputStream to OutputStream
   * @param in the InputStream to be read
   * @param out the OutputStream to be written to
   * @param numberOfBytes the number of bytes to be transferred
   * @param limit the point to which the transfer reaches
   * @throws IOException
   */
  public void  transfer(InputStream in, OutputStream out, int numberOfBytes, int limit) throws IOException {
    long s= limit-numberOfBytes-1;
    in.skip(s);
    for(int n=0; n<numberOfBytes; n++){
      out.write(in.read());
    }
    out.flush();
  }




}
