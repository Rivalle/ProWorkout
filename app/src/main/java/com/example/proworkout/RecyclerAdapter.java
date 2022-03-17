package com.example.proworkout;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 *Recycler adapter implementation that is used to fill up the content of plans depending of which plan user chooses.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private String[] titles; //name of each exercise
    private String plan;
    private Workouts workouts;

    public RecyclerAdapter (String[] titles,String plan) {
        this.titles = titles;
        this.plan = plan;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemTitle;
        public ViewHolder(View itemView) {
            super(itemView);
            itemTitle = itemView.findViewById(R.id.item_title);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();
                    Context context = itemView.getContext();
                    if(plan.equals("1")){
                        Intent intent = new Intent(context, Workouts.class);
                        String[] a;
                        switch (position){
                            case 0:
                                a = new String[]{"Squats (5x5)",
                                        "Bench Press (5x5)",
                                        "Barbell Row (5x5)",
                                        "Upright Row (3x10)",
                                        "Skullcrushers (3x10)",
                                        "Dumbbell Curls (3x10)",
                                        "Leg Curls (3x12)"};

                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                            case 1:
                                a = new String[]{"Deadlifts (3x5)",
                                        "Romanian Deadlift (2x8)",
                                        "Overhead Press	(3x8)",
                                        "Pull Ups (3x10)",
                                        "Dips (3x10)",
                                        "Barbell Shrugs	(3x10)",
                                        "Calf Raise	(3x12)"};
                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                            case 2:
                                 a = new String[]{ "Squats (3x5)",
                                         "Dumbbell BenchPress(3x10)",
                                         "One Arm Dumbbell Row (3x10)",
                                         "Seated Arnold Press (3x10)",
                                         "Cable Tricep Extensions (3x10)",
                                         "Barbell Curls	(3x10)",
                                         "Leg Curls (3x12)"};
                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                        }
                    }
                    if(plan.equals("2")){
                        Intent intent = new Intent(context, Workouts.class);
                        String[] a;
                        switch (position){
                            case 0:
                                a = new String[]{"Bench Press (5x5)",
                                        "Barbell Row (5x5)",
                                        "Seated Overhead Dumbbell Press (3x10)",
                                        "Pec Dec - 3 sec negative (2x10)",
                                        "V-Bar Lat Pull Down (2x10)",
                                        "Side Lateral Raise (2x12)",
                                        "Cable Tricep Extensions (3x8)",
                                        "Cable Curls - 3 sec negative (3x8)"};

                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                            case 1:
                                a = new String[]{"Squats (3x5)",
                                        "Stiff Leg Deadlifts (3x8)",
                                        "Standing Calf Raise (3x10)",
                                        "Leg Extensions (2x10)",
                                        "Leg Curl (2x10)",
                                        "Seated Calf Raise (2x10)",
                                        "Cable Crunch (3x10)",
                                        "Cable Pull Through (3x12)"};
                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                            case 2:
                                a = new String[]{ "Incline Dumbbell Bench Press (3x12)",
                                        "Rack Deadlifts (3x5)",
                                        "Military Press (3x10)",
                                        "Machine Chest Press (3x10)",
                                        "Pull Ups or Machine Rows (3x10)",
                                        "Machine Shoulder Press (3x10)",
                                        "Dumbbell Curls (3x12)",
                                        "Machine Tricep Dip (3x12)"};
                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                            case 3:
                                a = new String[]{ "Leg Press (3x15)",
                                        "Dumbbell Stiff Leg Deadlifts (3x10)",
                                        "Leg Press Calf Raise (3x10)",
                                        "Hack Squat (3x10)",
                                        "Seated Leg Curl (3x10)",
                                        "Seated Calf Raise (3x10)",
                                        "Planks (60sec)",
                                        "Hyperextension	(3x10)"};
                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                        }
                    }
                    if(plan.equals("3")){
                        Intent intent = new Intent(context, Workouts.class);
                        String[] a;
                        switch (position){
                            case 0:
                                a = new String[]{"Flat Barbell Bench Press (5x10)",
                                        "Seated Behind the Neck Press (5x25)",
                                        "(Weighted) Tricep Dips (3x30)",
                                        "Standing Cable Crossovers (3x15)",
                                        "Seated Tricep Extensions  (3x15)",
                                        "Dumbbell Curls (3x10)",
                                        "Seated Dumbbell Lateral Raises (3x12)"};

                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                            case 1:
                                a = new String[]{"Barbell Conventional Deadlift (3x5)",
                                        "(Weighted) Chin-ups (3x10)",
                                        "Chest Supported Rows	(3x8)",
                                        "Shrugs (3x15)",
                                        "Standing Barbell Curls	(3x10)",
                                        "Standing Cable Reverse Fly	(3x12)"};
                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                            case 2:
                                a = new String[]{ "Barbell Back Squat (3x15)",
                                        "Barbell Good Mornings (3x15)",
                                        "Leg Press (3x10)",
                                        "Reverse Hyperextension (3x10)",
                                        "Leg Curl (3x10)",
                                        "Calf Raise	(3x10)"};
                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                            case 3:
                                a = new String[]{"Standing Overhead Press (5x15)",
                                        "Incline Bench Press  (3x15)",
                                        "Close Grip Bench Press (3x15)",
                                        "Seated Machine Fly (3x10)",
                                        "Standing Tricep Pushdown (3x10)",
                                        "Standing Cable Lateral Raises (3x10)"};

                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                            case 4:
                                a = new String[]{"Barbell Snatch Grip Deadlift (3x15)",
                                        "Barbell Rows (3x15)",
                                        "(Weighted) Pull-ups (3x10)",
                                        "1-arm Rows (3x10)",
                                        "Incline Dumbbell Curl (3x10)",
                                        "Seated Machine Reverse Fly	(3x10)"};
                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                            case 5:
                                a = new String[]{ "Barbell Front Squat (3x5)",
                                        "Barbell Romanian Deadlifts (3x10)",
                                        "Barbell Hip Thrusts (3x10)",
                                        "Dumbbell Lunges (3x10)",
                                        "Seated Leg Extensions (3x10)",
                                        "Hanging Leg Raises	(3x10)",};
                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                        }
                    }
                }
            });
        }
    }
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_layout,parent,false);
        RecyclerAdapter.ViewHolder holder = new RecyclerAdapter.ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        holder.itemTitle.setText(titles[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

}
