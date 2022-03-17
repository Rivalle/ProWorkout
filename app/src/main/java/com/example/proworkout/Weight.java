package com.example.proworkout;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/*
this is the weight class which stores the weight the user typed in and the date in which it was typed
 */
public class Weight {
    private int _id;
    private int _weight;
    private String _date;

    public Weight(){
    }

    public Weight(int id, int weight, String date){
        this._id=id;
        this._weight=weight;
        this._date=date;
    }
    //the constructor takes the weight input and the system's current date and makes a weight object
    public Weight(int weight){
        this._weight=weight;
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
        String formattedDate = df.format(c);
        this._date = formattedDate;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public int getId(){
        return this._id;
    }

    public void setWeight(int _weight) {
        this._weight = _weight;
    }

    public int getWeight() {
        return _weight;
    }

    public void setDate(String date) {
        this._date=date;
    }

    public String getDate() {
        return _date;
    }
}
