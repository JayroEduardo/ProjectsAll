package com.example.aluno.helloworld2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOla = findViewById(R.id.buttonOla);

        buttonOla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ms = "Clique no botão";
                int duracoa = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(getApplicationContext(),ms,duracoa);
                toast.show();
            }
        });
    }
}
