package com.example.androidintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        // 取得 Bundle資料
        Intent intent = getIntent();
        float weight = intent.getExtras().getFloat("WEIGHT_VALUE", 0);
        float height = intent.getExtras().getFloat("HEIGHT_VALUE", 0);
        float bmi = intent.getExtras().getFloat("BMI_VALUE", 0);
        Log.e("Result", "身高:"+height+" 體重:"+weight+" BMI:"+bmi);
        TextView result = (TextView) findViewById(R.id.result);
        result.setText("身高:"+height+" 體重:"+weight+" BMI:"+bmi);
    }
}