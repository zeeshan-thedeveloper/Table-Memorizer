package com.example.table_memorizer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class StartScreen_Fragment extends Fragment {

   MainActivity mainActivity;
   Handler handler;
    public StartScreen_Fragment(MainActivity mainActivity) {
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
        View view = inflater.inflate(R.layout.fragment_start_screen_, container, false);
        Button btn_memorize = view.findViewById(R.id.btn_memorize);
        Button btn_learn_table = view.findViewById(R.id.btn_learn_tables);
        Button btn_about_app = view.findViewById(R.id.btn_about_app);
        TextView txt_app_title = view.findViewById(R.id.txt_app_title);
        ImageView img_iba_logo = view.findViewById(R.id.icon_iba_logo);
        ImageView img_puzzle_logo = view.findViewById(R.id.img_puzzle);

        TextView txt_under_super = view.findViewById(R.id.txt_under_super);
        TextView txt_developer = view.findViewById(R.id.txt_developer);


        handler = new Handler();
        btn_memorize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setTrainingOptionsScreen();
            }
        });
        btn_learn_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setListOfTablesForLearning();
            }
        });
        btn_about_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setAboutApp();
            }
        });

        if(mainActivity.flag==0) {

        Animation invisible = AnimationUtils.loadAnimation(mainActivity,R.anim.inivisible);
        invisible.reset();

        txt_app_title.clearAnimation();
        txt_app_title.startAnimation(invisible);
        img_iba_logo.clearAnimation();
        img_iba_logo.startAnimation(invisible);
        img_puzzle_logo.clearAnimation();
        img_puzzle_logo.startAnimation(invisible);
        btn_about_app.clearAnimation();
        btn_about_app.startAnimation(invisible);
        btn_learn_table.clearAnimation();
        btn_learn_table.startAnimation(invisible);
        btn_memorize.clearAnimation();
        btn_memorize.startAnimation(invisible);

        txt_developer.clearAnimation();
        txt_developer.startAnimation(invisible);
        txt_under_super.clearAnimation();
        txt_under_super.startAnimation(invisible);

        Animation fade_in_app_title = AnimationUtils.loadAnimation(mainActivity, R.anim.fade_in);
        fade_in_app_title.reset();
        Animation fade_in_img_iba_logo = AnimationUtils.loadAnimation(mainActivity, R.anim.fade_in);
        fade_in_img_iba_logo.reset();
        Animation fade_in_img_puzzle = AnimationUtils.loadAnimation(mainActivity, R.anim.fade_in);
        fade_in_img_puzzle.reset();

        Animation fade_in_btn_memorize = AnimationUtils.loadAnimation(mainActivity, R.anim.fade_in);
        fade_in_btn_memorize.reset();
        Animation fade_in_btn_learn = AnimationUtils.loadAnimation(mainActivity, R.anim.fade_in);
        fade_in_btn_learn.reset();
        Animation fade_in_btn_about = AnimationUtils.loadAnimation(mainActivity, R.anim.fade_in);
        fade_in_btn_about.reset();
        Animation fade_in_txt_under_supe = AnimationUtils.loadAnimation(mainActivity, R.anim.fade_in);
        fade_in_btn_about.reset();
        Animation fade_in_txt_developer = AnimationUtils.loadAnimation(mainActivity, R.anim.fade_in);
        fade_in_btn_about.reset();


        Animation slide_down = AnimationUtils.loadAnimation(mainActivity, R.anim.slide_down);
        slide_down.reset();



            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    txt_app_title.clearAnimation();
                    txt_app_title.startAnimation(fade_in_app_title);
                }
            }, 1000);


            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    img_iba_logo.clearAnimation();
                    img_iba_logo.startAnimation(fade_in_img_iba_logo);
                }
            }, 1500);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    img_puzzle_logo.clearAnimation();
                    img_puzzle_logo.startAnimation(fade_in_img_puzzle);
                }
            }, 2000);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    img_puzzle_logo.clearAnimation();
                    img_puzzle_logo.startAnimation(fade_in_img_puzzle);
                }
            }, 2000);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btn_memorize.clearAnimation();
                    btn_memorize.startAnimation(fade_in_btn_memorize);
                }
            }, 2500);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btn_learn_table.clearAnimation();
                    btn_learn_table.startAnimation(fade_in_btn_learn);
                }
            }, 2500);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btn_about_app.clearAnimation();
                    btn_about_app.startAnimation(fade_in_btn_about);
                }
            }, 2500);


            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    txt_under_super.clearAnimation();
                    txt_under_super.startAnimation(fade_in_txt_under_supe);
                }
            }, 3000);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    txt_developer.clearAnimation();
                    txt_developer.startAnimation(fade_in_txt_developer);
                }
            }, 3000);

        }
        mainActivity.flag=1;
        return view;
    }
}