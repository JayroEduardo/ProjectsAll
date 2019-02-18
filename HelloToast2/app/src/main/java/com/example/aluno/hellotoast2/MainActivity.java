package com.example.aluno.hellotoast2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textshow_toast;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textshow_toast = findViewById(R.id.textshow_toast);
    }

    public void shown_toast(View view) {
        //Toast toast = Toast.makeText(this, R.string.button_label_count, Toast.LENGTH_LONG);
        //toast.show();
        count--;
        if(textshow_toast != null){
            textshow_toast.setText(Integer.toString(count));
        }
    }

    public void show_count(View view) {
        count++;
        if(textshow_toast != null){
            textshow_toast.setText(Integer.toString(count));
        }
    }
}
