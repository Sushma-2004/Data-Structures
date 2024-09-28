package DoublyLinkedList;
import java.util.*;
   
public class DoublyLinkedList<T> implements Iterable<T> {
  Node head;
  Node tail;
  
  public class Node {
    T data;
    Node next;
    Node prev;
    
    Node(T val) {
      data = val;
      next = null;
      prev = null;
    }
  }
  
  DoublyLinkedList() {
    head = null;
    tail=null;
  }

  public void insertAtBeginning(T val) {
    Node newNode = new Node(val);
    newNode.next = head;
    if (head == null) {
      tail = newNode;
    } else {
      head.prev = newNode;
    }
    head = newNode;
  }

  public void insertAtPosition(int pos, T val) {
    if (pos == 0) {
      insertAtBeginning(val);
      return;
    }
    Node newNode = new Node(val);
    Node temp = head;
    for (int i = 1; i < pos; i++) {
      temp = temp.next;
      if(temp == null){
        throw new IndexOutOfBoundsException("Invalid Position!");
      }
    }
    newNode.next = temp.next;
    newNode.prev = temp;
    if(temp==tail){
      tail = newNode;
    }else{  
      temp.next.prev = newNode;
    }  
    temp.next = newNode;
  }

  public void deleteHead() {
    if (head == null) {
      throw new IndexOutOfBoundsException("Deletion attempted on empty list");
    }
    head = head.next;
    if(head == null){
      tail = null;
    }else{
    head.prev = null;
    }
  }

  public void deleteTail() {//not working
    if (head == null) {
      throw new IndexOutOfBoundsException("Deletion attempted on empty list");
    }
    Node temp = head;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = tail;
  }

  public void deleteAtPos(int pos) {
    if (head == null) {
      throw new IndexOutOfBoundsException("Deletion attempted on empty list");
    }
    if (pos == 0) {
      head = head.next;
      if(head == null){
        tail = null;
      }else{
      head.prev = null;
      }
      return;
    }
    Node temp = head;
    Node prev = null;
    for (int i = 1; i <= pos; i++) {
      prev = temp;
      temp = temp.next;
    }
    prev.next = temp.next;
    if(temp == tail){
      tail = prev;
    }else{
    temp.next.prev = prev;
    }
  }

  public void display(){
    if (head == null) {
      throw new IndexOutOfBoundsException("Deletion attempted on empty list");
    }
     Node temp = head;
     while(temp!=null){
      System.out.print(temp.data + " ");
      temp = temp.next;
     }
  }

  public void displayRev(){
    Node temp = tail;
    while(temp!=null){
     System.out.print(temp.data + " ");
     temp = temp.prev;
    }
 }


  public Iterator<T> iterator() {
    return new Iterator<T>() {
      Node temp = head;

      public boolean hasNext() {
        return temp != null;
      }

      public T next() {
        T val = temp.data;
        temp = temp.next;
        return val;
      }
    };
  }

}