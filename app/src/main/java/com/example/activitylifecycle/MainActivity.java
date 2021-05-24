package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "onCreate", Toast.LENGTH_LONG).show();

        Button firstActivity = (Button) findViewById(R.id.firstActivity);

        firstActivity.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(MainActivity.this, "onStart", Toast.LENGTH_SHORT).show();

    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(MainActivity.this, "onResume", Toast.LENGTH_SHORT).show();
    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(MainActivity.this, "onPause", Toast.LENGTH_SHORT).show();
    }

    protected void onStop(){
        super.onStop();
        Toast.makeText(MainActivity.this, "onStop", Toast.LENGTH_SHORT).show();
    }

    protected void onRestart(){
        super.onRestart();
        Toast.makeText(MainActivity.this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(MainActivity.this, "onDestroy", Toast.LENGTH_SHORT).show();
    }


}
