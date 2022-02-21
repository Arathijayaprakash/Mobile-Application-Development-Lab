package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView imageGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageGV=findViewById(R.id.gvitem);
        ArrayList<ImageModel>imageModelArrayList=new ArrayList<ImageModel>();
        imageModelArrayList.add(new ImageModel("Medicine",R.drawable.image));
        imageModelArrayList.add(new ImageModel("Doctor",R.drawable.image2));
        imageModelArrayList.add(new ImageModel("Booking",R.drawable.image3));
        imageModelArrayList.add(new ImageModel("Hands",R.drawable.main));
        imageModelArrayList.add(new ImageModel("Appointment Booking",R.drawable.med2));
        imageModelArrayList.add(new ImageModel("Time",R.drawable.top));
        ImGVAdapter adapter=new ImGVAdapter(this,imageModelArrayList);
        imageGV.setAdapter(adapter);

    }

}