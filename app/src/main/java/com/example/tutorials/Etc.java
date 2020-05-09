package com.example.tutorials;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Etc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc);
    }

    public void onBtnUrl(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }

    public void onBtnPhone(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-3182-0825"));
        startActivity(intent);
    }

    public void onBackButtonClick(View v) {
        Toast.makeText(getApplicationContext(), "돌아가기 버튼을 눌러써요.", Toast.LENGTH_LONG).show();
        finish();
    }
}
