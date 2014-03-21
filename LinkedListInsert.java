/**
 * Created with IntelliJ IDEA.
 * User: RAMA KRISHNA LINGA
 * Date: 3/10/14
 * Time: 9:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListInsert {
    Node head = null;
    Node firstNode = null;
    public void push(int n){
      Node newNode = new Node(n);
        if (head == null) {
           head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }

    }
    public int pop() {
        int temp = -1;
        if(head != null){
            temp = head.data;
            head =head.next;
        }
        return temp;
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public static void main(String args[]) {
        LinkedListInsert stack = new LinkedListInsert();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        stack.push(40);
        System.out.println("Pop: "+ stack.pop());
        System.out.println("Pop: "+ stack.pop());
        System.out.println("Pop: "+ stack.pop());
    }
}

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }

}