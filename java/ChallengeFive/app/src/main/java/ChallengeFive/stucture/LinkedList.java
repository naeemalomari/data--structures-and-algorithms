package ChallengeFive.stucture;

import ChallengeFive.data.LinkedListNode;

public class LinkedList {
  public LinkedListNode head;


  public void insert(String data) {
    if (head == null) {
      LinkedListNode node = new LinkedListNode(data);
      head = node;
    } else {
      LinkedListNode current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      LinkedListNode node = new LinkedListNode(data);
      current.setNext(node);
    }
  }

  public boolean include(String data) {
    if (head == null) {
      LinkedListNode node = new LinkedListNode(data);
      head = node;
    } else {
      LinkedListNode current = head;
      while (current != null) {
        if (current.getData() == data) {
          return true;
        }
        current = current.getNext();
      }
    }
    return false;
  }


  public void append(String data) {
    if (head == null) {
      LinkedListNode node = new LinkedListNode(data);
      head = node;
    } else {
      LinkedListNode current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      LinkedListNode node = new LinkedListNode(data);
      current.setNext(node);
    }
  }



  public void insertBefore(String data, String before) {
    LinkedListNode node = new LinkedListNode(before);
    if (head == null) {
      System.out.println("this " + data + " Not Exist in the linked list ");
      return;
    } else if (data == head.getData()) {
      node.next = head;
      head = node;
    } else {
      LinkedListNode temp = head;
      while (temp.next != null) {
        if (temp.next.getData() == data) {
          node.next = temp.next;
          temp.next = node;
          return;
        }
        temp = temp.next;
      }
      System.out.println("this " + data + " Not Exist in the linked list ");
    }
  }

  public void insertAfter(String data, String after) {
    LinkedListNode node = new LinkedListNode(after);
    if (head == null) {
      System.out.println("this " + data + " Not Exist in the linked list ");
      return;
    } else {
      LinkedListNode temp = head;
      while (temp != null) {
        if (temp.getData() == data) {
          node.next = temp.next;
          temp.next = node;
          return;
        }
        temp = temp.next;
      }
      System.out.println("this " + data + " Not Exist in the linked list ");
    }

  }

      

  @Override
  public String toString() {
    String printing = "";
    if (head == null) {
      System.out.println("THE LIST IS EMPTY ");
    } else {
      LinkedListNode current = head;
      while (current != null) {
        printing = printing + " { " + current.getData() + " } " + " -> ";
        current = current.getNext();
      }
      printing = printing + " NULL ";
    }
    return printing;
  }

}

