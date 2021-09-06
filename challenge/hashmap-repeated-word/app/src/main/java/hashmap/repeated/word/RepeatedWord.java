package hashmap.repeated.word;

import java.util.Hashtable;
import java.util.Locale;

public class RepeatedWord {

    public String RepeatedWord(String passage){
        Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
        String[] words = passage.split("\\W+");

        int counter = 1;
        String firstRepeatedWord = null;
 
        for(String word: words){
            word = word.toLowerCase();
            if(hashtable.get(word) != null){
                counter ++;
                if(firstRepeatedWord == null) firstRepeatedWord = word;
            }


            hashtable.put(word, counter);
        }
        return firstRepeatedWord;
    }

}
