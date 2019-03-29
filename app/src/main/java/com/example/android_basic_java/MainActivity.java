package com.example.android_basic_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1 = findViewById(R.id.editText);
        EditText e2= findViewById(R.id.edittext1);

        Button b1 = findViewById(R.id.button);

        try{
            a = e1.getText().toString().trim();
            b = e2.getText().toString().trim();
        }catch (Exception e){
            Toast.makeText(this, "Sorry no text taken", Toast.LENGTH_SHORT).show();
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}
