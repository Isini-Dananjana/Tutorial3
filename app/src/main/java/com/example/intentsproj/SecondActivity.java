package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText edNum1,edNum2;

    String number1;
    String number2;
    TextView lblSum;

    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


    //defining the text object
        edNum1 =findViewById(R.id.edNum1);
        edNum2 =findViewById(R.id.edNum2);
        lblSum = findViewById(R.id.lbl);

        Intent i = getIntent();

        //retrieve the first enters values
         number1 = i.getStringExtra("n1");
         number2 = i.getStringExtra("n2");

        //set the values
        edNum1.setText(number1);
        edNum2.setText(number2);

        //convert to int
        n1= Integer.parseInt(number1);
        n2= Integer.parseInt(number2);
    }

    public void add(View view){

      lblSum.setText(number1 +" + " +number2+" = "+(n1+n2));
    }
    public void substract(View view){

        lblSum.setText(number1 +" - " +number2+" = "+(n1-n2));
    }
    public void multiply(View view){

        lblSum.setText(number1 +" x " +number2+" = "+(n1*n2));
    }
    public void divide(View view){

        lblSum.setText(number1 +" / " +number2+" = "+(n1/n2));
    }

}