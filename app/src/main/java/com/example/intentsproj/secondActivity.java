package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnAdd = findViewById(R.id.btn2);
        Button btnSub = findViewById(R.id.btn3);
        Button btnMult = findViewById(R.id.btn4);
        Button btnDiv = findViewById(R.id.btn5);

        Intent intent = getIntent();
        final EditText ET1 = findViewById(R.id.txtBx3);
        final EditText ET2 = findViewById(R.id.txtBx4);
        final TextView FV = findViewById(R.id.txtFV); //Final result view

        ET1.setText(intent.getStringExtra("value1"));
        ET2.setText(intent.getStringExtra("value2"));


        //addition button
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = Integer.parseInt(ET1.getText().toString()) + Integer.parseInt(ET2.getText().toString());
                FV.setText(String.valueOf(result));
            }
        });

        //subtraction button
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = Integer.parseInt(ET1.getText().toString()) - Integer.parseInt(ET2.getText().toString());
                FV.setText(String.valueOf(result));
            }
        });

       //multiplication button
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = Integer.parseInt(ET1.getText().toString()) * Integer.parseInt(ET2.getText().toString());
                FV.setText(String.valueOf(result));
            }
        });

        //division button
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = Integer.parseInt(ET1.getText().toString()) / Integer.parseInt(ET2.getText().toString());
                FV.setText(String.valueOf(result));
            }
        });
    }
}