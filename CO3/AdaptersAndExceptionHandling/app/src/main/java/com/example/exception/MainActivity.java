package com.example.exception;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Collections;


class EmptyListException extends Exception{
    public String tostring(){
        return "EmptyList Exception";
    }
        }

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView) findViewById(R.id.lv);
        String[] list={};
        ArrayAdapter aa=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        try {
            if (list.length<=0){
                throw new EmptyListException();
            }
            listView.setAdapter(aa);
        } catch (EmptyListException e) {
            Toast.makeText(this, e.tostring(), Toast.LENGTH_SHORT).show();
        }


    }
}