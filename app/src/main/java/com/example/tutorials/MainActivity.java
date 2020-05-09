package com.example.tutorials;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnCalculator(View v) {
        Intent intent = new Intent(getApplicationContext(), Calculator.class);
        startActivity(intent);
    }

    public void onBtnAlarm(View v) {
        Intent intent = new Intent(getApplicationContext(), Alarm.class);
        startActivity(intent);
    }
}
