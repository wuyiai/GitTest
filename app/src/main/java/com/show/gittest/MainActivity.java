package com.show.gittest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

/**
 * Create by suzb on 2023/7/3
 * GitTest
 * com.show.gittest
 */
public class MainActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"第一次提交",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.tv_send_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"第二次提交。。",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
