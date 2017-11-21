package com.bettyjang1005.bmi;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String s = new String("abc");
    private EditText edWeight;
    private EditText edHeight;
    private Button help;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        getResources().getString(R.string.app_name);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           new AlertDialog.Builder(MainActivity.this).setMessage("BMI原來的設計是一個用於公眾健康研究的統計工具。當需要知道肥胖是否為某一疾病的致病原因時，可以把病人的身高及體重換算成BMI，再找出其數值及病發率是否有線性關連。")
                   .setPositiveButton("Ok",null).show();
            }
        });

    }

    protected void onCreate() {
        super.onStart();
        Log.d("MainActivity","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","onRestart");
    }

    private void findViews() {
        edWeight = (EditText) findViewById(R.id.ed_weight);
        edHeight = (EditText) findViewById(R.id.ed_height);
        help = (Button) findViewById(R.id.b_help);
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
        if (edheight >3){
            new AlertDialog.Builder(this).setMessage("身高單位應為公尺").setPositiveButton("OK",null).show();
            return;
        }
        float bmi = edweight/(edheight*edheight);
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("BMI_Extra",bmi);
        startActivity(intent);
      /*  if (bmi < 20){
            new  AlertDialog.Builder(this).setMessage("Your Bmi is: "+bmi+"  "+"請多吃點").show();
        }else {
            new AlertDialog.Builder(this).setMessage("Your Bmi is: "+bmi).show();
        }*/
       /*new AlertDialog.Builder(this).setMessage(getString(R.string.Your_BMI_is_) + bmi).setTitle(R.string.BMI_title)
                .setPositiveButton(R.string.ok,null).setNegativeButton(R.string.no,null)
                .setNeutralButton(R.string.cancel,null)
                .show();*/
       /* Log.d("MainActivity","Your BMI is : " + bmi);
        Toast.makeText(this , "Your BMI  is " + bmi ,Toast.LENGTH_SHORT).show();*/

    }

}
