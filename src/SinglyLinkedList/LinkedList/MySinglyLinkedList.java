/*
 * Created by Intellij IDEA
 * User: Tavishi123-singh
 */
package SinglyLinkedList.LinkedList;

import SinglyLinkedList.node.Node;

public class MySinglyLinkedList {
    Node head;
    public MySinglyLinkedList() {
        head=null;
    }

    public Node getHead() {
        return head;
    }
    public void insertAtLast(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
    }
    public void insertAtBeginning(int data){
        Node node=new Node(data);
        node.setNext(head);
        head=node;
    }
    public Node deleteFromLast(){
        Node res=null;
        if(head!=null){
            Node temp=head;
            Node previous=null;
            while (temp.getNext()!=null){
                previous=temp;
                temp=temp.getNext();
            }
            if (previous!=null){
                res=previous.getNext();
                previous.setNext(null);
            }
            else{
                res=head;
                head=null;
            }
        }
        return res;
    }
    public Node deleteFromBeginning(){
        Node res=null;
        res=head;
        if (head!=null){
            head=head.getNext();
        }
        return res;
    }
    public void Print(){
        System.out.println("Printing List-------");
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.getData());
            temp=temp.getNext();
            if(temp!=null){
                System.out.print("--->");
            }
        }
        System.out.println();
    }
}
