public interface Length {
    int x = 4;
    public void printMessage(String message);
    public  void printNumber(int i);
}

class Anonymous implements Length{

    int x = 8;

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printNumber (int i) {
        System.out.print(i);
    }

    public static void main(String[] args) {

        Anonymous length = new Anonymous();

        length.printMessage("y");
        length.printNumber(4);
        length.printMessage("x");
        length.printNumber(10);
    }
}