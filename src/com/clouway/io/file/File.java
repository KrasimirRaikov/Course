package com.clouway.io.file;

import java.io.BufferedReader;
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
  /*
  reverts the content of a file and then replaces it
   */
  public void reverse(Path path) throws IOException {
    BufferedWriter writer = null;
    try (
            Scanner input = new Scanner(Files.newBufferedReader(path, Charset.forName("UTF-8")))) {
      String fileContent = "";
      while (input.hasNextLine()) {
        fileContent += input.nextLine();
        if (input.hasNextLine()) {
          fileContent += String.format("%n");
        }
      }
      char[] ch = fileContent.toCharArray();

      char cup;
      for (int i = 0; i < ch.length / 2; i++) {
        cup = ch[(ch.length - i) - 1];
        ch[(ch.length - i) - 1] = ch[i];
        ch[i] = cup;
      }

      writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"), CREATE, TRUNCATE_EXISTING);
      writer.write(ch);
    } finally {
      if (writer != null) writer.close();
    }
  }
}

