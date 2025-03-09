package com.example.pirmp_2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );

        TextView infoTextView = findViewById( R.id.infoTextView );
        Intent intent = getIntent();
        String name = intent.getStringExtra( "name" );
        String group = intent.getStringExtra( "group" );
        String age = intent.getStringExtra( "age" );
        String grade = intent.getStringExtra( "grade" );

        String info = "ФИО: " + name + "\nГруппа: " + group + "\nВозраст: " + age + "\nОценка: " + grade;
        infoTextView.setText( info );
    }

    public void onPrevActivity( View view )
    {
        view.getContext().startActivity( new Intent( view.getContext(), MainActivity.class ) );
    }

}
