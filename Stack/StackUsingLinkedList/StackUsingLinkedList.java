package Stack.StackUsingLinkedList;

public class StackUsingLinkedList<T> {
  public class Node{
    T data;
    Node next;
    Node(T val){
      data = val;
      next = null;
    }
  }
  Node top;
  StackUsingLinkedList(){
    top = null;
  }

  public void push(T val){
    Node newNode = new Node(val);
    newNode.next = top;
    top = newNode;
  }
  public T pop(){
     if(top==null){
      throw new IndexOutOfBoundsException("Empty Stack");
     }
     T temp = top.data;
     top = top.next;
     return temp;
  }

  public T peek(){
    if(top==null){
      throw new IndexOutOfBoundsException("Empty Stack");
     }
     return top.data;
  }

  public void display() {
    Node temp = top;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public boolean isEmpty(){
    return top==null;
  }
}
