package com.example.goodtaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button button1 = (Button) findViewById(R.id.button2);
        EditText editText1 = (EditText) findViewById(R.id.txt1);
        EditText editText2 = (EditText) findViewById(R.id.txt2);
        EditText editText3 = (EditText) findViewById(R.id.txt3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1.getText().toString().equals("") || editText2.getText().toString().equals("") || editText3.getText().toString().equals("")){
                    Toast.makeText(MainActivity2.this, "Неверный логин или пароль", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent i = new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}