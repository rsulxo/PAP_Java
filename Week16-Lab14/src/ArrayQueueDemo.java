
public class ArrayQueueDemo {

    public static void main(String[] args) {

        ArrayQueue queueTest1 = new ArrayQueue();

        queueTest1.join(1);
        queueTest1.join(2);
        queueTest1.join(3);
        queueTest1.join(4);
        queueTest1.join(5);

        System.out.println("head " + queueTest1.head());
        System.out.println("tail " + queueTest1.tail());
        System.out.println("size " + queueTest1.size());

        queueTest1.leave();

        System.out.println("head " + queueTest1.head());
        System.out.println("tail " + queueTest1.tail());
        System.out.println("size " + queueTest1.size());

        System.out.println("empty? " + queueTest1.isEmpty());
    }

}
