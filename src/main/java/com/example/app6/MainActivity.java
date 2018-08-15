package com.example.app6;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        foo1();

        foo2();
    }

    private void foo2() {
        ImageView iv_start2 = (ImageView) findViewById(R.id.iv_start2);
        ((Animatable) iv_start2.getDrawable()).start();

        final ImageView iv_start3 = (ImageView) findViewById(R.id.iv_start3);
        iv_start3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Animatable) iv_start3.getDrawable()).start();
            }
        });

    }

    private void foo1() {
        ImageView iv_start = (ImageView) findViewById(R.id.iv_start);
        final ImageView iv_start1 = (ImageView) findViewById(R.id.iv_start1);
        ((Animatable) (iv_start.getDrawable())).start();
        //如果想再次点击后恢复原有的动画，应该是在创建一个背景，然后点击后开始启动动画
        iv_start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Animatable) (iv_start1.getDrawable())).start();
            }
        });
    }
}
