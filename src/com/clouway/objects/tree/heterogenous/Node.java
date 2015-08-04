package com.clouway.objects.tree.heterogenous;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Node {
  int index;
  Object obj;
  Node leftChild;
  Node rightChild;

  /**
   * Constructor for a node of the tree
   *
   * @param index
   * @param obj
   */
  public Node(int index, Object obj) {
    this.index = index;
    this.obj = obj;

  }


}
