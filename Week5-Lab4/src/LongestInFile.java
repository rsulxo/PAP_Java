import java.util.Scanner;
import java.io.*;

// asks the user to enter a file name and prints the longest string in the file.
// The file might have more than one string with the longest length, if this is the case
// then your program should print the first occurring longest word. Your program should
// be able to deal with I/O Exceptions.


public class LongestInFile {
    public static void main(String [ ] args) throws FileNotFoundException {
        new LongestInFile().getLongestWords();
    }

    public String getLongestWords() throws FileNotFoundException {

        String longestWord = "";                        // stores the longest word
        String current;                                 // stores the current value
        Scanner user = new Scanner(System.in);          // new scanner created
        System.out.print("Enter a file name: ");        // asks user to enter a file name
        String fileName = user.next().trim();           // stores file name
        Scanner scan = new Scanner(new File(fileName)); // When entering file name use path: "filename.txt"


        while (scan.hasNext()) {        // While loop created to look for the longest word
            current = scan.next();      // scans current word
            if ((current.length() > longestWord.length()) && (!current.matches(".*\\d.*"))) { // not to take into account words with numbers
                longestWord = current;  // compares the longest word to the current
            }

        }
        System.out.println(longestWord);
        longestWord.replaceAll("[^a-zA-Z ]", "").split("\\s+"); // strip punctuation before you return all
        return longestWord;
    }

}