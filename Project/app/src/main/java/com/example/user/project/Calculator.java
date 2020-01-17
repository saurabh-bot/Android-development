package com.example.user.project;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Calculator extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;
    Button b1,b2,b3,b4,b5,b6;
    TextToSpeech tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        e1=(EditText)findViewById(R.id.editText8);
        e2=(EditText)findViewById(R.id.editText9);
        b1=(Button)findViewById(R.id.button18);
        b2=(Button)findViewById(R.id.button19);
        b3=(Button)findViewById(R.id.button20);
        b4=(Button)findViewById(R.id.button22);
        b5=(Button)findViewById(R.id.button23);
        b6=(Button)findViewById(R.id.button17);
        t1=(TextView)findViewById(R.id.textView4);
        tt=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                tt.setLanguage(Locale.ENGLISH);
                tt.setSpeechRate(0.9f);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float i1=Float.parseFloat(s1);
                Float i2=Float.parseFloat(s2);
                Float i3=i1+i2;
                String s3=Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(Calculator.this, s3, Toast.LENGTH_SHORT).show();
                tt.speak("The answer is "+s3,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float i1=Float.parseFloat(s1);
                Float i2=Float.parseFloat(s2);
                Float i3=i1-i2;
                String s3=Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(Calculator.this, s3, Toast.LENGTH_SHORT).show();
                tt.speak("The answer is "+s3,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float i1=Float.parseFloat(s1);
                Float i2=Float.parseFloat(s2);
                Float i3=i1*i2;
                String s3=Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(Calculator.this, s3, Toast.LENGTH_SHORT).show();
                tt.speak("The answer is "+s3,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float i1=Float.parseFloat(s1);
                Float i2=Float.parseFloat(s2);
                Float i3=i1/i2;
                String s3=Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(Calculator.this, s3, Toast.LENGTH_SHORT).show();
                tt.speak("The answer is "+s3,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.getText().clear();
                e2.getText().clear();
                t1.setText("");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  i=new Intent(Calculator.this,Third.class);
                startActivity(i);
                finish();
            }
        });

    }
}
