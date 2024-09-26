package Queue.QueueUsingArray;

public class QueueUsingArray<T> {
  static final int MAX_SIZE = 50;
  @SuppressWarnings("unchecked")
  T arr[] = (T[])new Object[MAX_SIZE];
  int front, rear;

  QueueUsingArray(){
    front = -1;
    rear = -1;
  }

  public void enqueue(T val){
    if(rear == MAX_SIZE - 1){
      throw new IndexOutOfBoundsException("Queue is full");
    }
    if(front == -1){
      front ++;
    }
    arr[++rear] = val;
  }

  public T dequeue(){
    if(front == -1 || front>rear){
      throw new IndexOutOfBoundsException("Queue is Empty");
    }
    return arr[front++];
  }

  public T peek(){
    if(front == -1 || front>rear){
      throw new IndexOutOfBoundsException("Queue is Empty");
    }
    return arr[front];
  }

  public boolean isEmpty(){
    return front == -1||front>rear||rear == -1;
  }

  public void display(){
    if(front == -1 || front>rear){
      throw new IndexOutOfBoundsException("Queue is Empty");
    }
    for(int i = front;i<=rear;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
