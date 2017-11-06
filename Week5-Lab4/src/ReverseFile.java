import java.io.*;
import java.util.Scanner;

// ask the user to enter 2 file names .i.e. ’input.txt’ and ’output.txt’.
// The program then copies the content of ’input.txt’ in reverse order into ’output.txt’.

// In this example use 'test1.txt' and 'test2.txt' as the file names

public class ReverseFile {
    public static void main(String[] args) {
        FileInputStream inFile = null;
        FileOutputStream outFile = null;
        try {

            Scanner input = new Scanner(System.in);         // this will be the input file
            System.out.print("Please enter a file name: ");   // this asks for the file name
            String fileName = input.nextLine();             // this stores the file name into a variable
            inFile = new FileInputStream(fileName);            // this opens a connection to an actual file,
                                                        // the file named by the path name name in the file system


            Scanner output = new Scanner(System.in);                // this will ask for the output file
            System.out.print("Please enter the output file name: ");    // this asks the user for the file name
            String fileName2 = input.nextLine();                    // this stores output file into a variable
            outFile = new FileOutputStream(fileName2);                 // this looks for the path where the file is stored

            byte[] buffer = new byte[1024];                 // This is the byte array
            int length;

            while ((length = inFile.read(buffer)) > 0) {       // this just copies the first file
                outFile.write(buffer, 0, length);          // this copied it onto the second file


            }
            input.close();
            output.close();

            System.out.println("Your file has been copied!");   // This informs the user that the file has been copied
        } catch (Exception e) {                                 // This catches the exceptions
            System.out.println("File not found");               // informs the user their file wasn't found
        }
    }
}

//sources used to help understand:
// https://www.tutorialspoint.com/java/io/java_io_fileinputstream.htm
// https://docs.oracle.com/javase/7/docs/api/java/nio/ByteBuffer.html
// https://www.cs.princeton.edu/courses/archive/spr96/cs333/java/tutorial/java/io/streampairs.html