package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button maBtn ;
EditText editText1,editText2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maBtn = findViewById(R.id.btn_register);
editText1 = findViewById(R.id.edit1);
editText2 = findViewById(R.id.edit2);


        maBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
intent.putExtra("key1",editText1.getText().toString());
intent.putExtra("key2",editText2.getText().toString());
startActivity(intent);
                Log.e("ololo", "onClick:} "+intent );
            }
        });
    }
}