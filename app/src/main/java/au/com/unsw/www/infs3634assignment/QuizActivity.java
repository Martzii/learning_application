package au.com.unsw.www.infs3634assignment;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView textViewQuestion;
    private TextView textViewScore;
    private TextView textViewQcount;
    private RadioGroup radioGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private Button confirmNext;
    private List<Questions> questionsList;

    private ColorStateList defaultColor;
    private int qCount;
    private int qTotal;
    private Questions currentQuestion;
    private int score;
    private boolean answered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        textViewQuestion = findViewById(R.id.textview_question);
        textViewScore = findViewById(R.id.textview_currentscore);
        textViewQcount = findViewById(R.id.textview_questioncount);
        radioGroup = findViewById(R.id.radio_group);
        rb1 = findViewById(R.id.radio_button);
        rb2 = findViewById(R.id.radio_button2);
        rb3 = findViewById(R.id.radio_button3);
        confirmNext = findViewById(R.id.confirm_next_button);

        DatabaseClass db = new DatabaseClass(this);
        questionsList = db.getAllQuestions();

    }
}
