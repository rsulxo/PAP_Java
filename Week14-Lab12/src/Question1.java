public class Question1 {
    public static double divide(double a, double b) {
        if(b == 0){
            throw new IllegalArgumentException("Unable to divide by zero");
        }
        return a/b;
    }

    public static void printQuotient(double a, double b) {
        try {
            System.out.println(divide(a, b));
        }
        catch (IllegalArgumentException e) {
            System.out.println("Divisor is zero");
        }
    }
}


