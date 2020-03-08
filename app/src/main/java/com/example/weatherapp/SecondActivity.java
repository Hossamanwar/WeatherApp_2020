package com.example.weatherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent secondIntent = getIntent( );

        String message = "Software Selected is " + secondIntent.getStringExtra("Software_Selected");

        TextView myText = (TextView) findViewById(R.id.textView);

        myText.setText(message);
    }
}
