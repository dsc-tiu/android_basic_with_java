package com.example.android_basic_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String a = getIntent().getStringExtra("NAME");
        String b = getIntent().getStringExtra("DETAILS");
        TextView textView1 = findViewById(R.id.textView);

        String c = ""+a+" says about nature that "+b;
        textView1.setText(c);
    }
}
