package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Bai3 extends AppCompatActivity {
    FloatingActionButton fab3;
    CustomCircleView customCircleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        addControls();
        addEvents();
    }
    public void addControls(){
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        customCircleView = (CustomCircleView) findViewById(R.id.cstCrircle);
    }
    public void addEvents(){
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

}