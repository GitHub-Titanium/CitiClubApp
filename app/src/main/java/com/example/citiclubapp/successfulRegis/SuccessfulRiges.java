package com.example.citiclubapp.successfulRegis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.citiclubapp.R;
import com.example.citiclubapp.real_name_authentificationActivity;

/**
 * author:李季桥
 * todo:注册成功页面
 */

public class SuccessfulRiges extends AppCompatActivity {

    Button login2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_riges);
        login2 = findViewById(R.id.button_login2);

        //准备转接下一个页面
       login2.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               Intent intent = new Intent(  SuccessfulRiges.this, real_name_authentificationActivity.class);
                startActivity(intent);
                //finish();
            }
        });


    }




}
