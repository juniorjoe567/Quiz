package com.example.android.quiz;

import android.content.Context;
import android.content.DialogInterface;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int mark = 0;
    private CollapsingToolbarLayout collapsingToolbarLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //When the view solutions button is clicked
    public void displaySolutions(View view) {
        //get reference to the check boxes for the check boxes in question 1
        CheckBox ansQn1A = (CheckBox) findViewById(R.id.ansQn1a);
        CheckBox ansQn1B = (CheckBox) findViewById(R.id.ansQn1b);
        CheckBox ansQn1C = (CheckBox) findViewById(R.id.ansQn1c);
        CheckBox ansQn1D = (CheckBox) findViewById(R.id.ansQn1d);
        boolean ansqn1a = ansQn1A.isChecked();
        boolean ansqn1b = ansQn1B.isChecked();
        boolean ansqn1c = ansQn1C.isChecked();
        boolean ansqn1d = ansQn1D.isChecked();

        //Get refernce to the question 2 radio buttons
        RadioButton ansQn2A = (RadioButton) findViewById(R.id.ansQn2a);
        RadioButton ansQn2B = (RadioButton) findViewById(R.id.ansQn2b);
        RadioButton ansQn2C = (RadioButton) findViewById(R.id.ansQn2c);
        RadioButton ansQn2D = (RadioButton) findViewById(R.id.ansQn2d);

        //Get refernce to the question 3 radio buttons
        RadioButton ansQn3A = (RadioButton) findViewById(R.id.ansQn3a);
        RadioButton ansQn3B = (RadioButton) findViewById(R.id.ansQn3b);
        RadioButton ansQn3C = (RadioButton) findViewById(R.id.ansQn3c);
        RadioButton ansQn3D = (RadioButton) findViewById(R.id.ansQn3d);

        //Get refernce to the question 4 radio buttons
        RadioButton ansQn4A = (RadioButton) findViewById(R.id.ansQn4a);
        RadioButton ansQn4B = (RadioButton) findViewById(R.id.ansQn4b);
        RadioButton ansQn4C = (RadioButton) findViewById(R.id.ansQn4c);
        RadioButton ansQn4D = (RadioButton) findViewById(R.id.ansQn4d);

        //Get refernce to the question 5 radio buttons
        RadioButton ansQn5A = (RadioButton) findViewById(R.id.ansQn5a);
        RadioButton ansQn5B = (RadioButton) findViewById(R.id.ansQn5b);
        RadioButton ansQn5C = (RadioButton) findViewById(R.id.ansQn5c);
        RadioButton ansQn5D = (RadioButton) findViewById(R.id.ansQn5d);

        //Get refernce to the question 6 radio buttons
        RadioButton ansQn6A = (RadioButton) findViewById(R.id.ansQn6a);
        RadioButton ansQn6B = (RadioButton) findViewById(R.id.ansQn6b);
        RadioButton ansQn6C = (RadioButton) findViewById(R.id.ansQn6c);
        RadioButton ansQn6D = (RadioButton) findViewById(R.id.ansQn6d);

        //Get refernce to the question 7 radio buttons
        RadioButton ansQn7A = (RadioButton) findViewById(R.id.ansQn7a);
        RadioButton ansQn7B = (RadioButton) findViewById(R.id.ansQn7b);
        RadioButton ansQn7C = (RadioButton) findViewById(R.id.ansQn7c);
        RadioButton ansQn7D = (RadioButton) findViewById(R.id.ansQn7d);

        //Get refernce to the question 8 radio buttons
        CheckBox ansQn8A = (CheckBox) findViewById(R.id.ansQn8a);
        CheckBox ansQn8B = (CheckBox) findViewById(R.id.ansQn8b);
        CheckBox ansQn8C = (CheckBox) findViewById(R.id.ansQn8c);
        CheckBox ansQn8D = (CheckBox) findViewById(R.id.ansQn8d);
        boolean ansqn8a = ansQn8A.isChecked();
        boolean ansqn8b = ansQn8B.isChecked();
        boolean ansqn8c = ansQn8C.isChecked();
        boolean ansqn8d = ansQn8D.isChecked();

        //get refernce to the text boxes
        EditText ansqn9 = (EditText) findViewById(R.id.ansQn9);
        String ans9 = ansqn9.getText().toString();
        EditText names = (EditText) findViewById(R.id.name);
        String nameEntered = names.getText().toString();

        //Get refernce to the question 10 radio buttons
        RadioButton ansQn10A = (RadioButton) findViewById(R.id.ansQn10a);
        RadioButton ansQn10B = (RadioButton) findViewById(R.id.ansQn10b);
        RadioButton ansQn10C = (RadioButton) findViewById(R.id.ansQn10c);
        RadioButton ansQn10D = (RadioButton) findViewById(R.id.ansQn10d);

        if (TextUtils.isEmpty(nameEntered)) {
            names.setError("You won't continue if you don't enter your name");
        } else if (!(ansQn2A.isChecked() || (ansQn2B.isChecked() || (ansQn2C.isChecked() || (ansQn2D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn3A.isChecked() || (ansQn3B.isChecked() || (ansQn3C.isChecked() || (ansQn3D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn4A.isChecked() || (ansQn4B.isChecked() || (ansQn4C.isChecked() || (ansQn4D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn5A.isChecked() || (ansQn5B.isChecked() || (ansQn5C.isChecked() || (ansQn5D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn6A.isChecked() || (ansQn6B.isChecked() || (ansQn6C.isChecked() || (ansQn6D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn7A.isChecked() || (ansQn7B.isChecked() || (ansQn7C.isChecked() || (ansQn7D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn10A.isChecked() || (ansQn10B.isChecked() || (ansQn10C.isChecked() || (ansQn10D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn2A.isChecked() || (ansQn2B.isChecked() || (ansQn2C.isChecked() || (ansQn2D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else {
            String message = "The answers:\n1. c,d\n";
            message += "2. d\n";
            message += "3. a\n";
            message += "4. b\n";
            message += "5. c\n";
            message += "6. d\n";
            message += "7. c\n";
            message += "8. b,c\n";
            message += "Post order\n";
            message += "10. b\n";

            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
        }

        ansQn1A.setChecked(false);
        ansQn1B.setChecked(false);
        ansQn1C.setChecked(false);
        ansQn1D.setChecked(false);

        ansQn2A.setChecked(false);
        ansQn2B.setChecked(false);
        ansQn2C.setChecked(false);
        ansQn2D.setChecked(false);

        ansQn3A.setChecked(false);
        ansQn3B.setChecked(false);
        ansQn3C.setChecked(false);
        ansQn3D.setChecked(false);

        ansQn4A.setChecked(false);
        ansQn4B.setChecked(false);
        ansQn4C.setChecked(false);
        ansQn4D.setChecked(false);

        ansQn5A.setChecked(false);
        ansQn5B.setChecked(false);
        ansQn5C.setChecked(false);
        ansQn5D.setChecked(false);

        ansQn6A.setChecked(false);
        ansQn6B.setChecked(false);
        ansQn6C.setChecked(false);
        ansQn6D.setChecked(false);

        ansQn7A.setChecked(false);
        ansQn7B.setChecked(false);
        ansQn7C.setChecked(false);
        ansQn7D.setChecked(false);

        ansQn8A.setChecked(false);
        ansQn8B.setChecked(false);
        ansQn8C.setChecked(false);
        ansQn8D.setChecked(false);

        ansQn10A.setChecked(false);
        ansQn10B.setChecked(false);
        ansQn10C.setChecked(false);
        ansQn10D.setChecked(false);


    }

    public void repeat(View view) {
        EditText names = (EditText) findViewById(R.id.name);
        String nameEntered = names.getText().toString();

        if (TextUtils.isEmpty(nameEntered)) {
            names.setError("You won't continue if you don't enter your name");
        }

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure you want to repeat answering?");
        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {


                        EditText names = (EditText) findViewById(R.id.name);
                        String nameEntered = names.getText().toString();

                        CheckBox ansQn1A = (CheckBox) findViewById(R.id.ansQn1a);
                        CheckBox ansQn1B = (CheckBox) findViewById(R.id.ansQn1b);
                        CheckBox ansQn1C = (CheckBox) findViewById(R.id.ansQn1c);
                        CheckBox ansQn1D = (CheckBox) findViewById(R.id.ansQn1d);
                        boolean ansqn1a = ansQn1A.isChecked();
                        boolean ansqn1b = ansQn1B.isChecked();
                        boolean ansqn1c = ansQn1C.isChecked();
                        boolean ansqn1d = ansQn1D.isChecked();

                        RadioButton ansQn2A = (RadioButton) findViewById(R.id.ansQn2a);
                        RadioButton ansQn2B = (RadioButton) findViewById(R.id.ansQn2b);
                        RadioButton ansQn2C = (RadioButton) findViewById(R.id.ansQn2c);
                        RadioButton ansQn2D = (RadioButton) findViewById(R.id.ansQn2d);

                        RadioButton ansQn3A = (RadioButton) findViewById(R.id.ansQn3a);
                        RadioButton ansQn3B = (RadioButton) findViewById(R.id.ansQn3b);
                        RadioButton ansQn3C = (RadioButton) findViewById(R.id.ansQn3c);
                        RadioButton ansQn3D = (RadioButton) findViewById(R.id.ansQn3d);

                        RadioButton ansQn4A = (RadioButton) findViewById(R.id.ansQn4a);
                        RadioButton ansQn4B = (RadioButton) findViewById(R.id.ansQn4b);
                        RadioButton ansQn4C = (RadioButton) findViewById(R.id.ansQn4c);
                        RadioButton ansQn4D = (RadioButton) findViewById(R.id.ansQn4d);

                        RadioButton ansQn5A = (RadioButton) findViewById(R.id.ansQn5a);
                        RadioButton ansQn5B = (RadioButton) findViewById(R.id.ansQn5b);
                        RadioButton ansQn5C = (RadioButton) findViewById(R.id.ansQn5c);
                        RadioButton ansQn5D = (RadioButton) findViewById(R.id.ansQn5d);

                        RadioButton ansQn6A = (RadioButton) findViewById(R.id.ansQn6a);
                        RadioButton ansQn6B = (RadioButton) findViewById(R.id.ansQn6b);
                        RadioButton ansQn6C = (RadioButton) findViewById(R.id.ansQn6c);
                        RadioButton ansQn6D = (RadioButton) findViewById(R.id.ansQn6d);

                        RadioButton ansQn7A = (RadioButton) findViewById(R.id.ansQn7a);
                        RadioButton ansQn7B = (RadioButton) findViewById(R.id.ansQn7b);
                        RadioButton ansQn7C = (RadioButton) findViewById(R.id.ansQn7c);
                        RadioButton ansQn7D = (RadioButton) findViewById(R.id.ansQn7d);

                        CheckBox ansQn8A = (CheckBox) findViewById(R.id.ansQn8a);
                        CheckBox ansQn8B = (CheckBox) findViewById(R.id.ansQn8b);
                        CheckBox ansQn8C = (CheckBox) findViewById(R.id.ansQn8c);
                        CheckBox ansQn8D = (CheckBox) findViewById(R.id.ansQn8d);
                        boolean ansqn8a = ansQn8A.isChecked();
                        boolean ansqn8b = ansQn8B.isChecked();
                        boolean ansqn8c = ansQn8C.isChecked();
                        boolean ansqn8d = ansQn8D.isChecked();

                        EditText ansqn9 = (EditText) findViewById(R.id.ansQn9);
                        String ans9 = ansqn9.getText().toString();


                        RadioButton ansQn10A = (RadioButton) findViewById(R.id.ansQn10a);
                        RadioButton ansQn10B = (RadioButton) findViewById(R.id.ansQn10b);
                        RadioButton ansQn10C = (RadioButton) findViewById(R.id.ansQn10c);
                        RadioButton ansQn10D = (RadioButton) findViewById(R.id.ansQn10d);


                        ansQn1A.setChecked(false);
                        ansQn1B.setChecked(false);
                        ansQn1C.setChecked(false);
                        ansQn1D.setChecked(false);

                        ansQn2A.setChecked(false);
                        ansQn2B.setChecked(false);
                        ansQn2C.setChecked(false);
                        ansQn2D.setChecked(false);

                        ansQn3A.setChecked(false);
                        ansQn3B.setChecked(false);
                        ansQn3C.setChecked(false);
                        ansQn3D.setChecked(false);

                        ansQn4A.setChecked(false);
                        ansQn4B.setChecked(false);
                        ansQn4C.setChecked(false);
                        ansQn4D.setChecked(false);

                        ansQn5A.setChecked(false);
                        ansQn5B.setChecked(false);
                        ansQn5C.setChecked(false);
                        ansQn5D.setChecked(false);

                        ansQn6A.setChecked(false);
                        ansQn6B.setChecked(false);
                        ansQn6C.setChecked(false);
                        ansQn6D.setChecked(false);

                        ansQn7A.setChecked(false);
                        ansQn7B.setChecked(false);
                        ansQn7C.setChecked(false);
                        ansQn7D.setChecked(false);

                        ansQn8A.setChecked(false);
                        ansQn8B.setChecked(false);
                        ansQn8C.setChecked(false);
                        ansQn8D.setChecked(false);

                        ansQn10A.setChecked(false);
                        ansQn10B.setChecked(false);
                        ansQn10C.setChecked(false);
                        ansQn10D.setChecked(false);


                        Toast.makeText(MainActivity.this, "Okay, Start a fresh!", Toast.LENGTH_SHORT).show();

                    }
                });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Okay, Continue!", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();


    }

    public void submit(View view) {

        //Marking question 4 alternatively

        EditText names = (EditText) findViewById(R.id.name);
        String nameEntered = names.getText().toString();

        RadioButton ansQn2A = (RadioButton) findViewById(R.id.ansQn2a);
        RadioButton ansQn2B = (RadioButton) findViewById(R.id.ansQn2b);
        RadioButton ansQn2C = (RadioButton) findViewById(R.id.ansQn2c);
        RadioButton ansQn2D = (RadioButton) findViewById(R.id.ansQn2d);

        RadioButton ansQn3A = (RadioButton) findViewById(R.id.ansQn3a);
        RadioButton ansQn3B = (RadioButton) findViewById(R.id.ansQn3b);
        RadioButton ansQn3C = (RadioButton) findViewById(R.id.ansQn3c);
        RadioButton ansQn3D = (RadioButton) findViewById(R.id.ansQn3d);

        RadioButton ansQn4A = (RadioButton) findViewById(R.id.ansQn4a);
        RadioButton ansQn4B = (RadioButton) findViewById(R.id.ansQn4b);
        RadioButton ansQn4C = (RadioButton) findViewById(R.id.ansQn4c);
        RadioButton ansQn4D = (RadioButton) findViewById(R.id.ansQn4d);

        RadioButton ansQn5A = (RadioButton) findViewById(R.id.ansQn5a);
        RadioButton ansQn5B = (RadioButton) findViewById(R.id.ansQn5b);
        RadioButton ansQn5C = (RadioButton) findViewById(R.id.ansQn5c);
        RadioButton ansQn5D = (RadioButton) findViewById(R.id.ansQn5d);

        RadioButton ansQn6A = (RadioButton) findViewById(R.id.ansQn6a);
        RadioButton ansQn6B = (RadioButton) findViewById(R.id.ansQn6b);
        RadioButton ansQn6C = (RadioButton) findViewById(R.id.ansQn6c);
        RadioButton ansQn6D = (RadioButton) findViewById(R.id.ansQn6d);

        RadioButton ansQn7A = (RadioButton) findViewById(R.id.ansQn7a);
        RadioButton ansQn7B = (RadioButton) findViewById(R.id.ansQn7b);
        RadioButton ansQn7C = (RadioButton) findViewById(R.id.ansQn7c);
        RadioButton ansQn7D = (RadioButton) findViewById(R.id.ansQn7d);

        RadioButton ansQn10A = (RadioButton) findViewById(R.id.ansQn10a);
        RadioButton ansQn10B = (RadioButton) findViewById(R.id.ansQn10b);
        RadioButton ansQn10C = (RadioButton) findViewById(R.id.ansQn10c);
        RadioButton ansQn10D = (RadioButton) findViewById(R.id.ansQn10d);


        //Please use this method to know when a radio button is not cliked

        if (TextUtils.isEmpty(nameEntered)) {
            names.setError("You won't continue if you don't enter your name");

        } else if (!(ansQn2A.isChecked() || (ansQn2B.isChecked() || (ansQn2C.isChecked() || (ansQn2D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn3A.isChecked() || (ansQn3B.isChecked() || (ansQn3C.isChecked() || (ansQn3D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn4A.isChecked() || (ansQn4B.isChecked() || (ansQn4C.isChecked() || (ansQn4D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn5A.isChecked() || (ansQn5B.isChecked() || (ansQn5C.isChecked() || (ansQn5D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn6A.isChecked() || (ansQn6B.isChecked() || (ansQn6C.isChecked() || (ansQn6D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn7A.isChecked() || (ansQn7B.isChecked() || (ansQn7C.isChecked() || (ansQn7D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn10A.isChecked() || (ansQn10B.isChecked() || (ansQn10C.isChecked() || (ansQn10D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else if (!(ansQn2A.isChecked() || (ansQn2B.isChecked() || (ansQn2C.isChecked() || (ansQn2D.isChecked()))))) {
            displayNothingSelected("First Answer all the questions");

        } else//Or You can use this built in way
        {
            //call the method to start checking which checkboxes were marked
            markQuestion1();
        }

    }

    //Start marking question 1
    public void markQuestion1() {
        //Marking question 1
        CheckBox ansQn1A = (CheckBox) findViewById(R.id.ansQn1a);
        CheckBox ansQn1B = (CheckBox) findViewById(R.id.ansQn1b);
        CheckBox ansQn1C = (CheckBox) findViewById(R.id.ansQn1c);
        CheckBox ansQn1D = (CheckBox) findViewById(R.id.ansQn1d);
        boolean ansqn1a = ansQn1A.isChecked();
        boolean ansqn1b = ansQn1B.isChecked();
        boolean ansqn1c = ansQn1C.isChecked();
        boolean ansqn1d = ansQn1D.isChecked();

        if (((ansqn1a) && (ansqn1b)) && (ansqn1d)) {
            String c = "Invalid answer on question 1. Choose only 2 options";
            displayError(c);
        } else if (((ansqn1a) && (ansqn1c)) && (ansqn1d)) {
            String c = "Invalid answer on question 1. Choose only 2 options";
            displayError(c);
        } else if (((ansqn1b) && (ansqn1c)) && (ansqn1d)) {
            String c = "Invalid answer on question 1. Choose only 2 options";
            displayError(c);
        } else if (((ansqn1a) && (ansqn1b)) && (ansqn1c)) {
            String c = "Invalid answer on question 1. Choose only 2 options";
            displayError(c);
        } else if (((ansqn1a) && (ansqn1b)) && ((ansqn1c) && (ansqn1d))) {
            String c = "Invalid answer on question 1. Choose only 2 options";
            displayError(c);
        } else {
            int marks = checkAnswers(ansqn1a, ansqn1b, ansqn1c, ansqn1d);
            markQuestion2();
            markQuestion3();
            markQuestion4();
            markQuestion5();
            markQuestion6();
            markQuestion7();
            markQuestion10();
            markQuestion8(marks);

        }
    }


    public void markQuestion2() {

        RadioButton ansQn2A = (RadioButton) findViewById(R.id.ansQn2a);
        RadioButton ansQn2B = (RadioButton) findViewById(R.id.ansQn2b);
        RadioButton ansQn2C = (RadioButton) findViewById(R.id.ansQn2c);
        RadioButton ansQn2D = (RadioButton) findViewById(R.id.ansQn2d);

        boolean ansqn2a = ansQn2A.isChecked();
        boolean ansqn2b = ansQn2B.isChecked();
        boolean ansqn2c = ansQn2C.isChecked();
        boolean ansqn2d = ansQn2D.isChecked();

        if (ansqn2d) {
            mark = mark + 1;
        } else {
            mark = mark + 0;


        }

    }

    public void markQuestion3() {


        //Marking question 3 alternatively
        RadioButton ansQn3A = (RadioButton) findViewById(R.id.ansQn3a);
        RadioButton ansQn3B = (RadioButton) findViewById(R.id.ansQn3b);
        RadioButton ansQn3C = (RadioButton) findViewById(R.id.ansQn3c);
        RadioButton ansQn3D = (RadioButton) findViewById(R.id.ansQn3d);

        boolean ansqn3a = ansQn3A.isChecked();
        boolean ansqn3b = ansQn3B.isChecked();
        boolean ansqn3c = ansQn3C.isChecked();
        boolean ansqn3d = ansQn3D.isChecked();

        if (ansqn3a) {
            mark = mark + 1;


        }

        else {
            mark = mark + 0;


        }

    }

    public void markQuestion4() {
        RadioButton ansQn4A = (RadioButton) findViewById(R.id.ansQn4a);
        RadioButton ansQn4B = (RadioButton) findViewById(R.id.ansQn4b);
        RadioButton ansQn4C = (RadioButton) findViewById(R.id.ansQn4c);
        RadioButton ansQn4D = (RadioButton) findViewById(R.id.ansQn4d);

        boolean ansqn4a = ansQn4A.isChecked();
        boolean ansqn4b = ansQn4B.isChecked();
        boolean ansqn4c = ansQn4C.isChecked();
        boolean ansqn4d = ansQn4D.isChecked();

        if (ansqn4b) {
            mark = mark + 1;

        } else {
            mark = mark + 0;


        }


    }

    public void markQuestion5() {
        RadioButton ansQn5A = (RadioButton) findViewById(R.id.ansQn5a);
        RadioButton ansQn5B = (RadioButton) findViewById(R.id.ansQn5b);
        RadioButton ansQn5C = (RadioButton) findViewById(R.id.ansQn5c);
        RadioButton ansQn5D = (RadioButton) findViewById(R.id.ansQn5d);

        boolean ansqn5a = ansQn5A.isChecked();
        boolean ansqn5b = ansQn5B.isChecked();
        boolean ansqn5c = ansQn5C.isChecked();
        boolean ansqn5d = ansQn5D.isChecked();

        if (ansqn5c) {
            mark = mark + 1;

        } else {
            mark = mark + 0;


        }


    }

    public void markQuestion6() {
        RadioButton ansQn6A = (RadioButton) findViewById(R.id.ansQn6a);
        RadioButton ansQn6B = (RadioButton) findViewById(R.id.ansQn6b);
        RadioButton ansQn6C = (RadioButton) findViewById(R.id.ansQn6c);
        RadioButton ansQn6D = (RadioButton) findViewById(R.id.ansQn6d);

        boolean ansqn6a = ansQn6A.isChecked();
        boolean ansqn6b = ansQn6B.isChecked();
        boolean ansqn6c = ansQn6C.isChecked();
        boolean ansqn6d = ansQn6D.isChecked();

        if (ansqn6d) {
            mark = mark + 1;

        } else {
            mark = mark + 0;


        }

    }

    public void markQuestion7() {
        RadioButton ansQn7A = (RadioButton) findViewById(R.id.ansQn7a);
        RadioButton ansQn7B = (RadioButton) findViewById(R.id.ansQn7b);
        RadioButton ansQn7C = (RadioButton) findViewById(R.id.ansQn7c);
        RadioButton ansQn7D = (RadioButton) findViewById(R.id.ansQn7d);

        boolean ansqn7a = ansQn7A.isChecked();
        boolean ansqn7b = ansQn7B.isChecked();
        boolean ansqn7c = ansQn7C.isChecked();
        boolean ansqn7d = ansQn7D.isChecked();

        if (ansqn7c) {
            mark = mark + 1;

        } else {
            mark = mark + 0;


        }


    }

    public void markQuestion8(int mark1) {
        //Marking question 8
        CheckBox ansQn8A = (CheckBox) findViewById(R.id.ansQn8a);
        CheckBox ansQn8B = (CheckBox) findViewById(R.id.ansQn8b);
        CheckBox ansQn8C = (CheckBox) findViewById(R.id.ansQn8c);
        CheckBox ansQn8D = (CheckBox) findViewById(R.id.ansQn8d);
        boolean ansqn8a = ansQn8A.isChecked();
        boolean ansqn8b = ansQn8B.isChecked();
        boolean ansqn8c = ansQn8C.isChecked();
        boolean ansqn8d = ansQn8D.isChecked();

        if (((ansqn8a) && (ansqn8b)) && (ansqn8d)) {
            String c = "Invalid answer on question 8. Choose only 2 options";
            displayError(c);
        } else if (((ansqn8a) && (ansqn8c)) && (ansqn8d)) {
            String c = "Invalid answer on question 8. Choose only 2 options";
            displayError(c);
        } else if (((ansqn8b) && (ansqn8c)) && (ansqn8d)) {
            String c = "Invalid answer on question 8. Choose only 2 options";
            displayError(c);
        } else if (((ansqn8a) && (ansqn8b)) && (ansqn8c)) {
            String c = "Invalid answer on question 8. Choose only 2 options";
            displayError(c);
        } else if (((ansqn8a) && (ansqn8b)) && ((ansqn8c) && (ansqn8d))) {
            String c = "Invalid answer on question 8. Choose only 2 options";
            displayError(c);
        } else {
            int marks2 = checkAnswers8(ansqn8a, ansqn8b, ansqn8c, ansqn8d);
            question9();
            displaymoney(mark1, marks2);

        }
    }

    public void markQuestion10() {
        RadioButton ansQn10A = (RadioButton) findViewById(R.id.ansQn10a);
        RadioButton ansQn10B = (RadioButton) findViewById(R.id.ansQn10b);
        RadioButton ansQn10C = (RadioButton) findViewById(R.id.ansQn10c);
        RadioButton ansQn10D = (RadioButton) findViewById(R.id.ansQn10d);

        boolean ansqn10a = ansQn10A.isChecked();
        boolean ansqn10b = ansQn10B.isChecked();
        boolean ansqn10c = ansQn10C.isChecked();
        boolean ansqn10d = ansQn10D.isChecked();

        if (ansqn10b) {
            mark = mark + 1;

        } else {
            mark = mark + 0;
        }
    }

    public int checkAnswers(boolean qn1a, boolean qn1b, boolean qn1c, boolean qn1d) {
        int mark1 = 0;
        if (qn1a) {
            mark1 = mark1 + 0;
        }
        if (qn1b) {
            mark1 = mark1 + 0;
        }
        if (qn1c) {
            mark1 = mark1 + 0;
        }
        if (qn1d) {
            mark1 = mark1 + 0;
        }
        if (((qn1a) && (qn1c)) && (qn1d)) {
            mark1 = mark1 + 0;
        }
        if ((qn1b) && ((qn1c) && (qn1d))) {
            mark1 = mark1 + 0;
        }
        if (((qn1a) && (qn1b)) && ((qn1c) && (qn1d))) {
            mark1 = mark1 + 0;
        }
        if (((qn1c) && (qn1d))) {
            mark1 = mark1 + 1;
        } else
            mark1 = mark1 + 0;
        return mark1;
    }

    public int checkAnswers8(boolean qn8a, boolean qn8b, boolean qn8c, boolean qn8d) {
        int mark1 = 0;
        if (qn8a) {
            mark1 = mark1 + 0;
        }
        if (qn8b) {
            mark1 = mark1 + 0;
        }
        if (qn8c) {
            mark1 = mark1 + 0;
        }
        if (qn8d) {
            mark1 = mark1 + 0;
        }
        if (((qn8a) && (qn8c)) && (qn8d)) {
            mark1 = mark1 + 0;
        }
        if ((qn8b) && ((qn8c) && (qn8d))) {
            mark1 = mark1 + 0;
        }
        if (((qn8a) && (qn8b)) && ((qn8c) && (qn8d))) {
            mark1 = mark1 + 0;
        }
        if (((qn8b) && (qn8c))) {
            mark1 = mark1 + 1;
        } else
            mark1 = mark1 + 0;
        return mark1;
    }

    public void question9() {
        int getmark9 = 0;
        EditText ansqn9 = (EditText) findViewById(R.id.ansQn9);
        String ans9 = ansqn9.getText().toString();

        if (ans9.matches("")) {
            nameError("First Answer all questions");
        } else if (ans9.matches("Post order")) {
            mark += 1;
        } else if (ans9.matches("Postorder")) {
            mark += 1;
        } else if (ans9.matches("postorder")) {
            mark += 1;
        } else if (ans9.matches("post order")) {
            mark += 1;
            ;
        } else
            mark += 0;
    }

    public void displaymoney(int Marks, int Marks2) {
        Marks = Marks + mark;
        Marks = Marks + Marks2;

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure you want to submit these?");
        final int finalMarks = Marks;
        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        //mark = 0;
                        Toast.makeText(MainActivity.this, "You have got " + finalMarks + "/10", Toast.LENGTH_SHORT).show();
                        mark = 0;
                    }
                });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                displayNothing();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

    public void displayNothing() {
        Toast.makeText(MainActivity.this, "Go on then, Continue!", Toast.LENGTH_SHORT).show();
        mark = 0;
    }

    //This method is called when a person selects invalid checkboxes, like more than two
    public void displayError(String error) {
        Toast.makeText(this, "" + error, Toast.LENGTH_SHORT).show();
        mark = 0;
    }

    public void nameError(String nameError) {
        Toast.makeText(this, "" + nameError, Toast.LENGTH_SHORT).show();
        recreate();
    }
    public void displayNothingSelected(String nothing) {

        Toast.makeText(this, "" + nothing, Toast.LENGTH_SHORT).show();
        mark = 0;
    }

    //click away with this
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        View view = getCurrentFocus();
        if (view != null && (ev.getAction() == MotionEvent.ACTION_UP || ev.getAction() == MotionEvent.ACTION_MOVE) && view instanceof EditText && !view.getClass().getName().startsWith("android.webkit.")) {
            int scrcoords[] = new int[2];
            view.getLocationOnScreen(scrcoords);
            float x = ev.getRawX() + view.getLeft() - scrcoords[0];
            float y = ev.getRawY() + view.getTop() - scrcoords[1];
            if (x < view.getLeft() || x > view.getRight() || y < view.getTop() || y > view.getBottom())
                ((InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow((this.getWindow().getDecorView().getApplicationWindowToken()), 0);
        }
        return super.dispatchTouchEvent(ev);
    }

}
