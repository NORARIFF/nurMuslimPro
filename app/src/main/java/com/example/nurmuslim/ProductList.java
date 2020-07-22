package com.example.nurmuslim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        Button butt5=(Button)findViewById(R.id.button5);
        Button butt6=(Button)findViewById(R.id.button6);
        Button butt7=(Button)findViewById(R.id.button7);
        Button butt8=(Button)findViewById(R.id.button8);
        Button butt9=(Button)findViewById(R.id.button9);
        Button butt10=(Button)findViewById(R.id.button10);
        Button butt11=(Button)findViewById(R.id.button11);
        Button butt12=(Button)findViewById(R.id.button12);
        Button butt13=(Button)findViewById(R.id.button13);
        Button butt14=(Button)findViewById(R.id.button14);


        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5=new Intent(ProductList.this,Search.class);
                startActivity(int5);
            }
        });

        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6=new Intent(ProductList.this,List2.class);
                startActivity(int6);
            }
        });

        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7=new Intent(ProductList.this,List3.class);
                startActivity(int7);
            }
        });

        butt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8=new Intent(ProductList.this,List4.class);
                startActivity(int8);
            }
        });

        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9=new Intent(ProductList.this,List5.class);
                startActivity(int9);
            }
        });

        butt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10=new Intent(ProductList.this,List6.class);
                startActivity(int10);
            }
        });

        butt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int11=new Intent(ProductList.this,List7.class);
                startActivity(int11);
            }
        });

        butt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int12=new Intent(ProductList.this,List8.class);
                startActivity(int12);
            }
        });

        butt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int13=new Intent(ProductList.this,List9.class);
                startActivity(int13);
            }
        });

        butt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int14=new Intent(ProductList.this,List10.class);
                startActivity(int14);
            }
        });

    }
}
