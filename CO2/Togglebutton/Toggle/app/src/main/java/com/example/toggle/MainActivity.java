package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnCustomToggleClick(View view) {
        Toast.makeText(this, "CustomToggleClick", Toast.LENGTH_SHORT).show();
    }

    public void onDefaultToggleClick(View view) {
        Toast.makeText(this, "DefaultToggleClick", Toast.LENGTH_SHORT).show();
    }
}