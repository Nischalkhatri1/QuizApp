package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {

    private Button submitButton;
    private int score;
    private RadioGroup numOneRadionGroup;
    private RadioGroup numTwoRadionGroup;
    private RadioGroup numThreeRadionGroup;
    private RadioGroup numFourRadionGroup;

    private RadioGroup numFiveRadionGroup;
    private RadioGroup numSixRadionGroup;
    private RadioGroup numSevenRadionGroup;
    private RadioGroup numEightRadionGroup;
    private RadioGroup numNineRadionGroup;

    private EditText editText;
    private CheckBox japanCheckbox;
    private CheckBox indiaCheckbox;
    private CheckBox srilankaCheckbox;
    private CheckBox AmericaCheckbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        submitButton = findViewById(R.id.submit_button);
        editText = findViewById(R.id.edit_text);
        japanCheckbox = findViewById(R.id.japan_checkbox);
        indiaCheckbox= findViewById(R.id.india_checkbox);
        srilankaCheckbox = findViewById(R.id.s_checkbox);
        AmericaCheckbox = findViewById(R.id.a_checkbox);
        numOneRadionGroup = findViewById(R.id.num_one_radio_group);
        numTwoRadionGroup = findViewById(R.id.num_two_radio_group);
        numThreeRadionGroup = findViewById(R.id.num_three_radio_group);
        numFourRadionGroup = findViewById(R.id.num_four_radio_group);
        numFiveRadionGroup = findViewById(R.id.num_five_radio_group);
        numSixRadionGroup =findViewById(R.id.num_six_radio_group);
        numSevenRadionGroup =findViewById(R.id.num_seven_radio_group);
        numEightRadionGroup =findViewById(R.id.num_eight_radio_group);




        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score = 0;

                if(numOneRadionGroup.getCheckedRadioButtonId() == R.id.cos_radio){
                    score += 1;
                }

                if(numTwoRadionGroup.getCheckedRadioButtonId() == R.id.nationaladvisor_radio){
                    score += 1;
                }

                if(numThreeRadionGroup.getCheckedRadioButtonId() == R.id.ghandhis_radio){
                    score += 1;
                }

                if(numFourRadionGroup.getCheckedRadioButtonId() == R.id.nepal_radio){
                    score += 1;
                }
                if(numFiveRadionGroup.getCheckedRadioButtonId() == R.id.tannis_radio){
                    score += 1;
                }
                if(numSixRadionGroup.getCheckedRadioButtonId() == R.id.literature_radio){
                    score += 1;
                }
                if(numSevenRadionGroup.getCheckedRadioButtonId() == R.id.sweeden_radio){
                    score += 1;
                }
                if(numEightRadionGroup.getCheckedRadioButtonId() == R.id.nov_radi0){
                    score += 1;
                }


                String userAnswer = editText.getText().toString();
                if(userAnswer.equalsIgnoreCase("8.5")){
                    score += 1;
                }

                if(japanCheckbox.isChecked() &&indiaCheckbox.isChecked()){
                    score += 1;
                }

            Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
            intent.putExtra("SCORE", score+"/10");
            startActivity(intent);

            }
        });


    }
}




