package com.example.table_memorizer;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;


public class TrueFalse_Training_Fragment extends Fragment {

    MainActivity mainActivity;
    public TrueFalse_Training_Fragment(MainActivity mainActivity) {
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
        View view = inflater.inflate(R.layout.fragment_true_false__training_, container, false);
        ImageButton btn_back = view.findViewById(R.id.btn_back_fromtrue_false_fragment);
        Button btn_true_opt = view.findViewById(R.id.btn_true_option);
        Button btn_false_opt = view.findViewById(R.id.btn_false_option);

        TextView txt_current_number_of_question = view.findViewById(R.id.txt_current_question_number);
        TextView txt_number_of_right_or_wrong = view.findViewById(R.id.txt_number_of_right_wrong_questions);
        TextView txt_question = view.findViewById(R.id.txt_question);

        final int[] current_number_of_question = {0};
        final int[] number_of_right_question = {0};
        final int[] number_of_wrong_question = {0};


        AlertDialog.Builder inputDialog=new AlertDialog.Builder(mainActivity);
        inputDialog.setTitle("Result");

        inputDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String newName;
            }
        });

        inputDialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });



        txt_question.setText(mainActivity.listOfTrueFalseQuestion.get(current_number_of_question[0]).getQuestion());
            txt_current_number_of_question.setText("Question Number : "+current_number_of_question[0]);
            btn_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mainActivity.setTrainingOptionsScreen();
                }
            });
            btn_true_opt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //check question.
                    current_number_of_question[0]++;
                    if(current_number_of_question[0]<mainActivity.listOfTrueFalseQuestion.size()) {
                        txt_current_number_of_question.setText("Question Number : "+current_number_of_question[0]);
                        txt_question.setText(mainActivity.listOfTrueFalseQuestion.get(current_number_of_question[0]).getQuestion());
                        if(mainActivity.listOfTrueFalseQuestion.get(current_number_of_question[0]).isAnswer()){
                            inputDialog.setTitle("Wrong Answer");
                            //Right answer
                            number_of_wrong_question[0]++;
                            inputDialog.show();
                            txt_number_of_right_or_wrong.setText("Correct : "+ number_of_right_question[0] +"and Wrong : "+ number_of_wrong_question[0]);
                        }else{
                            inputDialog.setTitle("Right Answer");
                            number_of_right_question[0]++;
                            txt_number_of_right_or_wrong.setText("Correct : "+ number_of_right_question[0] +"and Wrong : "+ number_of_wrong_question[0]);
                            //False answer..
                            inputDialog.show();
                        }
                    }
                }
            });
            btn_false_opt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //check question.
                    current_number_of_question[0]++;
                    if(current_number_of_question[0]<mainActivity.listOfTrueFalseQuestion.size()) {
                        txt_current_number_of_question.setText("Question Number : "+current_number_of_question[0]);
                        txt_question.setText(mainActivity.listOfTrueFalseQuestion.get(current_number_of_question[0]).getQuestion());
                        if(mainActivity.listOfTrueFalseQuestion.get(current_number_of_question[0]).isAnswer()){
                            //Right answer
                            number_of_right_question[0]++;
                            txt_number_of_right_or_wrong.setText("Correct : "+ number_of_right_question[0] +"and Wrong : "+ number_of_wrong_question[0]);

                            inputDialog.setTitle("Right Answer");
                            inputDialog.show();
                        }else{
                            //Right answer
                            number_of_wrong_question[0]++;
                            inputDialog.setTitle("Wrong Answer");
                            inputDialog.show();
                        }
                    }
                }
            });


        return view;
    }
}