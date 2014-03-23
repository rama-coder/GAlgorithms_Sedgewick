/**
 * Created by GAYATHRI GUTTA on 3/20/2014.
 */
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

    private class DeckNode<Item> {
        Item data;
        DeckNode<Item> next;
        DeckNode<Item> prev;
        DeckNode(Item i){
            data = i;
        }
        void setData(Item data) {
            this.data = data;
        }
    }

    DeckNode<Item> first, last;

    public Iterator iterator(){
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>
    {
        DeckNode<Item> current = first;

        public boolean hasNext()
        {
            return (current != null);
        }

        public Item next()
        {
            if (current == null)
                throw new NoSuchElementException("No next element found");

            Item currentItem = current.data;
            current = current.next;
            return currentItem;
        }

        public void remove()
        {
            throw new UnsupportedOperationException("Remove not supported");
        }
    }

    int N = 0;
    public Deque() {

    }
    public boolean isEmpty() {
        return (N == 0);
    }
    public int size() {
        return N;
    }
    public void addFirst(Item item) {
        if(item == null)
            throw new NoSuchElementException("Cannot add Null value");
        if(first == null) {
            first = new DeckNode<Item>(item);
            first.setData(item);
            last = first;
            N++;
            return;
        }
            DeckNode<Item> temp = new DeckNode<Item>(item);
            temp.data = item;
            temp.next = first;
            first.prev = temp;
            first = temp;
        N++;

    }

    public void addLast(Item item) {
        if(item == null)
            throw new NoSuchElementException("Cannot add null value");
        if(last == null) {
            last = new DeckNode<Item>(item);
            last.setData(item);
            first = last;
            N++;
            return;
        }

            DeckNode<Item> temp = new DeckNode<Item>(item);
            temp.data = item;
            last.next = temp;
            temp.prev = last;
            last = temp;
            N++;
    }
    public Item removeFirst() {
        if(first == null)
            return null;
        if( first == last) {
            Item data = first.data;
            first = last = null;
            N--;
            return data;
        }
        DeckNode<Item> temp; //= new DeckNode<Item>();
        temp = first;
        first = first.next;
        first.prev = null;
        temp.next = null;
        Item data = temp.data;
        N--;
        temp = null;
        return data;
    }
    public Item removeLast() {
        if(last == null)
            return null;
        if(first == last) {
            Item data = last.data;
            first = last = null;
            N--;
            return data;
        }
        DeckNode<Item> temp;// = new DeckNode<Item>();
        temp = last;
        last = last.prev;
        last.next = null;
        temp.prev = null;
        Item data = temp.data;
        N--;
        temp = null;
        return data;
    }

    public static void main(String ars[]) {
        Deque<String> deq = new Deque<String>();
        deq.addFirst("Sree");
        deq.addFirst("Rama");
        deq.addLast("Gayathri");
        deq.addLast("Uma");

        for(String s:deq)
            System.out.println("Name => " + s);

        System.out.println(deq.removeLast());
        System.out.println(deq.removeLast());
        System.out.println(deq.removeFirst());
        System.out.println(deq.removeFirst());
        System.out.println(deq.isEmpty() ? "Empty List" : "Not empty List");
        deq.addLast("Laxmi");
        System.out.println(deq.size());
        System.out.println();
    }
}
