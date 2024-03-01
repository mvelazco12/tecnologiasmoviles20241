package com.example.taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableActivity extends AppCompatActivity {

    protected Button but55;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_table_activity);

        but55 = findViewById(R.id.button55);

    }

    public void clickIrMenuTable(View view){

        Intent intentoo = new Intent(TableActivity.this, MainActivity.class);
        startActivity(intentoo);
    }

    /*public void clickIrPantalla3(View view){

        Intent miIntent = new Intent(MainActivity.this,TableActivity.class);
        startActivity(miIntent);

    }*/

}