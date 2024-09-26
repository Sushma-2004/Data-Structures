package Stack.ArrayStack;

public class ArrayStack<T> {
  static final int MAX_SIZE = 50;
  @SuppressWarnings("unchecked")
  T arr[] = (T[])new Object[MAX_SIZE];
  int top;

  ArrayStack(){
    top = -1;
  }
  public void push(T val){
    if(top == MAX_SIZE-1){
      throw new IndexOutOfBoundsException("Array is full");
    }else{
      arr[++top] = val;
    }
  }

  public T pop(){
    if(top==-1){
      throw new IndexOutOfBoundsException("Array is empty");
    }
    return arr[top--];
  }

  public T peek(){
    if(top==-1){
      throw new IndexOutOfBoundsException("Array is empty");
    }
    return arr[top];
  }

  public boolean isEmpty(){
    return top==-1;
  }

  public void display(){
    for(int i = 0;i<top;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

}
