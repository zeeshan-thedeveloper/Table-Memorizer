package com.example.table_memorizer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

}