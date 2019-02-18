package com.example.aluno.exerccio_questo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExercicioQuestao1Activity extends AppCompatActivity {

    EditText editnome;
    Button buttonchama;
    String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_questao1);

        editnome = findViewById(R.id.editnome);
        buttonchama = findViewById(R.id.buttonchama);

        buttonchama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nome = editnome.getText().toString();
                String msg = "Olá, Senhor(a) " + nome;
                int duracao = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(getApplicationContext(), msg, duracao);
                toast.show();
            }
        });
    }
}
