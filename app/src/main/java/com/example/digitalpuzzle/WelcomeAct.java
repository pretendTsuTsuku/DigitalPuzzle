package com.example.digitalpuzzle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by 刘皓杰 on 2018/3/8.
 */

public class WelcomeAct extends Activity implements View.OnTouchListener {

    Button btnStart;
    Button btnExcit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_welcome);
        btnStart=findViewById(R.id.startGame);
        btnExcit=findViewById(R.id.excitGame);
        btnStart.setOnTouchListener(this);
        btnExcit.setOnTouchListener(this);

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
        {
            switch (view.getId()){
                case R.id.startGame:
                    btnStart.setBackgroundResource(R.drawable.btbg2);//改变按钮状态
                    break;
                case R.id.excitGame:
                    btnExcit.setBackgroundResource(R.drawable.btbg2);//改变按钮状态
                    break;
            }
        }
        if(motionEvent.getAction()==MotionEvent.ACTION_UP)
        {
            switch (view.getId()){
                case R.id.startGame:
                    btnStart.setBackgroundResource(R.drawable.btbg1);
                    Intent i=new Intent(this,MainActivity.class);
                    startActivity(i);                  //启动游戏Act
                    break;
                case R.id.excitGame:
                    btnExcit.setBackgroundResource(R.drawable.btbg1);
                    finish();                      //结束Act
                    break;
            }
        }
        return true;
    }
}
