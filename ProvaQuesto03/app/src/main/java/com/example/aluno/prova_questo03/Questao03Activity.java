package com.example.aluno.prova_questo03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Questao03Activity extends AppCompatActivity {

    EditText editnumero1;
    EditText editnumero2;
    EditText editnumero3;
    Button buttonOrdenar;
    String msg;
    int duracao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao03);

        editnumero1 = findViewById(R.id.editnumero1);
        editnumero2 = findViewById(R.id.editnumero2);
        editnumero3 = findViewById(R.id.editnumero3);
        buttonOrdenar = findViewById(R.id.buttonOrdenar);

        buttonOrdenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editnumero1.getText().toString());
                int num2 = Integer.parseInt(editnumero2.getText().toString());
                int num3 = Integer.parseInt(editnumero3.getText().toString());

                if((num1 > num2) && (num2 > num3) && (num1 > num3)){
                    msg = num3 + ", " + num2 + ", " + num1;
                    duracao = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(getApplicationContext(), msg, duracao);
                    toast.show();
                }
                if((num3 > num2) && (num2 > num1) && (num3 > num1)){
                    msg = num1 + ", " + num2 + ", " + num3;
                    duracao = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(getApplicationContext(), msg, duracao);
                    toast.show();
                }
                if((num1 > num2) && (num2 < num3) && (num1 > num3)){
                    msg = num2 + ", " + num3 + ", " + num1;
                    duracao = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(getApplicationContext(), msg, duracao);
                    toast.show();
                }
                if((num1 < num2) && (num2 > num3) && (num3 > num1)){
                    msg = num1 + ", " + num3 + ", " + num2;
                    duracao = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(getApplicationContext(), msg, duracao);
                    toast.show();
                }
                if((num1 < num2) && (num3 < num2) && (num3 < num1)){
                    msg = num3 + ", " + num1 + ", " + num2;
                    duracao = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(getApplicationContext(), msg, duracao);
                    toast.show();
                }
                if((num1 > num2) && (num3 > num2) && (num1 < num3)){
                    msg = num2 + ", " + num1 + ", " + num3;
                    duracao = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(getApplicationContext(), msg, duracao);
                    toast.show();
                }
            }
        });
    }
}
