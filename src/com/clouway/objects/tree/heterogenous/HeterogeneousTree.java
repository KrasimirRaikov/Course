package com.clouway.objects.tree.heterogenous;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class HeterogeneousTree {
  public Node root;

  /**
   * Cal's the adding method for adding items to the tree
   *
   * @param index of the node
   * @param obj   the item itself
   */
  public void add(int index, Object obj) {

    add(root, index, obj);
  }

  /**
   * Add's new items to the tree
   *
   * @param node  from which the adding begins
   * @param index of the node
   * @param obj   the item itself
   */
  private void add(Node node, int index, Object obj) {
    if (root == null) {
      root = new Node(index, obj);
      return;
    }
    if (node.index > index && node.leftChild != null) {
      add(node.leftChild, index, obj);
    }
    if (node.index > index && node.leftChild == null) {
      node.leftChild = new Node(index, obj);
      return;
    }
    if (node.index < index && node.rightChild != null) {
      add(node.rightChild, index, obj);
    }
    if (node.index < index && node.rightChild == null) {
      node.rightChild = new Node(index, obj);

    }
  }


  public List<String> printTree() {
    List<String> result = new ArrayList<String>();
    return printTree(root, result);
  }

  /**
   * Print's out the tree in preordered manner
   *
   * @param current node from which to begin printing
   * @param result
   */
  private List<String> printTree(Node current, List<String> result) {
    if (current != null) {

      printTree(current.leftChild, result);
      result.add(current.obj.toString());
      printTree(current.rightChild, result);
    }
    return result;
  }

  /**
   * Searches for a node inside the tree
   *
   * @param index of the node
   */
  public boolean findNode(int index) {
    Node mainNode = root;

    while (mainNode.index != index) {
      if (index < mainNode.index) {
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
