package com.example.homework4maximfilippovexercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bn;
    int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn=(Button) findViewById(R.id.clickMe);

    }



    public void go(View view) {
        n+=1;
        bn.setText("This is a click number:"+ n);
    }
}