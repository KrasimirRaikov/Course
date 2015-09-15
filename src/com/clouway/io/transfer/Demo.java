package com.clouway.io.transfer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    Path in = Paths.get("src/com/clouway/io/transfer/xanadu");
    Path out = Paths.get("src/com/clouway/io/transfer/outagain");
    try (InputStream input = new BufferedInputStream(Files.newInputStream(in));
         OutputStream output = new BufferedOutputStream(Files.newOutputStream(out))) {
      TransferObject trans = new TransferObject();
      trans.transfer(input, output, 25, 35);
    }
  }
}
