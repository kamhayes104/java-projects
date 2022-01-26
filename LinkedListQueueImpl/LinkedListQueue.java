import java.util.HashMap;
import java.util.Map;

class LinkedListQueue<E> {

    Node<E> top;
    Node<E> bottom;
    private int size;

    //creates empty queue
    LinkedListQueue() {
        top = null;
        bottom = null;
        size = 0;
    }

    //add to back of queue
    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            top = bottom = newNode;
        }

        else {
            bottom.next = newNode;
            bottom = newNode;
        }
        size++;
    }

    //remove from front of queue
    public E dequeue() {
        if (isEmpty())
            return null;
        else if (size == 1) {
            top = bottom = null;
            size--;
            return null;
        }
        else {
            Node<E> temp = top;
            top = top.next;
            size--;
            return temp.data;
        }
    }

    //returns element at front without removing
    public E peek() {return top.data;}

    public int frequency(E element) {
        int count = 0;
        Node<E> currNode = top;
        while (currNode != null) {
            if (currNode.data == element)
                count++;
            currNode = currNode.next;
        }
        return count;
    }

    public HashMap<E, Integer> freqAll() {
        HashMap<E, Integer> frequencies = new HashMap<>();
        Node<E> currNode = top;
        while (currNode != null) {
            E key = currNode.data;
            if (!frequencies.containsKey(currNode.data)) {
                frequencies.put(key, 1);
            }
            else {
                frequencies.put(key, (frequencies.get(key)+1));
            }
            currNode = currNode.next;
        }
        return frequencies;
    }

    public void print() {
        Node<E> currNode = top;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {return size == 0;}

    static class Node<E> {
        E data;
        Node<E> next;

        Node(E element) {
            data = element;
            next = null;
        }
    }
}
