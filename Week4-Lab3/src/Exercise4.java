public class Exercise4 {

    public static void main (String[] args){
        primeNumbers(100);
    } // n = 100 because thats the value we can go up til

    private static void primeNumbers(int n) {   // Function for the prime numbers
        for(int i = 2; i<n; i++){               //first prime number is 2 so i will be 2
            if(primality(i)){                   // i < n in this example means 2 < 100 - so all prime no.'s between them
                System.out.println(i);          // this prints the index which are all the prime numbers between the given number
            }
        }

    }


    static boolean primality(int p){            // a func to find the prime numbers
        for(int i = 2; i<p; i++){               // i=2 bcos the first prime number is 2, i<p bcos we are trying to go up til however long we want
            if(p%i == 0){                       // p modulo i(2) is 0 because that's how you calculate primes
                return false;
            }
        }
        return true;
    }
}