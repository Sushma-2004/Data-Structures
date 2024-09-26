package LinkedList;

public class Demo {
  public static void main(String[] args){
    LinkedList<Integer> list = new LinkedList<Integer>();

    list.insertAtBeginning(90);
    list.insertAtBeginning(80);
    list.insertAtBeginning(70);
    list.insertAtTail(100);
    //list.insertBeforeValue(100, 30);
    list.delete(70);
    list.delete(30);
    list.delete(100);
    list.deleteAtPos(0);
     list.display();

  }
}
