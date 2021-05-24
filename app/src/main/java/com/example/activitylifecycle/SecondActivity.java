package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast toast = Toast.makeText(SecondActivity.this, "SecondonCreate", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

        Button secondActivity = (Button) findViewById(R.id.secondActivity);

        secondActivity.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent i = new Intent(SecondActivity.this, MainActivity.class);
                    startActivity(i);
               }

        });


    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast toast = Toast.makeText(SecondActivity.this, "SecondonStart", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast toast = Toast.makeText(SecondActivity.this, "SecondonResume", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast toast = Toast.makeText(SecondActivity.this, "SecondonPause", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast toast = Toast.makeText(SecondActivity.this, "SecondonStop", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast toast = Toast.makeText(SecondActivity.this, "SecondonRestart", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast toast = Toast.makeText(SecondActivity.this, "SecondonDestroy", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}