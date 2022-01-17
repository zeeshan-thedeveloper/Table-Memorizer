package com.example.table_memorizer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
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
            }
        });
        btn_false_opt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //check question.
            }
        });

        return view;
    }
}