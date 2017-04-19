package example.codeclan.com.wordcounterapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on AD 2017/4/18.
 */

public class WordCountTest {

    @Test
    public void testGetWordCount() {
        WordCount wordCount = new WordCount();
        int count = wordCount.getWordCount("Hello world");
        assertEquals(2, count);
    }
}
