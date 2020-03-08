package com.example.weatherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView theListView;
    Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        myIntent = new Intent(this, SecondActivity.class);

        theListView = (ListView) findViewById(R.id.myListView);
        String[ ] myData = {"Android", "Iphone", "Windows", "Blackberry", "Linux","Ubuntu"};
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myData);

        theListView.setAdapter( myAdapter );

        theListView.setOnItemClickListener( listClick );
    }
    private AdapterView.OnItemClickListener listClick = new AdapterView.OnItemClickListener () {

        public void onItemClick(AdapterView parent, View v, int position, long id) {

            String itemValue = (String) theListView.getItemAtPosition( position );

            myIntent.putExtra("Software_Selected", itemValue);

            startActivity(myIntent);
        }
    };
}
