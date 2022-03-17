package com.example.proworkout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment {
    CardView card1;
    CardView card2;
    CardView card3;
    Activity context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context = getActivity();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false);
    }
    //This activity's onStart method takes the user to the desired workout plan depending on which of the 3 cards he/she tapped on
    public void onStart(){
        super.onStart();
        card1 = context.findViewById(R.id.cardFullBody);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Card_layout.class);
                String[] titles = {"Day1","Day2","Day3"};
                intent.putExtra("titles",titles);
                intent.putExtra("plan","1");
                startActivity(intent);
            }
        });
        card2 = context.findViewById(R.id.cardUL);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Card_layout.class);
                String[] titles = {"Day1","Day2","Day3","Day4"};
                intent.putExtra("titles",titles);
                intent.putExtra("plan","2");
                startActivity(intent);
            }
        });
        card3 = context.findViewById(R.id.cardPPL);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Card_layout.class);
                String[] titles = {"Day1","Day2","Day3","Day4","Day5","Day6"};
                intent.putExtra("titles",titles);
                intent.putExtra("plan","3");
                startActivity(intent);
            }
        });
    }
}