package example.codeclan.com.wordcounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.text_to_be_calculated);
        textView = (TextView) findViewById(R.id.my_text_view);
    }

    public void onButtonClicked(View view) {
        String setence = editText.getText().toString();
        WordCount word = new WordCount();
        int wordCount = word.getWordCount(setence);
        textView.setText("The wordcount is: " + wordCount);
    }

}

