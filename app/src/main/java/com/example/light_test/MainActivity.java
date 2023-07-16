package com.example.light_test;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView; // 작성 글자타내는 뷰

    Button button1;    // 작성 버튼9
    Button button2;



    String txt1 = " this is txt 1";
    String txt2 = " this is txt 2";



    //@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
        button1 =  findViewById(R.id.button);
        button2 =  findViewById(R.id.button2);

    }

   // @RequiresApi(api = Build.VERSION_CODES.M)
    public void onButton1Clicked(View view){
        textView.setText(txt1);

    }

    //@RequiresApi(api = Build.VERSION_CODES.M)
    public void onButton2Clicked(View view){
        textView.setText(txt2);



    }
}