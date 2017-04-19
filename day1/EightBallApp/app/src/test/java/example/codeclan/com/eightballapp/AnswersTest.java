package example.codeclan.com.eightballapp;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 17/04/2017.
 */

public class AnswersTest {

    public class getAnswersTest {
        @Test
        public void getAnswersTest(){
            Answers answers = new Answers();
            assertNotNull(answers);
        }
    }

        @Test
        public void setupAnswersTest(){
            Answers answers = new Answers();
            assertEquals(2, answers.getLength());
    }

        @Test
        public void createAnswersWithList(){
            ArrayList<String> testAnswers = new ArrayList<String>();
            testAnswers.add("Maybe");
            testAnswers.add("Yeah");
            Answers answers = new Answers(testAnswers);
            assertEquals(2, answers.getLength());
        }

        @Test
        public void canAddAnswer(){
            Answers answers = new Answers();
            answers.addAnswer("I dunno");
            assertEquals(3, answers.getLength());
        }

        @Test
        public void canReturnAnswerAtIndexTest() {
            Answers answers = new Answers();
            String result = answers.getAnswerAtIndex(0);
            assertEquals("Yes!", result);
        }

        @Test
        public void canReturnRandomAnswerTest(){
            Answers answers = new Answers();
            String result = answers.getAnswer();
            System.out.println("getAnswerTest answer: " + result);
            assertNotNull(result);
        }

}
