public class Question2 {
    public static void main(String[] args) {
        try {
            String[] s = {"abc", "123", null,"xyz"};
            for(int i = 0; i < s.length; i++) {
                int a = s[i].length();
                System.out.println(s[i+1]);
                a = Integer.parseInt(s[i]);
            }
        } catch(Exception e) {
            System.out.println("String can't be a number as it is not allowed to be null.");
        }
    }
}

