package com.example.android.cuidate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button hex=(Button)findViewById(R.id.hex);
        hex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hexintent=new Intent(Main4Activity.this,Main8Activity.class);
                startActivity(hexintent);
            }
        });
    }
}
