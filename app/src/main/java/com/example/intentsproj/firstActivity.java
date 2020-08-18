package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class firstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   View txtBx1 = findViewById(R.id.txtBx1);
     //   View txtBx2 = findViewById(R.id.txtBx2);
     //   View btn1 = findViewById(R.id.btn1);

        Button btn = (Button)findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(firstActivity.this, secondActivity.class));
                Context context = getApplicationContext();

                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.BOTTOM|Gravity.LEFT, 40, 100);
                toast.show();
            }
        });


    }
}