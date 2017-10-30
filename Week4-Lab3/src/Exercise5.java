import java.util.*;

public class Exercise5 {

    public static void main(String[] args) {
        String input= " Studying at Goldsmiths College, University of London. Students need to work harder to achieve a first class degree at Goldsmiths.";

        wordOccurrences(input);
    }

    public static void wordOccurrences(String st){

        Map<String, Integer> wordCount = new LinkedHashMap();   // LinkedHashMap preserves the order of insertion.
        st = st.trim();                                         // Trims the string
        st = st.replaceAll("\\p{P}", "");     // replaces the punctuation with a space
        st = st.toLowerCase();                                  // puts all string characters to lowercase to make it easier to understand
        String[] words = st.split(" ");                  // uses the space to differentiate between words

        for(String word: words){                                // check for word in words array
            if(wordCount.containsKey(word)){                    // assign each word with a key
                wordCount.put(word, wordCount.get(word)+1);     // if word with same key is found again, you add one to the value
            } else {
                wordCount.put(word, 1);                         // otherwise you carry on looking for other words with no occurences
            }
        }

        for(String key: wordCount.keySet()){                    // check for the key in key set of the word count
            System.out.println(key+"  "+wordCount.get(key));    // print the key first, then the word count of the key
        }
    }
}