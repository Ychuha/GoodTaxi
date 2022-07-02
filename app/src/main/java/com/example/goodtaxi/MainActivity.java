package com.example.goodtaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button2);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        EditText editText1 = (EditText) findViewById(R.id.txt1);
        EditText editText2 = (EditText) findViewById(R.id.txt2);

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1.getText().toString().equals("") || editText2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Неверный логин или пароль", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent i = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(i);
                }
            }
        });
    }
}