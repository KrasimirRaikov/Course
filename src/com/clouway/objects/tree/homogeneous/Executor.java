package com.clouway.objects.tree.homogeneous;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Executor {
  public static void main(String[] args) {

    HomogeneousTree tree1 = new HomogeneousTree();
    tree1.add(3);
    tree1.add(65);
    tree1.add(2);
    tree1.add(13);
    tree1.add(25);
    tree1.add(45);
    tree1.add(1);
    tree1.printTree(tree1.root);
    System.out.println("search for \'3\'");
    tree1.findNode(13);
  }
}
