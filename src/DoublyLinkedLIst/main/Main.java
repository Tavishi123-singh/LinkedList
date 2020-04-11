package DoublyLinkedLIst.main;

import DoublyLinkedLIst.LinkedList.MyDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyDoublyLinkedList obj=new MyDoublyLinkedList();
        obj.insertAtBeginning(100);
        obj.Print();
        obj.insertAtBeginning(200);
        obj.Print();
        obj.insertAtLast(2000);
        obj.insertAtLast(1000);
        obj.Print();
        obj.deleteFromBeginning();
        obj.Print();
        obj.deleteFromLast();
        obj.Print();
        obj.deleteFromBeginning();
        obj.Print();
    }
}
