package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text=findViewById(R.id.second);
        Bundle arguments=getIntent().getExtras();
        String name=arguments.getString(MainActivity.EXTRA_MESSAGE).toString();
        text.setText(name);
    }
}