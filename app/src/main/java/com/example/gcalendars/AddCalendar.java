package com.example.gcalendars;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gcalendars.calendar.MyCalendar;
import com.example.gcalendars.custom.GroupCalendar;

public class AddCalendar extends AppCompatActivity {

    public Button buttonPCalendar;
    public Button buttonGCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_add);

        /*
        int PCalendarCount = 0;
        int GCalendarCount = 0;
        String PCalendarText = getString(R.string.personal_calendar);

        buttonPCalendar = new Button(this);
        PCalendarCount++;
        buttonPCalendar.setText(PCalendarText + PCalendarCount);

        buttonGCalendar = new Button(this);
        GCalendarCount++;
        buttonGCalendar.setText("그룹 캘린더 " + GCalendarCount);

        // 개인 캘린더의 고유 ID
        long personalCalendarID = 1; // 예시로 1을 사용, 실제 ID로 대체

        // ContentResolver를 가져오기
        ContentResolver cr = getContentResolver();

        // 캘린더 삭제
        Uri uri = CalendarContract.Calendars.CONTENT_URI;
        uri = ContentUris.withAppendedId(uri, personalCalendarID);
        int rows = cr.delete(uri, null, null);

        if (rows > 0) {
        // 캘린더 삭제 성공
        } else {
        // 캘린더 삭제 실패
        }
        */

        buttonPCalendar = findViewById(R.id.buttonPCalendar);
        buttonGCalendar = findViewById(R.id.buttonGCalendar);


        buttonPCalendar.setOnClickListener(view -> {
            Intent intent = new Intent(AddCalendar.this, MyCalendar.class);
            startActivity(intent);
        });

        buttonGCalendar.setOnClickListener(view -> {
            Intent intent = new Intent(AddCalendar.this, GroupCalendar.class);
            startActivity(intent);
        });
    }
}
