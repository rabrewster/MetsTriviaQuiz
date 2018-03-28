package com.example.android.metstriviaquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAllAnswers(View v) {
        int correctAnswers = 0;
        // Check first answer
        if (checkQ1()) {
            correctAnswers++;
        }
        // Check second answer
        if (checkQ2()) {
            correctAnswers++;
        }
        // Check third answer
        if (checkQ3()) {
            correctAnswers++;
        }
        // Check fourth answer
        if (checkQ4()) {
            correctAnswers++;
        }
        ((TextView) findViewById(R.id.number_correct)).setText("You got " + correctAnswers + " out of 4 correct!");
    }

    public boolean checkQ1() {
        boolean isHernandezChecked = ((RadioButton) findViewById(R.id.hernandez_number)).isChecked();
        if (isHernandezChecked) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkQ2() {
        boolean isDarlingChecked = ((CheckBox) findViewById(R.id.darling)).isChecked();
        boolean isDickeyChecked = ((CheckBox) findViewById(R.id.dickey)).isChecked();
        boolean isGlavineChecked = ((CheckBox) findViewById(R.id.glavine)).isChecked();
        boolean isGoodenChecked = ((CheckBox) findViewById(R.id.gooden)).isChecked();
        boolean isSeaverChecked = ((CheckBox) findViewById(R.id.seaver)).isChecked();
        if (!isDarlingChecked && isDickeyChecked && !isGlavineChecked && isGoodenChecked && isSeaverChecked) {
             return true;
        } else {
            return false;
        }
    }

    public boolean checkQ3() {
        boolean isFalseChecked = ((RadioButton) findViewById(R.id.false_choice)).isChecked();
        if (isFalseChecked) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkQ4() {
        String answerText = ((EditText) findViewById(R.id.batting_champion_answer)).getText().toString();
        if (answerText.toUpperCase().contains("REYES")) {
            return true;
        } else {
            return false;
        }
    }
}