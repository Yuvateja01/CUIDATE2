package com.example.android.cuidate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button red=(Button)findViewById(R.id.Button3);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cr=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(cr);

            }
        });


        Button red1=(Button)findViewById(R.id.button4);
        red1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cr1=new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(cr1);


                Button red2=(Button)findViewById(R.id.button5);
                red2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cr2=new Intent(Main2Activity.this,Main5Activity.class);
                        startActivity(cr2);


                        Button red3=(Button)findViewById(R.id.button6);
                        red3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent cr3=new Intent(Main2Activity.this,Main6Activity.class);
                                startActivity(cr3);


                                ImageButton red4=(ImageButton)findViewById(R.id.hh);
                                red4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                      Intent numintent1= new Intent(Main2Activity.this,Main8Activity.class);

                                    }
                                });

                            }
                        });

                    }
                });

            }
        });
    }
}
