package com.example.semana5copia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private Button continuarBtn;
    private DatePicker calendario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=findViewById(R.id.nombre);
        continuarBtn=findViewById(R.id.continuarBtn);
       calendario=findViewById(R.id.calendario);

        continuarBtn.setOnClickListener(
                (v) -> {
                    String name=nombre.getText().toString();
                    Intent i=new Intent(MainActivity.this,Main2Activity.class);
                    i.putExtra("nom",name);
                    startActivity(i);

                    String fecha=calendario.getDayOfMonth()+" "+(calendario.getMonth()+1)+" "+calendario.getYear();
                    Toast.makeText(this, fecha, Toast.LENGTH_LONG).show();
                }
        );



    }
}
