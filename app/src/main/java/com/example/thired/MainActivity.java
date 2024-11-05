package com.example.thired;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.annotation.SuppressLint;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private boolean isOn=true;
    private int mode=1;//1-cool,2-heat
    private TextView tvMode;
    private int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMode=findViewById(R.id.b3);
        temp=24;
    }

    public void checkStatus(View view) {
        if (isOn)
            isOn=false;
        else
            isOn=true;
    }

    @SuppressLint("setTextI18n")
    public void checkMode(View view) {
        if (isOn){
            if (mode==1) {
                mode= 2;
                tvMode.setText("Heat");
            }
            else {
                mode = 1;
                tvMode.setText("Cool");
            }
        }
        else {
            Toast.makeText(this, "turn it on first...", Toast.LENGTH_SHORT).show();
        }
    }

    public void plus(View view) {
        if (isOn){
            if (temp<30)
                temp++;
            else
                Toast.makeText(this, "30 is the max temp", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, "turn it on first...", Toast.LENGTH_SHORT).show();
    }

    public void minus(View view) {
        if (isOn){
            if (temp>16)
                temp--;
            else
                Toast.makeText(this, "16 is the min temp", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, "turn it on first...", Toast.LENGTH_SHORT).show();
    }
}