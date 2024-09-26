package LinkedList;
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{
  Node head;

  public class Node{
    T data;
    Node next;
    Node(T val){
      data = val; 
      next = null;
    }
  }
  
  LinkedList(){
    head  = null;
  }

  public void insertAtBeginning(T val){
    Node newNode = new Node(val);
    if(head == null){
      head = newNode;
    }
    else{
      newNode.next = head;
      head = newNode;
    }
  }

  public void insertAtTail(T val){
    Node newNode = new Node(val);
    if(head == null){
      head = newNode;
    }
    else{
    Node temp = head;
    while(temp.next!=null){
      temp = temp.next;
    }
    temp.next = newNode;
    }
  }

  public void insertAtPosition(int pos, T val){
    if(pos==0){
       insertAtBeginning(val);
       return;
    }
    Node newNode = new Node(val);
    Node temp = head;
    for(int i =0;i<pos;i++){
        temp = temp.next;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  // public void insertBeforeValue(int nextVal, T val){
  //   Node newNode = new Node(val);
  //   if(head.data == nextVal){
  //     newNode.next = head;
  //     head = newNode;
  //   }else{
  //     Node temp = head;
  //     while(temp.next!=null){
  //       if(temp.next.data!=nextVal){
  //         temp = temp.next;
  //       }else{
  //       newNode.next = temp.next;
  //       temp.next = newNode;
  //       break;
  //       }
  //     }
  //   }
  // }

  public void delete(T val){
    if(head.data==val){
      head = head.next;
    }else{
      Node prev = null;
      Node current = head;
      while(current.data!=val && current!=null){
        prev = current;
        current = current.next;
      }
      prev.next = current.next;
    }
  }

  public void deleteTail(){
    Node temp = head;
    while(temp.next.next!=null){
      temp = temp.next;
    }
    temp.next =null;
  }
  
  public void deleteAtPos(int pos){
    if(head == null){
      throw new IndexOutOfBoundsException("Deletion attempted on empty list");
    }
    if(pos==0){
      head = head.next;
      return;
    }
    Node temp = head;
    Node prev = null;
    for(int i = 0 ; i<pos;i++){
      prev = temp;
      temp = temp.next;
    }
    prev.next = temp.next;

  }
  public void display(){
    Node temp = head;
    while(temp!= null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
  
  public  Iterator<T> iterator(){
      return new Iterator<T>(){
        Node temp = head;
        
        public boolean hasNext(){
          return temp!=null;
        }

        public T next(){
          T val = temp.data;
          temp = temp.next;
          return val;
        }
      };
  }
 
}
