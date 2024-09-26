package Stack.StackUsingLinkedList;
import java.util.*;
public class Main {
  public static void main(String[] args) {
  StackUsingLinkedList<Integer> list = new StackUsingLinkedList<Integer>();
  try (Scanner sc = new Scanner(System.in)) {
    int val;

    while (true) {
      System.out.println("---------------STACK OPERATIONS USING LL----------------");
      System.out.println("1. Push element to stack");
      System.out.println("2. Pop element from stack");
      System.out.println("3. Peek element from stack");// didn't delete the element from last position
      System.out.println("4. Check if empty");
      System.out.println("5. Display stack");
      System.out.println("6. Exit");
      System.out.println("-----------------------------------------------------");
      System.out.print("Enter your choice: ");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter the value: ");
          val = sc.nextInt();
          list.push(val);
          break;
        case 2:
          val = list.pop();
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
