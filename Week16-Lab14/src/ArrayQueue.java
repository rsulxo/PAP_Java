
public class ArrayQueue {
    int front,back;
    Object[] array;
    public static final int MAX=100;

    int size = back;

    public ArrayQueue(){
        front=0;
        back=0;
        array = new Object[MAX];
    }

    public Object head() {
        // returns the head of the queue
        return array[front];
    }

    public Object tail() {
        // returns the tails of the queue
        return array[back-1];
    }

    public void leave(){
        // check if the front of the queue reaches the end then front becomes 0
        front++;
        if(front==MAX) {
            front=0;
        }
        size = back -1;
    }


    public void join(Object obj){
        // add an element the queue
        array[back++]=obj;
        if(back==MAX) {
            back=0;
        }
        size = back;
    }

    public boolean isEmpty(){
        // checks if the queue is empty
        return front==back;
    }

    public int size(){
        // returns the size of the queue
        return size;
    }
}
