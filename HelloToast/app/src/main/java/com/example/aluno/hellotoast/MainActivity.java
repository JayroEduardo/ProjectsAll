package com.example.aluno.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textshow_count;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textshow_count = findViewById(R.id.textshow_count);
    }

    public void show_toast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_mansseger, Toast.LENGTH_LONG);
        toast.show();
    }

    public void show_count(View view) {
        count++;
        if(textshow_count != null){
            textshow_count.setText(Integer.toString(count));
        }
    }

    public void on_count(View view) {
        count--;
        if(textshow_count != null){
            textshow_count.setText(Integer.toString(count));
        }
    }
}
