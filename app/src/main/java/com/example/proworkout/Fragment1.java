package com.example.proworkout;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Fragment1 extends Fragment {

    int x;
    Activity context;
    Button btn_cw;
    Button btn_cal;
    Button progress;
    EditText age;
    EditText height;
    EditText weight;
    RadioButton male;
    RadioButton female;
    RadioButton plan1;
    RadioButton plan2;
    RadioButton plan3;
    int rg1,rg2, cal;
    TextView calories;
    EditText currW;
    MyDBHandler db;
    ArrayList<String> listItem;
    ArrayAdapter adapter;
    ListView list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context = getActivity();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }
    //onStart method sets up the ids from the elements it contains and has methods that tell its buttons what to do
    public void onStart(){
        super.onStart();

        age = context.findViewById(R.id.age);
        height = context.findViewById(R.id.height);
        weight = context.findViewById(R.id.weight);
        male = context.findViewById(R.id.radioMale);
        female = context.findViewById(R.id.radioFemale);
        plan1 = context.findViewById(R.id.radioPlan1);
        plan2 = context.findViewById(R.id.radioPlan2);
        plan3 = context.findViewById(R.id.radioPlan3);
        btn_cal = context.findViewById(R.id.calculate);
        calories = context.findViewById(R.id.Calories);
        btn_cw = context.findViewById(R.id.update);
        currW = context.findViewById(R.id.currentWeight);
        progress = context.findViewById(R.id.Progress);

        //this onClickListener takes the input the user set in the edittext which is the weight and adds a new weight object to the database
        btn_cw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDBHandler dbhandler = new MyDBHandler(context,null,null, 1);
                String theWeight = currW.getText().toString();
                int w = Integer.parseInt(theWeight);
                Weight weight = new Weight(w);
                dbhandler.addWeight(weight);
                currW.setText("");
            }
        });
        //this onClickListener takes the user to an activity that shows his/hers progress
        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context, ProgressList.class);
                startActivity(intent);
            }
        });
        //this onClickListener tells the user his/hers basic metabolic rate after calling calculate() method
        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (male.isChecked()){
                    rg1=1;
                }
                else{
                    rg1=2;
                }
                if (plan1.isChecked()){
                    rg2=1;
                }
                else if (plan2.isChecked()){
                    rg2=2;
                }
                else{
                    rg2=3;
                }
                if ((weight.getText().toString().equals("")) || (height.getText().toString().equals("")) || (age.getText().toString().equals(""))){
                    calories.setText("Please provide valid numbers.");
                }
                else{
                    int w = Integer.parseInt(weight.getText().toString());
                    int h = Integer.parseInt(height.getText().toString());
                    int a = Integer.parseInt(age.getText().toString());
                    cal = calculate(w,h,a,rg1,rg2);
                    calories.setText("Your BMR (Basic Metabolic Rate) is : "+ cal + " calories per day.");
                }
            }
        });
    }

    //method to calculate BMR
    public int calculate(int w, int h, int a, int rg1, int rg2){
        int calories = 0;
        float cals;
        cals = w;
        if (rg1==1){
            cals*=13.4;
            cals+=88.4;
            cals+=4.8*h;
            cals-=5.68*a;
        }
        else{
            cals*=9.25;
            cals+=447.6;
            cals+=3.1*h;
            cals-=4.33*a;
        }
        if (rg2==1){
            cals*=1.2;
        }
        else if (rg2==2){
            cals*=1.3;
        }
        else{
            cals*=1.5;
        }
        calories=(int) Math.round(cals);;
        return calories;
    }

}