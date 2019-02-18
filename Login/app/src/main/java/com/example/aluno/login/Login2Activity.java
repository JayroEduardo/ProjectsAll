package com.example.aluno.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login2Activity extends AppCompatActivity {

    public static final String EXTRA_MENSSAGEN = "com.example.android.LoginActivity.extra.MENSSAGEN";
    private TextView Final;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        Final = findViewById(R.id.textfinal);
        Intent intent = getIntent();
        String message = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(LoginActivity.EXTRA_MENSSAGE);
        TextView textView = findViewById(R.id.textlogin);
        TextView textView2 = findViewById(R.id.textsenha);
        textView.setText(message);
        textView2.setText(message2);

        TextView textView3;

        if(message == "ifpi"){
            if(message2 == "central"){
                textView3 = findViewById(R.id.textbemvindo);
                textView3.setText("Seja Bem Vindo!!!");
            }
        }
    }

    public void logout(View view) {
        Intent intent = new Intent(this, Login2Activity.class);
        String messagems = Final.getText().toString();
        intent.putExtra(EXTRA_MENSSAGEN, messagems);
        startActivity(intent);
    }
}
