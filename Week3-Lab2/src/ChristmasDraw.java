import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ChristmasDraw {

    static String couples[][] = new String[5][2];

    static String[] lastYear = new String[]{   // This has last years draw combinations which can't be repeated
            "y4, y2",
            "x3, y5",
            "y5, x1",
            "x2, x3",
            "y3, y1",
            "y2, x4",
            "x4, y3",
            "x5, x2",
            "y1, x5",
            "x1, y4"
    };

    static ArrayList<String> thisYear = new ArrayList<>();

    public static void main(String args[]){

        for(int i = 0; i<couples.length; i++){
            couples[i][0] = "x"+(i+1);   // the [i] holds the x value and [0] holds the value of 0+1, each time
            couples[i][1] = "y"+(i+1);  // the [i] holds the y value and [1] holds the value of 0+1, each time
        }

        for(int i = 0; i<couples.length; i++){   // This for loop is for the x values
            while(true){
                String res = assignMember(couples[i][0], i);
                if(Arrays.stream(lastYear).anyMatch(x -> x.equals(res))){
                    continue;
                } else {
                    thisYear.add(res);
                    break;
                }
            }

        }

        for(int i = 0; i<couples.length; i++){      // This for loop is for the y values
            while(true){
                String res = assignMember(couples[i][1], i);
                if(Arrays.stream(lastYear).anyMatch(x -> x.equals(res))){
                    continue;
                } else {
                    thisYear.add(res);
                    break;
                }
            }

        }

        for(String s: thisYear){
            System.out.println(s);
        }

    }

    public static String assignMember(String from, int index){ 
        Random r = new Random();
        int col,row = 0;

        while(true){
            col = r.nextBoolean() ? 0 : 1;
            row = r.nextInt(couples.length);

            if(row == index){
                continue;
            }

            break;
        }

        return from+", "+couples[row][col];   //Returns the value in row first and column second format

    }
}