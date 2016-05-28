package com.android.qusai.basic;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button addition, subtra, divide, multi;
    private TextView result;
    private EditText firsttextfield,secondtextfield;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        math();
    }
    private math(){
        addition =(Button) findViewById(R.id,addition);
        subtra = (Button) findViewById(R.id,subtra);
        divide = (Button) findViewById(R.id,divide);
        multi = (Button) findViewById(R.id,multi);
        firsttextfield = (TextView) findViewById(R.id,firsttextfield);
        secondtextfield = (TextView) findViewById(R.id,secondtextfield);
        result = (TextView) findViewById(R.id,result);

        addition.setOnClickListener(this);
        subtra.setOnClickListener(this);
        divide.setOnClickListener(this);
        multi.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         String num1 = firsttextfield.getText().toString();
         String num2 = secondtextfield.getText().toString();
         case R.id.addition:
             int adding = Integer.parseInt(num1,) + Integer.parseInt(num2);
             result.setText(String.valueOf(adding));
             break;
         case R.id.subtra:
             int subtraction = Integer.parseInt(num1)-Integer.parseInt(num2);
             result.setText(String.valueOf(subtraction));
             break;
         case R.id.divide:
             try {
                 int divition = Integer.parseInt(num1) / Integer.parseInt(num2);
                 result.setText(String.valueOf(divition));
             }catch (Exception e) {
                result.setText("Nigga aree you kidding me , can't the f*** divide by ZERO ");

             }
             break;
             }
         case R.id.multi:
             int mutiplication = Integer.parseInt(num1)*Integer.parseInt(num2);
             result.setText(String.valueOf(mutiplication));
             break;


     }
    }
}
