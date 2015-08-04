package com.clouway.objects.tree.heterogenous;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Executor {
  public static void main(String[] args) {
    Cat c1 = new Cat();
    c1.setName("Mirela");
    Dog d1 = new Dog();
    d1.setName("Rosen");
    Person p1 = new Person();
    p1.setName("Charlie");
    HeterogeneousTree hTree = new HeterogeneousTree();
    hTree.add(12, c1.getName());
    hTree.add(2, p1.getName());
    hTree.add(3, 13);
    hTree.add(7, "Whaaaaat");
    hTree.add(56, d1.getName());
    for (String s : hTree.printTree()) {
      System.out.println(s);
    }
    System.out.println("Search for \' 12 \'");
    if (hTree.findNode(12)) {
      System.out.println("Yes I found it");
    } else {
      System.out.println("Sorry it's not here");
    }
  }
}
