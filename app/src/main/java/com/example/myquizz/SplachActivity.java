package com.example.myquizz;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplachActivity extends AppCompatActivity {
    private Animation animation;
    private ImageView splash_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        splash_icon=findViewById(R.id.icon_anim);
        animation= AnimationUtils.loadAnimation(SplachActivity.this,R.anim.anim_left_to_right);
        splash_icon.setAnimation(animation);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplachActivity.this,HomeActivity.class);
                startActivity(intent);

            }
        },5000);
    }
}
