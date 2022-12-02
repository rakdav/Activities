package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{
    private TextView text;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text=findViewById(R.id.ageView);
        button=findViewById(R.id.button2);
        Bundle arguments=getIntent().getExtras();
        String name=arguments.getString(MainActivity.EXTRA_KEY).toString();
        text.setText("Возраст:"+name);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data=new Intent();
                data.putExtra(MainActivity.EXTRA_MESSAGE,"Вход разрешен");
                setResult(RESULT_OK,data);
                finish();
            }
        });
    }
}