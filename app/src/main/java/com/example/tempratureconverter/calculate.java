package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        TextView whatToDo = findViewById(R.id.whatToDo);
        TextView calTemp = findViewById(R.id.calTemp);

        EditText inpTemp = findViewById(R.id.inpTemp);
        Button btnConvert = findViewById(R.id.btnConvert);

        Intent comeIn = getIntent();

        int task = comeIn.getIntExtra("task",-1);

        if(task == 0){
            whatToDo.setText(R.string.CelToFar);
        } else if (task == 1) {
            whatToDo.setText(R.string.FarToCel);
        }else {
            Toast.makeText(getApplicationContext(),"Wrong Task",Toast.LENGTH_LONG).show();
        }

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float input = Float.parseFloat(inpTemp.getText().toString());
                String ans;
                switch (task){
                    case 0 : input = (input * 9)/5 +32;
                             ans = String.valueOf(input);
                             calTemp.setText(ans);
                             break;
                    case  1: input = (input - 32)*5/9;
                             ans = String.valueOf(input);
                             calTemp.setText(ans);
                             break;
                    default:Toast.makeText(getApplicationContext(),"Wrong Task",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}