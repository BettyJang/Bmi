package com.bettyjang1005.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_result);
        float bmi = getIntent().getFloatExtra("BMI_Extra",0);
        TextView result = (TextView) findViewById(R.id.result);
        result.setText("BMI :"+bmi);
    }


}
