import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;


public class Question3 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        try {   // try starts here
            fis = new FileInputStream("B:/myfile.txt");
        } catch (FileNotFoundException y) { // catch if file not found
            y.printStackTrace();
        }

        int k;
        try {   // try starts here
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (IOException y1) { //catch if input or output is  null
            y1.printStackTrace();
        }
        try {   // try starts here
            fis.close(); //fileinputstream closed
        } catch (IOException y) { //catch if input or output is  null
            y.printStackTrace();
        }
    }
}
