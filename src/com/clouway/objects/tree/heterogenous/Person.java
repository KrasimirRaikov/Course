package com.clouway.objects.tree.heterogenous;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Person {
  private String name;

  /**
   * Set's person's name
   * @param name of the person
   */
  public void setName(String name){
    this.name=name;
  }

  /**
   * Get's the name of the person
   * @return the name of the person
   */
  public String getName(){
    return name;
  }
}
