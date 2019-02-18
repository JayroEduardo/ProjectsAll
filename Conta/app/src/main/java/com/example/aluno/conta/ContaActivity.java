package com.example.aluno.conta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContaActivity extends AppCompatActivity {

    EditText editconta;
    EditText editcomicao;
    Button buttoncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta);

        editconta = findViewById(R.id.editconta);
        editcomicao = findViewById(R.id.editcondicao);
        buttoncalcular = findViewById(R.id.buttoncalcular);

        buttoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float conta = Float.parseFloat(editconta.getText().toString());
                int comissao = Integer.parseInt(editcomicao.getText().toString());

                float valortotal = conta * (comissao/10);

                String resultado = "R$ " + valortotal;

                int duracao = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(getApplicationContext(), resultado, duracao);
                toast.show();
            }
        });

    }
}
