import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA.
 * User: GAYATHRI GUTTA
 * Date: 3/20/14
 * Time: 10:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class GenericQueue<T> {

    class GQNode<T> {
        T data;
        GQNode next;

        GQNode(T data) {
            this.data = data;
        }
    }

    GQNode<T> head = null;
    GQNode<T> tail = null;

        public void enqueue(T data) {
            GQNode<T> newNode = new GQNode<T>(data);
            if(head == null && tail == null) {
                newNode.next = null;
                head = tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        public T deQueue() {
            if(head == null) {
                throw new NoSuchElementException("No element in queue.");
            }

            T data =  head.data;
            GQNode temp = head;
            head = head.next;
            temp.next = null;
            temp = null;
            return data;
        }

        public static void main(String args[]) {
            GenericQueue<String> gq = new GenericQueue<String>();
            gq.enqueue("Hello ");
            gq.enqueue("Gayathri\n");
            gq.enqueue("How ");
            System.out.print(gq.deQueue());
            System.out.print(gq.deQueue());
            gq.enqueue("are ");
            System.out.print(gq.deQueue());
            gq.enqueue("you!!\n");

            System.out.print(gq.deQueue());
            System.out.print(gq.deQueue());
            //System.out.print(gq.deQueue());
        }
}


