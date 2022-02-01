package com.example.table_memorizer;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class Input_Training_Fragment extends Fragment {

    MainActivity mainActivity;
    GifImageView gifImageView;
    public Input_Training_Fragment(MainActivity mainActivity) {
        // Required empty public constructor
        this.mainActivity=mainActivity;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_input__training_, container, false);
        gifImageView = view.findViewById(R.id.processing_gif);
        ImageButton btn_back = view.findViewById(R.id.btn_back_fom_input_type_traning);
        gifImageView.setVisibility(View.GONE);

        final int[] current_question_number = {0};


        TextView txt_question = view.findViewById(R.id.txt_question_input_type_training);
        EditText txt_answer = view.findViewById(R.id.txt_answer);
        txt_question.setText(mainActivity.listOfObjectiveQuestions.get(current_question_number[0]).getQuestion());
        AlertDialog.Builder inputDialog=new AlertDialog.Builder(mainActivity);
        inputDialog.setTitle("Result");

        Button btn_check = view.findViewById(R.id.btn_check_answer);
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    gifImageView.setVisibility(View.VISIBLE);
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                         try {
                             Thread.sleep(3000);
                             gifImageView.post(new Runnable() {
                                 @Override
                                 public void run() {
                                     if(txt_answer.getText().toString().equals(mainActivity.listOfObjectiveQuestions.get(current_question_number[0]).getAnswer())){
                                         inputDialog.setTitle("Right Answer");
                                     }else{
                                         inputDialog.setTitle("Wrong answer");
                                     }
                                     inputDialog.show();
                                     current_question_number[0]++;
                                     if(current_question_number[0] < mainActivity.listOfObjectiveQuestions.size())
                                     txt_question.setText(mainActivity.listOfObjectiveQuestions.get(current_question_number[0]).getQuestion());
                                     gifImageView.setVisibility(View.GONE);
                                 }
                             });
                         }catch (Exception e){}
                        }
                    });
                    thread.start();
                }
                catch (Exception e){}
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setTrainingOptionsScreen();
            }
        });

        return view;
    }
}