package com.example.aluno.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.android.LoginActivity.extra.MESSAGE";
    public static final String EXTRA_MENSSAGE = "com.example.android.LoginActivity.extra.MENSSAGE";
    private EditText mMessageEditText;
    private EditText mensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mMessageEditText = findViewById(R.id.editlogin);
        mensagem = findViewById(R.id.editsenha);
        Intent intent = getIntent();
        String messagen = intent.getStringExtra(Login2Activity.EXTRA_MENSSAGEN);
        TextView textview = findViewById(R.id.textfinal);
        textview.setText(messagen);
    }

    public void entrarnologin(View view) {
        //Log.d("oi", "Jayro");
        Intent intent = new Intent(this, Login2Activity.class);
        String message = mMessageEditText.getText().toString();
        String message2 = mensagem.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_MENSSAGE, message2);
        startActivity(intent);
    }
}
