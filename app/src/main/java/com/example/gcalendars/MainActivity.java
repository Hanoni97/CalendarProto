package com.example.gcalendars;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gcalendars.calendar.MyCalendar;
import com.example.gcalendars.custom.GroupCalendar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPersonalCalendar = findViewById(R.id.buttonPersonalCalendar);
        Button buttonGroupCalendar = findViewById(R.id.buttonGroupCalendar);
        Button buttonAddCalendar = findViewById(R.id.addButton);

        buttonPersonalCalendar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MyCalendar.class);
            startActivity(intent);
        });

        buttonGroupCalendar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GroupCalendar.class);
            startActivity(intent);
        });

        buttonAddCalendar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddCalendar.class);
            startActivity(intent);
        });
    }
}
