package com.example.chemsnake;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Display;

public class SnakeActivity extends Activity {

    SnakeEngine snakeEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Display display = getWindowManager().getDefaultDisplay();

        Point size = new Point();
        display.getSize(size);

        snakeEngine = new SnakeEngine(this, size);

        setContentView(snakeEngine);
    }

    protected void onResume(){
        super.onResume();
        snakeEngine.resume();
    }

    protected void onPause(){
        super.onPause();
        snakeEngine.pause();
    }
}
