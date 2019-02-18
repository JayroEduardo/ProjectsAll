package com.example.aluno.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.listateste);

        ArrayList<String> teste = preencherlista();

        ArrayAdapter<String> arrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teste);
        lista.setAdapter(arrayadapter);
    }

    private ArrayList<String> preencherlista() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Word");
        dados.add("Excel");
        dados.add("Power Point");
        dados.add("Microsoft");
        dados.add("Windows 7");
        dados.add("Windows 10");
        dados.add("Acess");
        return dados;
    }
}
