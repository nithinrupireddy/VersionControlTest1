package com.versioncontroltest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(this, "this is my second commit", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "fifth commit", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "sixth commit", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "seventh commit", Toast.LENGTH_SHORT).show();

    }
}