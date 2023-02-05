package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.io.File;
import java.time.Clock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimePicker timePicker=findViewById(R.id.time);

        timePicker.setEnabled(true);
        timePicker.setActivated(true);
        onStart();


    }
}