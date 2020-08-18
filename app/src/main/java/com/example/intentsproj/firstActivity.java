package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class firstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater lay = getLayoutInflater();
        final View layout = lay.inflate((R.layout.customtoast), (ViewGroup) findViewById(R.id.custom_toast_layout));

        final EditText et1 = findViewById(R.id.txtBx1);
        final EditText et2 = findViewById(R.id.txtBx2);
        Button btn = (Button)findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.BOTTOM|Gravity.LEFT, 0, 0);
                toast.show();

                Intent intent = new Intent(getApplicationContext(),secondActivity.class);

                intent.putExtra("value1",et1.getText().toString());
                intent.putExtra("value2",et2.getText().toString());
                 startActivity(intent);
            }
        });


    }
}