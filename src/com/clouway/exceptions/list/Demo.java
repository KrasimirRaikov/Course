package com.clouway.exceptions.list;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.List;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Demo {


  public static void main(String[] args) {
    ListOperations list = new ListOperations();
    list.setMaxLength(4);

    list.add("some string");
    list.add("1");
    list.add("2");
    list.add("3");
    //list.add("4");
    List<Object> obj =  list.printAll();
   for(Object ob : obj){
     System.out.println(ob);
   }
    list.remove();
    list.remove();
    list.remove();
    list.remove();
    /*list.remove();*/

    List<Object> object =  list.printAll();
    if(object !=null){
    for(Object ob : obj){
      System.out.println(ob);
    }}
    else{
      System.out.println("You can't print an empty list");
    }

  }


}
