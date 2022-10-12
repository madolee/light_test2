package com.example.light_test;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CameraManager cameraManager;
    private String cameraID;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try {
            cameraID = cameraManager.getCameraIdList()[0]; // 0 is for back camera
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void TorchONButtonClick(View view){

        


        try {
            cameraManager.setTorchMode(cameraID, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void TorchOFFButtonClick(View view){




        try {
            cameraManager.setTorchMode(cameraID, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}