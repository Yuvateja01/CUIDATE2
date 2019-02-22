package com.example.android.cuidate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText username=(EditText)findViewById(R.id.username);
        String name=username.getText().toString();


        EditText mobile1=(EditText)findViewById(R.id.mobile);
        String num=mobile1.getText().toString();

        Button num1=(Button)findViewById(R.id.button);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numintent=new Intent(MainActivity.this,MapsActivity.class);
                startActivity(numintent);
            }
        });

    }
}
