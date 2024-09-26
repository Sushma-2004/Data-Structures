package Queue.QueueUsingLL;
import java.util.Iterator;

public class QueueUsingLL<T> implements Iterable<T>{
  public class Node {
    T data;
    Node next;

    Node(T val) {
      data = val;
      next = null;
    }
  }

  Node front, rear;

  QueueUsingLL() {
    front = null;
    rear = null;
  }

  public void enqueue(T val) {
    Node newNode = new Node(val);
    if (front == null) {
      front = newNode;
    } else {
      rear.next = newNode;
    }
    rear = newNode;
  }

  public T dequeue() {
    if(front == null){
      throw new IndexOutOfBoundsException("Empty Queue");
    }
    T temp = front.data;
    if(front==null){
      rear = null;
    }
    return temp;
  }

  public void display() {
    Node temp = front;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public Iterator<T> iterator() {
    return new Iterator<T>() {
      Node temp = front;

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

  public T peek() {
    return front.data;
  }

  public boolean isEmpty() {
    return front == null;
  }
}
