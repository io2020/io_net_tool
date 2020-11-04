package com.io.smartnpc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.gyf.immersionbar.ImmersionBar;

import sdk.Sdk;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_ip;
    private EditText et_vkey;
    private Button button;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImmersionBar();
        et_ip = findViewById(R.id.et_main_server_ip);
        et_vkey = findViewById(R.id.et_main_server_vkey);
        button = findViewById(R.id.btn_start);
        toolbar = findViewById(R.id.toolbar);
        setToolBar();
        button.setOnClickListener(this);
    }

    protected void setToolBar() {
        toolbar.setTitle("");
        TextView tv = toolbar.findViewById(R.id.tv_toolbar_title);
        tv.setText("内网穿透神器");
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void initImmersionBar() {
        ImmersionBar.with(this)
                .fitsSystemWindows(true)  //使用该属性,必须指定状态栏颜色
                .statusBarColor(R.color.white_ffffff)
                .statusBarDarkFont(true)
                .init();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_start:
                String ip = et_ip.getText().toString();
                String vKey = et_vkey.getText().toString();
                String connType = "tcp";
                Sdk.startClientByVerifyKey(ip,vKey,connType);
                break;
            default:
                break;
        }
    }
}