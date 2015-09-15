package com.clouway.io.console;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class File {
  public void writeToFile(Path path, String separator) throws IOException {
    Charset charset = Charset.forName("UTF-16");
    try (BufferedWriter out = Files.newBufferedWriter(path, charset, CREATE, TRUNCATE_EXISTING);
         Scanner scan = new Scanner(System.in)) {
      while (true) {
        String line = scan.nextLine();
        if (!line.equals(separator)) {

          out.write(line);
          out.newLine();
        } else {
          out.flush();
          break;
        }
      }
    }
  }
}
