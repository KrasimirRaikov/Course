package com.clouway.objects.tree.homogeneous;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class HomogeneousTree {

  public Node root;
  List<String> list = new ArrayList<String>();

  /**
   * Cal's for the adding method to add node to the tree
   *
   * @param value to be added
   */
  public void add(int value) {
    add(root, value);
  }

  /**
   * Adds node to the tree
   *
   * @param node  from which to begin the adding
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
   * Makes a call to the printTree method
   */
  public List<String> printTree() {
    list.clear();
    return printTree(root);
  }

  /**
   * Prints the tree
   *
   * @param current the first node from the tree
   */
  private List<String> printTree(Node current) {

    if (current != null) {


      printTree(current.leftChild);
      list.add(current.value + " ");
      printTree(current.rightChild);
    }
    return list;
  }

  /**
   * Searches for a node in the tree
   *
   * @param value which is being searched for
   */
  public boolean findNode(int value) {
    Node mainNode = root;

    while (mainNode.value != value) {
      if (value < mainNode.value) {
        mainNode = mainNode.leftChild;
      } else {
        mainNode = mainNode.rightChild;
      }

      if (mainNode == null) {
        return false;
      }
    }

    return true;

  }


}
