package com.clouway.io.file;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    File file1 = new File();
    Path path = Paths.get("src/com/clouway/io/file/term");
    file1.reverse(path);
  }
}
