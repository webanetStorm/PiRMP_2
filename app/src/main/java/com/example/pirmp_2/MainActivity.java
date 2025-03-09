package com.example.pirmp_2;


import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.util.Log;


public class MainActivity extends AppCompatActivity
{

    private static final String TAG = "LifecycleLogs";

    private EditText nameEditText, groupEditText, ageEditText, gradeEditText;


    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Log.i( TAG, "Вызван метод onCreate()" );

        Button pButton = (Button) findViewById( R.id.pButton );
        pButton.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View view )
            {
                onNextActivity( view );
            }
        } );

        nameEditText = findViewById( R.id.nameEditText );
        groupEditText = findViewById( R.id.groupEditText );
        ageEditText = findViewById( R.id.ageEditText );
        gradeEditText = findViewById( R.id.gradeEditText );

        Button sendButton = findViewById( R.id.sendButton );
        sendButton.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View view )
            {
                Intent intent = new Intent( view.getContext(), SecondActivity.class );
                intent.putExtra( "name", nameEditText.getText().toString() );
                intent.putExtra( "group", groupEditText.getText().toString() );
                intent.putExtra( "age", ageEditText.getText().toString() );
                intent.putExtra( "grade", gradeEditText.getText().toString() );
                view.getContext().startActivity( intent );
            }
        } );
    }

    public void onNextActivity( View view )
    {
        view.getContext().startActivity( new Intent( view.getContext(), SecondActivity.class ) );
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i( TAG, "Вызван метод onStart()" );
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i( TAG, "Вызван метод onResume()" );
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i( TAG, "Вызван метод onPause()" );
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i( TAG, "Вызван метод onStop()" );
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i( TAG, "Вызван метод onDestroy()" );
    }

}
