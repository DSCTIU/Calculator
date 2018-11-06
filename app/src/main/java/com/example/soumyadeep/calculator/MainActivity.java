package com.example.soumyadeep.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final EditText t2=findViewById(R.id.editText1);
       final EditText t1=findViewById(R.id.editText2);

        Button b1=findViewById(R.id.button);
        Button b2=findViewById(R.id.button3);
        Button b3=findViewById(R.id.button4);
        Button b4=findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=t1.getText().toString();
                String s2=t2.getText().toString();
                int a=Integer.parseInt(s1);
                int b=Integer.parseInt(s2);
                int r=a+b;
                Toast.makeText(MainActivity.this, "Sum="+r, Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=t1.getText().toString();
                String s2=t2.getText().toString();
                int a=Integer.parseInt(s1);
                int b=Integer.parseInt(s2);
                int r=a-b;
                Toast.makeText(MainActivity.this, "Difference="+r, Toast.LENGTH_LONG).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=t1.getText().toString();
                String s2=t2.getText().toString();
                int a=Integer.parseInt(s1);
                int b=Integer.parseInt(s2);
                int r=a*b;
                Toast.makeText(MainActivity.this, "Multiplication="+r, Toast.LENGTH_LONG).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=t1.getText().toString();
                String s2=t2.getText().toString();
                int a=Integer.parseInt(s1);
                int b=Integer.parseInt(s2);
                double r=(double)a/(double)b;
                Toast.makeText(MainActivity.this, "Division="+r, Toast.LENGTH_LONG).show();
            }
        });
    }
}
