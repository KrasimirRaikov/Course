package com.clouway.exceptions.list;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Demo {


  public static void main(String[] args) {
    ListOperations list = new ListOperations(4);

    list.add("some string");
    list.add("1");

    list.add("2");
    list.add("3");

    //list.add("4");
    java.util.List obj =  list.printAll();
    if(obj !=null){
      for(Object ob : obj){
        System.out.println(ob);
      }}
    else{
      System.out.println("You can't print an empty list");
    }
    list.remove();
    list.remove();
    list.remove();
    list.remove();
    //list.remove();

    java.util.List object =  list.printAll();
    if(object !=null){
    for(Object ob : obj){
      System.out.println(ob);
    }}
    else{
      System.out.println("You can't print an empty list");
    }
  }


}
