public class Queuedemo {

    public static void main(String[] args) {
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();

        for (int i = 0; i < 10; i++)
            linkedListQueue.enqueue(9);

        System.out.println(linkedListQueue.peek());
        linkedListQueue.print();

        System.out.println(linkedListQueue.freqAll());


    }


}
