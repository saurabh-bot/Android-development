package com.example.user.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Netcamp extends AppCompatActivity {
    Button b1;
    WebView w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netcamp);

        b1=(Button)findViewById(R.id.button38);
        w1=(WebView)findViewById(R.id.webView3);

        w1.loadUrl("http://www.netcamp.in/");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Netcamp.this, Score.class);
                startActivity(i);
                finish();
            }
        });
}

}





