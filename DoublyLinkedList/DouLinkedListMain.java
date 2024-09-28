package DoublyLinkedList;

import java.util.*;

public class DouLinkedListMain {
  public static void main(String[] args) {
    DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
    try (Scanner sc = new Scanner(System.in)) {
      int val;
      int pos;

      while (true) {
        System.out.println("---------------DOUBLY LINKED LIST OPERATIONS----------------");
        System.out.println("1. Insert at the beginning of the List.");
        System.out.println("2. Insert at the end of the List.");
        System.out.println("3. Insert at the Specific position.");
        System.out.println("4. Delete head");
        System.out.println("5. Delete tail");
        System.out.println("6. Delete at the Specific position.");
        System.out.println("7. Display List elements.");
        System.out.println("8. Reverse List elements.");
        System.out.println("9. Exit");
        System.out.println("-----------------------------------------------------");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
          case 1:
            System.out.print("Enter the value: ");
            val = sc.nextInt();
            list.insertAtBeginning(val);
            break;
          case 2:
            System.out.print("Enter the value: ");
            val = sc.nextInt();
            //list.insertAtTail(val);
            break;
          case 3:
            System.out.print("Enter the value: ");
            val = sc.nextInt();
            System.out.print("Enter the position: ");
            pos = sc.nextInt();
            list.insertAtPosition(pos, val);
            break;
          case 4:
            list.deleteHead();
            break;
          case 5:
            list.deleteTail();
            break;
          case 6:
            System.out.print("Enter the position: ");
            pos = sc.nextInt();
            list.deleteAtPos(pos);
            break;
          case 7:
            // list.iterator();
            // for(int a: list){
            //   System.out.print(a + " ");
            // }
            // System.out.println();
            list.display();
            System.out.println();
            break;
          case 8:
            list.displayRev();
            System.out.println();
            break;  
          case 9:
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

