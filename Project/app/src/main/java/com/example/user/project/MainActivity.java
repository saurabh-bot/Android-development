package com.example.user.project;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    EditText e1,e2;
    static String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Signup.class);
                startActivity(i);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name=e1.getText().toString();
                String s2=e2.getText().toString();

                if(name.equals("")||s2.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please fill all the data.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("mnnit",MODE_PRIVATE,null);
                    String s4="select * from student where name='"+name+"' and password='"+s2+"'";
                    Cursor cursor=data.rawQuery(s4,null);
                    if(cursor.getCount()==0)
                    {
                        Toast.makeText(MainActivity.this, "USER DOES NOT EXISTS", Toast.LENGTH_SHORT).show();
                    }

                    else {
                        Intent j = new Intent(MainActivity.this, Third.class);
                        startActivity(j);
                        finish();
                    }
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.getText().clear();
                e2.getText().clear();

            }
        });
    }
}
