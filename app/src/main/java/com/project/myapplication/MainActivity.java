package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton radioIdle1, radioWork1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //App.app.activity = MainActivity.this;
        radioIdle1 = (RadioButton) findViewById(R.id.radioIdle);
        radioWork1 = (RadioButton) findViewById(R.id.radioWork);


        radioIdle1.setOnClickListener(optionOnClickListener);
        radioWork1.setOnClickListener(optionOnClickListener);
    }


    View.OnClickListener optionOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView textView = (TextView) findViewById(R.id.textView1);
//            String str = null;
//
//            str = ((RadioButton)v).getText().toString();
//            textView.setText(str);
            if(radioIdle1.isChecked()){
                textView.setText("Robot is Idle");
            }else if(radioWork1.isChecked()){
                textView.setText("Robot is Working on a Task");
            }
        }
    };

}