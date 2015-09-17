package com.clouway.collections.pages;


import java.util.ArrayList;
import java.util.List;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Pages {
  private int pageSize;
  private int firstElement;
  private int lastElement;
  List<String> list;
  List<String> listError= new ArrayList<>();

  public Pages(List<String> list, int pageSize){
    this.pageSize=pageSize;
    firstElement=0-pageSize;
    lastElement=firstElement+pageSize;
    this.list= new ArrayList<>(list);
  }
  public List<String> next(){

    if(hasNext()){
      firstElement+=pageSize;
      lastElement+=pageSize;
      return list.subList(firstElement,lastElement);
    }
    else{
      listError.clear();
      listError.add("Sorry, reached the last page");
      return listError;

    }
  }
  public List<String> previous(){

    if(hasPrevious()){
      firstElement-=pageSize;
      lastElement-=pageSize;
      return list.subList(firstElement, lastElement);}
    else{
      listError.clear();
      listError.add( "sorry you are at the first page");
      return listError;
    }
  }
  public boolean hasNext(){
    return lastElement + pageSize <= list.size();
  }
  public boolean hasPrevious(){
    return firstElement-pageSize>=0;
  }
  public List<String> firstPage(){
    firstElement=0;
    lastElement=firstElement+pageSize;
    return list.subList(firstElement, lastElement);
  }

  public List<String> lastPage(){
    lastElement=list.size();
    firstElement=lastElement-pageSize;
    return list.subList(firstElement, lastElement);
  }
}
