package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Bai2 extends AppCompatActivity {
    FloatingActionButton fab2;
    Button btnChangeColor;
    CustomView customView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        addControls();
        addEvents();
    }
    public void addControls(){
        customView = (CustomView) findViewById(R.id.cstView);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        btnChangeColor = (Button) findViewById(R.id.btnChangeColor);
    }
    public void addEvents(){
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customView.swapColor();
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}