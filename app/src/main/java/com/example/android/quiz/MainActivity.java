package com.example.android.quiz;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

public void repeat(View view){

    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
    alertDialogBuilder.setMessage("Are you sure you want to quit?");
    alertDialogBuilder.setPositiveButton("Nope",
            new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface arg0, int arg1) {
                    Toast.makeText(MainActivity.this,"Alright then, Continue!",Toast.LENGTH_LONG).show();
                }
            });

    alertDialogBuilder.setNegativeButton("Yeah.",new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            finish();
        }
    });

    AlertDialog alertDialog = alertDialogBuilder.create();
    alertDialog.show();


}

    int mark = 0;
    public void submit(View view) {




        //Marking question 4 alternatively

        TextView show = (TextView) findViewById(R.id.showprice);
        EditText names = (EditText) findViewById(R.id.name);
        String nameEntered = names.getText().toString();


        RadioButton ansQn2A = (RadioButton)findViewById(R.id.ansQn2a);
        RadioButton ansQn2B = (RadioButton)findViewById(R.id.ansQn2b);
        RadioButton ansQn2C = (RadioButton)findViewById(R.id.ansQn2c);
        RadioButton ansQn2D = (RadioButton)findViewById(R.id.ansQn2d);

        RadioButton ansQn3A = (RadioButton)findViewById(R.id.ansQn3a);
        RadioButton ansQn3B = (RadioButton)findViewById(R.id.ansQn3b);
        RadioButton ansQn3C = (RadioButton)findViewById(R.id.ansQn3c);
        RadioButton ansQn3D = (RadioButton)findViewById(R.id.ansQn3d);


        RadioButton ansQn4A = (RadioButton)findViewById(R.id.ansQn4a);
        RadioButton ansQn4B = (RadioButton)findViewById(R.id.ansQn4b);
        RadioButton ansQn4C = (RadioButton)findViewById(R.id.ansQn4c);
        RadioButton ansQn4D = (RadioButton)findViewById(R.id.ansQn4d);

        //Please use this method to know when a radio button is not cliked
        if(!(ansQn4A.isChecked()||(ansQn4B.isChecked()||(ansQn4C.isChecked()||(ansQn4D.isChecked()))))){
            displayNothingSelected("First Answer all the questions");

        }
        else if(!(ansQn2A.isChecked()||(ansQn2B.isChecked()||(ansQn2C.isChecked()||(ansQn2D.isChecked()))))){
            displayNothingSelected("First Answer all the questions");

        }
        else if(!(ansQn2A.isChecked()||(ansQn2B.isChecked()||(ansQn2C.isChecked()||(ansQn2D.isChecked()))))){
            displayNothingSelected("First Answer all the questions");

        }
        else//Or You can use this built in way
            if (TextUtils.isEmpty(nameEntered)) {
                names.setError("You won't continue if you don't enter your name");
                String noName = "Please enter a name";
                noNameError(noName);

            } else {
                //if name is entered, then start the process of marking
                show.setText(nameEntered);
                //call the method to start checking which checkboxes were marked

                markQuestion1();



            }


        //else start calling the marking methods



//       You can check the name entered either by this method
//        if(nameEntered.matches("")){
//          String noName = "Please enter a name";
      //  noNameError(noName);
//      }
//
//

    }

    //Start marking question 1
    public void markQuestion1(){
            //Marking question 1
            CheckBox ansQn1A = (CheckBox)findViewById(R.id.ansQn1a);
            CheckBox ansQn1B = (CheckBox)findViewById(R.id.ansQn1b);
            CheckBox ansQn1C = (CheckBox)findViewById(R.id.ansQn1c);
            CheckBox ansQn1D = (CheckBox)findViewById(R.id.ansQn1d);
            boolean ansqn1a = ansQn1A.isChecked();
            boolean ansqn1b = ansQn1B.isChecked();
            boolean ansqn1c = ansQn1C.isChecked();
            boolean ansqn1d = ansQn1D.isChecked();

            if(((ansqn1a)&&(ansqn1b))&&(ansqn1d)){
                String c = "Invalid answer on question 1. Choose only 2 options";
                displayError(c);
            }
            else if(((ansqn1a)&&(ansqn1c))&&(ansqn1d)){
                String c = "Invalid answer on question 1. Choose only 2 options";
                displayError(c);
            }
            else if(((ansqn1b)&&(ansqn1c))&&(ansqn1d)){
                String c = "Invalid answer on question 1. Choose only 2 options";
                displayError(c);
            }
            else if(((ansqn1a)&&(ansqn1b))&&(ansqn1c)){
                String c = "Invalid answer on question 1. Choose only 2 options";
                displayError(c);
            }
            else if(((ansqn1a)&&(ansqn1b))&&((ansqn1c)&&(ansqn1d))){
                String c = "Invalid answer on question 1. Choose only 2 options";
                displayError(c);
            }
            else
            {
                int marks = checkAnswers(ansqn1a,ansqn1b,ansqn1c,ansqn1d);
                markQuestion2();
                markQuestion3();
                markQuestion4();
                displaymoney(marks);

            }

    }

    //Start marking question 2










