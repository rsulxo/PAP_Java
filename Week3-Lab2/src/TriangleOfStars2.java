public class TriangleOfStars2 {
    public static void main(String args[]){
        int i;
        int j;
        for(i=1; i<=6; i++) {
            for ( j = 1; j<= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for(i = 7; i >= 1; i--) {       // 7 elements that go down in reverse from 6 til 1
            for(j = 1; j < i ; j++) {
                System.out.print(j); }
            System.out.println();
        }
    }
}
