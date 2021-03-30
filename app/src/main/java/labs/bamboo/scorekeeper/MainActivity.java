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

    private TextView homeAssistsLabel;
    private TextView visitorAssistsLabel;

    private int homeAssistsScore = 0;
    private int visitorAssistsScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeFields();
    }

    public void initializeFields() {
        homeScore = findViewById(R.id.home_score);
        visitorScore = findViewById(R.id.visitor_score);

        homeAssistsLabel = findViewById(R.id.home_assists);
        visitorAssistsLabel = findViewById(R.id.visistor_assists);

        Button homeGoal;
        Button visitorGoal;
        Button resetScore;
        Button homeAssists;
        Button visitorAssists;

        homeGoal = findViewById(R.id.home_goal);
        homeGoal.setOnClickListener(v -> homeGoalScore());

        visitorGoal = findViewById(R.id.visitor_goal);
        visitorGoal.setOnClickListener(v -> visitorGoalScore());

        resetScore = findViewById(R.id.reset_score);
        resetScore.setOnClickListener(v -> resetScoreValues());

        homeAssists = findViewById(R.id.home_assists_score);
        homeAssists.setOnClickListener(v -> homeAssists());

        visitorAssists = findViewById(R.id.visistor_assists_score);
        visitorAssists.setOnClickListener(v -> visitorAssists());

    }

    public void homeGoalScore() {
        homeScoreValue++;
        homeScore.setText(String.valueOf(homeScoreValue));
    }

    public void visitorGoalScore() {
        visitorScoreValue++;
        visitorScore.setText(String.valueOf(visitorScoreValue));
    }

    public void homeAssists(){
        homeAssistsScore++;
        homeAssistsLabel.setText(String.valueOf(homeAssistsScore));
    }

    public void visitorAssists(){
        visitorAssistsScore++;
        visitorAssistsLabel.setText(String.valueOf(visitorAssistsScore));
    }

    public void resetScoreValues() {
        homeScoreValue = 0;
        homeScore.setText("0");
        visitorScoreValue = 0;
        visitorScore.setText("0");
        homeAssistsScore = 0;
        homeAssistsLabel.setText("0");
        visitorAssistsScore = 0;
        visitorAssistsLabel.setText("0");
    }
}