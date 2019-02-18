package com.example.aluno.helloworld3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mg = "Clique no botão";
                int duracao = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(getApplicationContext(), mg, duracao);
                toast.show();
            }
        });
    }
}