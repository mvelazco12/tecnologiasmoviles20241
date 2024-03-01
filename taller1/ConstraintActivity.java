package com.example.taller1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConstraintActivity extends AppCompatActivity {

    protected Button but4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_activity);

        but4 = findViewById(R.id.button4);
    }

    public void volveraMenu(View view){
        Intent myintent = new Intent(ConstraintActivity.this, MainActivity.class);
        startActivity(myintent);
    }





}

    /*public void clickIrPantalla3(View view){

        Intent miIntent = new Intent(MainActivity.this,TableActivity.class);
        startActivity(miIntent);

    }*/