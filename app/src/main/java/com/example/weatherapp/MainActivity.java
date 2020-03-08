package com.example.weatherapp;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;
import com.example.weatherapp.R;


public class MainActivity extends AppCompatActivity {

    private EditText e1;
    private EditText e2;
    private CardView c1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.email);
        e2 = findViewById(R.id.password);
        c1 = findViewById(R.id.login);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

;              String mail =   e1.getText().toString();
                String password = e2.getText().toString();
                if (mail.isEmpty()) {
                    e1.setError("Email required");
                    e1.requestFocus();
                }
                else if (!mail.contains("@") || !mail.contains(".com") || mail.contains(" ") ){
                    e1.setError("Invalid Structure");
                    e1.requestFocus();
                }
                else if (password.isEmpty()) {
                    e2.setError("Password required");
                    e2.requestFocus();
                }
                else if (password.length() < 6){
                    e2.setError("Length Should be at least 6");
                    e2.requestFocus();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                    startActivity(intent);

                }

            }
        });
    }}

