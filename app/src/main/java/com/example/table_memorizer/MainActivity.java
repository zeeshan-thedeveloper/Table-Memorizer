package com.example.table_memorizer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    public List<TrueFalseQuestionDataholder> listOfTrueFalseQuestion;
    public List<ListOfObjectiveQuestions> listOfObjectiveQuestions;
    public static int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listOfTrueFalseQuestion = new ArrayList<>();
        listOfObjectiveQuestions = new ArrayList<>();
        //True false  questions
        listOfTrueFalseQuestion.add(new TrueFalseQuestionDataholder("3 X 4 = 12 ?",true));
        listOfTrueFalseQuestion.add(new TrueFalseQuestionDataholder("9 X 7 = 33 ?",false));
        listOfTrueFalseQuestion.add(new TrueFalseQuestionDataholder("11 X 4 = 44 ?",true));
        listOfTrueFalseQuestion.add(new TrueFalseQuestionDataholder("6 X 4 = 23 ?",false));
        listOfTrueFalseQuestion.add(new TrueFalseQuestionDataholder("9 X 9 = 18 ?",false));
        listOfTrueFalseQuestion.add(new TrueFalseQuestionDataholder("2 X 4 = 8 ?",true));

        listOfObjectiveQuestions.add(new ListOfObjectiveQuestions("5 X 2 = ?","10"));
        listOfObjectiveQuestions.add(new ListOfObjectiveQuestions("10 X 2 = ?","20"));
        listOfObjectiveQuestions.add(new ListOfObjectiveQuestions("4 X 5 = ?","20"));
        listOfObjectiveQuestions.add(new ListOfObjectiveQuestions("7 X 8 = ?","56"));
        listOfObjectiveQuestions.add(new ListOfObjectiveQuestions("10 X 3 = ?","30"));
        listOfObjectiveQuestions.add(new ListOfObjectiveQuestions("4 X 8 = ?","32"));
        listOfObjectiveQuestions.add(new ListOfObjectiveQuestions("2 X 8 = ?","16"));


        getSupportActionBar().hide();
        fragmentManager = getSupportFragmentManager();
        setStartScreen();
    }

    public void setStartScreen(){
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_holder,new StartScreen_Fragment(this));
        fragmentTransaction.commit();
    }
    public void setInputTraining(){
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_holder,new Input_Training_Fragment(this));
        fragmentTransaction.commit();
    }
    public void setListOfTablesForLearning(){
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_holder,new ListOfTables_ForLearning_Fragment(this));
        fragmentTransaction.commit();
    }
    public void setTrainingOptionsScreen(){
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_holder,new TrainingOptionsScreen_Fragment(this));
        fragmentTransaction.commit();
    }
    public void setTrueFalseTraining(){
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_holder,new TrueFalse_Training_Fragment(this));
        fragmentTransaction.commit();
    }
    public void setAboutApp(){
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_holder,new AboutApp_Fragment(this));
        fragmentTransaction.commit();
    }
    public void setTable(int tableNumber){
        fragmentTransaction = fragmentManager.beginTransaction();
        switch (tableNumber){
            case 2:
                fragmentTransaction.replace(R.id.fragment_holder,new ShowTable(this,R.drawable.two));
            break;
            case 3:
                fragmentTransaction.replace(R.id.fragment_holder,new ShowTable(this,R.drawable.three));
                break;
            case 4:
                fragmentTransaction.replace(R.id.fragment_holder,new ShowTable(this,R.drawable.four));
                break;
            case 5:
                fragmentTransaction.replace(R.id.fragment_holder,new ShowTable(this,R.drawable.five));
                break;
            case 6:
                fragmentTransaction.replace(R.id.fragment_holder,new ShowTable(this,R.drawable.six));
                break;
            case 7:
                fragmentTransaction.replace(R.id.fragment_holder,new ShowTable(this,R.drawable.seven));
                break;
            case 8:
                fragmentTransaction.replace(R.id.fragment_holder,new ShowTable(this,R.drawable.eight));
                break;
            case 9:
                fragmentTransaction.replace(R.id.fragment_holder,new ShowTable(this,R.drawable.nine));
                break;
            case 10:
                fragmentTransaction.replace(R.id.fragment_holder,new ShowTable(this,R.drawable.ten));
                break;
        }

        fragmentTransaction.commit();
    }

}