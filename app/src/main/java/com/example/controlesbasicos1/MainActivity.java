package com.example.controlesbasicos1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Switch sw;
    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.tv);
        sw=findViewById(R.id.sw);
        tb=findViewById(R.id.tb);

    }

    public void pulsarSwitch(View view) {
        if(sw.isChecked()){
            tv.setText("El switch está activado");
        }else{
            tv.setText("El switch está desactivado");
        }


    }

    public void pulsarToggle(View view) {
        if(tb.isChecked()){
            tv.setText("El toggleButton está activado");
        }else{
            tv.setText("El ToggleButton está desactivado");
        }

    }
}