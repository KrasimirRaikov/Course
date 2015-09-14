package com.clouway.io.transfer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    Path in = Paths.get("src/com/clouway/io/transfer/xanadu");
    Path out = Paths.get("src/com/clouway/io/transfer/outagain");
    Charset charset = Charset.forName("UTF-8");
    try (BufferedReader input = Files.newBufferedReader(in, charset);
         BufferedWriter output = Files.newBufferedWriter(out, charset, CREATE, TRUNCATE_EXISTING)) {
      TransferObject trans = new TransferObject();
      trans.transfer(input, output, 3);
    }
  }
}
