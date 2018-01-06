package com.example.victor.gestures;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnGestureListener, GestureDetector.OnDoubleTapListener {

    private TextView victorsMessage;
    private GestureDetectorCompat gestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        victorsMessage = (TextView)findViewById(R.id.victorsMessage);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        victorsMessage.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        victorsMessage.setText("onDoubleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        victorsMessage.setText("onDoubleTapEventConfirmed");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        victorsMessage.setText("onDownConfirmed");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        victorsMessage.setText("onShowPressConfirmed");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        victorsMessage.setText("onSingleTapUpConfirmed");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        victorsMessage.setText("onScrollConfirmed");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        victorsMessage.setText("onLongPressConfirmed");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        victorsMessage.setText("onFlingConfirmed");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
