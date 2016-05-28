package com.android.qusai.basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button addition, subtra, divide, mulyi;
    private TextView result;
    private EditText firsttextfield,secondtextfield;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private init(){
        addition =(Button) findViewById(R.layout,addition);

    }
}
