package com.example.findlargestnumberinthreenumber;

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

    public void findLargest(View view)
    {
        Toast.makeText(this, "Enter Number", Toast.LENGTH_SHORT).show();
    }

}