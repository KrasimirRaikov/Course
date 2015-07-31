package com.clouway.objects.tree.homogeneous;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class HomogeneousTree {

  public Node root;

  /**
   * Cal's for the adding method to add node to the tree
   * @param value to be added
   */
  public void add(int value) {
    add(root, value);
  }

  /**
   * Adds node to the tree
   * @param node from which to begin the adding
   * @param value wich to be added to the tree
   */
  private void add(Node node, int value) {
    if (root == null) {
      root = new Node(value);
      return;
    }
    if (node.value > value && node.leftChild != null) {
      add(node.leftChild, value);
    }
    if (node.value > value && node.leftChild == null) {
      node.leftChild = new Node(value);
      return;
    }
    if (node.value < value && node.rightChild != null) {
      add(node.rightChild, value);
    }
    if (node.value < value && node.rightChild == null) {
      node.rightChild = new Node(value);

    }
  }

  /**
   * Prints out the tree's nodes
   * @param current node from which to begin
   */
  public void printTree(Node current) {
    if (current != null) {


      printTree(current.leftChild);
      System.out.println(current.value + " ");
      printTree(current.rightChild);
    }
  }

  /**
   * Searches for a node in the tree
   * @param value which is being searched for
   */
  public void findNode(int value) {
    Node mainNode = root;

    while (mainNode.value != value) {
      if (value < mainNode.value) {
        mainNode = mainNode.leftChild;
      } else {
        mainNode = mainNode.rightChild;
      }

      if (mainNode == null) {
        System.out.println("Sory there is no " + value + " in here");
        return;
      }

    }
    System.out.println("Yes I found " + mainNode.value);

  }


}
