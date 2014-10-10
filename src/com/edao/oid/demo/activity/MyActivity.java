package com.edao.oid.demo.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

import com.edao.oid.connect.EdaoSDK;
import com.edao.oid.connect.exception.EdaoException;
import com.edao.oid.connect.listener.EdaoLoginListener;
import com.edao.oid.demo.config.CustomizeConfig;
import com.edao.oid.demo.R;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onEdaoLoginClick(View view) {
        EdaoSDK edaoSDK = new EdaoSDK(new CustomizeConfig());
        edaoSDK.login(this, new EdaoLoginListener() {
            @Override
            public void onComplete(String value) {
                alert("onComplete:"+value);
                //完成授权
            }

            @Override
            public void onCancel() {
                alert("onCancel");
                //取消授权
            }

            @Override
            public void onEdaoException(EdaoException e) {
                //异常信息
                alert("onException:"+e.getMessage());
            }
        });
    }

    private void alert(String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("提示").setMessage(msg).setPositiveButton("确定", null).show();
    }

}
