package com.mateo.velazco.explorandolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonscreen2, buttonTable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonscreen2 = findViewById(R.id.button1);
        buttonTable = findViewById(R.id.button2);
    }

    public void clickIrPantalla2(View view){

        Intent miIntent = new Intent(MainActivity.this,ScreenActivity2.class);
        startActivity(miIntent);

    }

    public void clickIrPantalla3(View view){

        Intent miIntent = new Intent(MainActivity.this,TableActivity.class);
        startActivity(miIntent);

    }
}