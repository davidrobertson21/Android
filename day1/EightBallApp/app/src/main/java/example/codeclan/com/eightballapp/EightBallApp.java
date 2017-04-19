package example.codeclan.com.eightballapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class EightBallApp extends AppCompatActivity {

    private EditText questionEditText;
    private Button shakeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_ball_app);
        Log.d(getClass().toString(), "onCreate is called");

        questionEditText = (EditText) findViewById(R.id.question_text);
        shakeButton = (Button) findViewById(R.id.shake_button);
    }

    public void onShakeButtonClicked(View button) {
        Log.d(getClass().toString(), "onShakeButton was clicked");

        String questionThatWasAsked = questionEditText.getText().toString();

        Log.d(getClass().toString(), questionThatWasAsked);

        Answers answer = new Answers();
        String randomAnswer = answer.getAnswer();

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", randomAnswer);

        startActivity(intent);
    }
}