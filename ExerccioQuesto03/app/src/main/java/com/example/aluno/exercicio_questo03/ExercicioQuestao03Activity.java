package com.example.aluno.exercicio_questo03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExercicioQuestao03Activity extends AppCompatActivity {

    EditText editreal;
    EditText editcotacaodolar;
    Button buttoncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_questao03);

        editreal = findViewById(R.id.editreal);
        editcotacaodolar = findViewById(R.id.editcotacaodolar);
        buttoncalcular = findViewById(R.id.buttoncalcular);

        buttoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float real = Float.parseFloat(editreal.getText().toString());
                float cotacao = Float.parseFloat(editcotacaodolar.getText().toString());
                float converter = real * cotacao;

                String valor = "U$$ " + converter;
                int duracao = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(getApplicationContext(), valor, duracao);
                toast.show();
            }
        });
    }
}
