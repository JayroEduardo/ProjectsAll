package com.example.aluno.exerccio_questo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExercicioQuestao02Activity extends AppCompatActivity {

    EditText editconta;
    EditText editcouvert;
    EditText editservico;
    EditText editpessoa;
    Button buttoncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_questao02);

        editconta = findViewById(R.id.editconta);
        editcouvert = findViewById(R.id.editcouvert);
        editservico = findViewById(R.id.editservico);
        editpessoa = findViewById(R.id.editpessoa);
        buttoncalcular = findViewById(R.id.buttoncalcular);

        buttoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float conta = Float.parseFloat(editconta.getText().toString());
                float couvert = Float.parseFloat(editcouvert.getText().toString());
                float servico = Integer.parseInt(editservico.getText().toString());
                int quant = Integer.parseInt(editpessoa.getText().toString());

                float totalconta = (conta + couvert) + (conta + couvert) * servico/100;
                float totalpessoa = totalconta/quant;

                String msg = "Cada pessoa vai pagar R$ " + totalpessoa;
                int duracao = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(getApplicationContext(), msg, duracao);
                toast.show();
            }
        });
    }
}
