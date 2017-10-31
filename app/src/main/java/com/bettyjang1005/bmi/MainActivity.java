package com.bettyjang1005.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi(View view) {
        //System.out.println("hi hi hi");
        //Log.d("MainActivity","testing bmi method");
        //Log.e("MainActivity","testing2 bmi method");
        //Log.i("MainActivity","testing3 bmi method");
       // EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        float edweight = Float.parseFloat(edWeight.getText().toString());
        float edheight = Float.parseFloat(edHeight.getText().toString());
        float bmi = edweight/(edheight*edheight);
        new AlertDialog.Builder(this).setMessage("Your BMI is " + bmi).setTitle("BMI")
                .setPositiveButton("OK",null).setNegativeButton("NO",null)
                .setNeutralButton("Cancel",null)
                .show();
       /* Log.d("MainActivity","Your BMI is : " + bmi);
        Toast.makeText(this , "Your BMI  is " + bmi ,Toast.LENGTH_SHORT).show();*/

    }

}
