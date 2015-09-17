package com.clouway.io.directory;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class DirectoryBrowser {

  /*
  returns an array of Directory type
   */
  public Directory[] listContent(String filePath) throws FileNotFoundException{
    Path path = Paths.get(filePath);
    if(Files.notExists(path)){
      throw new FileNotFoundException();
    }
    File[] files = new File(filePath).listFiles();
    assert files != null;
    Directory[] directories = new Directory[files.length];
    for (int i = 0; i < directories.length; i++) {
      directories[i] = new Directory(files[i]);
    }
    return directories;

  }

}


