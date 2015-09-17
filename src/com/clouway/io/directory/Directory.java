package com.clouway.io.directory;

import java.io.File;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Directory {
  private String name;
  private boolean isDirectory;
  private boolean isFile;
  public Directory(File name){
    this.name=name.getName();
    isDirectory=name.isDirectory();
    isFile=name.isFile();
  }

  /**
   *
   * @return the name of the file or directory
   */
  public String name(){
    return name;
  }

  /**
   *
   * @return true if the File instance is a directory and false if it is file
   */
  public boolean isDirectory(){
    return isDirectory;
  }

  /**
   *
   * @return true if the File instance is a file and false if it is directory
   */
  public boolean isFile(){
    return isFile;
  }
}
