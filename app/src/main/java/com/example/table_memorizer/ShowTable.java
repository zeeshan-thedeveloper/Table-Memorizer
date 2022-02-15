package com.example.table_memorizer;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class ShowTable extends Fragment {

    MainActivity mainActivity;
    int image;
    int tableNumber;

    ImageView img_table_number[]=null;
    ImageView img_mul[]=null;
    ImageView img_table_counter[]=null;
    ImageView img_equal[]=null;
    ImageView img_table_asnwer[]=null;
    int imagesToShow[]=null;

    int counter=0;
    public ShowTable(MainActivity mainActivity,int image,int tableNumber) {
        this.mainActivity=mainActivity;
        this.image=image;
        this.tableNumber=tableNumber;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_table, container, false);
        ImageButton btn_close_table = view.findViewById(R.id.btn_close_table);
        Button btn_go_for_testing  = view.findViewById(R.id.btn_go_for_training);
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        TextView txt_table_number = view.findViewById(R.id.txt_table_number);


        txt_table_number.setText(tableNumber+ "X");

         img_table_number=new ImageView[10];
         img_mul=new ImageView[10];
         img_table_counter=new ImageView[10];
         img_equal=new ImageView[10];
         img_table_asnwer=new ImageView[10];
         imagesToShow = new int[50];

        img_table_number[0] =  view.findViewById(R.id.img_table_number_1);
        img_table_number[1] =  view.findViewById(R.id.img_table_number_2);
        img_table_number[2] =  view.findViewById(R.id.img_table_number_3);
        img_table_number[3] =  view.findViewById(R.id.img_table_number_4);
        img_table_number[4] =  view.findViewById(R.id.img_table_number_5);
        img_table_number[5] =  view.findViewById(R.id.img_table_number_6);
        img_table_number[6] =  view.findViewById(R.id.img_table_number_7);
        img_table_number[7] =  view.findViewById(R.id.img_table_number_8);
        img_table_number[8] =  view.findViewById(R.id.img_table_number_9);
        img_table_number[9] =  view.findViewById(R.id.img_table_number_10);

        img_mul[0] = view.findViewById(R.id.img_mul_1);
        img_mul[1] = view.findViewById(R.id.img_mul_2);
        img_mul[2] = view.findViewById(R.id.img_mul_3);
        img_mul[3] = view.findViewById(R.id.img_mul_4);
        img_mul[4] = view.findViewById(R.id.img_mul_5);
        img_mul[5] = view.findViewById(R.id.img_mul_6);
        img_mul[6] = view.findViewById(R.id.img_mul_7);
        img_mul[7] = view.findViewById(R.id.img_mul_8);
        img_mul[8] = view.findViewById(R.id.img_mul_9);
        img_mul[9] = view.findViewById(R.id.img_mul_10);


        img_table_counter[0] = view.findViewById(R.id.img_table_counter_1);
        img_table_counter[1] = view.findViewById(R.id.img_table_counter_2);
        img_table_counter[2] = view.findViewById(R.id.img_table_counter_3);
        img_table_counter[3] = view.findViewById(R.id.img_table_counter_4);
        img_table_counter[4] = view.findViewById(R.id.img_table_counter_5);
        img_table_counter[5] = view.findViewById(R.id.img_table_counter_6);
        img_table_counter[6] = view.findViewById(R.id.img_table_counter_7);
        img_table_counter[7] = view.findViewById(R.id.img_table_counter_8);
        img_table_counter[8] = view.findViewById(R.id.img_table_counter_9);
        img_table_counter[9] = view.findViewById(R.id.img_table_counter_10);


        img_equal[0] = view.findViewById(R.id.img_equal_1);
        img_equal[1] = view.findViewById(R.id.img_equal_2);
        img_equal[2] = view.findViewById(R.id.img_equal_3);
        img_equal[3] = view.findViewById(R.id.img_equal_4);
        img_equal[4] = view.findViewById(R.id.img_equal_5);
        img_equal[5] = view.findViewById(R.id.img_equal_6);
        img_equal[6] = view.findViewById(R.id.img_equal_7);
        img_equal[7] = view.findViewById(R.id.img_equal_8);
        img_equal[8] = view.findViewById(R.id.img_equal_9);
        img_equal[9] = view.findViewById(R.id.img_equal_10);

        img_table_asnwer[0] = view.findViewById(R.id.img_table_asnwer_1);
        img_table_asnwer[1] = view.findViewById(R.id.img_table_asnwer_2);
        img_table_asnwer[2] = view.findViewById(R.id.img_table_asnwer_3);
        img_table_asnwer[3] = view.findViewById(R.id.img_table_asnwer_4);
        img_table_asnwer[4] = view.findViewById(R.id.img_table_asnwer_5);
        img_table_asnwer[5] = view.findViewById(R.id.img_table_asnwer_6);
        img_table_asnwer[6] = view.findViewById(R.id.img_table_asnwer_7);
        img_table_asnwer[7] = view.findViewById(R.id.img_table_asnwer_8);
        img_table_asnwer[8] = view.findViewById(R.id.img_table_asnwer_9);
        img_table_asnwer[9] = view.findViewById(R.id.img_table_asnwer_10);

        for(int i=0;i<10;i++){
            img_table_number[i].setImageResource(R.drawable.white_bg);
            img_mul[i].setImageResource(R.drawable.white_bg);
            img_table_asnwer[i].setImageResource(R.drawable.white_bg);
            img_equal[i].setImageResource(R.drawable.white_bg);
            img_table_counter[i].setImageResource(R.drawable.white_bg);
        }

        scrollView.post(new Runnable() {
            public void run() {
                scrollView.fullScroll(scrollView.FOCUSABLE_AUTO);
            }
        });



        if(tableNumber==2){
            //setting up images to show
            imagesToShow[0]=R.drawable.apple_count_two;
            imagesToShow[1]=R.drawable.multiply_sign;
            imagesToShow[2]=R.drawable.apple_count_one;
            imagesToShow[3]=R.drawable.equal_sign;
            imagesToShow[4]=R.drawable.apple_count_two;

            imagesToShow[5]=R.drawable.apple_count_two;
            imagesToShow[6]=R.drawable.multiply_sign;
            imagesToShow[7]=R.drawable.apple_count_two;
            imagesToShow[8]=R.drawable.equal_sign;
            imagesToShow[9]=R.drawable.apple_count_four;


            imagesToShow[10]=R.drawable.apple_count_two;
            imagesToShow[11]=R.drawable.multiply_sign;
            imagesToShow[12]=R.drawable.apple_count_three;
            imagesToShow[13]=R.drawable.equal_sign;
            imagesToShow[14]=R.drawable.apple_count_siz;


            imagesToShow[15]=R.drawable.apple_count_two;
            imagesToShow[16]=R.drawable.multiply_sign;
            imagesToShow[17]=R.drawable.apple_count_four;
            imagesToShow[18]=R.drawable.equal_sign;
            imagesToShow[19]=R.drawable.apple_count_eight;

            imagesToShow[20]=R.drawable.apple_count_two;
            imagesToShow[21]=R.drawable.multiply_sign;
            imagesToShow[22]=R.drawable.apple_count_five;
            imagesToShow[23]=R.drawable.equal_sign;
            imagesToShow[24]=R.drawable.apple_count_ten;

            imagesToShow[25]=R.drawable.apple_count_two;
            imagesToShow[26]=R.drawable.multiply_sign;
            imagesToShow[27]=R.drawable.apple_count_siz;
            imagesToShow[28]=R.drawable.equal_sign;
            imagesToShow[29]=R.drawable.apple_count_twelve;

            imagesToShow[30]=R.drawable.apple_count_two;
            imagesToShow[31]=R.drawable.multiply_sign;
            imagesToShow[32]=R.drawable.apple_count_seven;
            imagesToShow[33]=R.drawable.equal_sign;
            imagesToShow[34]=R.drawable.apple_count_fourteen;

            imagesToShow[35]=R.drawable.apple_count_two;
            imagesToShow[36]=R.drawable.multiply_sign;
            imagesToShow[37]=R.drawable.apple_count_eight;
            imagesToShow[38]=R.drawable.equal_sign;
            imagesToShow[39]=R.drawable.apple_count_sixteen;

            imagesToShow[40]=R.drawable.apple_count_two;
            imagesToShow[41]=R.drawable.multiply_sign;
            imagesToShow[42]=R.drawable.apple_count_nine;
            imagesToShow[43]=R.drawable.equal_sign;
            imagesToShow[44]=R.drawable.apple_count_eighteen;

            imagesToShow[45]=R.drawable.apple_count_two;
            imagesToShow[46]=R.drawable.multiply_sign;
            imagesToShow[47]=R.drawable.apple_count_ten;
            imagesToShow[48]=R.drawable.equal_sign;
            imagesToShow[49]=R.drawable.apple_count_twenty;

        }else{
            Toast.makeText(getContext(), "Will be updated soon", Toast.LENGTH_SHORT).show();
        }



        btn_go_for_testing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tbn=0;
                int mis=0;
                int tbc=0;
                int eqn=0;
                int asn=0;
                  if(tableNumber==2){
                      if(counter<=49){
                          switch (counter){
                              case 0:
                                  img_table_number[0].setImageResource(imagesToShow[counter]);
                                  break;
                              case 1:
                                  img_mul[0].setImageResource(imagesToShow[counter]);
                                  break;
                              case 2:
                                  img_table_counter[0].setImageResource(imagesToShow[counter]);
                                  break;
                              case 3:
                                  img_equal[0].setImageResource(imagesToShow[counter]);
                                  break;
                              case 4:
                                  img_table_asnwer[0].setImageResource(imagesToShow[counter]);
                                  break;


                              case 5:
                                  img_table_number[1].setImageResource(imagesToShow[counter]);
                                  break;
                              case 6:
                                  img_mul[1].setImageResource(imagesToShow[counter]);
                                  break;
                              case 7:
                                  img_table_counter[1].setImageResource(imagesToShow[counter]);
                                  break;
                              case 8:
                                  img_equal[1].setImageResource(imagesToShow[counter]);
                                  break;
                              case 9:
                                  img_table_asnwer[1].setImageResource(imagesToShow[counter]);
                                  break;

                              case 10:
                                  img_table_number[2].setImageResource(imagesToShow[counter]);
                                  break;
                              case 11:
                                  img_mul[2].setImageResource(imagesToShow[counter]);
                                  break;
                              case 12:
                                  img_table_counter[2].setImageResource(imagesToShow[counter]);
                                  break;
                              case 13:
                                  img_equal[2].setImageResource(imagesToShow[counter]);
                                  break;
                              case 14:
                                  img_table_asnwer[2].setImageResource(imagesToShow[counter]);
                                  break;


                              case 15:
                                  img_table_number[3].setImageResource(imagesToShow[counter]);
                                  break;
                              case 16:
                                  img_mul[3].setImageResource(imagesToShow[counter]);
                                  break;
                              case 17:
                                  img_table_counter[3].setImageResource(imagesToShow[counter]);
                                  break;
                              case 18:
                                  img_equal[3].setImageResource(imagesToShow[counter]);
                                  break;
                              case 19:
                                  img_table_asnwer[3].setImageResource(imagesToShow[counter]);
                                  break;


                              case 20:
                                  img_table_number[4].setImageResource(imagesToShow[counter]);
                                  break;
                              case 21:
                                  img_mul[4].setImageResource(imagesToShow[counter]);
                                  break;
                              case 22:
                                  img_table_counter[4].setImageResource(imagesToShow[counter]);
                                  break;
                              case 23:
                                  img_equal[4].setImageResource(imagesToShow[counter]);
                                  break;
                              case 24:
                                  img_table_asnwer[4].setImageResource(imagesToShow[counter]);
                                  break;


                              case 25:
                                  img_table_number[5].setImageResource(imagesToShow[counter]);
                                  break;
                              case 26:
                                  img_mul[5].setImageResource(imagesToShow[counter]);
                                  break;
                              case 27:
                                  img_table_counter[5].setImageResource(imagesToShow[counter]);
                                  break;
                              case 28:
                                  img_equal[5].setImageResource(imagesToShow[counter]);
                                  break;
                              case 29:
                                  img_table_asnwer[5].setImageResource(imagesToShow[counter]);
                                  break;


                              case 30:
                                  img_table_number[6].setImageResource(imagesToShow[counter]);
                                  break;
                              case 31:
                                  img_mul[6].setImageResource(imagesToShow[counter]);
                                  break;
                              case 32:
                                  img_table_counter[6].setImageResource(imagesToShow[counter]);
                                  break;
                              case 33:
                                  img_equal[6].setImageResource(imagesToShow[counter]);
                                  break;
                              case 34:
                                  img_table_asnwer[6].setImageResource(imagesToShow[counter]);
                                  break;


                              case 35:
                                  img_table_number[7].setImageResource(imagesToShow[counter]);
                                  break;
                              case 36:
                                  img_mul[7].setImageResource(imagesToShow[counter]);
                                  break;
                              case 37:
                                  img_table_counter[7].setImageResource(imagesToShow[counter]);
                                  break;
                              case 38:
                                  img_equal[7].setImageResource(imagesToShow[counter]);
                                  break;
                              case 39:
                                  img_table_asnwer[7].setImageResource(imagesToShow[counter]);
                                  break;


                              case 40:
                                  img_table_number[8].setImageResource(imagesToShow[counter]);
                                  break;
                              case 41:
                                  img_mul[8].setImageResource(imagesToShow[counter]);
                                  break;
                              case 42:
                                  img_table_counter[8].setImageResource(imagesToShow[counter]);
                                  break;
                              case 43:
                                  img_equal[8].setImageResource(imagesToShow[counter]);
                                  break;
                              case 44:
                                  img_table_asnwer[8].setImageResource(imagesToShow[counter]);
                                  break;


                              case 45:
                                  img_table_number[9].setImageResource(imagesToShow[counter]);
                                  break;
                              case 46:
                                  img_mul[9].setImageResource(imagesToShow[counter]);
                                  break;
                              case 47:
                                  img_table_counter[9].setImageResource(imagesToShow[counter]);
                                  break;
                              case 48:
                                  img_equal[9].setImageResource(imagesToShow[counter]);
                                  break;
                              case 49:
                                  img_table_asnwer[9].setImageResource(imagesToShow[counter]);
                                  break;


                          }
                          counter++;
                      }else{

                      }
                  }else{
                      Toast.makeText(getContext(), "Will be updated soon", Toast.LENGTH_SHORT).show();
                  }
//                mainActivity.setTrainingOptionsScreen();
            }
        });




        btn_close_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setListOfTablesForLearning();
            }
        });


        return view;
    }
}