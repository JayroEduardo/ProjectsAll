package com.example.aluno.exerccio_questo04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExercicoQuestao04Activity extends AppCompatActivity {

    EditText edithora;
    EditText editminuto;
    Button buttoncalcular;
    String resultado;
    int duracao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercico_questao04);

        edithora = findViewById(R.id.edithora);
        editminuto = findViewById(R.id.edithora);
        buttoncalcular = findViewById(R.id.buttoncalcular);

        buttoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hora = Integer.parseInt(edithora.getText().toString());
                int minutos = Integer.parseInt(editminuto.getText().toString());

                if((hora < 0) && (minutos < 0)){
                    resultado = "Número inválido";
                    duracao = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(getApplicationContext(), resultado, duracao);
                    toast.show();
                }
                else{
                    int converter = (hora * 3600) + (minutos * 60);

                    resultado = converter + " seg";
                    duracao = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(getApplicationContext(), resultado, duracao);
                    toast.show();
                }
            }
        });
    }
}
