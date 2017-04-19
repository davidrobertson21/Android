package example.codeclan.com.wordcounterapp;

/**
 * Created by user on AD 2017/4/18.
 */

public class WordCount {
    public int getWordCount(String sentence) {
        return sentence.split(" ").length;
    }
}
