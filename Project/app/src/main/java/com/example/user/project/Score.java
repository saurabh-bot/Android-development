package com.example.user.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Score extends AppCompatActivity {
    TextView t1;
    ImageButton b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        t1=(TextView)findViewById(R.id.textView8);
        b1=(ImageButton)findViewById(R.id.imageButton4);
        b2=(ImageButton)findViewById(R.id.imageButton5);
        b3=(ImageButton)findViewById(R.id.imageButton6);
        b4=(ImageButton)findViewById(R.id.imageButton7);

        t1.setText("Hello "+MainActivity.name+",Your score is "+Ques1.score);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Score.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Score.this,Facebook.class);
                startActivity(i);
                finish();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Score.this,Twitter.class);
                startActivity(i);
                finish();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Score.this,Netcamp.class);
                startActivity(i);
                finish();
            }
        });
    }
}
