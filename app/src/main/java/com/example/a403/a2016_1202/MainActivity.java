package com.example.a403.a2016_1202;

import android.graphics.Color;
import android.icu.util.Calendar;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;
    TextView tv1;
    RadioButton rb1, rb2;
    CalendarView calendar;
    TimePicker timepicker;
    Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        tv1 = (TextView)findViewById(R.id.textView1);
        calendar= (CalendarView)findViewById(R.id.calendarView1);
        timepicker = (TimePicker)findViewById(R.id.timePicker1);
        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        chronometer = (Chronometer) findViewById(R.id.chronometer1);

        chronometer.stop();
        calendar.setVisibility(View.INVISIBLE);
        timepicker.setVisibility(View.INVISIBLE);
        rb1.setVisibility(View.INVISIBLE);
        rb2.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.start();
                chronometer.setTextColor(Color.parseColor("#FF0000"));
                rb1.setVisibility(View.VISIBLE);
                rb2.setVisibility(View.VISIBLE);
            }
        });



        rb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(rb1.isChecked()){
                    calendar.setVisibility(View.VISIBLE);
                    timepicker.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                }
            }
        });
        rb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(rb2.isChecked()){
                    calendar.setVisibility(View.INVISIBLE);
                    timepicker.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                }
            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setVisibility(View.VISIBLE);
            }
        });
    }
}
