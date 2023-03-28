package com.example.archana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.blockedbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Block Button Pressed", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.emergencybtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Emergency Button Pressed", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.nonbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Non Emergency Button Pressed", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.registerbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Register Button Pressed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}