package com.example.tutorials;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class ListContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_content);

        String[] items = {"망고 쥬스", "토마토 쥬스", "포도 쥬스"};
        ListAdapter adapter = new ImgAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String item = String.valueOf(parent.getItemAtPosition(i));
                Toast.makeText(ListContent.this, item, Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void onBackButtonClick(View v) {
        Toast.makeText(getApplicationContext(), "돌아가기 버튼을 눌러써요.", Toast.LENGTH_LONG).show();
        finish();
    }
}
