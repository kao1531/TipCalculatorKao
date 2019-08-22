package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* if we want a button click to call a method, it must
     be defined like:
        public void methodName (View v)
     */
    public void clickMe(View v)
    {
        TextView textView = (TextView)findViewById(R.id.textView1);
        textView.setText("Hey 5th period");
    }
}
