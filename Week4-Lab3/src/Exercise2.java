
public class Exercise2 {

    public static void main(String[] args) {
        int [] numbers = {1,100, 200, 300, 250, 216, 500,1000, 400};     // array of stored integers

        System.out.println(isSorted(numbers));  // This will print out the numbers using the isSorted function
    }

    //Complete the function, isSorted which takes an array of integers as
    // argument and returns true if the array is sorted in ascending order and false otherwise.

    static boolean isSorted(int [] ar) {
        for(int i = 0; i<ar.length-1; i++){     // if i is less than the array length, add one
            if(ar[i] > ar[i+1]){                // if the index of the first one is greater than the second one
                return false;                   // the program is not in ascending order
            }
        }
        return true;                            // otherwise, it is
    }
}

// Overall, what that loop does is that it compares each index value to the one next to it and if it's larger than them
// It tells you that the integers are in an incorrect order