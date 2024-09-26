package Queue.QueueUsingLL;
import java.util.*;

public class QueueUsingLLMain {
  public static void main(String[] args) {
  QueueUsingLL<Integer> list = new QueueUsingLL<Integer>();
  try (Scanner sc = new Scanner(System.in)) {
    int val;

    while (true) {
      System.out.println("---------------QUEUE OPERATIONS USING ARRAY----------------");
      System.out.println("1. Enqueue");
      System.out.println("2. Dequeue");
      System.out.println("3. Peek ");
      System.out.println("4. Check if empty");
      System.out.println("5. Display ");
      System.out.println("6. Exit");
      System.out.println("-----------------------------------------------------");
      System.out.print("Enter your choice: ");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter the value: ");
          val = sc.nextInt();
          list.enqueue(val);
          break;
        case 2:
          val = list.dequeue();
          System.out.print("Element dequeued is "+val);
          System.out.println();
          break;
        case 3:
          val = list.peek();
          System.out.print("Element in peek is "+val);
          System.out.println();
          break;
        case 4:
          boolean isEmpty = list.isEmpty();
          System.out.println(isEmpty);
          break;
        case 5:
          list.display();
          break;  
        case 6:
          System.out.println("Exiting....");
          System.exit(0);
        default:
          System.out.println("Invalid choice!!");
          break;
      }
    }
  }
}
}
