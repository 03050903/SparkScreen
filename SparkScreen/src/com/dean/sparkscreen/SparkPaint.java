package com.dean.sparkscreen;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class SparkPaint {

	public Paint sparkPaint;

	public SparkPaint() {

		setSparkPaint();
	}

	private void setSparkPaint() {
		sparkPaint = new Paint();
		 // �򿪿����  
		this.sparkPaint.setAntiAlias(true);
		this.sparkPaint.setDither(true);
	    /* 
	     * ���û�����ʽΪ���
	     * Paint.Style.STROKE����� 
	     * Paint.Style.FILL_AND_STROKE����߲���� 
	     * Paint.Style.FILL����� 
	     */  
		this.sparkPaint.setStyle(Paint.Style.FILL);
		this.sparkPaint.setColor(Color.YELLOW);
		this.sparkPaint.setMaskFilter(new BlurMaskFilter(15.0F,
				BlurMaskFilter.Blur.NORMAL));
	}

	public void drawSpark(Canvas canvas, float x, float y) {
		canvas.drawCircle(x, y, 30, sparkPaint);
	}
	
}
