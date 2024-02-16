package com.mateo.velazco.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {//método que va en todas las activities
        super.onCreate(savedInstanceState); //
        setContentView(R.layout.activity_main);

        Button btsum, btrest, btmul, btdiv;
        EditText etnum1, etnum2;
        TextView tvres;

        btsum = findViewById(R.id.buttonsumar); //busque por el id que se le coloca
        btrest = findViewById(R.id.buttonrestar);
        btmul = findViewById(R.id.buttonmulti);
        btdiv = findViewById(R.id.buttondivide);

        etnum1 = findViewById(R.id.etvname1);
        etnum2 = findViewById(R.id.etvname2);
        tvres = findViewById(R.id.tvresultado);




    }

    public void clickSumar(View myview){
        Toast.makeText(this, "LE DÍ CLICK A SUMAR", Toast.LENGTH_SHORT).show();

    }
}