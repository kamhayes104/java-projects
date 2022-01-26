class SinglyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;


    public SinglyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    void insertFirst(E e) {
        Node<E> newNode = new Node<>();
        newNode.data = e;
        if (isEmpty()) {
            first = last = newNode;
        }
        else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    void insertLast(E e) {
        Node<E> newNode = new Node<>();
        newNode.data = e;

        if (isEmpty()) {
            first = last = newNode;
        }
        else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    void insertAt(E e, int pos) {
        if (pos <= 1)
            insertFirst(e);
        else if (pos > size)
            insertLast(e);
        else {
            Node<E> newNode = new Node<>();
            newNode.data = e;

            Node<E> currentNode = first;
            for (int i = 1; i < pos-1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            size++;
        }

    }

    void removeFirst() {
        if (isEmpty())
            return;
        else if (size == 1) {
            first = last = null;
            size--;
        }
        else {
            first = first.next;
            size--;
        }
    }

    void removeLast() {
        if (isEmpty())
            return;
        else if (size == 1) {
            first = last = null;
            size--;
        }
        else {
            Node<E> currentNode = first;
            for (int i = 1; i < size-1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            last = currentNode;
            size--;
        }

    }

    void removeAt(int pos) {
        if (isEmpty())
            return;
        else if (size == 1) {
            first = last = null;
            size--;
        }
        else {
            if (pos <= 1) {
                removeFirst();
            }
            else if (pos > size) {
                removeLast();
            }
            else {
                Node<E> currentNode = first;
                for (int i = 1; i < pos-1; i++) {
                    currentNode = currentNode.next;
                }
                currentNode.next = currentNode.next.next;
            }
            size--;
        }
    }

    void removeElement(E e) {
        if (isEmpty())
            return;
        else {
            if (first.data == e)
                removeFirst();
            else if (last.data == e)
                removeLast();
            else {
                Node<E> currentNode = first;
                while (currentNode != last) {
                    if (currentNode.next.data == e)
                        currentNode.next = currentNode.next.next;
                    currentNode = currentNode.next;
                }
            }
        }
    }

    void print() {
        Node<E> currentNode = first;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    boolean isEmpty() {
        return first == null;
    }

    static class Node<E> {
        private E data;
        private Node<E> next;

        Node() {
            data = null;
            next = null;
        }

    }

}







