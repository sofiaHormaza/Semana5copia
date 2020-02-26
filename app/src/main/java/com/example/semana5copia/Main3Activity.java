package com.example.semana5copia;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {

    private TextView resultados;
    private TextView total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String notass=getIntent().getExtras().getString("total");
        String elNombre=getIntent().getExtras().getString("nombr");

        total=findViewById(R.id.total);
        resultados=findViewById(R.id.resultados);


        total.setText("Total: "+notass);
        resultados.setText("Resultados para: "+elNombre);
    }
}
