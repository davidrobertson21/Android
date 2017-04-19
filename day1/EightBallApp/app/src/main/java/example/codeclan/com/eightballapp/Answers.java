package example.codeclan.com.eightballapp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 17/04/2017.
 */

public class Answers implements Answerable {

    private ArrayList<String> answers;


    public Answers() {
        answers = new ArrayList<String>();
        setupAnswers();
    }

    public Answers(ArrayList<String> newAnswers) {      //this is copying the array list
        answers = newAnswers;
    }

    public ArrayList<String> getAnswers(){
        return new ArrayList<String>(answers);

    }

    public int getLength(){
        return answers.size();

    }

    private void setupAnswers(){
        String[] answersToAdd = {
                "Yes!",
                "That would be an ecumenical matter"
        };

        for(String answer : answersToAdd){answers.add(answer);}

    }

    public void addAnswer(String answer) {
        answers.add(answer);
    }

    public String getAnswerAtIndex(int index) {
        return answers.get(index);
    }

    public String getAnswer() {
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        String answer = getAnswerAtIndex(index);
        return answer;
    }
}
