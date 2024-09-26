/*-- Not Efficient
 *-- 5 6 8 9 0 
     ^       ^
   dequeue    enqueue
   O(n)     O(1)
  -- on performing dequeue front increments and when it reaches the position
     same as that of rear it cannot perform enqueue operation further as the 
     reached its end.
  -- on performing dequeue the element is not actually deallocated from the 
     memmory, therefore too much memmory is wasted.
  -- To over come this here we shift the elements to the left once dequeue is 
     perfomed so that memmory is not wasted but it takes up lot of time to shift
     all elements to the left.
 */

package Queue.QueueUsingArray2;
import java.util.*;

public class QueueUsingArray2Main {
  public static void main(String[] args) {
  QueueUsingArray2<Integer> list = new QueueUsingArray2<Integer>();
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
          System.out.print("Element popped is "+val);
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
