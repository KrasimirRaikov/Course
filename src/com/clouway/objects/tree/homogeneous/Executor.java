package com.clouway.objects.tree.homogeneous;


/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Executor {
  public static void main(String[] args) {


    HomogeneousTree tree1 = new HomogeneousTree();
    tree1.add(3);

    for (String s : tree1.printTree()) {
      System.out.println(s);
    }

    System.out.println("search for \'13\'");
    if (tree1.findNode(13)) {
      System.out.println("Yes I found it");
    } else {
      System.out.println("Sorry it's not here");
    }
  }
}
