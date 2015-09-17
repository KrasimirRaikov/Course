package com.clouway.io.directory;

import java.io.FileNotFoundException;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Demo {
  public static void main(String[] args){
    String path = "/home/clouway/workspaces/idea/tut1/src/com/clouway/io/directory";
    DirectoryBrowser dir=new DirectoryBrowser();
    try{
    for (Directory fo: dir.listContent(path)) {
      if (fo.isDirectory()) {
        System.out.println("Directory: " + fo.name());
      }
      if(fo.isFile()){
        System.out.println("File:      "+ fo.name());
      }
    }
    }catch (FileNotFoundException e){
      System.out.println("Sorry this directory was not found");
    }
  }
}
