package com.lsw.customwidgetone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    // Scale按钮
    private Button btnScale;
    // Alpha动画对象
    private Animation scaleAnimation;

    // translate按钮
    private Button btnTranslate;
    // translate动画对象
    private Animation tranAnimation;

    // Alpha按钮
    private Button btnAlpha;
    // alpha动画对象
    private Animation alphaAnimation;

    // Rotate按钮
    private Button btnRotate;
    // rotate动画对象
    private Animation rotateAnimation;

    // set按钮
    private Button btnSet;
    // rotate动画对象
    private Animation setAnimation;
    // 动画展示文字
    private ImageView displayImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayImg.startAnimation(scaleAnimation);
            }
        });
        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayImg.startAnimation(tranAnimation);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayImg.startAnimation(alphaAnimation);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayImg.startAnimation(rotateAnimation);
            }
        });
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayImg.startAnimation(setAnimation);
            }
        });
    }

    /**
     * 初始化组件
     */
    private void initView() {
        tranAnimation = AnimationUtils.loadAnimation(this, R.anim.translateanim);
        btnTranslate = (Button) findViewById(R.id.tran);

        scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scaleanim);
        btnScale = (Button) findViewById(R.id.scale);

        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alphaanim);
        btnAlpha = (Button) findViewById(R.id.apla);

        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotateanim);
        btnRotate = (Button) findViewById(R.id.rotate);

        btnSet= (Button) findViewById(R.id.set);
        setAnimation=AnimationUtils.loadAnimation(this,R.anim.setanim);
        displayImg = (ImageView) findViewById(R.id.iv_display);
    }
}
