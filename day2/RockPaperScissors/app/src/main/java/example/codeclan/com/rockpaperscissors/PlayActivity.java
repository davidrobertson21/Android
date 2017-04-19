package example.codeclan.com.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PlayActivity extends AppCompatActivity {

    TextView result;
    Button rockButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        result = (TextView) findViewById(R.id.TextView_result);
        rockButton = (Button) findViewById(R.id.rock_button);

    }

    public void rockButtonIsPressed(View rockButton){
        Log.d(getClass().toString(), "Rock button has been pressed");

        GameLogic game = new GameLogic(RPS.ROCK);
        game.randomComputerChoice();
        String winner = game.getWinner(game.getComputerChoice());
        result.setText("Computer picked: " + game.getComputerChoice().toString() + ", " + winner);

    }

    public void paperButtonIsPressed(View paperButton){
        Log.d(getClass().toString(), "Paper button has been pressed");

        GameLogic game = new GameLogic(RPS.PAPER);
        game.randomComputerChoice();
        String winner = game.getWinner(game.getComputerChoice());
        result.setText("Computer picked: " + game.getComputerChoice().toString() + ", " + winner);

    }

    public void scissorsButtonIsPressed(View scissorsButton){
        Log.d(getClass().toString(), "Scissors button has been pressed");

        GameLogic game = new GameLogic(RPS.SCISSORS);
        game.randomComputerChoice();
        String winner = game.getWinner(game.getComputerChoice());
        result.setText("Computer picked: " + game.getComputerChoice().toString() + ", " + winner);

    }
}
