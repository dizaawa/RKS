package com.example.projek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Assigment extends AppCompatActivity {
    Button sisip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assigment);
        sisip = (Button) findViewById(R.id.sisipkan);

        sisip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Assigment.this,Submit.class);
                startActivity(intent);
            }
        });
    }
}