
public class Exercise1 {

    public static void main(String[] args) {
        String[] stringArray = {"computing", "at", "Goldsmiths", "College",         // an array which stores the strings
                "University", "of", "London", "New Cross", "London", "SE14 6NW"};
        String longestString = longestStringInArray(stringArray);                   // var to store the longest string in

        for (int i = 0; i < stringArray.length; i++) {                              // when i = 0, the index should be less than the
            System.out.println(stringArray[i]);                                     // string array's length
        }
        System.out.println("Longest String: " + longestStringInArray(stringArray));
    }

 // Complete the function, longestStringInArray which takes an array of strings and
 // returns the longest string in the array.

    public static String longestStringInArray(String[] a) {
        String[] stringArray = {"computing", "at", "Goldsmiths", "College",         // An array to store the strings in this function
                "University", "of", "London", "New Cross", "London", "SE14 6NW"};
        int maxLength = 0;                      // max length of string for now is 0
        String longestString = null;            // longest string value for now is null
        for (String s : stringArray) {          // look for the the string s in the array
            if (s.length() >= maxLength) {      // if the length of the string is greater than or eq to the max length
                maxLength = s.length();         // they will equal each other
                longestString = s;              // therefore, the string s will become the longest string
            }
        }
        return longestString;                   // returns the value found
    }
}