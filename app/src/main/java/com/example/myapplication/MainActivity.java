package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b;
EditText t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= (Button)findViewById(R.id.button);
        t=(EditText) findViewById(R.id.PersonName);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= t.getText().toString();
                Intent in= new Intent(getApplicationContext(),SecondActivity.class);
                in.putExtra("PersonName",s);
                startActivity(in);
            }
        });
    }
}//ss