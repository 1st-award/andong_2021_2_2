package com.example.ondrawcolormatrix_project;

import android.content.Context;
import android.graphics.*;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));
    }

    private static class MyGraphicView extends View {
        public MyGraphicView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Bitmap picture = BitmapFactory.decodeResource(getResources(), R.drawable.lena256);
            int picX = (this.getWidth() - picture.getWidth()) / 2;
            int picY = (this.getHeight() - picture.getHeight()) / 2;

            Paint paint = new Paint();
            float[] array = { 2, 0, 0, 0, -25,
                              0, 2, 0, 0, -25,
                              0, 0, 2, 0, -25,
                              0, 0, 0, 1, 0};
            ColorMatrix cm = new ColorMatrix(array);
            paint.setColorFilter(new ColorMatrixColorFilter(cm));
            canvas.drawBitmap(picture, picX, picY, paint);
            picture.recycle();
        }
    }
}