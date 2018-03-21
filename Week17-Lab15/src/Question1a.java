
// The static had to be removed for the the inner class as the outer class can only be static

public class Question1a {
    public class Outer{
        String s;
        class Inner {		// You have to remove the static as mentioned before
            void testMethod() {
                s = "Inner";
            }
        }
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
