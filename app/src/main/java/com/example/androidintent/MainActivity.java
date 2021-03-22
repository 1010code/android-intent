package com.example.androidintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void switchView(View view) {
        // 取得身高體重計算BMI並傳到下一頁
        EditText edWeight = (EditText) findViewById(R.id.weight);
        EditText edHeight = (EditText) findViewById(R.id.height);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight/(height*height);
        // 建立 Intent
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("WEIGHT_VALUE", weight);
        intent.putExtra("HEIGHT_VALUE", height);
        intent.putExtra("BMI_VALUE", bmi);
        startActivity(intent);
    }
}