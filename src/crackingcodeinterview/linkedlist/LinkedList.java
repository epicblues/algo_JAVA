package crackingcodeinterview.linkedlist;

import java.util.Comparator;

public class LinkedList<T extends Comparable<T>> {

  Node<T> head;
  int size = 0;

  public LinkedList() {
    this.head = null;
  }

  public void add(T data) {
    if (this.head == null) {
      this.head = new Node<>(data);


    } else {
      Node<T> currentNode = this.head;
      while (currentNode.next != null) {
        currentNode = currentNode.next;
      }

      currentNode.next = new Node<>(data);
      currentNode.next.before = currentNode;

    }

    size++;
  }

  public T get(int index) {
    if (index >= size) {
      throw new IndexOutOfBoundsException();
    }
    int pointer = 0;
    Node<T> target = head;
    while (pointer < index) {
      pointer++;
      target = target.next;
    }

    return target.data;
  }


  private Node<T> getNode(int index) {
    if (index >= size) {
      throw new IndexOutOfBoundsException();
    }
    int pointer = 0;
    Node<T> target = head;
    while (pointer < index) {
      pointer++;
      target = target.next;
    }

    return target;
  }

  public void sort(Comparator<T> comparator) {

    quickSort(comparator, getNode(0), getNode(size - 1));
  }

  private void quickSort(Comparator<T> comparator, Node<T> start, Node<T> end) {
    if (start == end || start == null || end == null) {
      return;
    }

    if (start.next == end) {
      if (comparator.compare(start.data, end.data) > 0) {
        exchangeTwoNodes(start, end);
      }
      return;
    }

    Node<T> p1 = start.next;
    Node<T> p2 = end;

    while (p1.before != p2) {
      while (comparator.compare(p1.data, start.data) <= 0 && p1.before != p2) {

        p1 = p1.next;
      }

      while (comparator.compare(start.data, p2.data) < 0 && p1.before != p2) {
        p2 = p2.before;

      }

      if (p1.before != p2) {
        exchangeTwoNodes(p1, p2);
      }


    }

    exchangeTwoNodes(start, p2);

    quickSort(comparator, start, p2.before);
    quickSort(comparator, p2.next, end);

  }

  private void exchangeTwoNodes(Node<T> n1, Node<T> n2) {
    T temp = n1.data;
    n1.data = n2.data;
    n2.data = temp;
  }

  private Node<T> remove(Node<T> node) {

    Node<T> prevNode = node.before;
    Node<T> nextNode = node.next;
    if (prevNode != null) {
      prevNode.next = nextNode;
    }
    if (nextNode != null) {
      nextNode.before = node.before;
    }

    return node;
  }

  public Node<T> removeByIndex(int index) {

    Node<T> target = getNode(index);
    return remove(target);

  }

  public void printAll() {
    Node<T> start = head;

    while (start != null) {
      System.out.println(start.data);
      start = start.next;
    }
  }


}

