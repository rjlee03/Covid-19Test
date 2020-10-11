package com.example.covy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void submit(View view) {
        if(answervaild()){
            if(suspicious()){
                Intent intent = new Intent(getApplicationContext(),gotohospital.class);
                startActivity(intent);
            }
            else{
                Intent intent = new Intent(getApplicationContext(),moniterathome.class);
                startActivity(intent);
            }
        }
        else{
            Toast.makeText(getApplicationContext(),
                    "Finish All The Questions", Toast.LENGTH_LONG).show();

        }
    }

    private boolean suspicious() {
        RadioButton buttton1 = findViewById(R.id.yes1);
        RadioButton buttton2 = findViewById(R.id.yes2);
        RadioButton buttton3 = findViewById(R.id.yes3);
        if(buttton1.isChecked() && buttton2.isChecked() && buttton3.isChecked()){
            return true;
        }else{
            return false;
        }
    }

    private boolean answervaild() {
        RadioGroup a = findViewById(R.id.radioGroup1);
        RadioGroup b = findViewById(R.id.radioGroup2);
        RadioGroup c = findViewById(R.id.radioGroup3);
        if(a.getCheckedRadioButtonId() == -1 || b.getCheckedRadioButtonId() == -1 || c.getCheckedRadioButtonId() == -1){
            return false;
        }
        else{
            return true;
        }
    }
}