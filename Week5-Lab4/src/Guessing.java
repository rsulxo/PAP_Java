//import java.util.Random;
import java.util.Scanner;

// asks the user to think of a number between 0 and 1000 and uses a binary search tree to guess the users number.
// the program will will display the guess and the user has the character ’C if the guess is correct, the character
// ’H’ if the guess is too low or the character ’L’ if the guess if too high

class Guessing {
    public static void main(String[] args) {

        Scanner start = new Scanner(System.in);
        String enter;                               // This is to ensure the user starts the game
        String correctGuess;                        // This is for the correct guess made by the comp.
        int guesses = 1;                            // This is for the guesses the comp. makes
        String high_or_low;                         // This var is for the higher/lower option
        int compGuess = 500;                        // This starts at 500 and changes depending on higher/lower
        int lower_bound = 0;                        // This is the lowest number
        int upper_bound = 1000;                     // This is the highest number


        System.out.println("Think of a number between 0 and 1000");            // Informs the user on what to do

        do {
            System.out.println("Press enter when ready...");                  // Pressing enter will start the game
            enter = start.nextLine();                                         // Creates a new line
        } while (!(enter.equals("")));

        do {
            System.out.println("Guessing between " + lower_bound + " and " + upper_bound);     // Tells you its going to guess between 0-1000
            System.out.println("My guess is " + compGuess);                                        // guess is updated and showed to the user
            System.out.println("is that correct? (yes/no)");                                   // user is asked to verify the correct answer
            correctGuess = start.nextLine();                                                        // creates a new line

            if (correctGuess.equals("no")) {                   // If correct equals to no the guesses will increase
                guesses++;

                do {
                    System.out.println("Is it higher or lower than " + compGuess + " (h/l)");    // The updated guesses is put in and asked for higher/lower
                    high_or_low = start.nextLine();                                            // creates a new line
                } while (!(high_or_low == "l") && (high_or_low == "h"));                          // not high is equiv to low & high is equiv to high

                if (high_or_low.equals("h"))  {                    // if the number is higher
                    lower_bound = compGuess;                       // lower bound becomes equiv to the guess
                    lower_bound++;                             // which then adds onto the guess to find higher numbers
                }

                if (high_or_low.equals("l"))  {                   // if number is lower
                    upper_bound = compGuess;                      // upper bound becomes equiv to the guess
                    upper_bound--;                            // which takes away from the original guess to find the lower number
                }
                compGuess = (lower_bound + upper_bound) / 2;      // guess is calculated by adding 0+1000/2 which is half of a 1000
            }

        } while (!(correctGuess.equals("yes")));                   // lets say that the comp. guesses the correct number

        if (correctGuess.equals("yes")) ; {
            System.out.println("Yay! I guessed it right!");   // It will simply print out a positive statement thus ending the program
        }
    }
}

// sources used to help understand:

// http://www.java-made-easy.com/guessing-game.html
// http://www.dreamincode.net/forums/topic/247097-computer-guesses-the-user-number-game/