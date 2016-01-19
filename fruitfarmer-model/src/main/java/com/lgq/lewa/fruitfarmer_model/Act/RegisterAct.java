package com.lgq.lewa.fruitfarmer_model.Act;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


import com.lgq.lewa.fruitfarmer_model.BmobBeans.User;
import com.lgq.lewa.fruitfarmer_model.R;

import cn.bmob.v3.listener.SaveListener;

public class RegisterAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        User userDb = new User();
        userDb.setUsername("sendi");
        userDb.setPassword("123456");
        userDb.setEmail("sendi@163.com");
        //注意：不能用save方法进行注册
        userDb.signUp(this, new SaveListener() {
            @Override
            public void onSuccess() {
                // TODO Auto-generated method stub
                System.out.println("注册成功:");
            }

            @Override
            public void onFailure(int code, String msg) {
                // TODO Auto-generated method stub
                System.out.println("注册失败:" + msg);
            }
        });
    }

}
