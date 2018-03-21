public class Outer {
    String s;
    public class Inner{        // You have to change static class to public class so they're both public.
        void testMethod(){
            s = "inner";
        }
    }
}