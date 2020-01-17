package com.example.user.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Facebook extends AppCompatActivity {
    Button b1;
    WebView w1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        b1=(Button)findViewById(R.id.button36);
        w1=(WebView)findViewById(R.id.webView);

        w1.loadUrl("http://www.facebook.com/");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Facebook.this,Score.class);
                startActivity(i);
                finish();

            }
        });
    }
}
