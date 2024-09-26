package Queue.QueueUsingArray2;

  public class QueueUsingArray2<T> {
    static final int MAX_SIZE = 5;
    @SuppressWarnings("unchecked")
    T arr[] = (T[])new Object[MAX_SIZE];
    int rear;
  
    QueueUsingArray2(){
      rear = -1;
    }
  
    public void enqueue(T val){
      if(rear == MAX_SIZE - 1){
        throw new IndexOutOfBoundsException("Queue is full");
      }
      arr[++rear] = val;
    }
  
    public T dequeue(){
      if(rear == -1){
        throw new IndexOutOfBoundsException("Queue is Empty");
      }
      T temp = arr[0];
      for(int i = 1;i<=rear;i++){
        arr[i-1] = arr[i];
      }
      rear --;
      return temp;
    }
  
    public T peek(){
      if(rear == -1){
        throw new IndexOutOfBoundsException("Queue is Empty");
      }
      return arr[0];
    }
  
    public boolean isEmpty(){
      return rear == -1;
    }
  
    public void display(){
      if(rear == -1 ){
        throw new IndexOutOfBoundsException("Queue is Empty");
      }
      for(int i = 0;i<=rear;i++){
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }
  
