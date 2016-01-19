package com.lgq.lewa.fruitfarmer_model;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.lgq.lewa.fruitfarmer_model.BmobBeans.User;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends AppCompatActivity {

    User user = new User();
    TextView toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        toast = (TextView) findViewById(R.id.toast);
        //初始化Bmob
        Bmob.initialize(this, "1e2c0a6ba014146ecf54552f56ee0c64");
        user.setUsername("sendi");
        user.setPassword("123456");
        user.setEmail("13558429391@163.com");
        //注意：不能用save方法进行注册

        user.signUp(this, new SaveListener() {
            @Override
            public void onSuccess() {
                // TODO Auto-generated method stub
                Toast.makeText(MainActivity.this,"注册成功:"+ user.getObjectId(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(int code, String msg) {
                // TODO Auto-generated method stub
                Toast.makeText(MainActivity.this, "注册失败:" +msg, Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
