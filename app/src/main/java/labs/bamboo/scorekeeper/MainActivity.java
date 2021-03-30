package labs.bamboo.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView homeScore;
    private TextView visitorScore;
    private int homeScoreValue = 0;
    private int visitorScoreValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeFields();
    }

    public void initializeFields() {
        homeScore = findViewById(R.id.home_score);
        visitorScore = findViewById(R.id.visitor_score);

        Button homeGoal;
        Button visitorGoal;
        Button resetScore;

        homeGoal = findViewById(R.id.home_goal);
        homeGoal.setOnClickListener(v -> homeGoalScore());

        visitorGoal = findViewById(R.id.visitor_goal);
        visitorGoal.setOnClickListener(v -> visitorGoalScore());

        resetScore = findViewById(R.id.reset_score);
        resetScore.setOnClickListener(v -> resetScoreValues());
    }

    public void homeGoalScore() {
        homeScoreValue++;
        homeScore.setText(String.valueOf(homeScoreValue));
    }

    public void visitorGoalScore() {
        visitorScoreValue++;
        visitorScore.setText(String.valueOf(visitorScoreValue));
    }

    public void resetScoreValues() {
        homeScoreValue = 0;
        homeScore.setText("0");
        visitorScoreValue = 0;
        visitorScore.setText("0");
    }
}