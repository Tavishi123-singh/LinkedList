/*
 * Created by Intellij IDEA
 * User: Tavishi123-singh
 */
package DoublyLinkedLIst.node;

public class Node {
    private int data;
    private Node next;
    private Node previous;

    public Node(int data) {
        this.data = data;
        next=null;
        previous=null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getPrevious() {
        return previous;
    }
}
