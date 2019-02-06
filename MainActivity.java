package com.example.estudiantes.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    public void click(View vista){

        EditText miTexto=(EditText) findViewById(R.id.editText);
        TextView etiqueta=(TextView) findViewById(R.id.textView);

        int numero=Integer.parseInt(miTexto.getText().toString());

                if(numero==0){
                    etiqueta.setText("Sí fuca");
                }else{
                    etiqueta.setText("No Fuca");
                }

    }
}
