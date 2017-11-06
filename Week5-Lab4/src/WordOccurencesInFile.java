import java.io.*;
import java.util.Scanner;

// sks the user to enter a file name and a String (word) then prints the number of occurrences
// of that word in the input file. Your program should be able to deal with I/O Exceptions.

public class WordOccurencesInFile {

    public static void main(String [] args) {
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
