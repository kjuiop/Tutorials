package com.example.tutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Slider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
    }

    public void onBackButtonClick(View v) {
        Toast.makeText(getApplicationContext(), "돌아가기 버튼을 눌러써요.", Toast.LENGTH_LONG).show();
        finish();
    }
}
