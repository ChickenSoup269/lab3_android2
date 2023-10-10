package com.example.lab3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CustomCircleView extends View {
    Paint turquoise, orange, yellow, hotPink;
    RectF rectF;

    public CustomCircleView(Context context) {
        super(context);
        init();
    }

    public CustomCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomCircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        turquoise = createPaint("#30D5C8"); // màu xanh lá
        orange = createPaint("#FFA500"); // màu cam
        yellow = createPaint("#FFFF8F"); // màu vàng
        hotPink = createPaint("#FF69B4"); // màu hồng
        rectF = new RectF();
    }

    public Paint createPaint(String color) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(android.graphics.Color.parseColor(color));  // set màu tương ứng
        return paint;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = Math.min(centerX, centerY) - 120; // đặt bán kính hình tròn

        rectF.set(centerX - radius, centerY - radius, centerX + radius, centerY + radius);

        // Góc và các màu đại diện
        canvas.drawArc(rectF, 0F, 90F, false, turquoise);
        canvas.drawArc(rectF, 90F, 90F, false, orange);
        canvas.drawArc(rectF, 180F, 90F, false, yellow);
        canvas.drawArc(rectF, 270F, 90F, false, hotPink);

    }
}
