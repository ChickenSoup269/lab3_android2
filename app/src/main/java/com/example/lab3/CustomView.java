package com.example.lab3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {
    Rect rect;
    Paint paintRect;

    public CustomView(Context context) {
        super(context);
        init (null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void init (@Nullable AttributeSet set){
        rect = new Rect();
        paintRect = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintRect.setColor(Color.GREEN);
    }

    public void swapColor()
    {
        paintRect.setColor(paintRect.getColor()==Color.GREEN?Color.BLUE:Color.GREEN);
        postInvalidate();
    }

    @Override
    protected void onDraw (Canvas canvas){
        rect.left = 50;
        rect.top = 50;
        rect.right = 400;
        rect.bottom = 400;
        canvas.drawRect(rect,paintRect);
    }

}
