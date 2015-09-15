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
  public Object[] listContent(String filePath){
    Path path = Paths.get(filePath);
    if (Files.notExists(path)) {
      String[] fail2 = new String[1];
      fail2[0] = "file does not exist";
      return fail2;
    }

    if (Files.isDirectory(path)) {
      File[] files = new File(filePath).listFiles();
      assert files != null;
      String[] str=new String[files.length];
      for(int i=0; i<str.length; i++){
        if(files[i].isDirectory()){
          str[i]="directory "+files[i].toString();
        }else{
          str[i]="file      "+files[i].toString();
        }
      }
      return str;

    } else {
      String[] fail2 = new String[1];
      fail2[0] = " this is a file";
      return fail2;
    }
  }

}


