package com.example.taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected Button but1, but2, but3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = findViewById(R.id.button11);
        but2 = findViewById(R.id.button22);
        but3 = findViewById(R.id.button33);
    }

    public void clickIrPantalla2(View view){

        Intent miIntent = new Intent(MainActivity.this, ConstraintActivity.class);
        startActivity(miIntent);

    }

    public void clickIrPantalla3(View view){

        Intent miIntent = new Intent(MainActivity.this, TableActivity.class);
        startActivity(miIntent);

    }

    public void clickIrPantalla4(View view){

        Intent miIntent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(miIntent);

    }


}