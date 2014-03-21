/**
 * Created with IntelliJ IDEA.
 * User: RAMA KRISHNA LINGA
 * Date: 3/20/14
 * Time: 9:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class QueueExample {
    QNode head = null;
    QNode tail = null;
    QueueExample() {

    }

    public void enqueue(String data) {
        QNode newNode = new QNode(data);
        if(head == null && tail == null) {
            newNode.next = null;
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public String deQueue() {
        if(head == null) {
            return "Queue is Empty";
        }
        String data =  head.data;
        QNode temp = head;
        head = head.next;
        temp.next = null;
        temp = null;
        return data;
    }

    public static void main(String args[]) {
        QueueExample q = new QueueExample();
        q.enqueue("Hello ");
        q.enqueue("Gayathri\n");
        q.enqueue("How ");
        System.out.print(q.deQueue());
        System.out.print(q.deQueue());
        q.enqueue("are ");
        System.out.print(q.deQueue());
        q.enqueue("you!!\n");
        System.out.print(q.deQueue());
        System.out.print(q.deQueue());
        System.out.print(q.deQueue());
    }
}

class QNode {
    String data;
    QNode next;
    QNode(String data){
        this.data = data;
        next = null;
    }
}
