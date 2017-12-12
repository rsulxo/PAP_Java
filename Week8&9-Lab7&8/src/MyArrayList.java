//  Exercise 1
// Add the missing methods add, get and remove to give an implementation of a dynamic array.


public class MyArrayList {

    private static final int SIZE_FACTOR=10;
    private Object data[];
    private int size;
    private Object new1[];
    int nitems;

    public MyArrayList(){
        this.data = new Object[SIZE_FACTOR];
        this.size = SIZE_FACTOR;
        nitems = 0;
    }

    public void extend() {

        this.size = SIZE_FACTOR;
        this.size = this.size * 2;
        new1 = new Object[this.size];
        for(int i = 0; i < nitems; i++) {
            new1[i] = data[i];
        }
        data = new1;

    }

    public void add(Object obj){        // add method
        if(this.size == nitems) {
            extend();
        }
        data[nitems] = obj;
        nitems++;
    }

    public Object get(int i) throws Exception{      // get method
        return data[i];
    }

    public void remove(int i) throws Exception{     // remove method
        for(int j = i; j < this.size-1; j++) {
            data[j] = data[j+1];
        }
    }

    public static void main(String[] args) throws Exception {
        MyArrayList mal = new MyArrayList();
        mal.add("zero");
        mal.add("one");
        mal.add("two");
        mal.add("three");
        mal.add("four");
        mal.add("five");
        mal.add("six");
        mal.add("seven");
        mal.add("eight");
        mal.add("nine");
        mal.remove(6);
        System.out.println(mal.get(8));
    }
}