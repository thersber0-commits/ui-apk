package com.my.app;

import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity______________);
        
        findViewById(R.id.button_comp_1776692977652_1).setOnClickListener(v -> {
            Toast.makeText(this, "677777", Toast.LENGTH_SHORT).show();
        });
    }

    
}
