package org.jiangtao.customview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by kevin on 16-5-18.
 */
public class CustomViewCircle extends View {

  private Paint mPaint;

  public CustomViewCircle(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  public CustomViewCircle(Context context) {
    super(context);
    init();
  }

  public CustomViewCircle(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public void init() {
    mPaint = new Paint();
    mPaint.setStrokeWidth(5);
    mPaint.setColor(Color.RED);
    mPaint.setAntiAlias(true);
    mPaint.setStyle(Paint.Style.FILL);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    canvas.drawCircle(getWidth() / 2, getHeight() / 2, 50, mPaint);
  }
}
