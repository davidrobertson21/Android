package example.codeclan.com.eightballapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AnswerActivity extends AppCompatActivity {

    private TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Log.d(getClass().toString(), "onCreate called");

        answerText = (TextView) findViewById(R.id.answer_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("answer");
        answerText.setText(answer);
    }
}
