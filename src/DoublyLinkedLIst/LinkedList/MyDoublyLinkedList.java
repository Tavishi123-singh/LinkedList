/*
 * Created by Intellij IDEA
 * User: Tavishi123-singh
 */
package DoublyLinkedLIst.LinkedList;

import DoublyLinkedLIst.node.Node;

public class MyDoublyLinkedList {
    private Node head;
    public MyDoublyLinkedList(){
       head=null;
    }
    public void insertAtBeginning(int data){
        Node node=new Node(data);
        if(head==null){
            node.setNext(head);
            head=node;
        }
        else{
            head.setPrevious(node);
            node.setNext(head);
            head=node;
        }
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
            node.setPrevious(temp);
            temp.setNext(node);
        }
    }
    public Node deleteFromBeginning(){
        Node res=null;
        if (head!=null){
            res=head;
            head=head.getNext();
            head.setPrevious(null);
        }
        return res;
    }
    public Node deleteFromLast(){
        Node res=null;
        if(head!=null){
            Node temp=head;
            Node previous=null;
            while (temp.getNext()!=null){
                temp=temp.getNext();
            }
            if (temp.getPrevious()!=null){
                res=temp;
                temp=temp.getPrevious();
                temp.setNext(null);
            }
            else{
                res=head;
                head=null;
            }
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
