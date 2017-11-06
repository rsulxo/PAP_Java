import java.util.Scanner;
import java.io.*;

// Write a complete program, WordCount.java, that asks the user to enter a file name
// then prints the number of words in the file. Your program should be to deal with
// I/O Exceptions.


public class WordCount {

    public static void main(String[] args) {

        try {

            Scanner user = new Scanner(System.in);          // creates a new scanner
            System.out.print("Enter a file name: ");        // asks user to input a file name
            String fileName = user.next().trim();           // stores file name as a variable
            Scanner scan = new Scanner(new File(fileName)); // When entering file name use path: "filename.txt"
            int counter = 0;                                // starting value for the counting variable
            while (scan.hasNext()) {                        // scans next word
                scan.next();                                // once it scans the next word
                counter++;                                  // it adds one to the counter


            }

            System.out.println(counter);                    // once the loop is finished, it prints the total

        } catch (FileNotFoundException e) {                 // this deals with exceptions
            System.out.println("Unable to find file");      // tells user there has been an error if file doesn't exist
        }
    }
}