//    public void answerRadioButton2(View view){
//            //check if the radio button is checked
//            boolean checked = ((RadioButton)view).isChecked();
//
//            //To check which button specifically is checked
//        switch (view.getId()){
//            case R.id.ansQn2a:
//                if(checked){
//                    mark = mark + 0;
//                    break;
//                }
//            case R.id.ansQn2b:
//                    if(checked){
//                        mark = mark + 0;
//                        break;
//                    }
//            case R.id.ansQn2c:
//                if(checked){
//                    mark = mark + 0;
//                    break;
//                }
//            case R.id.ansQn2d:
//                if(checked){
//                    mark = mark + 1;
//                    break;
//                }
//
//                markQuestion3();
//        }
//    }

//    public void markQuestion3(){
//
//
//
//
//    }

    //Start marking question 2


    public void markQuestion2(){



        //Marking question 2 alternatively
        RadioButton ansQn2A = (RadioButton)findViewById(R.id.ansQn2a);
        RadioButton ansQn2B = (RadioButton)findViewById(R.id.ansQn2b);
        RadioButton ansQn2C = (RadioButton)findViewById(R.id.ansQn2c);
        RadioButton ansQn2D = (RadioButton)findViewById(R.id.ansQn2d);

        //Please use this method to know when a radio button is not cliked
//        if(ansQn2A.isChecked()||(ansQn2B.isChecked()||(ansQn2C.isChecked()||(ansQn2D.isChecked())))){
//
//        }
//       else
//            displayNothingSelected("First Answer all the questions");

        boolean ansqn2a = ansQn2A.isChecked();
        boolean ansqn2b = ansQn2B.isChecked();
        boolean ansqn2c = ansQn2C.isChecked();
        boolean ansqn2d = ansQn2D.isChecked();

        if(ansqn2d){
            mark = mark +1;
            //int marks = checkAnswers(ansqn2d);

            //displaymoney(marks);

        }
//        else if(((ansqn1a)&&(ansqn1c))&&(ansqn1d)){
//            String c = "Invalid answer on question 1. Choose only 2 options";
//            displayError(c);
//        }
//        else if(((ansqn1b)&&(ansqn1c))&&(ansqn1d)){
//            String c = "Invalid answer on question 1. Choose only 2 options";
//            displayError(c);
//        }
//        else if(((ansqn1a)&&(ansqn1b))&&(ansqn1c)){
//            String c = "Invalid answer on question 1. Choose only 2 options";
//            displayError(c);
//        }
//        else if(((ansqn1a)&&(ansqn1b))&&((ansqn1c)&&(ansqn1d))){
//            String c = "Invalid answer on question 1. Choose only 2 options";
//            displayError(c);
//        }
        else
        {
            mark = mark + 0;


        }

    }

    public void markQuestion3(){



        //Marking question 3 alternatively
        RadioButton ansQn3A = (RadioButton)findViewById(R.id.ansQn3a);
        RadioButton ansQn3B = (RadioButton)findViewById(R.id.ansQn3b);
        RadioButton ansQn3C = (RadioButton)findViewById(R.id.ansQn3c);
        RadioButton ansQn3D = (RadioButton)findViewById(R.id.ansQn3d);

        //Please use this method to know when a radio button is not cliked
//        if(ansQn2A.isChecked()||(ansQn2B.isChecked()||(ansQn2C.isChecked()||(ansQn2D.isChecked())))){
//
//        }
//       else
//            displayNothingSelected("First Answer all the questions");

        boolean ansqn3a = ansQn3A.isChecked();
        boolean ansqn3b = ansQn3B.isChecked();
        boolean ansqn3c = ansQn3C.isChecked();
        boolean ansqn3d = ansQn3D.isChecked();

        if(ansqn3a){
            mark = mark +1;
            //int marks = checkAnswers(ansqn2d);

            //displaymoney(marks);

        }
//        else if(((ansqn1a)&&(ansqn1c))&&(ansqn1d)){
//            String c = "Invalid answer on question 1. Choose only 2 options";
//            displayError(c);
//        }
//        else if(((ansqn1b)&&(ansqn1c))&&(ansqn1d)){
//            String c = "Invalid answer on question 1. Choose only 2 options";
//            displayError(c);
//        }
//        else if(((ansqn1a)&&(ansqn1b))&&(ansqn1c)){
//            String c = "Invalid answer on question 1. Choose only 2 options";
//            displayError(c);
//        }
//        else if(((ansqn1a)&&(ansqn1b))&&((ansqn1c)&&(ansqn1d))){
//            String c = "Invalid answer on question 1. Choose only 2 options";
//            displayError(c);
//        }
        else
        {
            mark = mark + 0;


        }

    }


    public void markQuestion4(){
        RadioButton ansQn4A = (RadioButton)findViewById(R.id.ansQn4a);
        RadioButton ansQn4B = (RadioButton)findViewById(R.id.ansQn4b);
        RadioButton ansQn4C = (RadioButton)findViewById(R.id.ansQn4c);
        RadioButton ansQn4D = (RadioButton)findViewById(R.id.ansQn4d);

        boolean ansqn4a = ansQn4A.isChecked();
        boolean ansqn4b = ansQn4B.isChecked();
        boolean ansqn4c = ansQn4C.isChecked();
        boolean ansqn4d = ansQn4D.isChecked();

        if(ansqn4b){
            mark = mark +1;
            //int marks = checkAnswers(ansqn2d);

            //displaymoney(marks);

        }
//        else if(((ansqn1a)&&(ansqn1c))&&(ansqn1d)){
//            String c = "Invalid answer on question 1. Choose only 2 options";
//            displayError(c);
//        }
//        else if(((ansqn1b)&&(ansqn1c))&&(ansqn1d)){
//            String c = "Invalid answer on question 1. Choose only 2 options";
//            displayError(c);
//        }
//        else if(((ansqn1a)&&(ansqn1b))&&(ansqn1c)){
//            String c = "Invalid answer on question 1. Choose only 2 options";
//            displayError(c);
//        }
//        else if(((ansqn1a)&&(ansqn1b))&&((ansqn1c)&&(ansqn1d))){
//            String c = "Invalid answer on question 1. Choose only 2 options";
//            displayError(c);
//        }
        else
        {
            mark = mark + 0;


        }


    }
    public int checkAnswers(boolean qn1a,boolean qn1b,boolean qn1c,boolean qn1d){
        int mark1 = 0;
        if(qn1a){
            mark1 = mark1 + 0;
        }
        if(qn1b){
            mark1 = mark1 + 0;
        }
        if(qn1c){
            mark1 = mark1 + 0;
        }
        if(qn1d){
            mark1 = mark1 + 0;
        }
        if(((qn1a)&&(qn1c))&&(qn1d)){
            mark1 = mark1 + 0;
        }
        if((qn1b)&&((qn1c)&&(qn1d))){
            mark1 = mark1 + 0;
        }
        if(((qn1a)&&(qn1b))&&((qn1c)&&(qn1d))){
            mark1 = mark1 + 0;
        }
        if(((qn1c)&&(qn1d))){
            mark1 = mark1 + 1;
        }
        else
            mark1 = mark1 + 0;
        return mark1;
    }
    public void displaymoney(int Marks){
      Marks = Marks + mark;
        TextView show = (TextView)findViewById(R.id.showprice);
        EditText names = (EditText)findViewById(R.id.name);
        String nameEntered = names.getText().toString();
        if(nameEntered ==""){
            String noName = "Please enter a name";
            noNameError(noName);
        }


        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure you want to submit these?");
        final int finalMarks = Marks;
        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        //mark = 0;
                        Toast.makeText(MainActivity.this,"You have got "+ finalMarks +"/10",Toast.LENGTH_SHORT).show();
                        mark = 0;
                    }
                });

        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
              displayNothing();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();




    }
    public void displayNothing(){
        Toast.makeText(MainActivity.this,"Go on then, Continue!",Toast.LENGTH_SHORT).show();

    }

    //This method is called when a person selects invalid checkboxes, like more than two
    public void displayError(String error){
        TextView name = (TextView)findViewById(R.id.showprice);
        String names = name.toString();
        name.setText("joseph" + error);
        Toast.makeText(this,""+error,Toast.LENGTH_SHORT).show();
    }
    public void noNameError(String nameError){
        TextView name = (TextView)findViewById(R.id.showprice);
        String names = name.toString();
        name.setText("joseph" + nameError);
        Toast.makeText(this,""+nameError,Toast.LENGTH_SHORT).show();
    }
    public void displayNothingSelected(String nothing){
        TextView name = (TextView)findViewById(R.id.showprice);
        String names = name.toString();
        name.setText("joseph" + nothing);
        Toast.makeText(this,""+nothing,Toast.LENGTH_SHORT).show();

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
    } // this solution was found on stackOverflow - https://stackoverflow.com/questions/4165414/how-to-hide-soft-keyboard-on-android-after-clicking-outside-edittext/16176277#16176277


}
