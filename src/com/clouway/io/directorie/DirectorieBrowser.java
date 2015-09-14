package com.clouway.io.directorie;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class DirectorieBrowser {

  /*
  returns a list with the content of a directory or an exception massage
   */
  public String[] listContent(String filePath) {
    Path path = Paths.get(filePath);
    if (Files.notExists(path)) {
      String[] fail = new String[1];
      fail[0] = "this directory does not exist";
      return fail;
    } else {
      if (Files.isDirectory(path)) {
        File file = new File(filePath);
        return file.list();
      } else {
        String[] fail2 = new String[1];
        fail2[0] = "sorry this is a file";
        return fail2;
      }
    }
  }

}


