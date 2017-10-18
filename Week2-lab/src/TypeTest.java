public class TypeTest {
    public static void main(String[] args) {
        double a = 99999.8;
        double b = 99999.4;
        System.out.println(a + b);
    }
    // If i change the type of the variables a and b
    //to floats, it gives me an error because a float
    // is a single precision value (32 bit) and
    // double is a double precision value (64 bit)
}

