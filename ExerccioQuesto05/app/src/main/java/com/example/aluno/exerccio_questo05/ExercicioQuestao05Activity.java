package com.example.aluno.exerccio_questo05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExercicioQuestao05Activity extends AppCompatActivity {

    EditText editsalario;
    Button buttoncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_questao05);

        editsalario = findViewById(R.id.editsalario);
        buttoncalcular = findViewById(R.id.buttoncalcular);

        buttoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float salario = Float.parseFloat(editsalario.getText().toString());

                float reajuste1 = salario + (salario * 7) / 100;
                float reajuste2 = reajuste1 + (salario * 6) / 100;
                float reajuste3 = reajuste2 + (salario * 5) / 100;

                String reajuste = "1º Ano: R$ " + reajuste1 + " , 2º Ano: R$ " + reajuste2 + " , 3º Ano: R$ " + reajuste3;
                int duracao = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(getApplicationContext(), reajuste, duracao);
                toast.show();
            }
        });
    }
}
