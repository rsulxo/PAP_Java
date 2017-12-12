package FileInfo;

import java.io.FileNotFoundException;

public class FileInfoDemo {
    public static void main(String [] args) throws FileNotFoundException {
        FileInfo.wordCount("test1.txt");
        FileInfo.wordOccurrences("test1.txt");
    }
}