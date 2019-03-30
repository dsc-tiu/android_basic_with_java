package com.example.android_basic_java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText e1 = findViewById(R.id.editText);
        final EditText e2= findViewById(R.id.edittext1);

        Button b1 = findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                a = e1.getText().toString();
                b = e2.getText().toString();
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("NAME",a);
                intent.putExtra("DETAILS",b);
                startActivity(intent);
            }
        });
    }
}
