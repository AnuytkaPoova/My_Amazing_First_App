package com.a_ches.myamazingfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*
убрала implements View.OnClickListener у класса MainActivity
 */

public class MainActivity extends AppCompatActivity  {
    Button button_info;
    Button button_calendar;
    Button button_note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       /*
        button_info = (Button) findViewById(R.id.button_info);
        button_info.setOnClickListener((View.OnClickListener) this);

        button_calendar = (Button) findViewById(R.id.button_calendar);
        button_calendar.setOnClickListener((View.OnClickListener) this);

        button_note = (Button) findViewById(R.id.button_note);
        button_note.setOnClickListener((View.OnClickListener) this);

        */
    }


    public void clickInfo(View view) {
        runActivity(SecondActivity.class);
    }

    public void clickCalendar(View view) {
        runActivity(ThirdActivity.class);
    }

    public void clickNote(View view) {
        runActivity(FourthActivity.class);
    }

    private void runActivity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
    /*
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_info:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.button_calendar:
                Intent intent2 = new Intent(this, ThirdActivity.class);
                startActivity(intent2);
                break;
            case R.id.button_note:
                Intent intent3 = new Intent(this, FourthActivity.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }

     */




}