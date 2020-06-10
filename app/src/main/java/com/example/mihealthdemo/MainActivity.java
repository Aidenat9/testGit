package com.example.mihealthdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.xiaomi.fits.sdk.FitSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        注册SDK, 提供小米账号系统生产的token
        String appId = "2882303761517629403";
        String accessToken = "";
        String dataURL = "";
        FitSDK fitSDK = new FitSDK(this, appId, accessToken, dataURL);
//        fitSDK.getDataSourceByType()
    }
}
