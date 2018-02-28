
public class ArrayStack {

    private Object[] array;
    private int counter;
    public static final int MAX = 100;

    public ArrayStack(){
        array = new Object[MAX];
        counter = 0;
    }
    public Object top() {
        // returns the last added element
        return array[counter-1];
    }

    public void pop(){
        // removes last added element
        counter--;
    }

    public void push(Object obj){
        // add element to the stack
        array[counter++]=obj;
    }

    public boolean isEmpty(){
        // checks if the stack is empty
        return counter==0;
    }

    public int size(){
        // returns the size of the stack
        return counter;
    }


}

