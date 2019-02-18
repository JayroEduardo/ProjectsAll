package com.example.aluno.prova_questo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Questao02Activity extends AppCompatActivity {

    EditText editnumero;
    Button buttonverifica;
    String resultado;
    int duracao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao02);

        editnumero = findViewById(R.id.editnumero);
        buttonverifica = findViewById(R.id.buttonverifica);

        buttonverifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float numero = Float.parseFloat(editnumero.getText().toString());

                if((numero % 2) ==0){
                    resultado = "O número digitado é par";
                    duracao = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(getApplicationContext(), resultado, duracao);
                    toast.show();
                }
                else{
                    resultado = "O número digitado é impar";
                    duracao = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(getApplicationContext(), resultado, duracao);
                    toast.show();
                }
            }
        });
    }
}
