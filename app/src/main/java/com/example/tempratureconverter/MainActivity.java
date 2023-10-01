package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cTof = findViewById(R.id.cTof);
        Button fToc = findViewById(R.id.fToc);

        Intent goTo = new Intent(this,calculate.class);

        cTof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTo.putExtra("task",0);
                startActivity(goTo);
            }
        });

        fToc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTo.putExtra("task",1);
                startActivity(goTo);
            }
        });
    }
}