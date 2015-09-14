package com.clouway.io.console;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    Console c1 = new Console();
    System.out.println("Choose a name for the file");
    String fileName = "src/com/clouway/io/console/" + c1.readString();
    Path path = Paths.get(fileName);

    System.out.println("Enter Content");
    new File().writeToFile(path);
  }

}
