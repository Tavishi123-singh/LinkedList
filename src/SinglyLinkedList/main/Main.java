/*
 * Created by Intellij IDEA
 * User: Tavishi123-singh
 */
package SinglyLinkedList.main;

import SinglyLinkedList.LinkedList.MySinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        MySinglyLinkedList obj=new MySinglyLinkedList();
        obj.insertAtBeginning(100);
        obj.insertAtBeginning(200);
        obj.Print();
        obj.insertAtLast(1000);
        obj.insertAtLast(2000);
        obj.Print();
        obj.deleteFromBeginning();
        obj.Print();
        obj.deleteFromBeginning();
        obj.Print();
        obj.deleteFromLast();
        obj.Print();
    }
}
