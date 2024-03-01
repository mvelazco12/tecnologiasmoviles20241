package com.example.taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    protected Button butt66;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_activity);

        butt66 = findViewById(R.id.button66);
    }

    public void volverMenuProfile (View view){
        Intent meinIntento = new Intent(ProfileActivity.this, MainActivity.class);
        startActivity(meinIntento);


    }
}