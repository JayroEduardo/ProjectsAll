package com.example.aluno.exerccio_questo06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExercicioQuestao06Activity extends AppCompatActivity {

    EditText editkmatual;
    EditText editkmanterior;
    EditText editgasolina;
    Button buttoncalcular;
    String msg;
    int duracao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_questao06);

        editkmatual = findViewById(R.id.editkmatual);
        editkmanterior = findViewById(R.id.editkmanterior);
        editgasolina = findViewById(R.id.editgasolina);
        buttoncalcular = findViewById(R.id.buttoncalcular);

        buttoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float kmatual = Float.parseFloat(editkmatual.getText().toString());
                float kmanterior = Float.parseFloat(editkmanterior.getText().toString());
                float gasolina = Float.parseFloat(editgasolina.getText().toString());

                if(kmatual < 0 && kmanterior < 0 && gasolina < 0){
                    msg = "Digite apenas valore válidos";
                    duracao = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(getApplicationContext(), msg, duracao);
                    toast.show();
                }
                else{
                    float taxaconsumo = (kmatual - kmanterior) / gasolina;
                    msg = String.format("A taxa de consumo é %.2f", taxaconsumo);
                    duracao = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(getApplicationContext(), msg, duracao);
                    toast.show();
                }
            }
        });
    }
}
