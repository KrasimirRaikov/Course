package com.clouway.io.serial;

import java.io.Serializable;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Dog implements Serializable {
  private String breed;
  private int age;
  private String name;

  public Dog(String name, int age, String breed) {
    this.breed = breed;
    this.age = age;
    this.name = name;
  }

  /*
  Sets the age of the dog
   */
  public void setAge(int age) {
    this.age = age;
  }

  /*
  Sets the breed of the dog
   */
  public void setBreed(String breed) {
    this.breed = breed;
  }

  /*
  Sets the name of the dog
   */
  public void setName(String name) {
    this.name = name;
  }

  /*
  Gets the age of the dog
   */
  public int getAge() {
    return age;
  }

  /*
  Gets the breed of the dog
   */
  public String getBreed() {
    return breed;
  }

  /*
  Gets the name of the dog
   */
  public String getName() {
    return name;
  }
}
