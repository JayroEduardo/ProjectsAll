package com.example.aluno.tabexperiment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment1 extends Fragment {

    public TabFragment1() {
        // Required empty public constructor
    }

    EditText editaltura;
    EditText editpeso;
    Button verificar;
    String resultado;
    int duracao;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        float h, p;

        return inflater.inflate(R.layout.tab_fragment1, container, false);
    }

}
