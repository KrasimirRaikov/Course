package com.clouway.objects.tree.heterogenous;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Executor {
  public static void main(String[] args){
    Cat c1= new Cat();
    c1.setName("Mirela");
    Dog d1= new Dog();
    d1.setName("Rosen");
    Person p1= new Person();
    p1.setName("Charlie");
    HeterogeneousTree hTree= new HeterogeneousTree();
    hTree.add(12, c1.getName());
    hTree.add(2, p1.getName());
    hTree.add(3, 13);
    hTree.add(7, "Whaaaaat");
    hTree.add(56, d1.getName());
    hTree.printTree(hTree.root);
    hTree.findNode(12);
  }
}
