package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText editText1,editText2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText1 = findViewById(R.id.result1);
        editText2 = findViewById(R.id.result2);

        Intent intent = getIntent();
        String result1 =  intent.getStringExtra("key1");
        String result2 =  intent.getStringExtra("key2");
        editText1.setText(result1);
        editText2.setText(result2);
    }
}