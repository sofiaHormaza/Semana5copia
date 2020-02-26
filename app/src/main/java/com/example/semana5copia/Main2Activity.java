package com.example.semana5copia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    private EditText parcial1;
    private EditText parcial2;
    private EditText taller1;
    private EditText taller2;
    private EditText teorico;
    private EditText practico;
    private EditText ejercicios;
    private EditText prFinal;
    private Button calcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String name=getIntent().getExtras().getString("nom");

        calcular=findViewById(R.id.calcular);
        parcial1=findViewById(R.id.parcial1);
        parcial2=findViewById(R.id.parcial2);
        taller1=findViewById(R.id.taller1);
        taller2=findViewById(R.id.taller2);
        teorico=findViewById(R.id.teorico);
        practico=findViewById(R.id.practico);
        ejercicios=findViewById(R.id.ejercicios);
        prFinal=findViewById(R.id.prFinal);


        //Log.e(">>>","Hola");

        calcular.setOnClickListener(
                (v) ->{

                    Intent j=new Intent(this,Main3Activity.class);


                    String nota1= parcial1.getText().toString();
                    double parc1=Double.parseDouble(nota1);

                    String nota2=parcial2.getText().toString();
                    double parc2=Double.parseDouble(nota2);

                    String nota3=taller1.getText().toString();
                    double tall1=Double.parseDouble(nota3);

                    String nota4=taller2.getText().toString();
                    double tall2=Double.parseDouble(nota4);

                    String nota5=teorico.getText().toString();
                    double teor=Double.parseDouble(nota5);

                    String nota6=practico.getText().toString();
                    double prac=Double.parseDouble(nota6);

                    String nota7=ejercicios.getText().toString();
                    double ejer=Double.parseDouble(nota7);

                    String nota8=prFinal.getText().toString();
                    double prF=Double.parseDouble(nota8);

                    double notaFinal=(parc1*0.15)+(parc2*0.15)+(tall1*0.15)+(tall2*0.15)+(teor*0.10)+(prac*0.05)+(ejer*0.05)+(prF*0.20);
                    String notaMostrar=Double.toString(notaFinal);

                    j.putExtra("total",notaMostrar);
                    j.putExtra("nombr",name);
                    startActivity(j);
                }
        );
    }
}
