package com.androidlime.rabindranthtagore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Tips1,Tips2,Tips3,Tips4,Tips5,Tips6,Tips7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Tips1= (Button) findViewById(R.id.btn1);
        Tips2= (Button) findViewById(R.id.btn2);
        Tips3= (Button) findViewById(R.id.btn3);
        Tips4= (Button) findViewById(R.id.btn4);
        Tips5= (Button) findViewById(R.id.btn5);
        Tips6= (Button) findViewById(R.id.btn6);
        Tips7= (Button) findViewById(R.id.btn7);

        Tips1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Tips_1.class);
                startActivity(intent);
            }
        });

        Tips2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Tips_2.class);
                startActivity(intent);
            }
        });
        Tips3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Tips_3.class);
                startActivity(intent);
            }
        });
        Tips4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Tips_4.class);
                startActivity(intent);
            }
        });
        Tips5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Tips_5.class);
                startActivity(intent);
            }
        });
        Tips6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Tips_6.class);
                startActivity(intent);
            }
        });
        Tips7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Tips_7.class);
                startActivity(intent);
            }
        });
    }
}
