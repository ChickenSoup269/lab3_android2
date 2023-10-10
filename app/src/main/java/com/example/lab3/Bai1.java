package com.example.lab3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Bai1 extends AppCompatActivity {
    FloatingActionButton fab1;
    SurfaceView sfvB1;
    SurfaceHolder surfaceHolder;
    Paint paint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        addControls();
        addEvents();
    }
    public void addControls(){
        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        sfvB1 = (SurfaceView) findViewById(R.id.sfvB1);
        surfaceHolder = sfvB1.getHolder();
        paint= new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
    }
    public void addEvents()
    {
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                drawShape(holder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
    public void drawShape(SurfaceHolder holder){
        Canvas canvas = holder.lockCanvas();
        if (canvas != null) {
             canvas.drawColor(Color.WHITE);
             canvas.drawCircle(200,200,150, paint);
             canvas.drawRect(400,450,500,500,paint);
             holder.unlockCanvasAndPost(canvas);
        }
    }
}