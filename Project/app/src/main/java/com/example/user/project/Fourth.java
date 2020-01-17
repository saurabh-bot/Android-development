package com.example.user.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Fourth extends AppCompatActivity {
    ImageButton i1,i2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        i1=(ImageButton)findViewById(R.id.imageButton2);
        i2=(ImageButton)findViewById(R.id.imageButton3);
        b1=(Button)findViewById(R.id.button11);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1=new Intent(Fourth.this,Ques1.class);
                startActivity(in1);
                finish();
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2=new Intent(Fourth.this,Magical.class);
                startActivity(in2);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3=new Intent(Fourth.this,Third.class);
                startActivity(in3);
                finish();
            }
        });
    }
}
