package com.example.sendarray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txtStrArr;
    Button btnBackMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtStrArr = findViewById(R.id.textViewStringArrayID);
        btnBackMain = findViewById(R.id.buttonBackMainID);

        Intent intent = getIntent();
        String[] arrMonHoc = intent.getStringArrayExtra("arrMonHoc");
        for (String mh: arrMonHoc) {
            txtStrArr.setText(txtStrArr.getText().toString() + mh + "\n");
        }

        btnBackMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBack = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intentBack);
            }
        });
    }
}