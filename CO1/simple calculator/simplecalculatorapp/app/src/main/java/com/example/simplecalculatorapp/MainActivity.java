package com.example.simplecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etnum1,etnum2;
    private TextView etans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View V){
        etnum1=(EditText) findViewById(R.id.etnum1);
        etnum2=(EditText) findViewById(R.id.etnum2);
        etans=(TextView) findViewById(R.id.etans);

        int n1=Integer.parseInt(etnum1.getText().toString());
        int n2=Integer.parseInt(etnum2.getText().toString());

        int result=n1+n2;
        etans.setText("Result:"+result);
    }
    public void sub(View V){
        etnum1=(EditText) findViewById(R.id.etnum1);
        etnum2=(EditText) findViewById(R.id.etnum2);
        etans=(TextView) findViewById(R.id.etans);

        int n1=Integer.parseInt(etnum1.getText().toString());
        int n2=Integer.parseInt(etnum2.getText().toString());

        int result=n1-n2;
        etans.setText("Result:"+result);
    }
    public void div(View V){
        etnum1=(EditText) findViewById(R.id.etnum1);
        etnum2=(EditText) findViewById(R.id.etnum2);
        etans=(TextView) findViewById(R.id.etans);

        int n1=Integer.parseInt(etnum1.getText().toString());
        int n2=Integer.parseInt(etnum2.getText().toString());

        int result=n1/n2;
        etans.setText("Result:"+result);
    }
    public void mul(View V){
        etnum1=(EditText) findViewById(R.id.etnum1);
        etnum2=(EditText) findViewById(R.id.etnum2);
        etans=(TextView) findViewById(R.id.etans);

        int n1=Integer.parseInt(etnum1.getText().toString());
        int n2=Integer.parseInt(etnum2.getText().toString());

        int result=n1*n2;
        etans.setText("Result:"+result);
    }

}