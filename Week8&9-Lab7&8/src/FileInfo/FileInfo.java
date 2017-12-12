package FileInfo;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInfo {
    public static void wordCount(String _file) {

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
    @SuppressWarnings("unchecked")
    public static void wordOccurrences(String _file) {
        try {

            Scanner user = new Scanner(System.in);          // creates new scanner
            System.out.print("Enter a file name: ");        // asks user to enter a file name
            String fileName = user.next().trim();           // stores file name in a variable
            Scanner scan = new Scanner(new File(fileName)); // When entering file name use path: "filename.txt"
            System.out.println("Enter a word: ");           // asks user to enter the word they're looking for
            String WordName = user.next().trim();           // stores the word as a variable
            int number = 0;                                 // starting value for the number
            while (scan.hasNext()){                         // this scans for the next item each time
                if (scan.next().equals(WordName))           // if the word its scans equals to the word inputted
                    number++;                               // you add 1 to the number(0)
            }
            WordName.replaceAll("[^a-zA-Z ]", "").split("\\s+"); // strip punctuation
            System.out.println(number);                     // then print the final number
        }
        catch (FileNotFoundException e) {
            System.out.println("Unable to find file");  // this is for when the file entered doesn't exist
        }
    }


}