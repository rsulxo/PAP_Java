
public class ArrayStackDemo {

    public static void main(String[] args) {

        ArrayStack stackTest1 = new ArrayStack();

        stackTest1.push(1);
        stackTest1.push(2);
        stackTest1.push(3);
        stackTest1.push(4);

        System.out.println("top " + stackTest1.top());

        System.out.println("size " + stackTest1.size());

        System.out.println("Empty? " + stackTest1.isEmpty());

        stackTest1.pop();

        System.out.println("top " + stackTest1.top());

        System.out.println("size " + stackTest1.size());
    }

}
