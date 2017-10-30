import java.util.*;

public class Exercise3 {

    public static void main(String[] args) {
        int [] numbers = {1, 100, 200, 300, 250, 215, 500, 1000, 400}; // An array of stored integers
        System.out.println(duplicates(numbers));                            // will print out T/F if the function tests for duplicates
    }


    //Add a function called duplicates which takes an array of integers as
    // argument and return true if the array contains duplicates and false otherwise.

    static boolean duplicates(int [] ar) {

        Set<Integer> ints = new HashSet<Integer>();     // I used Hash Map to create a Map first
        for(int a: ar) {                                // check for the number a in array
            if(ints.contains(a)){                       // if the int has 'a' (duplicate)
                return true;                            // the program will return true
            }
            ints.add(a);
        }
        return false;                                   // otherwise, it'll return false
    }
}


