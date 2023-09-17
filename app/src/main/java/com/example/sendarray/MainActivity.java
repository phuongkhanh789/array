package com.example.sendarray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String[] arrMonHoc = {"Lập trình Android cơ bản", "Lập trình Android nâng cao", "Lập trình C#", "Quảng cáo Facebook", "Quảng cáo Google Adword"};
    Button btnStrArr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStrArr = findViewById(R.id.buttonStringArrayID);

        btnStrArr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("arrMonHoc", arrMonHoc);
                startActivity(intent);
            }
        });
    }
}