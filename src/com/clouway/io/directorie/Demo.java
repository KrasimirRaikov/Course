package com.clouway.io.directorie;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Demo {
  public static void main(String[] args){
    String path = "/home/clouway/workspaces/idea/tut1/src/com/clouway/io/directorie";
    DirectorieBrowser dir=new DirectorieBrowser();
    for (Object str: dir.listContent(path)) {
      System.out.println(str);
    }
  }
}
