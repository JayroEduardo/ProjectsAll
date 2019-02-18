package com.example.aluno.prova_questo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Questao01Activity extends AppCompatActivity {

    EditText editnome;
    EditText editsaudacao;
    Button buttonsau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao01);

        editnome = findViewById(R.id.editnome);
        editsaudacao = findViewById(R.id.editsaudacao);
        buttonsau = findViewById(R.id.buttonsau);

        buttonsau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = editnome.getText().toString();
                String saudacao = editsaudacao.getText().toString();
                String resultado = saudacao + " " + nome;
                int duracao = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(getApplicationContext(), resultado, duracao);
                toast.show();
            }
        });
    }
}
