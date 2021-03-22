package com.example.androidintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    float weight =0;
    float height=0;
    float bmi =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        weight = intent.getFloatExtra("WEIGHT_VALUE", 0);
        height = intent.getFloatExtra("HEIGHT_VALUE", 0);
        bmi = intent.getFloatExtra("BMI_VALUE", 0);
        Log.e("Result", "身高:"+height+" 體重:"+weight+" BMI:"+bmi);
        TextView result = (TextView) findViewById(R.id.result);
        result.setText("身高:"+height+" 體重:"+weight+" BMI:"+bmi);
    }

    public void switchView(View view) {
        // 建立 Intent
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        Bundle bundle = new Bundle();
        bundle.putFloat("WEIGHT_VALUE",weight);
        bundle.putFloat("HEIGHT_VALUE", height);
        bundle.putFloat("BMI_VALUE", bmi);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}