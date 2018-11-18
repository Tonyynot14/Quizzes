package net.androidbootcamp.quizzes;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    boolean anwser1;
    boolean anwser2;
    boolean anwser3;
    boolean anwser4;
    public void sumbitAnswers(View view)
    {

        if(anwser1)
        {
           displayMessage("Correct",R.id.answerToQuestion1,anwser1);
        }
        else
        {
            displayMessage("Incorrect "+getString(R.string.q1AnswerA)+ " is correct", R.id.answerToQuestion1,anwser1);
        }
        if(anwser2)
        {
            displayMessage("Correct",R.id.answerToQuestion2,anwser2);
        }
        else
        {
            displayMessage("Incorrect "+getString(R.string.q2AnswerB)+ " is correct", R.id.answerToQuestion2,anwser2);
        }


        if(anwser3)
        {
            displayMessage("Correct",R.id.answerToQuestion3,anwser3);
        }
        else
        {
            displayMessage("Incorrect "+getString(R.string.q3AnswerB)+ " is correct", R.id.answerToQuestion3,anwser3);
        }
        if(anwser4)
        {
            displayMessage("Correct",R.id.answerToQuestion4,anwser4);
        }
        else
        {
            displayMessage("Incorrect "+getString(R.string.q4AnswerC)+ " is correct", R.id.answerToQuestion4,anwser4);
        }

    }
    public void onRadioButtonClicked(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        if(view.getId()==R.id.question1_answerA)
        {
            anwser1=true;
        }
        else
        {
            anwser1=false;
        }
    }
    public void onRadioButtonClicked2(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        if(view.getId()==R.id.question2_answerB)
        {
            anwser2=true;
        }
        else
        {
            anwser2=false;
        }
    }

    public void onRadioButtonClicked3(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        if(view.getId()==R.id.question3_answerB)
        {
            anwser3=true;
        }
        else
        {
            anwser3=false;
        }
    }

    public void onRadioButtonClicked4(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        if(view.getId()==R.id.question4_answerC)
        {
            anwser4=true;
        }
        else
        {
            anwser4=false;
        }
    }

    private void displayMessage(String message,int resource, boolean answer)
    {
        TextView questionTextView = findViewById(resource);
        questionTextView.setText(message);
        if (answer)
        {
            questionTextView.setBackgroundColor(Color.parseColor("#006400"));
        }
        else
        {
            questionTextView.setBackgroundColor(Color.parseColor("#FF0000"));
        }

    }


}
