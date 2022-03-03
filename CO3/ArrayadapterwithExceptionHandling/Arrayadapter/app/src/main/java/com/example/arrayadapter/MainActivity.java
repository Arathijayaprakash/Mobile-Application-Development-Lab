package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView simplelistview;
    String[] list ={"Apple","Orange","Mango","Banana","Pineapple"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simplelistview = (ListView)findViewById(R.id.lv);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.item_view, R.id.tvitem, list);
        try{
            simplelistview.setAdapter(arrayAdapter);
        }catch (Exception e){
            Toast.makeText(this,e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}