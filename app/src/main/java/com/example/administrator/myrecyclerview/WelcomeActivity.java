package com.example.administrator.myrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.example.administrator.myrecyclerview.constants.ConstantValues;
import com.example.administrator.myrecyclerview.core.AppStatusTracker;
import com.example.administrator.myrecyclerview.core.BaseActivity;

/**
 * Created by Administrator on 2017/2/20.
 */

public class WelcomeActivity extends BaseActivity {
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppStatusTracker.getInstance().setAppStatus(ConstantValues.STATUS_OFFLINE);
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void setUpContentView() {
        setContentView(R.layout.ac_welcome,-1,MODE_NONE);
    }

    @Override
    protected void setUpView() {

    }

    @Override
    protected void setUpData(Bundle savedInstanceState) {
        handler.sendEmptyMessageDelayed(0, 1000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeMessages(0);
    }
}
