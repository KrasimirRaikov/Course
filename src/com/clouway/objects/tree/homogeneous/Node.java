package com.clouway.objects.tree.homogeneous;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Node {

  int value;
  Node leftChild;
  Node rightChild;

  /**
   * Creates node
   * @param value of this node
   */
  public Node(int value) {
    this.value = value;
  }
}

