package com.example.aluno.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ContadorActivity extends AppCompatActivity {

    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        TextView editcontador = findViewById(R.id.editcontador);

        editcontador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador = contador + 1;
                String contador1 = "" + contador;
                int duracao = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(getApplicationContext(), contador1, duracao);
                toast.show();
            }
        });
    }
}
